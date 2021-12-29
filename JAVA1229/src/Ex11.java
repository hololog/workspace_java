
public class Ex11 {
	public static void main(String[] args) {
		/*
		 *  상속
		 *  -슈퍼클래서의 모든 멤버를 서브클래스 에서 물려받아 선언없이 사용하는 ㄱ서 
		 *    =>상속을 받은 서브클래스에서 별도의 선언 및 정의 없이도
		 *     슈퍼클래스가 가진 멤ㅂ변수나 메서드 등을 자신의 멤버처럼 사용 가능
		 *    => 상속을 화라용하면 코드 중복이 제거되며 유지보수에 용이해진다.
		 *  - private접근제한자가 적용된 멤버는 상속대상에서 제외 
		 * 
		 * 
		 */
		Child c = new Child();
		c.childPrn();
		
		c.name = "홍길동";
		c.parentPrn();
		
		Parent p = new Parent();
		
		p.name = "이순신";
		p.parentPrn();
		
		System.out.println(c.name);
		System.out.println("================");
		
		System.out.println("------아버지---------");
		
		Father father = new Father();
		System.out.println(father.car);
		father.drawWell();
		
		System.out.println(father.house);
		father.singWell();
		
		System.out.println("------나---------");
		Me me = new Me();
		System.out.println(me.pc);
		me.programing();
		
	}
}

class Grandfa {
	String house = "이층집";
	public void singWell() {
		System.out.println("노래를 잘한다");
	}
}

class Father extends Grandfa {
	String car = "자동차";
	public void drawWell() {
		System.out.println("그림 잘");
	}
}

class Me extends Father {
	String pc = "컴퓨터";
	public void programing() {
		System.out.println("컴잘알");
	}
}
//
class Parent {
	String name;
	public void parentPrn() {
		System.out.println("슈퍼클래스 Parent의 parentPrn()");
	}
}

class Child extends Parent {
//	String name = "길동";
	public void childPrn() {
		System.out.println("서브클래스 Child의 childPrn()");
	}
}