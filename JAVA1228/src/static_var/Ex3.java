package static_var;

class StaticMethod {
	private int normalVar = 10;
	private static int staticVar = 20;
	
	public void normalMethod() {
		System.out.println("일반");
		System.out.println("일반메서드서 인스턴스 변수 접근"+normalVar);
		System.out.println("일반메서드서 static 변수 접근"+staticVar);
	}
	
	public static void staticMethod() {
		System.out.println("static");
//		System.out.println("static메서드서 인스턴스 변수 접근"+normalVar);
		System.out.println("static메서드서 static 변수 접근"+staticVar);
	}
	
	//normalVar변수에 대한 setter정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	
	public static void setStaticVar(int staticVar) {
//		this.staticVar = staticVar;
		StaticMethod.staticVar = staticVar;
	}
	
}

public class Ex3 {
	public static void main(String[] args) {
		/*
		 *  static 메서드
		 *  - 메서드 서언시 리턴 타입 앞에 Static 키워드를 붙임
		 *  -  
		 * 
		 *  < 주의사항 >
		 *  1. static 메서드 내에서는 인스턴스 멤버변수에 접근불가
		 *    => static 메서드가 로딩되는 시점에서는 인스턴그사 생선전이므로 인스턴스 멤버변수도 도딩이 않은 상태이다.
		 *    따라서, Static 메서드 호출 시점에 인스턴스 멤버변수가 존재하지 않을 수 이싿.
		 *  2. STatic 메서드 내에서 this, super 사용불가  
		 *  3. static 메서드 내에서 클래스 외부의 일반 메서드 호출불가 → 메모리 로딩 시점이 달라서
		 *  
		 *    
		 */
		
		
	}
}
