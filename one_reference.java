interface Animal{
	void makeSound();
}
class Dog implements Animal{
	public void makeSound(){
		System.out.println("DOG BARKS!!!");
	}
}
class Cat implements Animal{
	public void makeSound(){
		System.out.println("CAT MEOWS !!..");
	}
}
public class one_reference{
	public static void main(String[]args){
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.makeSound();
		a2.makeSound();
	}
}