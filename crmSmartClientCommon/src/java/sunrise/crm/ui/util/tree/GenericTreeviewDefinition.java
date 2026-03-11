package sunrise.crm.ui.util.tree;

import java.io.Serializable;

public class GenericTreeviewDefinition implements Serializable {

	// This class contains specific 
	
	private static final long serialVersionUID = 1400644216101050715L;

	//Icons
	private String openIcon;
	private String disabledOpenIcon;
	private String closedIcon;
	private String disabledClosedIcon;
	private String leafIcon;
	private String disabledLeafIcon;
	
	//Behavior
	private boolean enabled = true;
	private boolean visible = true;
	
	//Node Name
	private String nodeName;

	private String style;

	private String treeNodeTemplateSequence;

	
	public String getOpenIcon() {
		return openIcon;
	}

	public void setOpenIcon(String openIcon) {
		this.openIcon = openIcon;
	}

	public String getDisabledOpenIcon() {
		return disabledOpenIcon;
	}

	public void setDisabledOpenIcon(String disabledOpenIcon) {
		this.disabledOpenIcon = disabledOpenIcon;
	}

	public String getClosedIcon() {
		return closedIcon;
	}

	public void setClosedIcon(String closedIcon) {
		this.closedIcon = closedIcon;
	}

	public String getDisabledClosedIcon() {
		return disabledClosedIcon;
	}

	public void setDisabledClosedIcon(String disabledClosedIcon) {
		this.disabledClosedIcon = disabledClosedIcon;
	}

	public String getLeafIcon() {
		return leafIcon;
	}

	public void setLeafIcon(String leafIcon) {
		this.leafIcon = leafIcon;
	}

	public String getDisabledLeafIcon() {
		return disabledLeafIcon;
	}

	public void setDisabledLeafIcon(String disabledLeafIcon) {
		this.disabledLeafIcon = disabledLeafIcon;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public void setStyle(String style) {
		this.style = style;
		
	}
	
	public String getStyle() {
		return this.style;
		
	}

	public void setTreeNodeTemplateSequence(String treeNodeTemplateSequence) {
		this.treeNodeTemplateSequence = treeNodeTemplateSequence;
	}

	public String getTreeNodeTemplateSequence() {
		return this.treeNodeTemplateSequence;
	}

}
