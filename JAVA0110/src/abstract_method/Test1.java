package abstract_method;

public class Test1 {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		SuperMan s = new SuperMan();
		s.fly();
		Airplane ap = new Airplane();
		ap.fly();
 		
		System.out.println("------------");
		Flyer f;
		f = new Bird();
		f.fly();
		f = new SuperMan();
		f.fly();
		f = new Airplane();
		f.fly();
		
		System.out.println("------------");
		
		Flyer[] f2 = new Flyer[3];
		f2[0] = new Bird();
		f2[1] = new SuperMan();
		f2[2] = new Airplane();
		
		for (Flyer a : f2) {
			a.fly();
		}
	
	}
}

//날아다니는 것
abstract class Flyer {
	public abstract void fly();
}

class Bird extends Flyer {

	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
	
}

class SuperMan extends Flyer {

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}
	
}

class Airplane extends Flyer {
	
	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
	
}


