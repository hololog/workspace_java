
public class Ex22 {
	public static void main(String[] args) {
		SpiderMan sm = new SpiderMan();
		sm.name = "피터파커";
		sm.age = 20;
		sm.nickName = "친저러한 이웃";
		sm.eat();
		sm.fireWeb();
		sm.jump();
		System.out.println("=======================");
		
		Person p = new Person("홍길동", 20);
		SpiderMan s = new  
		
	}
}

class Person {
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("밥먹기");
	}
	
	public void jump() {
		System.out.println("점프");
	}
	
	private void normalLife() {
		System.out.println("평범한 삶");
	}
}

class SpiderMan extends Person {
	String nickName;
	
	public void fireWeb() {
		System.out.println("거미줄발사");
	}
	
	SpiderMan(String nickName) {
		
	}
	
	SpiderMan(String name, int age, String nickName) {
		
	}
}