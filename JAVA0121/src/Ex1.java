
public class Ex1 {
	public static void main(String[] args) {
		/*
		 *toString()메서드 
		 * 
		 */
		Person p1 = new Person("홍길동", 20);
		System.out.println(p1);
		
		System.out.println("클래스명: "+p1.getClass().getName());
		System.out.println("해쉬코드: "+p1.hashCode());
	
		System.out.println("---------------");
		ToStringPerson p2 = new ToStringPerson("홍길동", 20);
			
		System.out.println(p2);
		System.out.println("클래스명: "+p2.getClass().getName());
		System.out.println("해쉬코드: "+p2.hashCode());
	}

}

class ToStringPerson {
	String name;
	int age;
	
	public ToStringPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ToStringPerson [name=" + name + ", age=" + age + "]";
	}
}

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}