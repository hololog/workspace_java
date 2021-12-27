package constructor;

class DefaultPerson2 {
	String name;

	public DefaultPerson2() {
		name = "홍길동";
	}
}

class DefaultPerson {
	String name;

}

class ParameterPerson {
	String name;

	public ParameterPerson(String name) {
		this.name = name;
	}
}

class ParameterPerson2 {
	String name;
	int age;
	boolean isHungry;

	public ParameterPerson2(String name, int age, boolean isHungry) {
//		super();
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	public ParameterPerson2() {
//		super();
		this("홍길동", 20 , true);
	}
	
	

//		public ParameterPerson2(String newName, int newAge, boolean newIsHungry) {
//			System.out.println("ParaemterPerson2생성자 호출됨");
//			name = newName;
//			age = newAge;
//			isHungry = newIsHungry;
//		}

}

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		DefaultPerson dp = new DefaultPerson();
		System.out.println("DefaultPerson의 name : " + dp.name);
		System.out.println("----------------------");

		DefaultPerson2 dp2 = new DefaultPerson2();
		System.out.println("DefaultPerson2의 name : " + dp2.name);
		System.out.println("----------------------");
		;

		ParameterPerson pp = new ParameterPerson("이순신");
		System.out.println("ParameterPerson의 name : " + pp.name);
		System.out.println("----------------------");

		ParameterPerson2 pp2 = new ParameterPerson2("홍길동", 20, true);
		System.out.println(pp2.name);
		System.out.println(pp2.age);
		System.out.println(pp2.isHungry);
		System.out.println("----------------------");
		ParameterPerson2 pp3 = new ParameterPerson2();
		System.out.println(pp3.name);
		System.out.println(pp3.age);
		System.out.println(pp3.isHungry);
	}
}
