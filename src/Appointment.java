public class Appointment {
    private int appId;
    private int patientId;
    private String appdate ;
    private String appTime;
    private String meridiem;
    private String dname;
    private String pname;
    private double amt;
    Appointment(){}//Default values
    

    Appointment(int appId, int patientId, String appdate, String appTime, String meridiem,String dname,String pname,double amt) {
        this.appId = appId;
        this.patientId = patientId;
        this.appdate = appdate;
        this.appTime = appTime;
        this.meridiem=meridiem;
        this.dname = dname;
        this.amt = amt;
        this.pname = pname;
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


    public String getDname() {
        return dname;
    }


    public String getPname() {
        return pname;
    }


    public double getAmt() {
        return amt;
    }
    @Override
    public String toString() {
        return String.format(" %-2s  %-15s  %-15s  %-12s %-6s %n", appId,dname,pname,appdate,appTime);
    }

    



}
