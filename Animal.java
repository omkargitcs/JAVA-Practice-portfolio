class Animal1{
	void sound(){
		System.out.println("animal makes a sound");
	}
}

class Dog extends Animal1{
	void bark(){
		System.out.println("dog barls");
	}
}
public class Animal{
	public static void main(String[]args){
		Dog d = new Dog();
		d.sound();
		d.bark();
	}
	
}