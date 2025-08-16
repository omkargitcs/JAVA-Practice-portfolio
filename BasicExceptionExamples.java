public class BasicExceptionExamples{
	public static void main(String[] args){
		try{
			int result=10/0;
			System.out.println(result + " : result");
		}catch(ArithmeticException e){
			System.out.println("erroe : division by zero is not allowed ");
		}
		System.out.println("programs continous after exception handling");
	}
}