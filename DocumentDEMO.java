interface interface_multiple_implementations{
	void displayDetails();
}

class Invoice implements interface_multiple_implementations{
	public void displayDetails(){
		System.out.println("INVOICE DETAILS : 12345");
	}
	
	
}
class Receipt implements interface_multiple_implementations{
	public void displayDetails(){
		System.out.println("receipt details : r-87uop");
	}
	
	
}
public class DocumentDEMO{
	public static void main(String[]args){
		interface_multiple_implementations d1 = new Invoice();
		interface_multiple_implementations d2 = new Receipt();
		d1.displayDetails();
		d2.displayDetails();
	}
}
