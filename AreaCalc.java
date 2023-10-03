import java.util.*;
import java.lang.Math;

class Area
 {
 	float l, w, h, ans;
 	double p,q,r;
 	Area(double x,double y, double z)
 	{
 	 p = x;
 	 q = y;
 	 r = z;
 	}
 	Area (float x, float y)
 	{
 		l = x;
 		w = y;
 	}
 	Area(float x)
 	{
 		l=x;
 	}
 	float rectArea()
 	{
 		ans  = l * w;
 		return ans;
 	}
 	float circleArea()
 	{
 		ans = 3.14f * l * l;
 		return ans;
 	}
 	float triArea1()
 	{
 		ans = (0.5f)*l*w;
 		return ans;
 	}
 	double triArea2()
 	 {
 	 	double s = (p+q+r)/2;
 	     double ans= Math.sqrt(s*(s-p)*(s-q)*(s-r));
 	 	float answer =(float) ans;
 	 	System.out.println(answer);
 	 	return ans;
 	 }
 }	
public class AreaCalc 
 {
	public static void main(String[] args) 
	
		{
			System.out.println("  *_*		Trignometric Area Calculator     *_* \n 			 Saurav DJ        ");
			float l, w, result;
			int opt;
			Area a;
			Scanner sdj = new Scanner(System.in);
		do{
			System.out.println("=========================================================");
			System.out.println("Enter choice : \n1)Enter 1 for area of rectangle .\n2)Enter 2 for area of circle.\n3)Enter 3 for area of triangle. ");		
			System.out.print("\nEnter your choice :  ");
			opt = sdj.nextInt();
			System.out.println("=========================================================");
		
			switch(opt)
			  {
			  	case 1 :
			  	{
			 	 	System.out.print("\nEnter length and width of Rectangle : ");	
			  	 l = sdj.nextFloat();
			  	 w= sdj.nextFloat();
			  	 a = new Area(l,w);
			  	 result = a.rectArea();
			  	 System.out.println("\nArea of rectangle having length "+l+" unit and width "+w+" unit is "+result+ " unit sq.");
			  	 break;
			    }
			    case 2 :
			     {
			     	System.out.print("\nEnter radius of circle : ");
			     	l = sdj.nextFloat();
			     	a = new Area(l);
			     	result = a.circleArea();
			     	System.out.println("Area of circle of radius "+l+" unit is "+result+" unit sq.");
			     	break;
			     }
			   case 3 :
			     {
			   	System.out.println("\nThere are two ways to calculate Area of triangle : \n1)USING BASE AND HEIGHT \n2)USING LENGTHS OF THREE SIDES ");
			   	System.out.print("Enter your choice : ");
			   	int ch =sdj.nextInt();
			   	if(ch == 1)
			   	{
			   		System.out.print("\nEnter BASE and HEIGHT : ");
			   		l = sdj.nextFloat();
			   		w = sdj.nextFloat();
			   		a = new Area(l,w);
			   		result = a.triArea1();
			   		System.out.println("\nThe area of Triangle having Base " +l+ " unit and Height "+w+" unit is "+result +" unit sq.");
			   	}
			   	else if( ch == 2)
			   	{
			   		System.out.println("\nEnter lengths of sides of triangle : ");
			   		double p = sdj.nextDouble();
			   		double q = sdj.nextDouble();
			   		double r = sdj.nextDouble();
			   		a = new Area(p,q,r);
			   		double resu = a.triArea2();
			   		System.out.println("\nThe area of Triangle having lengths of its side  " +p+", "+q+", "+r+" is " +String.format("%.2f",resu)+" unit sq.");
			   		
			   	}
			   	
		 	     }	 
			  }
			 
		}while(opt != 5);
		sdj.close();	
		/*	
			Area a1 =new Area();
			Area c = new Area (10f);
		    float a = a1.rectArea();
		    System.out.println(c.circleArea());
		    Area t1 = new Area (2.3f,2.4f );
	    
		*/
	}
}