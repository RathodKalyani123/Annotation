package example;

public class Animal {
	public void displayInfo() {
		System.out.println("i am an animal");
	} 
}
class Dog extends Animal{
	@Override
	public void displayInfo() {
		System.out.println("i am a dog");
		
	}
	public static void main(String[] args) {
		Dog d= new Dog();
		d.displayInfo();
		
	}
}