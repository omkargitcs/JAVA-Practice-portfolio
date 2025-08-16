import java.util.Scanner;
public class ArmstrongNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the number");
		int num = sc.nextInt();
		int originalNum = num,result =0;
		
		while (num !=0){
			int digit = num % 10;
			result +=Math.pow(digit,3);
			num/=10;
			
		}
		
		if(result == originalNum){
			System.out.println(originalNum + "is a armstrong number");
			
		}else{
			System.out.println(originalNum + " is not a armsstrong number");
		}
	}
}