// Intrest rate calculater by Saurav__dj

import java.util.Scanner;
 
class Intrest
{
 public static void main(String[] saurav)
 {
  
  float rate,year,intrest,bal,age,total;
  String name;
  Scanner sdj =new Scanner(System.in);
  System.out.println("Name of customer :");
  name = sdj.nextLine();
  System.out.println(name);
  System.out.println("\nEnter customer age : " );
  age = sdj.nextFloat();
  System.out.println(age);
  System.out.println("\nEnter current balance : " );
  bal = sdj.nextFloat();
  System.out.println(bal+"\n");
  System.out.println("Enter intrest rate(per month) : ");
  rate = sdj.nextFloat();
  System.out.println(rate+"\n");
  System.out.println("Enter time duration (in month): ");
  year = sdj.nextFloat();
  System.out.println(year+"\n");
  
  System.out.println("*^*^*^*^*^*^*^*^*Total amount calculator^*^*^*^*^*^*^*^*^*\n\n\n");
  
  intrest= bal*rate*year/100;
  
  total=intrest+bal;
     
 System.out.println("Total account amount after "+year+" months with intrest rate "+ rate+ " is " + total);
 sdj.close();
}}
