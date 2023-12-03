public class WagePercentCalculation {
public static void main(String[] args) {
double sales = 0, basicWage = 5000;
System.out.println("Sales: Commission:");
for (sales = 1000; sales <= 20000; sales += 1000) { // for loop used to raise sales to 1k until it reaches 20k
double comm = tiers(sales, basicWage); 
System.out.printf("%10s%15s\n", sales, comm);
}
}
static double tiers(double sales, double basicWage) { // Static was created per requirements. separating main with tiers 
double comm = 0;
if (sales <= 5000) { // Tier one 8%, reason it is 0.08 is to get correct calculation 8/100 = 0.08
comm = sales * 0.08 + basicWage; 
} else if (sales >= 5000.01 && sales <= 10000) { // Tier two 10%
comm = sales + basicWage * 0.10 ;
} else if (sales >= 10000.01) { // Tier three 12% 
comm = sales + basicWage * 0.12;
}
return comm;
}
}

