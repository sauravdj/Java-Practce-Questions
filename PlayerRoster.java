import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        final int NUM_PPL = 5;
          
          int[] jerseyNum = new int[NUM_PPL];
          int[] ratingNum = new int[NUM_PPL];
          
          int i = 0;
          char menuChar = 'b';
          int newRating = 0;
          
          for (i = 0; i < NUM_PPL; i++) {
             System.out.println("Enter player " + (i + 1) + "'s jersey number:");
             jerseyNum[i] = scnr.nextInt();
             
             System.out.println("Enter player " + (i + 1) + "'s rating:");
             ratingNum[i] = scnr.nextInt();
             
             System.out.println("");
          }
          
          System.out.println("ROSTER");
          
          for (i = 0; i < NUM_PPL; i++) {
             System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: " + ratingNum[i]);
          }
          
          while (menuChar != 'q') {
             System.out.println("\nMENU");
             System.out.println("u - Update player rating");
             System.out.println("a - Output players above a rating");
             System.out.println("r - Replace player");
             System.out.println("o - Output roster");
             System.out.println("q - Quit");
             System.out.println("");
             
             System.out.println("Choose an option:");
             menuChar = scnr.next().charAt(0);
             
             switch(menuChar) {
             case 'o':
                if (menuChar == 'o') {
                   System.out.println("ROSTER");
                   for (i = 0; i < NUM_PPL; ++i) {
                      System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: " + ratingNum[i]);
                   }
                }
                break;
             case 'u':
                System.out.println("\nEnter a jersey number: ");
                int playerJersey = scnr.nextInt();
                
                System.out.println("Enter a new rating for player: ");
                newRating = scnr.nextInt();
                
                for (i = 0; i < 5; ++i) {
                   if (jerseyNum[i] == playerJersey) {
                      ratingNum[i] = newRating;
                      break;
                   }
                }
                break;
             case 'a':
                System.out.println("\nEnter a rating: ");
                int aboveRating = scnr.nextInt();
                
                System.out.println("ABOVE " + aboveRating);
                
                for (i = 0; i < 5; ++i) {
                   if (ratingNum[i] > aboveRating) {
                      System.out.println("Player " + (i + 1) + " -- Jersey number " + jerseyNum[i] + ", Rating " + ratingNum[i]);
                   }
                }
                break;
             case 'r':
                boolean flag = true;
                do {
                   System.out.println("\nEnter a jersey number: ");
                   playerJersey = scnr.nextInt();
                   
                   System.out.println("Enter a new jersey number: ");
                   int playerNewJersey = scnr.nextInt();
                   
                   for (i = 0; i < 5; ++i) {
                      if (jerseyNum[i] == playerJersey) {
                         jerseyNum[i] = playerNewJersey;
                        //  ratingNum[i] = newRating;
                         flag = false;
                         break;
                      }
                   }
                   if (flag) {
                      System.out.println("Error: Invalid Jersey Number... Try Again...");
                   }
                } while (flag == true);
             
             case 'q':
                break;
             default:
                break;
             }
             
          }
    }

      return;
      
   }
}
