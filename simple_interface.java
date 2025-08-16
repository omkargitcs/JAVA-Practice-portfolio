interface printable{
	void print();
}
class simple_interface implements printable{
	public void print(){
		System.out.println("Printing Documents...");
	}
	
	public static void main(String[]args){
		simple_interface doc = new simple_interface();
		doc.print();
	}
}