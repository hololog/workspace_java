package static_var;

class Car {
	static String model;
	int maxSpeed;
	
}
public class Ex1 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.maxSpeed = 100;
		car2.maxSpeed = 200;
		
		System.out.println(car1.maxSpeed);
		System.out.println(car2.maxSpeed);
		
		
	}
}
