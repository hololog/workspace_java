
public class Ex1 {
	public static void main(String[] args) {
		
		Object o = new Object();
		System.out.println(o);
		
		System.out.println("-----------------------");
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.getClass());
		System.out.println(p1.getClass().getName());
		System.out.println(o.getClass().getName());
		
		
	}
}

class Person {
	String name;
}