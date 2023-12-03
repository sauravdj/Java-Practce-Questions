//Fibonacci series of given number by  Saurav

import java.util.Scanner;
class Fibonacci
{
	public static void main (String  Sdj[] )
	{
		System.out.println("*^*^* Fibonacci series by Saurav DJ *^*^*");
		int i=0,no,fibo=0;
		System.out.println("\n\nEnter any number to print Fibonacci series:");
		Scanner sc= new Scanner (System.in);
		no=sc.nextInt();
		System.out.println(no);
		System.out.println("The Fibonacci series of "+no+"term is");
		while (i<=no)
		{
			fibo=fibo+i;
			i++;
			System.out.print(fibo+"\n");
		}
		sc.close();
	}
 }