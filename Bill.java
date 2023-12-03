// practical question 1
// billing program in java 
import java.text.DecimalFormat;
import java.util.Scanner;
class Bill 
 {
    static public void main (String arg[])
      {
        Float p ,q , dis, ta, bill ;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("###.");
        System.out.println("Enter price of item : " );
        
       p = sc.nextFloat(); 
     
       System.out.println(p);
     
       System.out.println("\nEnter quantity of item : " );
   
       q = sc.nextFloat();
       System.out.println(q );
       ta = p * q;
     
       dis =( ta/100)*20;      //20% diacount 
    
       bill = ta - dis;
   
       System.out.println("\nTotal bill amount is : " +ta);
       System.out.printf("\nTotal amount after 20 discount : %5.200f",bill);
       System.out.println("\nTotal amount after 20% discount :  "+ft.format(bill));
       sc.close();
   }
}
