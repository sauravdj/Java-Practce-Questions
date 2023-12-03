
import java.util.Scanner;


public class arraysort{
   public static void main(String[] args) {
       String cityName[] = new String[3];


       // Read in two cities from the user
       Scanner input = new Scanner(System.in);


       System.out.print("Please enter the first city: ");
       cityName[0] = input.nextLine();


       System.out.println("Please enter the second city: ");
       cityName[1] = input.nextLine();


       System.out.println("Please enter the third city: ");
       cityName[2] = input.nextLine();


       //Compare cities and print in order
       for (int i = 0; i < cityName.length-1; i++) {
           for (int j = i+1; j < cityName.length; j++) {
               if(cityName[i].compareToIgnoreCase(cityName[j]) > 0) {
                  // comparetoIgnoreCase
                   String temp = cityName[i];
                   cityName[i]=cityName[j];
                   cityName[j]=temp;
               }
           }
       }
       for (int i = 0; i < cityName.length; i++) {
           System.out.println(cityName[i]);
       }
       input.close();
   }
}


