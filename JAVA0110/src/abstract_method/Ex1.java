package abstract_method;

public class Ex1 {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.abstractMethod();
		
		AbstractClass ac = sc;
		
	}
}

abstract class AbstractClass {
	public abstract void abstractMethod();
//	public void abstractMethod() {
//		
//	};
	int a;
	static int b;
	
	public AbstractClass() {}
	public void print() {}
	public static void print2() {}
}

class SubClass extends AbstractClass{

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("서버클래스에서 오버라이딩을 통해 구현한 추상메서드");
	}
	
}

abstract class MiddleClass extends AbstractClass{
	
}

class SubClass2 extends MiddleClass {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstarctclass -> middlecalss => subclass2로 구현");
	}
	
}