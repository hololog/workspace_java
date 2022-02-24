package NestedClass;

public class Ex1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		outer.method();
		
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();
	//	
//		//-------------------------------
		Outer.StaticInner staticInner = new Outer.StaticInner();
	}

}

class Outer{
	private int num = 10;
	public void method() {
		System.out.println(num);
		Inner inner = new Inner();
		
		class LocalInner {
			String name = "Local InnerClass";
		}
		LocalInner localInner = new  LocalInner();
		System.out.println(localInner.name);
	}
	
	class Inner{
		public void innerMethod() {
			System.out.println(num);
			method();  //내부클래스에서 외부클래스 메서드 호출가능
			
		}
	}
	
	static class StaticInner{
		static String name;
		public void staticInnerMethod() {
			
//			System.out.println(num);
		}
	}
}