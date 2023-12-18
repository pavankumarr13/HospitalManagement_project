import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Hospital ");
        Hospital_Factory hf=new Hospital_Factory();
        Hospital_interf hi=hf.getObject();

        while(true){
            hi.choice();
            int ch=sc.nextInt();
            switch (ch) {
                case 1: hi.regPatient();
                    break;
                case 2:
                    break ;

                case 3:hi.displayPatient();
                    break ;
                
                case 4: hi.displayDoctors();
            
                default:
                    break;
            }
        }
    }
}
