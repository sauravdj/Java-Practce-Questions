import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {  
  public static void main(String[] args) {  
    try {
      // File myObj = new File("filename.txt");
      Scanner myReader = new Scanner( new File("filename.txt"));
      int c = 0;  
      while (myReader.hasNext()) {
        String data = myReader.next();
        c++;
        System.out.println(data);
      }
      System.out.println(c);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
     File myObj = new File("filename.txt");
   if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }  
} 