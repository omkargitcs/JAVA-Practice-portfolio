public class ThrowExample{
	public static void main(String[] args){
		int age = 15 ;
		if(age<18){
			throw new IllegalArgumentException("age must be 18 or above");
		}System.out.println("access granted");
	}
}