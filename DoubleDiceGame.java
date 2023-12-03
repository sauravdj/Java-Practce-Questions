//import a scanner to take in user input
import java.util.Scanner;
import java.util.Random;
class Dice {
    //declare variables
    private int dieOne;
    
    Random randNum;// = new Random();
    //constructor for the die class
    Dice(){
    
      //instantiate Random class object
      randNum = new Random();
    }
  
    //method to roll the dice
    public int rollDie(){
  
      //generates random number 0 to 5 and adds one to match the dice
      this.dieOne = randNum.nextInt(6) + 1;
      return this.dieOne;
    }
  
    //check if the two values of the dice equal each other
    public boolean equals(Dice Die2) {
      if(this.dieOne == Die2.dieOne) {
        return true;
      } 
      else {
        return false;
      }
    }
  
    //convert the value of the die to a string
    public String toString(int d) {
      if (d == 1) {
        return "one";
      } else if (d == 2) {
        return "two";
      } else if (d == 3) {
        return "three";
      } else if (d == 4) {
        return "four";
      } else if (d == 5) {
        return "five";
      } else  {
        return "six";
      }
     
    }
    
  }


class DoubleDiceGame {
    public static void main(String[] args) {
        //create a scanner object
        Scanner scnr = new Scanner(System.in);
    
        //initialize vaiables for the user's money, the user's bet, and a boolean for the do-while loop
        double userMoney = 100.00;
        double userBet = 0.00;
        boolean gameManager = true;
    
        //create two objects of class Die
        Dice die1 = new Dice();
        Dice die2 = new Dice();
    
        //enter into the game at least once and repeat until user runs out of money or loses
        do {
          //if user runs out of money, the game ends
          if (userMoney == 0.00) {
            System.out.println("You are out of money!");
            System.out.println("Better luck next time!");
            gameManager = false;
          }
          
          //output the user's money and ask how much they'd like to bet
          System.out.println("You have $" + userMoney);
          System.out.print("How much would you like to bet (Enter 0 to quit)? ");
    
          //take input for user's bet
          userBet = scnr.nextDouble();
    
          System.out.println(userBet);
    
          //game ends if bet is 0
          if (userBet == 0.00) {
            System.out.println("See you around, winner!");
            gameManager = false;
          }
    
          //roll the dice
          die1.rollDie();
          die2.rollDie();
    
          //output the result of the rolls
          System.out.println("You rolled a " + die1.rollDie() + " and " + die2.rollDie());
    
          //if the user wins, the amount won is output and added to the user's money, or the user loses and their money is reduced by their bet
          if(die1.toString().equals(die2.toString())) {
            System.out.println("You win $" + userBet);
            userMoney += userBet;
          } else {
            System.out.println("You lose $" + userBet);
            userMoney -= userBet;
          }
    
          System.out.println("");
        } while (gameManager);
    
        scnr.close();
      }
} 