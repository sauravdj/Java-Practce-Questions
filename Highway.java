import java.util.Scanner;

public class Highway {
 public static void main(String[] args) {

Scanner scnr = new Scanner(System.in);

int highwayNumber;


String direction;
System.out.println("Enter Highway number: ");
highwayNumber = scnr.nextInt();
int last = highwayNumber%100;
if (highwayNumber > 0 && highwayNumber <=99){ 
    if (highwayNumber % 2==0)
     direction = "east/west";
    else{
    direction="north/south";
    }
    System.out.println("I-"+ highwayNumber +" is primary, going " + direction + ".");

}
else if (highwayNumber>99 && highwayNumber <= 999){
    //  if (highwayNumber.substring(1).equals("ee")){
     if (highwayNumber % 100 == 00){
        System.out.println(highwayNumber +" is not a valid interstate highway number.");
      }
    else if (highwayNumber%2==0){
    // System.out.println("I-"+ highwayNumber+" is auxiliary, serving 1-"+last+", going east/west."); }
    System.out.println("I-"+ highwayNumber+" is auxiliary, serving 1-"+last+", going east/west.");
    }
    else{
    System.out.println("I" + highwayNumber+" is auxiliary, serving 1-"+ last+", going north/south.");
    }
} 
else{
System.out.println(highwayNumber +" is not a valid interstate highway number.");
}
scnr.close();
}
}