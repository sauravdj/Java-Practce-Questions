import java.util.Scanner;

class ElectricityBill
{
	public static void main (String args[])
	{
		int pr,cr,mtr,tr;
		double amo= 0, bill, tax;
		String name;
		System.out.println("\n^-^*^-^*Bill calculator by Saurav^-^_^-^");
		Scanner sdj =new Scanner(System.in);
		System.out.println("\nEnter Customer Name : ");
		name = sdj.nextLine();
		System.out.println("\nEnter meter number : ");
		mtr = sdj.nextInt();
		System.out.println("\n***************BILL CALCULATOR******************");
		System.out.println("\nEnter Previous Reading : ");
		pr = sdj.nextInt();
		System.out.println("Enter Current Reading : ");
		cr = sdj.nextInt();
		tr = cr - pr; // total reading
		System.out.println("\nTotal Readings = "+tr);
		if(tr<50)
		{
			amo = tr *0.60;
		}
		else if(tr>=50 && tr<200)
		{
			amo = tr * 1.00;
		}
		else if (tr>=200 && tr <500)
		{
			amo = tr * 1.50;
		}
		else if(tr >= 500)
		{
			amo = tr * 1.80;
		}
		System.out.println("Name of customer: "+ name);
		System.out.println("Meter number: "+ mtr);
		System.out.println("\nTotal readings = "+ tr);
		System.out.println("\nAmount is = "+ amo);
		tax = (3*amo)/100;
		System.out.println("\nTotal tax applied = "+ tax);
		bill = tax + amo;
		System.out.println("\nTotal Bill with 3 % tax is : "+bill);
		sdj.close();	
	}
}	