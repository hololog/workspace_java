
public class Ex1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("우리집 티비: "+ c.tv);
		c.watchTv();
		c.watchParentTv();
		System.out.println("=================");
		c.scope();
		System.out.println("=================");
		SpiderMan sm = new SpiderMan();
		System.out.println(sm.isSpider);
	}
}

class Parent {
	String tv = "부모티비";

	String name = "Parent클래스의  멤버 name";
	
	public void watchTv() {
		System.out.println("부모님 댁에서 "+tv +"보자");
	}
}

class Child extends Parent {
	String tv = "내 티비";
	
	@Override
	public void watchTv() {
		System.out.println("집에서 "+tv +"보자");
		System.out.println("super.tv: "+super.tv);
	}
	String name = "Child클래스의  멤버 name";
	public void scope() {
		String name = "Child클래스의 로컬변수 name";
		
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

	public void watchParentTv() {
//		watchTv();
		
		super.watchTv();
	}
}	

class SonOfChild extends Child {
	String name;
	
	public void scope() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
//		System.out.println(super.super.name);// 중첩안됨
	}
}

class Person {
	String name;
	int age;
	
	public void jump() {
		System.out.println("점프");
	}
	
	public void eat() {
		System.out.println("먹기");
	}
}

class SpiderMan extends Person{
	boolean isSpider;

	@Override
	public void jump() {
		if(isSpider) {
			System.out.println("강력점프");
		} else {
			super.jump();
		}
	}

	
	
	
	
}