package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.BBCSF2ALO_MIGRATION)
public class XBBCSFMigrationData {
	
	 	@XColumn(id = 0, required = true)
	    public String siteId;

	    @XColumn(id = 1)
	    public String productSerial;
	    
	    @XColumn(id = 2)
	    public String otoId;
	    
	    @XColumn(id = 3)
	    public String migrationScenario;
	    
	    @XColumn(id = 4)
	    public String migrationDate;
	    
	    @XColumn(id = 5)
	    public String migrationDateOverride;

		public String getSiteId() {
			return siteId;
		}

		public void setsiteId(String siteId) {
			this.siteId = siteId;
		}

		public String getProductSerial() {
			return productSerial;
		}

		public void setproductSerial(String productSerial) {
			this.productSerial = productSerial;
		}

		public String getOtoId() {
			return otoId;
		}

		public void setotoId(String otoId) {
			this.otoId = otoId;
		}

		public String getMigrationScenario() {
			return migrationScenario;
		}

		public void setmigrationScenario(String migrationScenario) {
			this.migrationScenario = migrationScenario;
		}

		public String getMigrationDate() {
			return migrationDate;
		}

		public void setmigrationDate(String migrationDate) {
			this.migrationDate = migrationDate;
		}

		public String getMigrationDateOverride() {
			return migrationDateOverride;
		}

		public void setmigrationDateOverride(String migrationDateOverride) {
			this.migrationDateOverride = migrationDateOverride;
		}
}
