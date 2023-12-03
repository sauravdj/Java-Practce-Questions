
import java.util.Scanner;
public class RemoveLeadingTrailingSpaces {

    
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText = " no  "; 
      
    //   char space = ' ';
      int i = 0;
     
    System.out.println("Enter something   ");
    userText = scnr.nextLine();
    int j = userText.length()-1;
    // System.out.println(j);
      while (i < userText.length() && userText.charAt(i)== ' ' ){
          i++;
      } 
      while ( j >= 0 &&  userText.charAt(j)== ' '){
      // for ( j = userText.length()-1; j>=0;j--)  {
       j--;
      
      }
      if(i>=j){
        System.out.println("Empty string ");
       }
      else
      
       {String cleanedText = userText.substring(i,j+1);
        System.out.println(cleanedText);}
      scnr.close();
    }

}
