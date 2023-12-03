//import java.text.NumberFormat;
import java.util.Scanner;

public class MoveDriver {

	public static void main(String[] args) {
		

		String more = "yes";
		while (more.equals("yes")) {

			Scanner scan = new Scanner(System.in);
			//NumberFormat nf = NumberFormat.getCurrencyInstance();

			System.out.println("Weight?");
			double weight = scan.nextDouble();

			System.out.println("Miles?");
			double mileage = scan.nextDouble();
			
			scan.nextLine();
			
			MovingCharges movingcharges = new MovingCharges(weight,mileage);
	
			System.out.println(movingcharges.toString());

			System.out.println("More shipments?(yes or no)");
			more = scan.nextLine();
			scan.close();
		}

	}

}
