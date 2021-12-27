package constructor;

class OverloadingPerson  {
	String name;
	int age;
	boolean isHungry;
	
	public OverloadingPerson() {
		this("홍길동", 20, true);
	}
	
	public OverloadingPerson(String name, int age, boolean isHungry) {
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	public void print() {
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
		System.out.println("배고픔 " + isHungry);
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		
		OverloadingPerson op = new OverloadingPerson();
		op.print();
		System.out.println("-------------------------");
		
		OverloadingPerson op2 = new OverloadingPerson("이순신", 20 ,false);
		op2.print();
	}
}
