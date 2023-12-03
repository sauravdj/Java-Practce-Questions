// Java program to reverse a given number by Saurav DJ
import java.util.Scanner;
class ReverseNumber
{
public static void main (String sdj[])
{
	System.out.println("*^*^* Reverse number by Saurav *^*^*^ ");
	int number, reverse=0,rem;
	Scanner sc=new Scanner ( System.in);
	System.out.println("\n\nEnter any integer:");
	number = sc.nextInt();
	System.out.println(number);
	while (number !=0)
	{
		rem=number%10;
		reverse=reverse*10+rem;
		number=number/10;
	}
	System.out.println("\nReversed number is:"+reverse);
	sc.close();	
 }
}