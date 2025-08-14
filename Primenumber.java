public class Primenumber{
	public static boolean isPrime(int number){
		if (number <=1){
			return false;
		}
		if (number ==2){
			return true;
		}
		for (int i =2 ;i<number ;i++){
			if(number % i ==0){
				return false;
			}
			
		}
		return true;
		}
	public static void main(String args[]){
		int num1 = 7;
		int num2 = 4;
		int num3 = 89;
		
		System.out.println(num1+ "is prime : " + isPrime(num1));
		System.out.println(num2+ "is prime : " + isPrime(num2));
		System.out.println(num3+ "is prime : " + isPrime(num3));
		
	}
		
}