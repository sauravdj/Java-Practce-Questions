
    
   
    import java.util.Scanner;
    import java.util.Random;
    import java.util.Arrays;
    public class FrequencyBF {
        
        Scanner scn = new Scanner(System.in);
    //Random object
    Random rand = new Random();
    //Setting a variable to user input
    //Variable for array size
    int i = scn.nextInt();
    
    int [] Myarr = new int [i];
    
    int Largest = 0;
    int Smallest = 0;
    int avg = 0;
    int freq2 = 0;
    int Frequency = 0;
    static int Frequency2 = 0;
    int f = 0;
    int f2 = 0;
        public static void main(String[] args) {
           
            System.out.println("Enter array length.");
            int Myarr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
            boolean visited[]  = new boolean[Myarr.length];
             Arrays.fill(visited, false);
             Arrays.sort(Myarr);
             int count = 0;
             for (int i = 0; i < Myarr.length; i++) {
                 
                    // Skip this element if already processed
                    if (visited[i] == true)
                        continue;
                    
                    count = 1;
                    int currentval = Myarr[i];
                  //  System.out.println("Frequency is : " + currentval + " " + count);
                    for (int f2 = i +1 ; f2 < Myarr.length; f2++) {
                        Frequency2 = Myarr[f2];
                        if (currentval == Frequency2) {
                            visited[f2] = true;
                            count++;
                        }
                        //if(f2 == Myarr.length - 1)
                      //  System.out.println("Frequency is : " + currentval + " " + count);
                        
                    }
                    System.out.println("Frequency is : " + currentval + " " + count);
                    
                }
            
       
    }
    }
    
    
    
    