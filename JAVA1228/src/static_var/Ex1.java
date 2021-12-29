package static_var;

class VariableEx {
	//멤버변수 선언
	String instanceMember = "인스턴스 멤버 변수";
	String instanceMember2;//초기값 Null로 자동 초기화
	static String classMember = "클래스 멤버 변수";
	
	public void instanceMethod(String parameterVariable) {
		String localVariable = "로컬변수";
		
		System.out.println(instanceMember);
		System.out.println(classMember);

		System.out.println(parameterVariable);
		System.out.println(localVariable);
		
		//로컬변수는 반드시 초기화 후에 사용해야함
		String localVariable2;
		
		for (int i=0; i<3; i++) {
			System.out.println(i);
		}
		
	}
	
	public void instanceMethod2() {
		
		//메서드 내에서는 멤버변수와 자신의 메서드에서 선언ㅇ된 로켤변수에만 접근가능
		System.out.println(instanceMember);
		System.out.println(classMember);
		//로컬변수
//		System.out.println(localVariable);
		
		
	}
	
}
public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 변수 선언 위치 따른 분류
		 * 1. 로컬 변수(Local Variable)
		 * 	- 메서드 내부에서 선언된 변수(for문, if문 등 포함)
		 *  - 주로 메서드의 중괄호 내부에서 선언되는 변수를 말하며
		 *    for문의 소괄호() 에서 선언되는 제어변수도 로컬 변수에 해당함
		 *    => 메서드 파라미터 부분인 소괄호() 에서 선언되는 변수를 별도로
		 *       파라미터 변수라고도 하지만, 로컬 변수로 통일해도 무관함
		 *  - 해당 변수가 선언된 위치로 부터 소속된 중괄호가 끝나는 지점까지만 접근 가능
		 *    => 라이프 사이클(Life Cycle)이라고 하며,
		 *       로컬 변수의 라이프 사이클은 선언 지점부터 중괄호가 끝나는 지점 까지이다!
		 *  - 반드시 초기화 후에 사용 해야한다!
		 *  
		 *  2. 멤버변수 (Member Variable)
		 *   - 클래스 내부, 메서드 외부에서 선언되는 변수
		 *   - 클래스 내의 어느 위치에서라도 동일한 변수로 취급됨(메모리 생성 시점은 다름)
		 *   - 클래스 내의 생성자나 메서드 등에서 접근 가능
		 *   - 별도의 초기화를 하지 않을 경우 기본값으로 자동 초기화 됨
		 *  
		 *  	1) 인스턴스 멤버 변수
		 *  		- 멤버변수의 선언부 접근제한자 뒤(리턴타입 앞)에 아무것도 붙지 않은 변수
		 *  		- 인스턴스가 생성될 때마다 각각의 공간이 새로 할당되므로
		 *  		  인스턴스가 다르면 인스턴스 멤버 변수(저장공안)가 다르며,
		 *  		  인스턴스 멤버변수에 저장되는 값이 다를 수 있다!
		 *  		- 인스턴스가 생성(new)되는 시점에 메모리에 로딩(생성)되며,
		 *  		  인스턴스가 제거되는 시점에 메모리에서 제거됨
		 *  
		 *  	2) 클래스(정적, static) 멤버 변수
		 *  		- 멤버 변수의 선언부 접근제한자 뒤(리턴타입 앞)에
		 *  		  static 키워드를 붙여 선언한 변수
		 *  
		 *  
		 * 
		 * */
		VariableEx ve = new VariableEx();
		//외부클래서으세ㅓ 특정 인스턴스 내의 인스턴스 변수에 접근하려면 해당 인스턴스를 생성한 후에 인스턴스의 참조변수를 통해 접근할수 있다.
		System.out.println(ve.instanceMember);
		//클래스 변수도 동일한 방법으로 접근가능하다 하지만 클래스.클래스변수로 
		System.out.println(ve.classMember);
		//하지만 클래스 멤버변수는 클래스명으로 접근하도록 하자(인스턴스 생성할 필요없이)
		System.out.println(VariableEx.classMember);
		
		
		
		
		
		
		
		
		
	}
}
