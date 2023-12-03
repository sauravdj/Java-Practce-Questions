//CSC 222 Assignment 5: Create Pet database for adding pets, removing pets, updating pet information, searching for pets by name or age.
// I certify, that this computer program submitted by me is all of my own work. Signed: Natasha Czaplewski
import java.util.Scanner;
public class PetDatabase {
    static int i;
    static Pet[]  pets = new Pet[10];
	static int petCount = 0;
	static int rowCount = 0;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int program = getUserChoice();
		do {
	        switch (program) {
	        case 1: showAllPets();
	    		break;
	        case 2: addPets();
	        	break;
	        case 3: updatePet();
	        	break;
	        case 4: removePet();
	        	break;
	        case 5: searchPetsByName();
	        	break;
	        case 6: searchPetsByAge();
	        	break;
	        case 7: 
	        	break;
	        }
	        program = getUserChoice();
		}
	        while (program != 7);
	}
        //List options, take choice input
        private static int getUserChoice() {
            System.out.println("What would you like to do? " +
            "\n 1. View all pets" +
            "\n 2. Add more pets" +
            "\n 3. Update an existing pet" +
            "\n 4. Remove an existing pet" +
            "\n 5. Search pets by age" +
            "\n 6. Search pets by age" +
            "\n 7. Exit program");
            System.out.println("Your choice: ");
            int program = s.nextInt();
            // s.nextLine();
            return program;
        }
        //Add pets
        private static void addPets() {
           
        	String name = " ";
    		for (int id = 0; id < pets.length ; id++) {
    			System.out.println("Add pet (name, age): ");
    			name = s.next();
                if (name.toLowerCase().equals("done")) {
            		break;
            	}
    			int age = s.nextInt();
            	pets[id] = new Pet(name, age);
            	System.out.printf(id + " " +pets[id].getName() + " " + pets[id].getAge()+ "\n");
            	petCount++;
            	
    			}
    		}
        //Show all pets
		private static void showAllPets() {
			printTableHeader();
            int row = 0;
			for (int id = 0; id < pets.length; id++) {
             //   System.out.println(pets[id].getName());
             if (pets[id] == null) {
                printTableFooter(row);
                break;
            }
			    printTableRow(id, pets[id].getName(), pets[id].getAge());
                row++;
				
			}
		}
		//Update object
		private static void updatePet() {
			showAllPets();
			System.out.println("Enter the pet ID you wish to update: ");
			int id = s.nextInt();
			System.out.println("Enter new name and new age: ");
			String name = s.next();
			int age = s.nextInt();
			pets[id].setName(name);
			pets[id].setAge(age);
		}
		//Remove object
		private static void removePet() {
			showAllPets();
			System.out.println("Enter the pet ID to remove: ");
			int id = s.nextInt();
			pets[id] = null;
		}
		//Search names of objects regardless of case
		private static void searchPetsByName() {
			System.out.println("Enter a name to search: ");
            int row =0;
			String searchName = s.next();
			printTableHeader();
			for (int id = 0; id < pets.length; id++) {
                if (pets[id] == null) {
                    printTableFooter(row);
                    break;
                }
				if (pets[id].getName().equalsIgnoreCase(searchName)) {
					row++;
					printTableRow(id, pets[id].getName(), pets[id].getAge());
				}
			}
		}
		//Search ages of objects
		private static void searchPetsByAge() {
			System.out.println("Enter an age to search: ");
			int searchAge = s.nextInt();
			printTableHeader();
			for (int id = 0; id < pets.length; id++) {
                if (pets[id] == null) {
                    printTableFooter(rowCount);
                    break;
                }
				if (pets[id].getAge() == searchAge) {
					rowCount++;
					printTableRow(id, pets[id].getName(), pets[id].getAge());
				}
			}
		}
		private static void printTableHeader() {
			System.out.println("+----------------------+");
			System.out.println("| ID | NAME      | AGE |");
			System.out.println("+----------------------+");
		}
		private static void printTableRow(int id, String name, int age) {
			System.out.printf("| %-3d| %-10s|%4d | \n", id, name, age);
		}
		private static void printTableFooter(int rowCount) {
			System.out.println("+----------------------+\n");
			System.out.printf("%d rows in set.\n",rowCount);
		}
}
	class Pet {
		//Add data fields
       
		private String name;
		private int age;
		public Pet(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

