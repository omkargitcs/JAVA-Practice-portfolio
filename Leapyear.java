import java.util.Scanner;
public class Leapyear{
public static void main(String[] args){
Scanner myObj = new Scanner(System.in);
System.out.println("enter the year to check the number : ");
int year = myObj.nextInt();

if ((year % 4==0 && year % 100 != 0) || (year % 400 == 0)){
	System.out.println("The year" + " " + year + "is a leap year Great !!");
}else {
	System.out.println("The year" + " " + year + "is not a leap year  !!");
}
}
}
