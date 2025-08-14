import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		Scanner pal = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = pal.nextInt();
		
		
		int originalnumber = num;
		int reversednum = 0;
		int remainder;
		
		while(num!=0){
			remainder = num % 10;
			reversednum = reversednum * 10 + remainder;
			num/=10;
			
		}
		if (originalnumber == reversednum){
			System.out.println(originalnumber + " is a palindrome congrats !!..");
		}else{
			System.out.println(originalnumber + " is not palindrome try again with another number ");
			
			
		}
	
	}
}