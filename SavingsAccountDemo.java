import java.util.Scanner;
class SavingsAccount{
    private double balance;
    private double annualIntrestRate;
    private double AccumulativeInterest;
    private double AccumulativeDeposits;
    private double AccumulativeWithdrawals;
    private double MonthlyInterest;
    
    SavingsAccount(double b){
        balance = b;
        System.out.println(balance);
    }
    public double getBalance(){
        return balance;
    }
    public double getAccumulativeDeposits(){
        return AccumulativeDeposits;
    }
    public double getAccumulativeInterest(){
        return AccumulativeInterest ;
    }
    public double getMonthlyInterest(){
        return MonthlyInterest;
    }
    public double getannualIntrestRate(){
        return annualIntrestRate;
    }
    public double getAccumulativeWithdrawals(){
        return AccumulativeWithdrawals;
    }
    public void setAnnualInterestRate(double i){
        annualIntrestRate = i;
    }
    public void deposit(double amt){
        balance = balance + amt;

    }
    public void withdraw(double amt){
        if (amt <= balance)
           balance -= amt;
        else
           System.out.println("Insufficient balance...");   
    }
    public void addMonthlyInterest(){
        
    }

}
public class SavingsAccountDemo
{
	public static void main(String[] args)
	{
		int monthsPassed = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the starting balance: $");
		SavingsAccount demoAccount = new SavingsAccount(userInput.nextDouble());
		
		System.out.print("Enter the annual interest rate (decimal): ");
		demoAccount.setAnnualInterestRate(userInput.nextDouble());
		
		System.out.print("Enter the number of months that have passed since the account\'s establishment: ");
		monthsPassed = userInput.nextInt();
		

		for (int count = 1; count <= monthsPassed; count++)
		{

			System.out.println("\n-----MONTH " + count + "-----");
			
			System.out.printf("Enter the amount deposited into the account: $");
			demoAccount.deposit(userInput.nextDouble());
			
		
			System.out.printf("Enter the amount withdrawn from the account: $");
			demoAccount.withdraw(userInput.nextDouble());
			
          
			System.out.printf("This month\'s interest is: $%.2f\n", demoAccount.getMonthlyInterest());
			demoAccount.addMonthlyInterest();
		}
		
		System.out.printf("\nEnding balance: $%.2f", demoAccount.getBalance());
		System.out.printf("\nTotal deposits: $%.2f", demoAccount.getAccumulativeDeposits());
		System.out.printf("\nTotal withdrawals: $%.2f", demoAccount.getAccumulativeWithdrawals());
		System.out.printf("\nTotal interest: $%.2f", demoAccount.getAccumulativeInterest());
		userInput.close();
	}
}