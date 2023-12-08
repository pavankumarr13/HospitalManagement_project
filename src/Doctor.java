public class Doctor {
    String name,specialization;
    int did;

    String [] doctors={"John","Vishwash","Suhas","Raj","Suchin","Shilpa","Sdidarth"};
    int[] doctorsID={1,2,3,4,5,6,70};
    String[]specification={"Cardiologist","Dermatologist","Diabetologist","Gynecologist","Neurologist","Dietition","Physiothearapist"};
   
   
   
    public String getName(int i) {
        return doctors[i];
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialization(int i) {
        return specification[i];
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public int getDid(int i) {
        return doctorsID[i];
    }
    public void setDid(int did) {
        this.did = did;
    }
    
    
    



}
