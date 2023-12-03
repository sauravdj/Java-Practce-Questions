// import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
// import java.util.Random;
import java.util.Scanner;


public class Hangman{
   public static void main(String[] args) throws FileNotFoundException {


       Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to Hangman! Please note 2 players are required.\n" +
               "Enter 'Ready' to begin.");
    //    String players = keyboard.nextLine();


       String word;


       System.out.println("Player 1, please enter your word:");
       word = keyboard.nextLine();
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       //System.out.println(word);
       List<Character> playerGuesses = new ArrayList<>();
       Integer wrongCount = 0;
       while(true) {
           printHangedMan(wrongCount);
           if (wrongCount >= 6) {
               System.out.println("Life is cruel. You are dead! " + word + " killed you.");
               break;
           }
           printWordState(word, playerGuesses);
           if (!getPlayerGuess(keyboard, word, playerGuesses)) {
               wrongCount++;
           }
           if(printWordState(word, playerGuesses)) {
               System.out.println("You Survived!\n" +
                       "The word was: " + word);
               break;
           }
         //  System.out.println("Please enter your guess for the word:");
         //  if(keyboard.nextLine().equals(word)) {
          //     System.out.println("You win!");
            //   break;
         //  }
          // else {
           //    System.out.println("Nope! Try again.");
          // }
       }
   }
   private static void printHangedMan(Integer wrongCount) {
    System.out.println(" Player 2's Turn: Good Luck!");
       if (wrongCount >= 1) {
        //    System.out.println("O");
           System.out.println(" ╷——————╷    ");
           System.out.println(" │      ╵");
           System.out.println(" │      0");
           System.out.println(" │     /|\\");
           System.out.println(" │     / \\");
           System.out.println("—╵——");
       }


       if (wrongCount >= 2) {
           System.out.print("\\ ");
           if (wrongCount >= 3) {
               System.out.println("/");
           }
           else {
               System.out.println("");
           }
       }


       if (wrongCount >= 4) {
           System.out.println(" |");
       }


       if (wrongCount >= 5) {
           System.out.print("/ ");
           if (wrongCount >= 6) {
               System.out.println("\\");
           }
           else {
               System.out.println("");
           } 
       }
   }
   private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
       System.out.println("Please enter a letter:");
       String letterGuess = keyboard.nextLine();
       playerGuesses.add(letterGuess.charAt(0));
       //print guessed letters
       System.out.println("Current Guesses: ");
       System.out.print(playerGuesses);
       return word.contains(letterGuess);
   }
   private static boolean printWordState(String word, List<Character> playerGuesses) {
       int correctCount = 0;
       for (int i = 0; i < word.length(); i++) {
           if (playerGuesses.contains(word.charAt(i))) {
               System.out.print(word.charAt(i));
               correctCount++;
           }
           else {
               System.out.print("'_'");
           }
       }
       System.out.println();


       return (word.length() == correctCount);
   }
}