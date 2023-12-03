import java.util.* ;
public class StringProblem1 {
	public static void main(String[] args) {
		String s1,s2;
		System.out.println("First and Last character equality checker by Saurav DJ\n\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		s1= sc.nextLine();
		System.out.println("Enter second String : ");
		s2 = sc.nextLine();
		if(s1.charAt(0) == s2.charAt(0) && s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1))
			 System.out.println("\nThe first and last character of borh strings are same!!!  ^_^ ");
		 else 
		     System.out.println("\nThe First and last character of both strings ain't same¡¡¡ *_*");
		sc.close();
	}
}