interface Calculator{
	int add(int a,int b);
	int substract(int a,int b);
}
abstract class BaseCalculator{
	abstract int multiply(int a,int b);
}

class MyCalculator extends BaseCalculator implements Calculator{
	public int add(int a,int b){
		return a+b;
	}
	public int substract(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	
}

public class interface_abstract{
	public static void main(String [] args){
		MyCalculator doc = new MyCalculator();
		System.out.println("ADD : " + doc.add(3,4));
		System.out.println("sub : " + doc.substract(5,4));
		System.out.println("mul : " + doc.multiply(3,4));
		
	}
	
}