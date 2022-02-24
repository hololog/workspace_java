
public class Ex6 {
	public static void main(String[] args) {
		C c = new C();
		c.method();
		
		SubClass sub = new SubClass();
		sub.method();
	}
}

class A {
	void method() {
		System.out.println("class A");
	}
}

interface B {
	public default void method() {
		System.out.println("interface B");
	}
}

class C extends A implements B {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
	}
	
}

interface I1 {
	default void method() {
		System.out.println("I1");
	}
}
interface I2 {
	default void method() {
		System.out.println("I2");
	}
}
class SubClass implements I1, I2 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		I1.super.method();
	}
//	public void method() {
//		System.out.println("IIII");
//	}
	
}