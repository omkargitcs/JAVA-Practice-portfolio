interface TaxInfo{
	double RATE = 0.18;
	double calculateTax(double amount);
}

class interface_constants implements TaxInfo{
	public double calculateTax(double amount){
		return amount * RATE;
	}
	
	public static void main(String[]args){
		interface_constants doc = new interface_constants();
		System.out.println("TAX : "+ doc.calculateTax(1000));
	}
}