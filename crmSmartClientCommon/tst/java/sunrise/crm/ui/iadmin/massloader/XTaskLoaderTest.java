package sunrise.crm.ui.iadmin.massloader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class XTaskLoaderTest {
    private static final String EXCEL_BATCH_FILENAME = "batch_loader_template_v3.8.xls";

    private XTaskLoader taskLoader;

    @BeforeClass
    public void setup() throws IOException, InvalidFormatException {
        taskLoader = new XTaskLoader(EXCEL_BATCH_FILENAME);
    }

    @Test(groups = {"fail"}, enabled=false)
    public void testNewContractActivation() throws Exception {

        List<XNewContractActivation> newContractActivations = taskLoader.load(XNewContractActivation.class);
        List<XOrderLineItem> orderLineItems = taskLoader.load(XConstants.NEW_CONTRACT_ACTIVATION, XOrderLineItem.class,
                XConstants.DEFAULT_ROW_OFFSET, XConstants.NEW_CONTRACT_ACTIVATION_ORDER_LINE_ITEMS_COLUMN_OFFSET,0);

        Assert.assertEquals(newContractActivations.size(), 2, String.format("Loaded %s new contract activation items", newContractActivations.size()));
        Assert.assertEquals(orderLineItems.size(), 23, String.format("Loaded %s order line items", orderLineItems.size()));
    }

    @Test(groups = {"fail"}, enabled=false)
    public void testActivateNewGsmContract() throws Exception {

        List<XActivateNewGsmContract> activateNewGsmContracts = taskLoader.load(XActivateNewGsmContract.class);
        List<XOrderLineItem> orderLineItems = taskLoader.load(XConstants.ACTIVATE_NEW_GSM_CONTRACT, XOrderLineItem.class,
                XConstants.DEFAULT_ROW_OFFSET, XConstants.ACTIVATE_NEW_GSM_CONTRACT_ORDER_LINE_ITEMS_COLUMN_OFFSET,0);

        Assert.assertEquals(activateNewGsmContracts.size(), 1, String.format("Loaded %s activate new gsm contract items", activateNewGsmContracts.size()));
        Assert.assertEquals(orderLineItems.size(), 0, String.format("Loaded %s order line items", orderLineItems.size()));
    }

    @AfterClass
    public void release() {
        taskLoader.close();
    }

}