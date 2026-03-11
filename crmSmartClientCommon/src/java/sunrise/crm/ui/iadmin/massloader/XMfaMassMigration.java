package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.MFA_MASS_MIGRATION_DATA)
public class XMfaMassMigration {
	
	@XColumn(id = 0, required = true)
    public String siteId;
	
	@XColumn(id = 1)
	public String migrationScenario;	
	 
	 
	// Only OUT Params
	    
	    public String migrationStatus;
	    
	    public String migrationStage;

	     
	    public String failureReason;
	    
	    public String getSiteId() {
			return siteId;
		}

		public void setsiteId(String siteId) {
			this.siteId = siteId;
		}

		

		

		public String getMigrationScenario() {
			return migrationScenario;
		}

		public void setmigrationScenario(String migrationScenario) {
			this.migrationScenario = migrationScenario;
		}

		public String getMigrationStatus() {
			return migrationStatus;
		}

		public void setMigrationStatus(String migrationStatus) {
			this.migrationStatus = migrationStatus;
		}

		

		public String getMigrationStage() {
			return migrationStage;
		}

		public void setMigrationStage(String migrationStage) {
			this.migrationStage = migrationStage;
		}

		public String getFailureReason() {
			return failureReason;
		}

		public void setFailureReason(String failureReason) {
			this.failureReason = failureReason;
		}

}