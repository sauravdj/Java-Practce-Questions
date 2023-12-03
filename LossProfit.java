//loss  profit counter by Sauravdj
import java.util.Scanner;
class LossProfit
{
  	int p , s;
  	LossProfit(int p, int s)
 	 { 
   	 this.p=p;
 	   this.s=s;
	  }
	void result()
	 { 
	   if (p<s)
 	   {
   	  	System.out.println("There is Profit!!");
	     	System.out.println("\nTotal profit is : "+ (s-p));		 }
	  else if(s<p)
	 	{
 			System.out.println("\nThere is loss!!!");
			 System.out.println("\nTotal loss is : "+ (p-s));
		}
		else 
		{
	    	System.out.println(" There is no profit or loss");
		}
 	}
	public static void main(String sdj[])
	 {
 		System.out.println("Loss profit calculator by Saurav DJ\n\n");
		  int x,y;
		  System.out.println("Enter Purchase and sell values :");
		 Scanner sc =new Scanner(System.in);
	 x=sc.nextInt();
	 y=sc.nextInt();
	System.out.println("Purchase : "+ x+"\nSell : "+y);
	LossProfit s = new LossProfit(x, y);
	s.result();
	sc.close();
  }

}