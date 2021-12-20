
public class Ex1 {
	//멤버변수
//	int a, b;
	//생성자
//	Ex1(){}
	public static void main(String[] args) {
	/*
	 * main()메소드는 자바프로그램의 시작점
	 * 프로그램이 실행되면 자동으로 호출
	 * 
	 * 클래스의 객체(인스턴스=instance)
	 *  - new 연산자를 사용하여 인스턴스 생성
	 *    => Heap공간에 특정 위치에 클래스에 대한 인스턴스가 생성됨
	 *       또한 생선된 공간의 주소값이 리턴됨
	 *       
	 * <클래스 인스턴스 생성 기본문법>
	 * 클래스명 변수명;      
	 * 변수명 = new 클래스명();
	 *  -> 클래스명 변수명 = new 클래스명(); 선언과 생성을 한번에
	 */
	
	//1. 인스턴스 생성하여 변수 p선언
//	Person p; //참조변수 선언
	//2. person클래스의 인스턴스를 생섷하며 변수p에 주소값전달
//	p = new Person();
		
	Person p = new Person();
	
	//참조변수를 통해 인스턴스에 접근하여 멤버변수 값을 출력하고 메서도 호출
	//1. 멤버변수값 출력
	System.out.println("이름(p.name): " + p.name);
	System.out.println("나이(p.age): " + p.age);
	System.out.println("p.isHungry: " + p.isHungry);
	
	//2.메서드 호출
	p.eat();
	p.talk();
//	System.out.println(p.talk()); //리턴값이 없어서 에려
	System.out.println("---------------------------");
	//인스턴스의 멤버변수 초기화
	p.name = "홍길동";
	p.age = 20;
	p.isHungry = true;
	
	System.out.println("이름(p.name): " + p.name);
	System.out.println("나이(p.age): " + p.age);
	System.out.println("p.isHungry: " + p.isHungry);
	System.out.println("---------------------------");
	
	Person p2 = new Person();
	//인스턴스 p2의 이름을 
	
	p2.name = "이순신";
	p2.age = 44;
	
	System.out.println("이름(p.name): " + p2.name);
	System.out.println("나이(p.age): " + p2.age);
	System.out.println("p.isHungry: " + p2.isHungry);
	System.out.println("---------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
