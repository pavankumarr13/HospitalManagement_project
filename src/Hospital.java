import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital implements Hospital_interf {
    Scanner sc=new Scanner(System.in);
    int patientcount=1;
  
    List<Patient> patient=new ArrayList<>();
    List<Doctor> doctor = new ArrayList<>();
    Hospital(){
        doctor.add(new Doctor("John",1,"Cardiologist"));
        doctor.add(new Doctor("Vishwash",2,"Dermatologist"));
        doctor.add(new Doctor("Suhas",3,"Diabetologist"));
        doctor.add(new Doctor("Raj",4,"Gynecologist"));
        doctor.add(new Doctor("Suchin",5,"Neurologist"));
        doctor.add(new Doctor("Shilpa",6,"Dietition"));
        doctor.add(new Doctor("Sdidarth",7,"Physiothearapist"));
    }

    
    
    


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

        int pid=0;
        System.out.println("Enter Your Patient id : ");
        int id = sc.nextInt();
        sc.nextLine();
        
        for(Patient p:patient){
            try{
                if(p.getId()==id){
                    pid=1;
                    throw new PatientAlreadyExistsException();
                    
                 }
                }catch(PatientAlreadyExistsException e){
                     System.out.println(e.getMessage());
                    }
            }

        if(pid==0){
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
    
    

    }

    @Override
    public void displayDoctors() {
        System.out.printf(" %-2s  %-15s  %-15s %n","Id","Doctor Name","Specialization");
        for(Doctor d : doctor){
            System.out.println(d);
        }
    }

    @Override
    public void displayPatient() {
        System.out.printf(" %-2s  %-15s  %-12s  %-15s %n", "Id","Patient Name","Contact","MedicalHistory");
        for(Patient patient : patient){
            System.out.println(patient);
        }
    }

    
    @Override
    public void scheduleAppointment() {
        System.out.println("Enter the Patient Id :");
        int pid=sc.nextInt();

        try{
            for(Patient p :patient){
                if(pid==p.getId()){
                    throw new AppointmentException();
                }
            }
        }catch(AppointmentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Enter the date of appointment required : (DD:MM:YYYY) ");
        String date=sc.nextLine();

        System.out.println("Enter the time of   appointment required : (00:00) ");
        String time=sc.nextLine();

        String meridien;

        while(true){
            System.out.println("Please select the choice \n1.\tAM\n2.\tPM");
            int choice=sc.nextInt();

            switch(choice) {
                case 1: meridien="AM";
                    break;
                case 2: meridien="PM";
                    break;
                default: System.out.println("Invalid choice");
                    break;
            }

            if(choice==1 || choice==2){
                break;
            }
        }
        
        
    }

    @Override
    public void displayAppointment(Appointment a) {
    }

    @Override
    public void generateBill() {
    }
    
}
