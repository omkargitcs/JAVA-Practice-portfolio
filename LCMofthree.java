import java.util.Scanner;
public class LCMofthree{
	static int findHCF(int a,int b){
		while(b!=0){
			int temp = b;
			b=a%b;
			a=temp;
			
		}
		return a;
	}
	static int findLCM (int a,int b){
		return (a*b)/findHCF(a,b);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number");
		int num1 = sc.nextInt();
		System.out.print("enter the second number");
		int num2 = sc.nextInt();
		System.out.print("enter the third number");
		int num3 = sc.nextInt();
		
		int tempLcm = findLCM(num1,num2);
		int finalLCM= findLCM(tempLcm,num3);
		
		System.out.println("LCM OF :" + num1 + ", " +num2 +", " +num3+ "is : "+ finalLCM);
		
	}

}