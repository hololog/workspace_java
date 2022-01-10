package ref_casting;

public class Ex1 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.childPrn();
		c.parentPrn();
		
		Parent p;
		p = c;// 업캐스팅
		
//		p.childPrn(); //컴파일 에러 서브클래스에서 정의한 메서드는 접근 불가능
		p.parentPrn();
		System.out.println("------------------");
		
//		Parent p2 = new Parent();
//		p2.parentPrn();
//		
//		Child c2 = (Child)p2;//다운캐스팅 명시적 형변환 필수
//		c2.childPrn();
//		c2.parentPrn();
//		
		//3. 다운캐스킹이 가능한 경우 
		// 이전에 이미 업캐스팅 된 인스턴스를 다시 다우 캐스팅 하는 경우만 허용
		Parent p3 = new Child();
		Child c3 = (Child)p3;
		
		c3.childPrn();
		c3.parentPrn();
	}
}

class Parent {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

class Child extends Parent {

//	@Override
//	public void parentPrn() {
//		System.out.println("자식클래스의 parentPrn()");
//	}

	public void	childPrn() {
		System.out.println("자식클래스의 childPrn()");
	}
}