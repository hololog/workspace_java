package static_var;

class StaticMember {
	static int a = 10;//클래스 멤버변수
	int b = 20;//인스턴스 멤버변수
	
	public void normalMethod() {
		System.out.println("일반 메소드");
	}
	
	public static void staticMethod() {
		System.out.println("static메소드");
	}
	
}


public class Ex2 {
	public static void main(String[] args) {
		/*
		 * <자바 프로그램 실행 과정>
		 * 1. 소스 코드 작성 및 컴파일후 클래스 실행 
		 * 2. 클래스 로딩 - 클래스(정적) 멤버변수 및 메서드가 메모리에 로딩(method arad)
		 * 3. main() 메서드를 호출
		 * 4. 인스턴스 생성 - 인스턴스 멤버변수 및 메서드가 메모리에 로딩(heap)
		 * 5. 메서드 호출(실행) - 메서드 내의 로컬 변수가 메모리에 로딩(stack)
		 * 6. 결과 출력
		 * 
		 * < static 키워드 >
		 * - 정적 이라는 의미를 갖는 키워드
		 * - 클래싀 메서드, 변수의 지정자로 사용가능
		 * - 멤버 메서드 또는 변수에 Static키워드를 사용할 경우 
		 *   인스턴스 생성과 관게없이 클래스가 로딩되는 시점에 함께 메모리에 로딩됨
		 *   => 따라서 인스턴스 생성없이도 접근가능(클래스 명으로 접근가능)
		 *   
		 * < static 멤버변수 >
		 * - 멤버변수 선언부 데이터 타입 앞에 static키워드를 사용하여 선언함
		 * - 인스턴스 생성전 클래스가 메모리에 로딩될때 static 변수도 하마께 로딩됨
		 *   => heap이 아닌 method area에 변수가 생성됨
		 * - 모든 인스턴스가 하나의 변수(메모리)를 공유함
		 *   (= 클래스 당 하나의 변수 만 생성되면 해당 변수를 모든 인스턴스가 공유)
		 * - 참조변수 없이 클래스 명만으로 행당 멤버에 접근 가능 
		 * 
		 * < static 메서드 >
		 * - static 멤버변수와 마찬가지로 클래스 로딩시 함ㄱ께 메모리에 로딩되므로 클래스 명만으로 호출
		 *    
		 */
		
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		
		
	}
}
