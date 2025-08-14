import java.util.Scanner;
	public class Largest_num{
		public static void main(String[] args){
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter the number1 : ");
		int num1 = myObj.nextInt( );

		System.out.println("Enter the number2 : ");
		int num2 = myObj.nextInt( );

		System.out.println("Enter the number3 : ");
		int num3 = myObj.nextInt( );
			if(num1 > num2 && num1 > num3){
				System.out.print("The Number 1" + num1 + "is the biggest number");
}
			else if (num2 > num1 && num2 > num3){
				System.out.print("The Number 2" + num2 + "is the biggest number");


}			else if (num3 > num1 && num3 > num1){
				System.out.print("The Number 3" + num3 + "is the biggest number");


				

}
			myObj.close();


}
}