import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Hospital ");
        Hospital_Factory hf=new Hospital_Factory();
        Hospital_interf hi=hf.getObject();
       

        while(true){
            System.out.println();
            hi.choice();
            int ch=sc.nextInt();
            switch (ch) {
                case 1: hi.regPatient();
                  
                    break;
                case 2: 
                    // boolean reg=hi.checkBoolean();
                    hi.scheduleAppointment();
                    break ;

                case 3:hi.displayPatient();
                    break ;
                
                case 4: hi.displayDoctors();
                    break;

                case 5: hi.displayAppointment();
                    break;
                    
                case 6: hi.generateBill();
                    break ;
                case 7: System.out.println("Thank You ....!");
                        System.exit(0);
                default:
                    break;
            }
        }
    }
}
