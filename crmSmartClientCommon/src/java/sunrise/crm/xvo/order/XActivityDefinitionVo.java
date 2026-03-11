package sunrise.crm.xvo.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

/**
 * Class is used to describe the process definition. Displayed on the XProcessMaintenance form, 2323.cbs.
 * Hierarchical structure. Root object contains all children activities.
 * @author kosyrev
 *
 */
public class XActivityDefinitionVo {

	/*
	x_main_act_def2proc_def
	x_act_def2proc_def
	x_child_def2act_def
	x_act_def2node_id
	*/

	private String objid;
	private String clazz;
	private String seq_num;
	private String name;
	private String description;
	private String definition;
	private String max_duration;
	private String critical;
	private String detail;
	private String error_queue;
	private String processing_queue;
	private String prov_step;
	private String milestone;
	private String exp_duration;
	private String auto_restart_count;
	private String auto_restart_interval;
	private String rule_set;
	private String skip_in_child_proc;
	private String prov_step_display;
	private String message_id;
	private boolean rollback;
	private String notificationNodeId;
	private String icon;
	private String rbfw_execute;
	private String is_skippable;
	private String is_rollback_allowed;
	private List<XActivityDefinitionVo> children = new ArrayList<>();

	public String getRbfw_execute() {
		return rbfw_execute;
	}
	public void setRbfw_execute(String rbfw_execute) {
		this.rbfw_execute = rbfw_execute;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getSeq_num() {
		return seq_num;
	}
	public void setSeq_num(String seq_num) {
		this.seq_num = seq_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getMax_duration() {
		return max_duration;
	}
	public void setMax_duration(String max_duration) {
		this.max_duration = max_duration;
	}
	public String getCritical() {
		return critical;
	}
	public void setCritical(String critical) {
		this.critical = critical;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getError_queue() {
		return error_queue;
	}
	public void setError_queue(String error_queue) {
		this.error_queue = error_queue;
	}
	public String getProcessing_queue() {
		return processing_queue;
	}
	public void setProcessing_queue(String processing_queue) {
		this.processing_queue = processing_queue;
	}
	public void setNotificationNodeId(String notificationNodeId) {
		this.notificationNodeId = notificationNodeId;
	}
	public String getProv_step() {
		return prov_step;
	}
	public void setProv_step(String prov_step) {
		this.prov_step = prov_step;
	}
	public String getMilestone() {
		return milestone;
	}
	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}
	public String getExp_duration() {
		return exp_duration;
	}
	public void setExp_duration(String exp_duration) {
		this.exp_duration = exp_duration;
	}
	public String getAuto_restart_count() {
		return auto_restart_count;
	}
	public void setAuto_restart_count(String auto_restart_count) {
		this.auto_restart_count = auto_restart_count;
	}
	public String getAuto_restart_interval() {
		return auto_restart_interval;
	}
	public void setAuto_restart_interval(String auto_restart_interval) {
		this.auto_restart_interval = auto_restart_interval;
	}
	public String getRule_set() {
		return rule_set;
	}
	public void setRule_set(String rule_set) {
		this.rule_set = rule_set;
	}
	public String getSkip_in_child_proc() {
		return skip_in_child_proc;
	}
	public void setSkip_in_child_proc(String skip_in_child_proc) {
		this.skip_in_child_proc = skip_in_child_proc;
	}
	public String getProv_step_display() {
		return prov_step_display;
	}
	public void setProv_step_display(String prov_step_display) {
		this.prov_step_display = prov_step_display;
	}
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<XActivityDefinitionVo> getChildren() {
		return children;
	}
	public void setChildren(List<XActivityDefinitionVo> children) {
		this.children = children;
	}
	public boolean getRollback() {
        return rollback;
    }
	public String getNotificationNodeId() {
		return notificationNodeId;
	}
	public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

	public String getIs_skippable() {
		return is_skippable;
	}
	public void setIs_skippable(String is_skippable) {
		this.is_skippable = is_skippable;
	}
	public String getIs_rollback_allowed() {
		return is_rollback_allowed;
	}
	public void setIs_rollback_allowed(String is_rollback_allowed) {
		this.is_rollback_allowed = is_rollback_allowed;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
