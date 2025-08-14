class Vehicle{
	void start(){
		System.out.println("vehicle is starting");
	}
}
class Car extends Vehicle{
	void start(){
		super.start();//parent method runs first 
		System.out.println("car is starting");
	}
}

public class Vehicle1{
	public static void main(String[]args){
		Car c = new Car();
		c.start();
		c.start();
	}
}
