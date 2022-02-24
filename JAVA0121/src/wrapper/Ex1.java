package wrapper;

public class Ex1 {
	public static void main(String[] args) {
//		Integer n1 = new Integer(20);
//		System.out.println(n1);
//		Integer b = Integer.valueOf(1); 
//		System.out.println(b);
//		Integer c = new Integer(1);
//		System.out.println(c);
		
		int a = 1; 
		Integer b = Integer.valueOf(2); 
		int sum1 = a + b; //오토언박싱
		int sum2 = a + b.intValue(); //오토언박싱x
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
