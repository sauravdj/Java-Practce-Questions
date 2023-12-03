
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     double meters= -1;
     while(meters<0){
      System.out.println("Enter meters: ");
      meters = sc.nextDouble();
    }
     int ch;
     do{
        menu();
        System.out.println("Enter choice: ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
               showKilometers(meters);
               break;
            case 2:
               showInches(meters);
               break;
            case 3:
               showFoots(meters);
               break;    
            case 4:
                System.out.println("Quitting ");
                break;  
            default: 
                System.out.println("Enter correct choice!!!");      
        }
     }
     while(ch != 4);
     sc.close();
    }
    public static void showKilometers(double meters){
        double kiloMeters = meters * 0.001;
        System.out.println("Total kilometers: "+kiloMeters);
    }
    public static void showInches(double meters){
        double inches = meters * 39.37;
        System.out.println("Total Inches: "+inches);
    }
    public static void showFoots(double meters){
        double foots = meters * 3.28;
        System.out.println("Total Inches: "+foots);
    }
    public static void menu() {
        System.out.println("\n1. Convert meters to Kilometers.\n"
        +"2. Convert meters to Inches.\n"
        +"3. Convert meters to Foots.\n"
        +"4. Quit\n");
    }
}

