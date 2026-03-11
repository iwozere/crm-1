package sunrise.crm.xvo.retention;

import java.math.BigDecimal;

import sunrise.crm.xvo.util.XKeyValueVo;


public class XCurrentOptionsListVo {
	private String itemType;
	private String itemName;	
	private BigDecimal priceRc;		
	private BigDecimal priceNrc;
	private BigDecimal value;
	private boolean btnRemoveEnable;
	private String action;
	private XKeyValueVo[] attributeMap;
	private String id;
	private String parentId;	
	private String levelToPart;
	private int orderLineNo;
	private boolean btnProlongEnable;
	private String prolongDuration;
    private String[] prolongDurations;

	public String getLevelToPart() {
		return levelToPart;
	}
	public void setLevelToPart(String levelToPart) {
		this.levelToPart = levelToPart;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public boolean isBtnRemoveEnable() {
		return btnRemoveEnable;
	}
	public void setBtnRemoveEnable(boolean btnRemoveEnable) {
		this.btnRemoveEnable = btnRemoveEnable;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getPriceRc() {
		return priceRc;
	}
	public void setPriceRc(BigDecimal priceRc) {
		this.priceRc = priceRc;
	}
	public BigDecimal getPriceNrc() {
		return priceNrc;
	}
	public void setPriceNrc(BigDecimal priceNrc) {
		this.priceNrc = priceNrc;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public void setAttributeMap(XKeyValueVo[] attributeMap) {
		this.attributeMap = attributeMap;
	}
	public XKeyValueVo[] getAttributeMap() {
		return attributeMap;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public int getOrderLineNo() {
		return orderLineNo;
	}
	public void setOrderLineNo(int orderLineNo) {
		this.orderLineNo = orderLineNo;
	}
	public boolean isBtnProlongEnable() {
		return btnProlongEnable;
	}
	public void setBtnProlongEnable(boolean btnProlongEnable) {
		this.btnProlongEnable = btnProlongEnable;
	}
	public String getProlongDuration() {
		return prolongDuration;
	}
	public void setProlongDuration(String prolongDuration) {
		this.prolongDuration = prolongDuration;
	}
	public String[] getProlongDurations() {
		return prolongDurations;
	}
	public void setProlongDurations(String[] prolongDurations) {
		this.prolongDurations = prolongDurations;
	}
}
