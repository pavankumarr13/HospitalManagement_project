public class Doctor {
    String name,specialization;
    int did;

    // String [] doctors={"John","Vishwash","Suhas","Raj","Suchin","Shilpa","Sdidarth"};

    Doctor(String nm,int id, String specl){
        name=nm;
        did=id;
        specialization=specl;
    }
    // int[] doctorsID={1,2,3,4,5,6,7};
    // String[]specification={"Cardiologist","Dermatologist","Diabetologist","Gynecologist","Neurologist","Dietition","Physiothearapist"};
   
   
   
    public String getName(int i) {
        this.did=i;
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // public String getSpecialization(int i) {
    //     return specification;
    // }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    // public int getDid(int i) {
    //     return doctorsID[i];
    // }
    public void setDid(int did) {
        this.did = did;
    }
    public String toString() {
        

        return String.format(" %-2s  %-15s  %-15s %n",did, name, specialization);
    }
    
    
    



}
