import java.util.Scanner;

public class Te {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double wallHeight;
      double wallWidth;
      double cansNeeded;
      double wallArea;
      double gallonsPaintNeeded;
      double paintCostPerCan;
      double paintCost;
      double salesTax;
      double totalCost;
      
      wallHeight = scnr.nextDouble();
      wallWidth = scnr.nextDouble(); 
      wallArea = wallHeight * wallWidth;
      System.out.printf("Wall area: %.1f sq ft\n", wallArea);
      
      gallonsPaintNeeded= wallArea/350.0;
      System.out.printf("Paint needed: %.3f gallons\n", gallonsPaintNeeded);
      
     cansNeeded = (int) (Math.ceil (gallonsPaintNeeded)) ;
     System.out.printf("Cans needed: " + cansNeeded + " can(s)\n");
     paintCostPerCan= scnr.nextDouble();
     System.out.printf("Paint cost: $%.2f\n", paintCostPerCan * cansNeeded);
     salesTax=0.07 * paintCostPerCan * cansNeeded ;
     System.out.printf("Sales tax: $%.2f\n", salesTax);
     totalCost= salesTax + paintCostPerCan * cansNeeded;
     System.out.printf("Total cost: $%.2f\n",totalCost);
     scnr.close();
   }
}