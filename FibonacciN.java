import java.util.Scanner;
public class FibonacciN{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter fibo number: ");
		int n = sc.nextInt();
		
		int a = 0,b=1;
		System.out.println("FIBONACCI SEQUENCE : ");
		for(int i=1;i<=n;i++){
			System.out.print(a+" ");
			int temp = a+b;
			a=b;
			b=temp;
		}
	}
	
}