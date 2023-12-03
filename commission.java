
public class commission {
	
	static void comissionRate(double[] sales) {
		//double [] sales = {1000, 2000};

        double base = 5000;
        double takeHomePay = 0;
        System.out.println("Sale"+"   "+"takeHomePay");
        for (int i = 0 ; i <sales.length ; i++){
            double sale = sales[i];
            if (sale >= 0.0 && sale <= 5000.0){
                takeHomePay = sale * 8 /100 + base;
            }
            else if(sale > 5000.0 && sale <= 10000.0){
                takeHomePay = 5000.0 * 8 /100 + (sale - 5000) * 10 /100 + base;
            }
            else if(sale >10000.0 ){
                takeHomePay = 5000.0 * 8 /100 + 5000 * 10 /100 +(sale - 10000) * 10 /100+ base;
            }
           
            System.out.println(sale+"   "+ takeHomePay);
        }
       
	// 	double takeHomePay = 0;
	// 	double tierOneComission = 0.08;

	// for (int i = 0; i < sales.length; i++) {
	// 	if(sales[i] <= 5000) {
	// 	for( i = 0; i<sales.length; i++) {
		
	// 		takeHomePay = (0.08 * sales[i]);
	// 		takeHomePay+= 5000;
	// 		//sales[i] += sales[i];
	// 		return takeHomePay;
	// }
	// }


	// }
	// return -1;
	}
	
	
	 public static void main(String[] args) {
		 double [] sales = {1000, 2000, 3000, 4000, 5000,6000, 7000, 8000, 9000, 10000};
	 
		 comissionRate(sales);
		 
	}
}
	