package interface_statement;

public class Test1 {
	public static void main(String[] args) {
		SuperMan s = new SuperMan();
//		s.takeOff();
//		s.fly();
//		s.land();
		
		Bird b = new Bird();
//		b.takeOff();
//		b.fly();
//		b.land();
		
		Airplane a = new Airplane();
//		a.takeOff();
//		a.fly();
//		a.land();
		
//		Flyer[] f = {new SuperMan(), new Bird(), new Airplane()};
		Flyer[] f = {s, b, a};
		
		for (Flyer flyer : f) {
			flyer.takeOff();
			flyer.fly();
			flyer.land();
		}
		
		
	}
}

interface Flyer {
	public abstract void takeOff();
	public void fly();
	public void land();
}

class SuperMan implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("SuperMan 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}

	@Override
	public void land() {
		System.out.println("SuperMan 착륙!");
	}
	
}

class Bird implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("Bird 이륙!");
	}
	
	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
	
	@Override
	public void land() {
		System.out.println("Bird 착륙!");
	}
	
}

class Airplane implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙!");
	}
	
	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
	
	@Override
	public void land() {
		System.out.println("Airplane 착륙!");
	}
	
}