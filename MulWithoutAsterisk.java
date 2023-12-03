// multiplication of given number without using asterisk(*) by Saurav DJ
import java.util.Scanner;
class MulWithoutAsterisk
	{
	public static void main(String arg[])
		{
			System.out.println("Multiplication of given number without using asterisk(*) by Saurav DJ");
			int m,n,product=0,i=1;
			System.out.println("\nEnter any two number to calculate multiplication without using asterisk*:\n");
			Scanner sc=new Scanner (System.in);
			m=sc.nextInt();
			n=sc.nextInt();
			System.out.println("m = "+m+"\nn = "+n);
			System.out.println("\nThe multiplication of two number :");
			while (i<=n)
				{
					product=product+m;
					i++;
				}
				System.out.print(product);
				sc.close();
		}
	}