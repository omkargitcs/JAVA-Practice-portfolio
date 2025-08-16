public class Vehicle{
    void start(){
        System.out.println("vehicle started");
    }
	class Car extends Vehicle{
		void drive(){
			System.out.println("car is driving");
		}
	}

	public static void main(String args[]){
		Vehicle outer = new Vehicle();
		Car myCar = outer.new Car();
		
		myCar.start();
		myCar.drive();
		}

}
