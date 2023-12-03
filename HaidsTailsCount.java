import java.util.Scanner; 


public class HaidsTailsCount{
	public static void main(String[] args) { 
   
int heads = 0;
int tails = 0;

double headstotal;
double tailstotal;

Scanner sc = new Scanner(System.in);
String s ;

for(int i=0; i<8; i++){

System.out.println("Heads or Tails?");
s =sc.next();
if (s.equals("t")){
tails++;
}
if (s.equals("h")){

heads++;
}


}
System.out.println("tails " + tails);
System.out.println("heads " + heads);

headstotal = (heads * 100 / 8) ;
tailstotal = (tails * 100 / 8) ;

System.out.println("Percentage of tails " + tailstotal);
System.out.println("Percentage of heads " + headstotal);
sc.close();

}
}