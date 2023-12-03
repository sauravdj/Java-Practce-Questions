import java.util.Scanner;

public class RockPaperScissorsWithMethods {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		String ch = "yes";
		
		while (ch.equals("yes")){
		String compChoice = computerChoice();
		String playerChoice = userChoice();
		determineWinner(playerChoice, compChoice);
		System.out.println("Do you want to continue? yes/no:");
        ch = scan.nextLine();
		}
		scan.close();
	}

	public static String computerChoice() {

		// get computer choice
		int computer = ((int) (Math.random() * 3 + 1));
		String comp = "";

		if (computer == 1)
			comp = "rock";
		else if (computer == 2)
			comp = "paper";
		else
			comp = "scissors";

		return comp;
	}

	public static String userChoice() {
      
		System.out.println("Please enter rock, paper, or scissors using only lower case letters");
		String user = scan.nextLine();
        
	if (isValidChoice(user))
        return user;
    else{
         return userChoice();
	}
     
	}

	public static boolean isValidChoice(String user) {

		boolean notValid;

		if (user.equals("rock") || user.equals("scissors") || user.equals("paper")) {

			notValid = true;
		}

		else {
			notValid = false;
			
		}
		return notValid;

	}

	public static void determineWinner(String user, String comp) {

		// set counters
		int uWins = 0;

		int cWins = 0;
       
			System.out.println("The computer's choice was " + comp);
			System.out.println("The user's choice was " + user);
			if (user.equals("rock") && comp.equals("paper")) {
				cWins++;
				System.out.println("Paper covers rock.\n" + "The computer wins!");
			} else if (user.equals("paper") && comp.equals("scissors")) {
				cWins++;
				System.out.println("Scissors cuts paper.\n" + "The computer wins!");
			} else if (user.equals("scissors") && comp.equals("rock")) {
				cWins++;
				System.out.println("Rock crushes scissors.\n" + "The computer wins!");
			} else if (user.equals("rock") && comp.equals("scissors")) {
				uWins++;
				System.out.println("Rock crushes scissors.\n" + "The user wins!");
			} else if (user.equals("scissors") && comp.equals("paper")) {
				uWins++;
				System.out.println("Scissors cuts paper.\n" + "The user wins!");
			} else if (user.equals("paper") && comp.equals("rock")) {
				uWins++;
				System.out.println("Paper covers rock.\n" + "The user wins!");
			} else {
				System.out.println("It is a tie.  No one wins!!");

			}

		

		System.out.println("The user won " + uWins + " times and the computer won " + cWins + " times");
	}
}