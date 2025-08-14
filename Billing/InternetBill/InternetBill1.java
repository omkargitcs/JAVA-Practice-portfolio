package Billing.InternetBill;

public class InternetBill1{
	public double calculate (double gbUsed){
		double baseCharge = 500;
		double extraCharge = 0;
		if(gbUsed>100){
			extraCharge=(gbUsed -100) * 2.5;
		}return baseCharge+extraCharge;
	}
	public static void main(String[]args){
		InternetBill1 ib = new InternetBill1();
		double gbUsed = 145.6;
		System.out.println("Data used : " + gbUsed + "GB");
		System.out.println("Total bill  : " + ib.calculate(gbUsed));
		
	}
	
}