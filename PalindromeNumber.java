//Palindrome number checker by Saurav
import java.util.Scanner;
class PalindromeNumber
{
public static void main (String [] Saurav)
 {
	int no, rem,reverse=0;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter any three digit no:");
	no=sc.nextInt();
	System.out.println(no);
	int number =no;
	while (number!=0)
	{
		rem =number%10;
		reverse=reverse*10+rem;
		number=number/10;
	}
	System.out.println("reversed number is;"+reverse);
	if(no==reverse)
	{
		System.out.println("The number is palindrome number.");
	}
	else
	{
	System.out.println("The number is not palindrome number....");
	}
	sc.close();
 }
}