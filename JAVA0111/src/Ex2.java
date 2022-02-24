
public class Ex2 {
	public static void main(String[] args) {

	}
}

interface IHello {
	void sayHello(String name);
}

interface IGoodbye {
	public abstract void sayGoodbye(String name);
}

interface ITotal extends IGoodbye, IHello {
	public abstract void sayHello(String name);

	void sayGoodbye(String name);

	void greeting(String name);
}

class ISay implements ITotal {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "씨, 안녕하세요!");
	}

	@Override
	public void greeting(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "씨, 안녕히 가세요!");

	}

	@Override
	public void sayGoodbye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + ", 안녕!");

	}

}

//------------------------------------------------------------------------

abstract class ISay2 implements ITotal {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "씨, 안녕하세요!");
	}

//	@Override
//	public void greeting(String name) {
//		// TODO Auto-generated method stub
//		System.out.println(name + "씨, 안녕히 가세요!");
//		
//	}

	@Override
	public void sayGoodbye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + ", 안녕!");

	}

}

class ISay2SubClass extends ISay2 {

	@Override
	public void greeting(String name) {
		// TODO Auto-generated method stub

	}

}

//-----------------------------------------------------------------------

abstract class AbstractClass1 {
	public abstract void abstractMethod1();
}

abstract class AbstractClass2 extends AbstractClass1 {
	public abstract void abstractMethod2();
}

class NormalClass extends AbstractClass2 {

	@Override
	public void abstractMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractMethod1() {
		// TODO Auto-generated method stub
		
	}
	
}
