import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 *  Q1) 객체지향언어의 특징
		 *  1. 슈퍼클래스의 멤버를 서브클래스에서 선언없이 사용할수 있도록 물려받는 것은?
		 *  	=> 상속(상속성, inheritance)
		 *  2. 객체의 상세한 내용을 외부에 숨기고 단순히 메시지만으로 객체와 상호작용을 하는것?
		 *      => 캡슐화(encapsulation) 예)private, getter/setter
		 *  3. 현실세계 그대로 객체롤 표현하기 보다는 공통점을 추출하여 상위개념을 만들고 상세내역을 
		 *  	없애나가는 과정
		 *  	=> 추상화(abstraction)
		 *  4. 상속관계에서 슈퍼클래스 타입으로 서브클래스의 인스턴스를 참조할수 있는 것?
		 *  	=> 다형성(polymorphism)
		 *  	업캐스킹->참조영역의 축소
		 *  	=> 하나의 참조변수로 여러 인스턴스를 다루는 것->코드의 통일성 향상
		 *  
		 *  
		 */
		
		Student s = new Student("홍길동", 20171111);
		
	}

}
class Student{
	String name;
	int number;
	
	public Student(String name, int number){
		this.name = name;
		this.number = number;
	}
}

class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " " + salary;
	}
}

class Manager extends Employee {
	String depart;

	public String getManager() {
		return super.getEmployee() + depart;
	}
}









