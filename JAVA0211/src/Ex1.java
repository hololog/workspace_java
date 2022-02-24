@FunctionalInterface
interface MyFunction {
	public abstract void run();
}

public class Ex1 {
	static void excute(MyFunction f) {
		f.run();
	}
	static MyFunction getMyFunction() {
		return () -> System.out.println("getMyFuntion 구현부");
	}
	
	public static void main(String[] args) {
		//람다식으로 run()구현
		MyFunction f2= new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("f2.run() 구현");
			}
		};
		MyFunction f1 = ()-> System.out.println("f1.run() 구현");
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		excute(f1);
	}
}
