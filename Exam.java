import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
        
public class Exam {
    static String correctAnswer[] = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"};
    static ArrayList<String> chosenAnswer = new ArrayList<>(Arrays.asList("","","","","","","","","","","","","","","","","","","",""));
    // static ArrayList<String> chosenAnswer = new ArrayList<>(Arrays.asList());
        public static void main(String[] args){
        String input;    
        Scanner keyboard = new Scanner(System.in);
     
        
        for (int i = 0; i < correctAnswer.length; i++){
            System.out.println("Please enter the choice selected for question " + (i + 1) + ":");
            input = keyboard.nextLine();
            chosenAnswer.set(i, input);            
        }  
         
        System.out.println("Your Results: \n");
      int correct =  totalCorrect(chosenAnswer, correctAnswer);
      System.out.println("Total correct answers: " + correct);
      System.out.println("Total incorrect answers: " + totalIncorrect(chosenAnswer, correctAnswer));

      int[] questionsMissed = questionsMissed(chosenAnswer, correctAnswer);
      if (questionsMissed.length != 0) {
         System.out.print("The following questions have incorrect answers: ");
         System.out.println(Arrays.toString(questionsMissed));
      } else {
         System.out.println("All answers are corrects");
      }

     if (passed(correct,correctAnswer)) {
         System.out.print("Congratulations, " + "You have passed the exam!");
      } else {
         System.out.print("You failed. Better luck next time.");
      }  
      keyboard.close(); 
     }

    private static boolean  passed(int totalCorrect, String correctAnswer[]) {
        double score = totalCorrect / correctAnswer.length;
        return (score >= 75.0);
    }
    

    private static int totalCorrect(ArrayList<String> chosenAnswer2, String correctAnswer[]) {
        int totalCorrect = 0;
         for (int i = 0; i < chosenAnswer2.size(); i++){
            if (correctAnswer [i].equals(chosenAnswer2.get(i))){
                totalCorrect++;
            }
         }
      return totalCorrect;
    }

    private static int totalIncorrect(ArrayList<String> chosenAnswer, String correctAnswer[]) {
        int totalIncorrect = 0;
         for (int i = 0; i < chosenAnswer.size(); i++){
              if(!correctAnswer[i].equals(chosenAnswer.get(i))){
                totalIncorrect++;
            }
         }
      return totalIncorrect;
    }
    
       public static int[] questionsMissed(ArrayList<String> chosenAnswer, String correctAnswer[]) {
      ArrayList<Integer> questionsMissed = new ArrayList<>();
      for (int i = 0; i < correctAnswer.length; i++) {
         if (!chosenAnswer.get(i).equals(correctAnswer[i])) {
            questionsMissed.add(i + 1);
         }
      }
      int questions[] = new int[questionsMissed.size()];
      for(int i=0; i<questions.length; i++) {
         questions[i] = questionsMissed.get(i);
      }
      return questions;
    }
}    