package sunrise.crm.xvo.bizOrder;

public class BizOrderAttributeVo {

        private String sitePartObjid;      // site_part.objid
        private String serialNo;           // site_part.serial_no
        private String modLevelObjid;      // mod_level.objid
        private String defObjid;           // x_attribute_def.objid
        private String name;               // x_attribute_def.x_name
        private String required;           // x_attribute_def.x_required (yes/no)
        private String type;               // x_attribute_def.x_type: from list / free text
        private String source;             // x_attribute_def.x_source
        private int    sequence;           // x_attribute_def.x_seq_num
        private String valObjid;           // x_part_attribute_value.objid
        private String value;              // x_part_attribute_value.x_value
        private String defDefault;         // x_attribute_def.x_default
        private int    level;              // 
        private String validation;         // x_attribute_def.x_validation
        private int    validationMinValue; // x_attribute_def.x_min_value
        private int    validationMaxValue; // x_attribute_def.x_max_value

        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

        public BizOrderAttributeVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
        public String getSitePartObjid() {
            return sitePartObjid;
        }
        
        public void setSitePartObjid(String sitePartObjid) {
            this.sitePartObjid = sitePartObjid;
        }

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getSerialNo() {
			return serialNo;
		}
  
        public void setModLevelObjid(String modLevelObjid) {
			this.modLevelObjid = modLevelObjid;
		}

		public String getModLevelObjid() {
			return modLevelObjid;
		}

		public String getDefObjid() {
            return defObjid;
        }
        
        public void setDefObjid(String defObjid) {
            this.defObjid = defObjid;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getRequired() {
            return required;
        }
        
        public void setRequired(String required) {
            this.required = required;
        }
        
        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type = type;
        }
        
        public String getSource() {
            return source;
        }
        
        public void setSource(String source) {
            this.source = source;
        }
        
        public int getSequence() {
            return sequence;
        }
        
        public void setSequence(int sequence) {
            this.sequence = sequence;
        }
        
        public String getValObjid() {
            return valObjid;
        }
        
        public void setValObjid(String valObjid) {
            this.valObjid = valObjid;
        }
        
        public String getValue() {
            return value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
        
        public String getDefDefault() {
            return defDefault;
        }
        
        public void setDefDefault(String defDefault) {
            this.defDefault = defDefault;
        }
        
        public int getLevel() {
            return level;
        }
        
        public void setLevel(int level) {
            this.level = level;
        }

		@Override
		public String toString() { 
			return "BizOrderAttributeVo [sitePartObjid=" + sitePartObjid
					+ ", serialNo=" + serialNo + ", modLevelObjid="
					+ modLevelObjid + ", defObjid=" + defObjid + ", name="
					+ name + ", required=" + required + ", type=" + type
					+ ", source=" + source + ", sequence=" + sequence
					+ ", valObjid=" + valObjid + ", value=" + value
					+ ", defDefault=" + defDefault + ", level=" + level + "]";
		}

		public String getValidation() {
			return validation;
		}

		public void setValidation(String validation) {
			this.validation = validation;
		}

		public int getValidationMinValue() {
			return validationMinValue;
		}

		public void setValidationMinValue(int validationMinValue) {
			this.validationMinValue = validationMinValue;
		}

		public int getValidationMaxValue() {
			return validationMaxValue;
		}

		public void setValidationMaxValue(int validationMaxValue) {
			this.validationMaxValue = validationMaxValue;
		}

}
