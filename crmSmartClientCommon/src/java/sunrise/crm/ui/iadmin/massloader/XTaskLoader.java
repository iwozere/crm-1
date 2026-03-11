package sunrise.crm.ui.iadmin.massloader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import sunrise.crm.util.CrmDateUtil;
import sunrise.crm.util.CrmStringUtil;

public class XTaskLoader {
    public static final Logger LOG = Logger.getLogger(XTaskLoader.class);
    
    DataFormatter formatter = new DataFormatter();
    private final Workbook workbook;
    private static final String INTERNAL_ERROR = "Internal error!";
    private static final String UNABLE_TO_OPEN = "Unable to open Excel file!";
    private static final String INVALID_FORMAT = "Invalid Excel file format!";

    public XTaskLoader(String filepath) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filepath);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new XWorksheetException(UNABLE_TO_OPEN, e);
        } catch (Exception e) {
            throw new XWorksheetException(INTERNAL_ERROR, e);
        } finally {
            try {
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                LOG.error("", e);
            }
        }
    }

    public XTaskLoader(InputStream inputStream) {
        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new XWorksheetException(UNABLE_TO_OPEN, e);
        } catch (Exception e) {
            throw new XWorksheetException(INTERNAL_ERROR, e);
        }
    }

    public <T> List<T> load(String worksheetName, Class<T> clas, /*UifTabularDataModel tdm, */int rowOffset, int columnOffset, int rowOffsetAV) throws XWorksheetException {
        try {
            XWorksheet sheetAnnotation = clas.getAnnotation(XWorksheet.class);

            int rowoffset = calculateRowOffset(sheetAnnotation, rowOffset);
            int columnoffset = calculateColumnOffset(sheetAnnotation, columnOffset);
            
            String worksheetname = calculateWorksheetName(sheetAnnotation, worksheetName);
            Sheet worksheet = workbook.getSheet(worksheetname);
            if (worksheet == null) {
                throw new XWorksheetException(String.format("The spreadsheet %s was not found in Excel workbook. Please make sure to have worksheet with name '%s' in your excel file", worksheetname, worksheetname));
            }
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            List<T> result = new ArrayList<T>();
            Iterator<Row> iterator = worksheet.iterator();
            Field[] fields = clas.getDeclaredFields();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (row.getRowNum() < rowoffset) continue;
                T inst = (T) clas.getDeclaredConstructors()[0].newInstance();
                boolean addRecord = true;
                boolean allBlank = true;
                int columnindex = columnoffset - 1;
                for (Field field : fields) {
                    columnindex++;
                    XColumn column = field.getAnnotation(XColumn.class);
                    if (column != null) {
                        columnindex = column.id();
                    }
                    Cell cell = row.getCell(columnindex);
                    String value = getCellValue(cell, evaluator, worksheet, rowOffsetAV);
                    if (value != null) {
                        String trimmedValue = value.trim();
                        field.set(inst, trimmedValue);
                        if (CrmStringUtil.isBlank(trimmedValue)
                                && column != null && column.required()) {
                            addRecord = false;
                            break;
                        }
                    }
                    allBlank &= CrmStringUtil.isBlank(value);
                }
                if (addRecord && !allBlank) {
                    result.add(inst);
                }
                if (allBlank) break;
            }
            return result;
        } catch (XWorksheetException e) {
            throw e;
        } catch (Exception e) {
            throw new XWorksheetException(INTERNAL_ERROR, e);
        }
    }

    private static String calculateWorksheetName(XWorksheet sheetAnnotation, String worksheetName) {
        if (sheetAnnotation == null || CrmStringUtil.isBlank(sheetAnnotation.name())) return worksheetName;
        return sheetAnnotation.name();
    }

    private static int calculateColumnOffset(XWorksheet sheetAnnotation, int columnOffset) {
        if (sheetAnnotation == null || sheetAnnotation.columnOffset() == 0) return columnOffset;
        return sheetAnnotation.columnOffset();
    }

    private static int calculateRowOffset(XWorksheet sheetAnnotation, int rowOffset) {
        if (sheetAnnotation == null || sheetAnnotation.rowOffset() == 0) return rowOffset;
        return sheetAnnotation.rowOffset();
    }

    public <T> List<T> load(Class<T> clas) throws XWorksheetException {
        return load("", clas, 0, 0, 0);
    }

	public String getCellValue(Cell cell, FormulaEvaluator evaluator,
			Sheet worksheet,int rowOffsetAV) {

		if (cell == null)
			return "";

		if (cell.getCellType() == CellType.FORMULA) {
			return formatter.formatCellValue(cell, evaluator).trim();
		}
		// Currently cell.getCellType() is not returning the FORMULA as cell type and hence not able to evaluate the formula Value.
		// Below modified code is workaround for same. Fixed as part of - 116388

        String value = formatter.formatCellValue(cell).trim();

        if (cell.getCellType() == CellType.NUMERIC) {
            if (HSSFDateUtil.isCellDateFormatted(cell)) {
                value = CrmDateUtil.formatEuLong(cell.getDateCellValue());
            }
        }

        /*
		 * 65663 - Massload "Modify existingt GSM contract" for Flat Post CH Geraete/Fahrzeuge is failing
		 * Flat Post CH Geraete/​Fahrzeuge in excel is imported as Flat Post CH Geraete/?Fahrzeuge
		 * Though it appears as ?, it is actually char with Ascii value 8203 (Zero Width Space)
		 * Not sure why it is happening suddenly. Assuming because of / in the input value, so replacing the value only if / is available.
		 */
		
        CellType cellType = cell.getCellType();
        if (cellType == CellType.STRING && value.contains("/")) {
   			value = value.replaceAll("[\\p{Cf}]", "");
        }

		if (value.contains("=")) {
			CellReference cellReference = new CellReference(rowOffsetAV == 0 ? value.replace("=", "") : format(value,rowOffsetAV));
			Row row = worksheet.getRow(cellReference.getRow());
			Cell formulaCell = row.getCell(cellReference.getCol());
			value = formatter.formatCellValue(formulaCell).trim();
		}

		return value;
	}

    private String format(String value, int rowOffsetAV) {
         String newValue = value.replace("=", "");
         String lastChar =  newValue.substring(newValue.length() - 1);
         int j = Integer.parseInt(lastChar) + rowOffsetAV;
         return newValue.substring(0, newValue.length() - 1) + String.valueOf(j)  ;
		
	}

	public void updateCustomerAppIds(List<String> appIds) {
        Sheet worksheet = workbook.getSheet(XConstants.CREATE_CUSTOMER);
        if (worksheet != null) {
            for (int i = 0; i < appIds.size(); ++i) {
                Row row = worksheet.getRow(XConstants.DEFAULT_ROW_OFFSET + i);
                if (row != null) {
                    Cell appIdCell = row.getCell(37);
                    if(appIdCell == null){
                    	appIdCell = row.createCell(37);
                    	appIdCell.setCellValue(appIds.get(i));
                    }else{
                    	appIdCell.setCellValue(appIds.get(i));
                    }                    
                }
            }
        }
    }

    public void write(String filepath) {
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream(filepath);
            workbook.write(outFile);

        } catch (FileNotFoundException e) {
            LOG.error("", e);
        } catch (IOException e) {
            LOG.error("", e);
        } finally {
            try {
                if (outFile != null) outFile.close();
            } catch (IOException e) {
                LOG.error("", e);
            }
        }
    }

    public void close() {
        try {
            workbook.close();
        } catch (Exception e) {
            LOG.error("Error while closing workbook ", e);
        }
    }

}
