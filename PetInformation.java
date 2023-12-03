 import java.util.Scanner;
 class Pet {

    protected String name;
    protected int age;
 
    public void setName(String userName) {
       name = userName;
    }
 
    public String getName() {
       return name;
    }
 
    public void setAge(int userAge) {
       age = userAge;
    }
 
    public int getAge() {
       return age;
    }
 
    public void printInfo() {
       System.out.println("Pet Information: ");
       System.out.println("   Name: " + name);
       System.out.println("   Age: " + age);
    }
 
 }
class Cat extends Pet {
   private String breed;

   public void setBreed(String userBreed) {
      breed = userBreed;
   }

   public String getBreed() {
      return breed;
   }
}
  public class PetInformation{ 
        public static void main(String[] args) {      
                      Scanner scnr = new Scanner(System.in);    
                       Pet myPet = new Pet();        
                        Cat myCat = new Cat();        
                        String petName, dogName, dogBreed;      
                        int petAge, dogAge;        
                        petName = scnr.nextLine();      
                        petAge = scnr.nextInt();       
                        scnr.nextLine();       
                        dogName = scnr.next();   
                        dogAge = scnr.nextInt();     
                        scnr.nextLine();     
                        dogBreed = scnr.nextLine();    
                        // TODO: Create generic pet (using petName, petAge) and then call printInfo     
                        myPet.setName(petName);        
                        myPet.setAge(petAge); 
                        myPet.printInfo();        
                        // TODO: Create dog pet (using dogName, dogAge, dogBreed) and then call printInfo   
                        myCat.setName(dogName); 
                        myCat.setAge(dogAge);     
                        myCat.setBreed(dogBreed);      
                        myCat.printInfo();          
                        // TODO: Use getBreed(), to output the breed of the dog      
                        System.out.println("   Breed: " + myCat.getBreed());   
                        scnr.close();
                       } 
                     } 

    

