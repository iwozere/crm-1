package sunrise.crm.appointment.dto;

import java.util.Date;

public class TechnicianTimeslotDto implements Comparable<TechnicianTimeslotDto> {

	private String jobId;
	private String appointmentId;
	private String jobType;
	private Date startDate;
	private Date endDate;
	private String timeslotType;
	private String workorderType;
	private String workorderSubtype;
	private Date validTill;
	
	public TechnicianTimeslotDto() {
		super();
	}
	
	public TechnicianTimeslotDto(String jobId, String appointmentId, String jobType, Date startDate, Date endDate,
			String timeslotType) {
		super();
		this.jobId = jobId;
		this.appointmentId = appointmentId;
		this.jobType = jobType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timeslotType = timeslotType;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTimeslotType() {
		return timeslotType;
	}

	public void setTimeslotType(String timeslotType) {
		this.timeslotType = timeslotType;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public String getWorkorderType() {
		return workorderType;
	}

	public void setWorkorderType(String workorderType) {
		this.workorderType = workorderType;
	}

	public String getWorkorderSubtype() {
		return workorderSubtype;
	}

	public void setWorkorderSubtype(String workorderSubtype) {
		this.workorderSubtype = workorderSubtype;
	}

	@Override
	public int compareTo(TechnicianTimeslotDto anotherTimeslot) {

		if (this.startDate.compareTo(anotherTimeslot.startDate) == 0) {
			return this.endDate.compareTo(anotherTimeslot.endDate);
		}
		
		return this.startDate.compareTo(anotherTimeslot.startDate);
	}

}
