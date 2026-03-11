package sunrise.crm.appointment.dto;

import java.util.Calendar;

public class TimeSlotDto implements Comparable<TimeSlotDto> {

    private String timeSlotId;

    private int timeSlotSize;

    private Calendar timeSlotStartDateTime;

    private Calendar timeSlotEndDateTime;

    private boolean outOfSaSla;

    private int rank;

    private String duration;
    private String date;
    private String startTime;
    private String endTime;

    public TimeSlotDto(
            String timeSlotId,
            int timeSlotSize,
            Calendar timeSlotStartDateTime,
            Calendar timeSlotEndDateTime,
            boolean outOfSaSla,
            int rank) {
        this.timeSlotId = timeSlotId;
        this.timeSlotSize = timeSlotSize;
        this.timeSlotStartDateTime = timeSlotStartDateTime;
        this.timeSlotEndDateTime = timeSlotEndDateTime;
        this.outOfSaSla = outOfSaSla;
        this.rank = rank;
        setStartTime();
        setEndTime();
        setDuration();
        setDate();
    }

    public TimeSlotDto(
            String timeSlotId, Calendar timeSlotStartDateTime, Calendar timeSlotEndDateTime) {
        this.timeSlotId = timeSlotId;
        this.timeSlotStartDateTime = timeSlotStartDateTime;
        this.timeSlotEndDateTime = timeSlotEndDateTime;
        setStartTime();
        setEndTime();
        setDuration();
        setDate();
    }

    public TimeSlotDto(
            String timeSlotId,
            Calendar timeSlotStartDateTime,
            Calendar timeSlotEndDateTime,
            boolean outOfSaSla,
            int rank) {
        this.timeSlotId = timeSlotId;
        this.timeSlotStartDateTime = timeSlotStartDateTime;
        this.timeSlotEndDateTime = timeSlotEndDateTime;
        this.outOfSaSla = outOfSaSla;
        this.rank = rank;
        setStartTime();
        setEndTime();
        setDuration();
        setDate();
    }

    @Override
    public int compareTo(TimeSlotDto o) {

        if (this.timeSlotStartDateTime.before(o.getTimeSlotStartDateTime())) {
            return 1;
        }

        if (this.timeSlotStartDateTime.equals(o.getTimeSlotStartDateTime())) {

            if (this.timeSlotEndDateTime.before(o.getTimeSlotEndDateTime())) {
                return -1;
            }

            return 1;
        }

        return -1;
    }

    public String getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getStartTime() {
        return startTime;
    }

    public Calendar getTimeSlotEndDateTime() {
        return timeSlotEndDateTime;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public int getTimeSlotSize() {
        return timeSlotSize;
    }

    public void setTimeSlotSize(int timeSlotSize) {
        this.timeSlotSize = timeSlotSize;
    }

    public Calendar getTimeSlotStartDateTime() {
        return timeSlotStartDateTime;
    }

    public boolean isOutOfSaSla() {
        return outOfSaSla;
    }

    public void setOutOfSaSla(boolean outOfSaSla) {
        this.outOfSaSla = outOfSaSla;
    }

    public void setEndTime() {
        int hour = timeSlotEndDateTime.get(Calendar.HOUR_OF_DAY);
        int minute = timeSlotEndDateTime.get(Calendar.MINUTE);

        endTime = String.format("%02d:%02d", hour, minute);
    }

    private void setDate() {
        int day = timeSlotStartDateTime.get(Calendar.DAY_OF_MONTH);
        int month = timeSlotStartDateTime.get(Calendar.MONTH);
        int year = timeSlotStartDateTime.get(Calendar.YEAR);

        date = String.format("%02d.%02d.%4d", day, month + 1, year);
    }

    private void setDuration() {
        long milli = timeSlotEndDateTime.getTimeInMillis() - timeSlotStartDateTime.getTimeInMillis();
        int dur = (int) milli / (60 * 60 * 1000);
        duration = String.valueOf(dur);
    }

    private void setStartTime() {
        int hour = timeSlotStartDateTime.get(Calendar.HOUR_OF_DAY);
        int minute = timeSlotStartDateTime.get(Calendar.MINUTE);

        startTime = String.format("%02d:%02d", hour, minute);
    }
}
