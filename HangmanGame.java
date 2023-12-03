

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HangmanGame {
   public static void main(String[] args) {


       String word;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to Hangman!\n(2 Players Required)\n");
       System.out.println("Player 1, please enter your word:");
       word = keyboard.nextLine();
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       //System.out.println(word);
       List<Character> playerGuesses = new ArrayList<>();


       int wrongCount = 0;
       while (true) {
           printHangedMan(wrongCount);


           if (wrongCount >= 6) {
               System.out.println("You are dead! " + word + " killed you.");
               break;
           }


           printWordState(word, playerGuesses);
           if (!getPlayerGuess(keyboard, word, playerGuesses)) {
               wrongCount++;
           }


           if (printWordState(word, playerGuesses)) {
               System.out.println("\nYou Survived!");
               break;
           }
       }
   }
   private static void printHangedMan(int wrongCount) {
       //print hangman image
           System.out.print("\n\n——————————\n|\t      |      Player 2's Turn: Good Luck!" +
                   "\n|\n|\n|\n|\n|\n|\n————————\n\n");
       if (wrongCount >= 1) {
           System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                   "\n|\t    O\n|\n|\n|\n|\n|\n————————\n\n");


           if (wrongCount >= 2) {
               System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                       "\n|\t    O\n|\t    |\n|\n|\n|\n|\n————————\n\n");


               if (wrongCount >= 3) {
                   System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                           "\n|\t    O\n|      /|\n|\n|\n|\n|\n————————\n\n");
               }
           }
       }
       if (wrongCount >= 4) {
           System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                   "\n|\t    O\n|      /|\\\n|\n|\n|\n|\n————————\n\n");


           if (wrongCount >= 5) {
               System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                       "\n|\t    O\n|      /|\\\n|      /\n|\n|\n|\n————————\n\n");


               if (wrongCount >= 6) {
                   System.out.print("\n——————————\n|\t    |      Player 2's Turn: Good Luck!" +
                           "\n|\t    O\n|      /|\\\n|      / \\\n|\n|\n|\n————————\n\n");
               }
           }
       }
   }
   private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
       System.out.println("Guessed Letters: ");
       System.out.println(playerGuesses);
       System.out.println("Please enter a letter:");
       String letterGuess = keyboard.nextLine();
       playerGuesses.add(letterGuess.charAt(0));


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
 
