package method;

class OverloadingMethod {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(long a, long b) {
		System.out.println(a+b);
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		
		OverloadingMethod om = new OverloadingMethod();
		
		om.add(10, 20);
		om.add(3.14, 2.2);
		om.add(100L, 100L);
		System.out.println("=============");
	}
}
