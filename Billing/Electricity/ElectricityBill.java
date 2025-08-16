package Billing.Electricity;

public class ElectricityBill{
	public double calculate(int units){
		double bill = 0;
		if(units<=100){
			bill = units * 5.0;
		}else if(units <=300){
			bill = (100 * 0.5) +((units - 100) *7.5);
		}else {
			bill = (100 * 5.0) + (200 * 7.5) + ((units - 300) * 10.0);
		}
		return bill;
	}
	
	public static void main (String[] args){
		ElectricityBill eb = new ElectricityBill();
		System.out.println("TOtal electriity bill : "+eb.calculate(350));
	}
}