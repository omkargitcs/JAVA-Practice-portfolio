import mathops.Addition;
import mathops.Subtraction;

public class Calculatorforaddsub{
	public static void main(String[] args){
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		
		System.out.println("sum : "+add.add(12,23));
		System.out.println("sub : "+sub.subtract(56,23));
		
	}
}