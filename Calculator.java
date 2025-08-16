public class Calculator{
	private double number1;
	private double number2;
	
	public Calculator(int num){
		this.number1= num;
	}
	public Calculator(double num){
		this.number1=num;
	}
	public Calculator(int num1,int num2){
		this.number1 = num1;
		this.number2=num2;
	}
	public Calculator(double num1,double num2){
		this.number1 = num1;
		this.number2=num2;
	}
	public double inverse(){
         return 1.0/number1;
	 }
	public double negate(){
		return -number1;
	}
	public double root(){
		return Math.sqrt(number1);
	}
	public double add(){
		return number1 + number2;
	}
	public double multiply(){
		return number1*number2;
	}
	public static void main(String[] args){
		Calculator singleInt = new Calculator(5);
		Calculator singleDouble = new Calculator(18.9);
		
		System.out.println("inverse of 5 :"+singleInt.inverse());
		System.out.println("negate of 5 :"+singleInt.negate());
		System.out.println("root of 18.9 :"+singleDouble.root());
		
		Calculator twoInts=new Calculator(4,7);
		Calculator twoDoubles=new Calculator(3.5,2.8);
		System.out.println("ADDITION OF 4 AND 7 :"+twoInts.add());
		System.out.println("Multiplication of 3.5 and 2.8" + twoDoubles.multiply());
		
	}
}