interface Flyable{
	void fly();
}
interface Swimmable{
	void swim();
}

class Duck implements Flyable,Swimmable{
	public void fly(){
		System.out.print("Duck flies in the sky ");
	}
	public void swim(){
		System.out.print("Duck swims in the lake.... ");
	}
	
}
public class interfaces_2{
	public static void main(String[]args){
		Duck d = new Duck();
		d.fly();
		d.swim();
	}
}