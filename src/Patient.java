public class Patient {
    private String name ;
    private int id;
    private long contact;
    private int condition;
    int count=0;
    String [] conditionsStrings={"Cardiology", "Dermatology", "Diabetology", "Gynecology", "Neurology", "Diet", "Physiology"};

    Patient(String name ,int id ,long contact ,int condition){
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        

        return String.format(" %-2d  %-15s  %-12d  %-15s %n",id, name, contact, conditionsStrings[condition-1]);
    }
        

    
}
