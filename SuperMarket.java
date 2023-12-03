 
// SuperMarket.java - This program creates a report that lists weekly hours worked
// by employees of a supermarket. The report lists total hours for
// each day of one week.
// Input: Interactive
// Output: Report.

import java.util.Scanner;


public class SuperMarket 
{
public static void main(String args[])
{
// Declare variables.
final String HEAD1 = "WEEKLY HOURS WORKED";
final String DAY_FOOTER = " Day Total "; // Leading spaces are intentional.
final String SENTINEL = "done"; // Named constant for sentinel value.
double hoursWorked = 0; // Current record hours.

String hoursWorkedString = ""; // String version of hours
String dayOfWeek; // Current record day of week.
double hoursTotal = 0; // Hours total for a day.
String prevDay =""; // Previous day of week.
boolean done = false; // loop control

Scanner input = new Scanner(System.in);
// Print two blank lines.
System.out.println();
System.out.println();
// Print heading.
System.out.println(HEAD1);
// Print two blank lines.
System.out.println();
System.out.println();
System.out.println("Enter number of emplees : ");
int n= input.nextInt();
input.nextLine();
int [] emp = new int[n];
// Read first record
System.out.println("Enter day of week or done to quit: ");
dayOfWeek = input.nextLine();
if(dayOfWeek.compareTo(SENTINEL) == 0)
done = true;
else
{
    System.out.print("Enter hours worked: ");
    hoursWorkedString = input.nextLine();
    hoursWorked = Integer.parseInt(hoursWorkedString);
    prevDay = dayOfWeek;
    hoursTotal += hoursWorked;
    System.out.println(DAY_FOOTER + "(" + prevDay + ") " + hoursTotal);
}
while(done == false)
{
// Implement control break logic here
    System.out.println("Enter day of week or done to quit: ");
    dayOfWeek = input.nextLine();
    if(dayOfWeek.compareTo(SENTINEL) == 0)
     break;
    // Include work done in the dayChange() 
    if(prevDay.compareToIgnoreCase(dayOfWeek)!=0){
     hoursTotal = 0;
    }
    System.out.print("Enter hours worked: ");
    hoursWorkedString = input.nextLine();
    hoursWorked = Integer.parseInt(hoursWorkedString);
    prevDay = dayOfWeek;  
    hoursTotal += hoursWorked;
    System.out.println(DAY_FOOTER + "(" + prevDay + ") " + hoursTotal);

}
System.out.println(DAY_FOOTER + "(" + prevDay + ") " + hoursTotal);
input.close();

System.exit(0);

} // End of main() method.

} // End of SuperMarket class.