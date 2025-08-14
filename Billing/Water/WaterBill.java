package Billing.Water;
public class WaterBill {
	public double calculate(int liters){
		double rate = 2.0;
		double bill = liters * rate ;
		if(liters > 500){
			bill += 50;
		}
		return bill;
	}
	public static void main(String[] args) {
		WaterBill wb = new WaterBill();
        int liters = 600;
        System.out.println("Liters: " + liters);
        System.out.println("Total Bill: ₹" + wb.calculate(liters));
    }
}