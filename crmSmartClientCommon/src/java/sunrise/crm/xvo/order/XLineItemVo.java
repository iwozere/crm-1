package sunrise.crm.xvo.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XLineItemVo implements Serializable {

	private static final long serialVersionUID = -263591715609640087L;

	private String action;
	private String contrItmObjid;
	private String partNumObjid;
	private String partNumber;
	private String lineNo;
	private XAttributeValueVo[] attributes;
	private Boolean isOptional; // frontent attribute only
	private Boolean isDummy; // frontent attribute only
	private String price; // frontent attribute only
	private String parentLineNo;
	private String relatedSitePartObjid;
	private String partType;
	private String partClass;
	private String domain;
	private String parentContrItmObjid;
	private String line;

	public XLineItemVo() {

	}
	
	public XLineItemVo(String partNumber, String action) {		
		this.partNumber = partNumber;
		this.action = action;
	}

	public XLineItemVo(String action, String contrItmObjid,
			String partNumObjid, String partNumber, String lineNo,
			Boolean isOptional, Boolean isDummy, String price,
			String parentLineNo, String relatedSitePartObjid, String partType,
			String partClass, String domain, String parentContrItmObjid,
			String line, String... attributes) {
		this.action = action;
		this.contrItmObjid = contrItmObjid;
		this.partNumObjid = partNumObjid;
		this.partNumber = partNumber;
		this.lineNo = lineNo;
		this.isOptional = isOptional;
		this.isDummy = isDummy;
		this.price = price;
		this.parentLineNo = parentLineNo;
		this.relatedSitePartObjid = relatedSitePartObjid;
		this.partType = partType;
		this.partClass = partClass;
		this.domain = domain;
		this.parentContrItmObjid = parentContrItmObjid;
		this.line = line;
		List<XAttributeValueVo> attrs = new ArrayList<XAttributeValueVo>();
		if (attributes!= null) {
			for (int i = 0; i < attributes.length; i += 2) {
				XAttributeValueVo attr = new XAttributeValueVo(attributes[i],
						attributes[i+1]);
				attrs.add(attr);
			}
		}
		setAttributes(attrs.toArray(new XAttributeValueVo[0]));
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getContrItmObjid() {
		return contrItmObjid;
	}

	public void setContrItmObjid(String contrItmObjid) {
		this.contrItmObjid = contrItmObjid;
	}

	public String getPartNumObjid() {
		return partNumObjid;
	}

	public void setPartNumObjid(String partNumObjid) {
		this.partNumObjid = partNumObjid;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public XAttributeValueVo[] getAttributes() {
		return attributes;
	}

	public void setAttributes(XAttributeValueVo[] attributes) {
		this.attributes = attributes;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setParentLineNo(String parentLineNo) {
		this.parentLineNo = parentLineNo;
	}

	public String getParentLineNo() {
		return parentLineNo;
	}

	public void setRelatedSitePartObjid(String relatedSitePartObjid) {
		this.relatedSitePartObjid = relatedSitePartObjid;
	}

	public String getRelatedSitePartObjid() {
		return relatedSitePartObjid;
	}

	public void setIsDummy(Boolean isDummy) {
		this.isDummy = isDummy;
	}

	public Boolean getIsDummy() {
		return isDummy;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartClass(String partClass) {
		this.partClass = partClass;
	}

	public String getPartClass() {
		return partClass;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomain() {
		return domain;
	}

	public String getParentContrItmObjid() {
		return parentContrItmObjid;
	}

	public void setParentContrItmObjid(String parentContrItmObjid) {
		this.parentContrItmObjid = parentContrItmObjid;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "XLineItemVo [action=" + action + ", contrItmObjid="
				+ contrItmObjid + ", partNumObjid=" + partNumObjid
				+ ", partNumber=" + partNumber + ", lineNo=" + lineNo
				+ ", attributes=" + Arrays.toString(attributes)
				+ ", isOptional=" + isOptional + ", isDummy=" + isDummy
				+ ", price=" + price + ", parentLineNo=" + parentLineNo
				+ ", relatedSitePartObjid=" + relatedSitePartObjid
				+ ", partType=" + partType + ", partClass=" + partClass
				+ ", domain=" + domain + ", parentContrItmObjid="
				+ parentContrItmObjid + ", line=" + line + "]";
	}
}
