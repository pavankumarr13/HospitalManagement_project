public class Appointment {
    private int appId;
    private int patientId;
    private String appdate ;
    private String appTime;
    private String meridiem;

    Appointment(int appId, int patientId, String appdate, String appTime, String meridiem) {
        this.appId = appId;
        this.patientId = patientId;
        this.appdate = appdate;
        this.appTime = appTime;
        this.meridiem=meridiem;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getAppdate() {
        return appdate;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public String getAppTime() {
        return appTime;
    }

    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    public String getMeridiem() {
        return meridiem;
    }

    public void setMeridiem(String meridiem) {
        this.meridiem = meridiem;
    }

    



}
