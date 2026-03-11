package sunrise.crm.iadmin.processdefinition;

import com.google.gson.GsonBuilder;

import sunrise.crm.util.CrmStringUtil;
import sunrise.crm.xvo.order.XActivityDefinitionVo;

import java.util.List;
import java.util.regex.Pattern;

public class ProcessDefinitionService {
	
	private static final String NL = "\n";
	private static final String TAB = "\t";
	private static final String TAB9 = "\t\t\t\t\t\t\t\t\t";
	
    private static final String SCRIPT_DECLARATION_PART = "" +
            "set serveroutput on size 1000000\n" +
            "set scan off\n\n" +
            "DECLARE\n\n" +
            "   c_process_name     CONSTANT table_x_proc_def.x_name%%TYPE := '%1$s';        -- name of the process definition\n" +
            "   c_process_version  CONSTANT table_x_proc_def.x_version_dsp%%TYPE := '%2$s';   -- version MUST BE CHANGED FOR EACH RELEASE OR FT\n\n" +
            "   v_status_code     PLS_INTEGER;                     -- for the returned status code \n" +
            "   v_status_message  VARCHAR2(4000);                  -- for the returned status message \n\n" +
            "   v_proc_id         table_x_proc_def.x_id%%TYPE;      -- ID of process definition\n" +
            "\n" +
            "BEGIN\n\n"+
            "-- NO NEED TO INACTIVATE THE PREVIOUS VERSIONS OF THE PROCESS !\n"+
            "-- THE CREATE_PROCESS PROCEDURE WILL TAKE CARE OF THAT\n\n"+
            "DBMS_OUTPUT.put_line ('Process: ' || c_process_name);\n\n";

        private static final String ADD_CONFIG_ITM_SCRIPT = "" +
            "    SELECT x_id INTO v_proc_id\n" +
            "    FROM table_x_proc_def\n" +
            "    WHERE x_name = c_process_name\n" +
            "    AND x_version_dsp = c_process_version\n" +
            "    AND x_active = 1;\n\n" +
            "    sa.pkg_product_config_e.e_add_config_itm (p_name => c_process_name,\n" +
            "                                              p_description => 'Process definition for ' || c_process_name,\n" +
            "                                              p_value_type => 0,\n" +
            "                                              p_str_value => v_proc_id,\n" +
            "                                              p_category => 'Process',\n" +
            "                                              p_status_code => v_status_code,\n" +
            "                                              p_status_message => v_status_message);\n\n" +
            "    DBMS_OUTPUT.put_line (SQL%ROWCOUNT || ' config_itm record updated to point to ' || v_proc_id);\n";

    private static final String SCRIPT_END_PART = "" +
            "    EXCEPTION\n" +
            "       WHEN OTHERS THEN\n" +
            "           ROLLBACK;  -- rollback all changes\n" +
            "           RAISE;     -- terminate entire script\n" +
            "END;\n" +
            "/\n" +
            "COMMIT;";

    public static final String ICON_PATH = "sunrise/crm/ui/resources/icons/library/process/maintenance/";

    public static String generateSqlScript(XProcessDefinitionVo processDefinitionVo) {
        String scriptDeclaration = generateScriptDeclaration(processDefinitionVo);
        String createProcessScript = generateCreateProcessScript(processDefinitionVo);
        StringBuilder createActivityScript = generateCreateActivityScript(processDefinitionVo.getMainActivity(),
                null, null, "");
        return new StringBuilder(scriptDeclaration).append(createProcessScript).append(createActivityScript)
                .append(ADD_CONFIG_ITM_SCRIPT).append(SCRIPT_END_PART).toString();
    }

    private static String generateCreateProcessScript(XProcessDefinitionVo processDefinitionVo) {
        String description = processDefinitionVo.getDescription();
        String active = booleanToString(processDefinitionVo.getIsActive());
        String reversible = booleanToString(processDefinitionVo.isReversible());
        String defErrorQueue = processDefinitionVo.getDefErrorQueue();
        String defProcessingQueue = processDefinitionVo.getDefProcessingQueue();
        String defOnHoldQueue = processDefinitionVo.getDefOnholdQueue();
        String preProcessingQueue = processDefinitionVo.getPreprocessingQueue();
        String isStatusEnabled = booleanToString(processDefinitionVo.getIsStatusEnabled());
        String isStatusLogEnabled = booleanToString(processDefinitionVo.getIsStatusLogEnabled());

        StringBuilder sb = new StringBuilder();
        sb.append(TAB).append("pkg_process_config.create_process(p_name => c_process_name,").append(NL);
        sb.append(TAB9).append("p_version => c_process_version,").append(NL);
        if (CrmStringUtil.isNotBlank(defErrorQueue)) {
            sb.append(TAB9).append("p_def_err_queue => '").append(defErrorQueue).append("',").append(NL);
        }
        if (CrmStringUtil.isNotBlank(defOnHoldQueue)) {
            sb.append(TAB9).append("p_def_onhold_queue => '").append(defOnHoldQueue).append("',").append(NL);
        }
        if (CrmStringUtil.isNotBlank(defProcessingQueue)) {
            sb.append(TAB9).append(String.format("p_def_proc_queue => '%s',", defProcessingQueue)).append(NL);
        }
        sb.append(TAB9).append(String.format("p_description => '%s',", description)).append(NL);
        sb.append(TAB9).append(String.format("p_is_status_enabled => '%s',", isStatusEnabled)).append(NL);
        sb.append(TAB9).append(String.format("p_is_status_log_enabled => '%s',", isStatusLogEnabled)).append(NL);
        sb.append(TAB9).append(String.format("p_active => '%s',", active)).append(NL);

        if (CrmStringUtil.isNotBlank(preProcessingQueue)) {
            sb.append(TAB9).append(String.format("p_preprocessing_queue => '%s',", preProcessingQueue)).append(NL);
        }
        sb.append(TAB9).append(String.format("p_reversible => '%s',", reversible)).append(NL);
        sb.append(TAB9).append("p_status_code => v_status_code,").append(NL);
        sb.append(TAB9).append("p_status_message => v_status_message);").append(NL).append(NL);
        sb.append(TAB).append("DBMS_OUTPUT.put_line ('create_process = ' || v_status_code || '  status message is ' || NVL(v_status_message, 'null'));").append(NL);
        return sb.toString();
    }

    private static StringBuilder generateCreateActivityScript(XActivityDefinitionVo currentActivity, XActivityDefinitionVo parentActivity, XActivityDefinitionVo previousActivity, String activityComment) {
        StringBuilder sb = new StringBuilder();
        String name = currentActivity.getName();
        String clazz = currentActivity.getClazz();
        String description = currentActivity.getDescription();
        String definition = currentActivity.getDefinition();
        String maxDuration = currentActivity.getMax_duration();
        String expDuration = currentActivity.getExp_duration();
        String critical = currentActivity.getCritical();
        String detail = currentActivity.getDetail();
        String processingQueue = currentActivity.getProcessing_queue();
        String errorQueue = currentActivity.getError_queue();
        String provStep = currentActivity.getProv_step();
        String milestone = currentActivity.getMilestone();
        String skipInChildProc = currentActivity.getSkip_in_child_proc();
        String provStepDisplay = currentActivity.getProv_step_display();
        String messageId = currentActivity.getMessage_id();
        String positionalItem = previousActivity != null && previousActivity.getName() != null ? previousActivity.getName() : null;
        String notificationNodeId = currentActivity.getNotificationNodeId();
        String rbfw = currentActivity.getRbfw_execute();
        String isSkippable = currentActivity.getIs_skippable();
        String isRollbackAllowed = currentActivity.getIs_rollback_allowed();

        String parentName = null;
        if (parentActivity != null) {
            parentName = parentActivity.getName();
        }
        activityComment += "/" + currentActivity.getName();
        sb.append("\t--" + activityComment + ":\n");

        sb.append("\t sa.pkg_process_config.create_process_activity(p_proc_name => c_process_name,\n");
        sb.append(TAB9).append("p_proc_version => c_process_version,").append(NL);
        sb.append(TAB9).append(String.format("p_name => '%s',", name)).append(NL);
        sb.append(TAB9).append(String.format("p_class => '%s',", clazz)).append(NL);
        if (!"".equals(description)) {
            sb.append(TAB9).append(String.format("p_description => '%s',", description)).append(NL);
        }
        if (CrmStringUtil.isNotBlank(definition)) {
            sb.append(TAB9).append(String.format("p_definition => '%s',", definition)).append(NL);
        }
        if (currentActivity.getRollback()) {
            if (CrmStringUtil.isNotBlank(expDuration)) {
                sb.append(TAB9).append(String.format("p_exp_duration => '%s',", expDuration)).append(NL);
            } else {
                sb.append(TAB9).append("p_exp_duration => '0',").append(NL);
            }
            sb.append(TAB9).append(String.format("p_prov_step => '%s',", name)).append(NL);
            if (CrmStringUtil.isNotBlank(skipInChildProc)) {
                sb.append(TAB9).append(String.format("p_skip_in_child_proc => '%s',", skipInChildProc)).append(NL);
            } else {
                sb.append(TAB9).append("p_skip_in_child_proc => '0',").append(NL);
            }
            if (isRollbackActivity(previousActivity) && positionalItem != null) {
                sb.append(TAB9).append(String.format("p_positional_item => '%s',", positionalItem)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(detail)) {
                sb.append(TAB9).append(String.format("p_detail => '%s',", detail.replace("'", "''"))).append(NL);
            }
            if (CrmStringUtil.isNotBlank(parentName)) {
                sb.append(TAB9).append(String.format("p_roll_back_name => '%s',", parentName)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(rbfw)) {
                sb.append(TAB9).append(String.format("p_rbfw_execute => '%s',", rbfw)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(isSkippable)) {
                sb.append(TAB9).append(String.format("p_is_skippable => '%s',", isSkippable)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(isRollbackAllowed)) {
                sb.append(TAB9).append(String.format("p_is_rollback_allowed => '%s',", isRollbackAllowed)).append(NL);
            }
        } else {
            if (CrmStringUtil.isNotBlank(maxDuration)) {
                sb.append(TAB9).append(String.format("p_max_duration => '%s',", maxDuration)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(expDuration)) {
                sb.append(TAB9).append(String.format("p_exp_duration => '%s',", expDuration)).append(NL);
            } else {
                sb.append(TAB9).append("p_exp_duration => '0',").append(NL);
            }
            if (CrmStringUtil.isNotBlank(critical) && !"0".equals(critical)) {
                sb.append(TAB9).append(String.format("p_critical => '%s',", critical)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(detail)) {
                sb.append(TAB9).append(String.format("p_detail => '%s',", detail.replace("'", "''"))).append(NL);
            }
            if (CrmStringUtil.isNotBlank(parentName)) {
                sb.append(TAB9).append(String.format("p_parent_name => '%s',", parentName)).append(NL);
            }
            if (!isRollbackActivity(previousActivity) && positionalItem != null) {
                sb.append(TAB9).append(String.format("p_positional_item => '%s',", positionalItem)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(provStep)) {
                sb.append(TAB9).append(String.format("p_prov_step => '%s',", provStep)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(milestone)) {
                sb.append(TAB9).append(String.format("p_milestone => '%s',", milestone)).append(NL);
            }
            if (notificationNodeId != null) {
                sb.append(TAB9).append(String.format("p_notif_node_id => '%s',", notificationNodeId)).append(NL);
            }
            if (skipInChildProc != null) {
                sb.append(TAB9).append(String.format("p_skip_in_child_proc => '%s',", skipInChildProc)).append(NL);
            }else{
                sb.append(TAB9).append("p_skip_in_child_proc => '0',").append(NL);
            }
            if (CrmStringUtil.isNotBlank(provStepDisplay)) {
                sb.append(TAB9).append(String.format("p_prov_step_display => '%s',", provStepDisplay)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(messageId)) {
                sb.append(TAB9).append(String.format("p_message_id => '%s',", messageId)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(isSkippable)) {
                sb.append(TAB9).append(String.format("p_is_skippable => '%s',", isSkippable)).append(NL);
            }
            if (CrmStringUtil.isNotBlank(isRollbackAllowed)) {
                sb.append(TAB9).append(String.format("p_is_rollback_allowed => '%s',", isRollbackAllowed)).append(NL);
            }
        }

        if (CrmStringUtil.isNotBlank(processingQueue)) {
            sb.append(TAB9).append(String.format("p_process_queue => '%s',", processingQueue)).append(NL);
        }
        if (CrmStringUtil.isNotBlank(errorQueue)) {
            sb.append(TAB9).append(String.format("p_error_queue => '%s',", errorQueue)).append(NL);
        }
        sb.append(TAB9).append("p_status_code => v_status_code,").append(NL);
        sb.append(TAB9).append("p_status_message => v_status_message);").append(NL).append(NL);
        sb.append(TAB).append("DBMS_OUTPUT.put_line('create_process_activity status=' || v_status_code || ', message is ' || NVL(v_status_message, 'null'));").append(NL).append(NL);

        List<XActivityDefinitionVo> children = currentActivity.getChildren();
        for (int i = 0; i < children.size(); i++) {
            XActivityDefinitionVo prevActivity = (i > 0) ? children.get(i - 1) : null;
            sb.append(generateCreateActivityScript(children.get(i), currentActivity, prevActivity, activityComment));
        }

        return sb;
    }

    private static boolean isRollbackActivity(XActivityDefinitionVo previousActivity) {
        return previousActivity != null && previousActivity.getRollback();
    }

    private static String generateScriptDeclaration(XProcessDefinitionVo processDefinitionVo) {
        String processDefinitionName = processDefinitionVo.getName();
        String versionDsp = processDefinitionVo.getVersionDsp();
        //String newVersion = generateNewVersion(versionDsp);
        return String.format(SCRIPT_DECLARATION_PART, processDefinitionName, versionDsp);
    }

    public static String generateNewVersion(String oldVersion) {
        String[] versionArray = oldVersion.split(Pattern.quote("."));
        String newVersion = "";
        boolean isFirst = Pattern.compile("^\\d{2}\\.\\d+$").matcher(oldVersion).find();
        boolean isSecond = Pattern.compile("^\\d{2}.\\d.\\d{2}$").matcher(oldVersion).find();
        boolean isThird = Pattern.compile("^\\d{2}.\\d.\\d$").matcher(oldVersion).find();
        boolean isForth = Pattern.compile("^\\d{2}.\\d.\\d.\\d{2}$").matcher(oldVersion).find();
        if ("".equals(oldVersion)) {
            newVersion = "00.0.0.01";
        } else if (isFirst) {
            newVersion = oldVersion + ".0.01";
        } else if (isSecond) {
            int versionThirdNumber = Integer.parseInt(versionArray[2]);
            String versionForthNumber = "01";
            if (versionThirdNumber % 10 != 0) {
                versionThirdNumber = (versionThirdNumber / 10) + 1;
                versionForthNumber = "00";
            } else {
                versionThirdNumber /= 10;
            }
            if (versionThirdNumber == 10) {
                versionThirdNumber = 0;
                versionArray[1] = String.valueOf(Integer.parseInt(versionArray[1]) + 1);
            }
            if (versionArray[1].equals("10")) {
                versionArray[1] = "0";
                versionArray[0] = String.valueOf(Integer.parseInt(versionArray[0]) + 1);
            }
            newVersion = String.format("%s.%s.%d.%s", versionArray[0], versionArray[1], versionThirdNumber, versionForthNumber);
        } else if (isThird) {
            newVersion = oldVersion + ".01";
        } else if (isForth) {
            int versionForthNumber = Integer.parseInt(versionArray[3]) + 1;
            if (versionForthNumber == 100) {
                versionForthNumber = 0;
                versionArray[2] = String.valueOf(Integer.parseInt(versionArray[2]) + 1);
            }
            if (versionArray[2].equals("10")) {
                versionArray[2] = "0";
                versionArray[1] = String.valueOf(Integer.parseInt(versionArray[1]) + 1);
            }
            if ("10".equals(versionArray[1])) {
                versionArray[1] = "0";
                versionArray[0] = String.valueOf(Integer.parseInt(versionArray[0]) + 1);
            }
            newVersion = String.format("%s.%s.%s.%02d", versionArray[0], versionArray[1], versionArray[2], versionForthNumber);
        }
        return newVersion;
    }

    private static String booleanToString(boolean value) {
        return value ? "1" : "0";
    }

    public static String serializeProcessDefinition(XProcessDefinitionVo processDefinitionVo) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(processDefinitionVo);
    }

}
