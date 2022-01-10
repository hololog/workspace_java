
public class Ex1 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.cry();
		cat.cry();
			
	}
}

class Parent {
	public void parentPrn() {
		System.out.println("1");
	}
}

class Child extends Parent {
	
	@Override
	public void parentPrn() {
		System.out.println("2");
	}
}

class Animal {
	String name;
	int age;
	
	public void cry() {
		System.out.println("울음소리");
	}
}

class Dog extends Animal{
	
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
}

class Cat extends Animal{
	
	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹!");
	}
}