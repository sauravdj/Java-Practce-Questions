
import java.util.Scanner;

public class StringOps {
   static Scanner scnr = new Scanner(System.in);
   public static void main(String[] args) {
     
      
      System.out.println("Enter a sample text:");
      System.out.println("");

      String userString = scnr.nextLine();
      
      System.out.println("You entered: " + userString);
      System.out.println("");
      char userChar= ' ' ;
      do{
       userChar = printMenu();
       switch (userChar){
        case 'c':
            System.out.println(getNumOfNonWSCharacters(userString));
            break;
        case 'w':  
            System.out.println("w - Number of words");  
            break;
        case 'q':
            System.out.println("q - Quit");
            break;
        default:
        System.out.println("Please enter appropriate input!!!");    
       }
      }while(userChar != 'q');
      
   }
      
  public static char printMenu() {
      System.out.println("MENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      System.out.println("");
      System.out.println("Choose an option:");
      char userChar = scnr.next().charAt(0);
      if (userChar == 'c' || userChar == 'w' || userChar=='f' ||userChar =='r'|| userChar=='s' ||userChar =='q')
       return userChar;
      else{
        System.out.println(
         "_________________________________________\n"
        +"Please enter correct input \n"
        +"_________________________________________\n");
        return printMenu(); 
      }
       
   }
   public static int getNumOfNonWSCharacters(String s) {
    int num=0;
    for (int i = 0; i < s.length(); i++){
        if(s.charAt(i) != ' '){
            num++;
        }
    }
    return num;
   }
   public static int getNumOfWords(String s){
    int l = s.length();
    int i=0;
    for(i=0;i<l;i++){
        if(s.charAt(i) != ' '){
        while(i<l && s.charAt(i) != ' '){

        }
    }
    }
    return 0;
   }
 }
