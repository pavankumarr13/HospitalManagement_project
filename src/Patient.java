public class Patient {
    private String pname ;
    private int id;
    private long contact;
    private int condition;
    int count=0;
    private double amount;
    private String dname;
    String [] conditionsStrings={"Cardiology", "Dermatology", "Diabetology", "Gynecology", "Neurology", "Diet", "Physiology"};
    String [] doctors={"John","Vishwas","Suhas","Raj","Suchin","Shilpa","Siddarth"};
    int[] amt={3000,2500,1800,4000,3200,1500,5000};
    Patient(){}//for Default Values

    Patient(String name ,int id ,long contact ,int condition ){
        this.pname = name;
        this.id = id;
        this.contact = contact;
        this.condition = condition;
        // this.dname = dname;
        // this.amount = amount;
    }

    public String getPname() {
        return this.pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
    @Override 
    public String toString() {
        

        return String.format(" %-2d  %-15s  %-12d  %-15s %n",id, pname, contact, conditionsStrings[condition-1]);
    }

   

    public double getAmount() {
        amount=amt[condition-1];
        return amount;
    }

    public String getDname() {
        dname=doctors[condition-1];
        return dname;
    }

    public String[] getConditionsStrings() {
        return conditionsStrings;
    }
        

    
}
