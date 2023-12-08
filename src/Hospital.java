import java.util.ArrayList;
import java.util.Scanner;

public class Hospital implements Hospital_interf {
    Scanner sc=new Scanner(System.in);
    int patientcount=1;

    ArrayList  patient=new ArrayList<Patient>();

    
    
    


    @Override
    public void choice() {
        System.out.println("Enter Your Choice....!");
        System.out.println("1.Rigister Patient");
        System.out.println("2.Schedule Appointment");
        System.out.println("3.Display Patient list");
        System.out.println("4.Display Doctor list");
        System.out.println("5.Display Scheduled Appointment list");
        System.out.println("6.Genearate bill");
        System.out.println("7.Exit");
    }

    @Override
    public void patientCondition(){
        System.out.println("Enter Patient's Medical Condition");

        System.out.println("1.Heart pain");
        System.out.println("2.Skin,Hair or Nail disorder");
        System.out.println("3.Diabeties");
        System.out.println("4.Women's Haelth issues");
        System.out.println("5.Neuro disorders");
        System.out.println("6.Health issues regarding food");
        System.out.println("7.Any Physical pain");

    }

    @Override
    public void regPatient(){
        System.out.println("Your Patient id : "+patientcount);
        int id = patientcount;
        patientcount++;
        
        System.out.println("Enter the patient Name");
        String name=sc.nextLine();

        System.out.println("Enter the contact number");
        long c=sc.nextLong();

        
        patientCondition();
        int condition=sc.nextInt();
        try{
           if(condition>0 && condition<8){
                Patient p=new Patient(name,id,c,condition);

                patient.add(p);

                System.out.println("Patient registered successfully");
                
           }else{
            throw new InvalidCondition();
           }
         }catch(InvalidCondition e){
            System.out.println(e.getMessage());
        }
    

    }

    @Override
    public void displayDoctors(Doctor d) {
        System.out.print(" %-2d  %-12s  %-10d  %-14s %n");
    }

    @Override
    public void displayPatient() {
        System.out.printf(" %-2s  %-12s  %-10s  %-14s %n", "Id","PatientName","Contact","MedicalHistory");
        for(Patient patient :patient){

        }
    }

    @Override
    public void displayAppointment(Appointment a) {
    }

    @Override
    public void generateBill() {
    }
    
}
