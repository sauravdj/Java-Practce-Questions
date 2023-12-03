//import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class MovingCharges {
	
	private double miles;
	private double weight;
	private double totalCharge;
	
	public MovingCharges() {
		
	}
	
	public MovingCharges(double w, double m) {
		
		weight = w;
		miles = m;
	}
	
	public String toString() {
        calcCharge();
		//NumberFormat nf = NumberFormat.getCurrencyInstance();
		//DecimalFormat df = new DecimalFormat("##.#");
		return "You moved " + weight+ " pounds " + miles + " miles for a charge of " 
				+ totalCharge;
	}
	
	public double calcCharge() {
		
		double charge;
		
		if (weight < 250) {
			charge = 30;
            totalCharge = (miles/300) * charge;
			}
		else if (weight >= 250 && weight <= 500) {
			charge = 60;
            double temp = weight - 250;
            totalCharge = (temp * 60) + (miles/300 * 30);
		}
		
		else if (weight >= 501 && weight <= 1000) {
			charge = 90;
		}
		
		else if (weight >= 1001 && weight <= 2000) {
			charge = 110;
		}
		
		else {
			charge = 130;
		}
        return totalCharge;
    }
	
	
	public double getMiles() {
		return miles;
	}
	
	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
