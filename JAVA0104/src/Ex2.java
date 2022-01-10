
public class Ex2 {
	public static void main(String[] args) {
		 Child2 ch = new Child2();
		 
		
		
	}
}

class Parent2{
	public Parent2() {
		System.out.println("Parent2 생성자 호출됨!");
	}
}

class Child2 extends Parent2 {
	public Child2() {
		super(); //생략됨
		System.out.println("Child2 생성자 호출됨");
	}
	
}

class Person2{
	String name;
	int age;
	
	
	public Person2() {
	}


	public Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class SpiderMan2 extends Person2 {
	boolean isSpider;
	
	public SpiderMan2(String name,int age, boolean isSpider) {
		this.name = name;
		this.age = age;
		this.isSpider = isSpider;
	}
}
















