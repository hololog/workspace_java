package constructor;

class Person {
	String name;
	int age;
//	1.멤버변수와 로컬변수의 이름을 다르게 선언
//	public void setName(String newName) {
//		this.name = name;
//	}
//	2.레퍼런스 this를 사용하여 멤버변ㅅ를 지정
	public Person(String name) {
		this.name = name;
	}
	
	
		
	
}


public class Ex3 {
	public static void main(String[] args) {
		/*
		 * this 키워드
		 * 1. Reference this
		 *    자신의 인스턴스 주고사 저장되는 레퍼런스
		 *    개발자가 임의로 생성할수 없으며 인스턴스 생성시 자동으로 ㅈ소가 저장됨
		 *    => 각 인스턴스 맏 this에 저장되는 주소가 달라짐
		 *    일반적인 참조변수와 동일한 방법으로 사용가능
		 *    주로 생성자나 메서드내에서 멤버변수와 로컬변수의 이름이 동일한 경우
		 *    멤버벼수를 구별할 목적으로 사용
		 *    또한 자신의 인스턴스 내의 다른 메서드를 호출하는데에도 사용가능
		 *    (일반적으로 데서드 이름은 로컬변수처럼 중복되지 않으므로 this생랴ㄱ)
		 *    
		 */
		
		
	}
}
