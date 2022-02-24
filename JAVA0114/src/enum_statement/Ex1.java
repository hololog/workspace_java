package enum_statement;

import java.time.LocalDate;
import java.time.Month;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해 관리할 수 있는 장점이 있으나
		 * 해당 값의 범위를 벗어나는 값을 사용할 경우 컴파일 시점에서 오류 발견이 불가능하므로
		 * 추가젓인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함
		 * => 이를 해결하기 위해 열거형(enum type) 필요
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 		// 열거타입에서 사용할 값(상수)을 차례대로 나열
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 * - 단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정
		 * 
		 * < 열거타입 사용 방법 >
		 * 1. 열거타입 변수 선언 방법(클래스, 인터페이스와 동일)
		 * 	- 열거타입명 변수명
		 *  예)   Car  car
		 * 
		 * 2. 열거타입 상수 접근 방법 (일반 상수와 동일)
		 *  - 열거타입명.상수명
		 *  예) Car.MAX_SPEED
		 * 
		 * 3. 열거타입 비교 방법
		 *  - if문 사용 시 동등비교 연산자 사용 (==)
		 *  - switch문 사용 사능 (단, case문에서 열거타입명 없이 상수만 지정 필수!)
		 *    switch(열거타입변수){
		 *		case 열거타입상수1 : 수행할 작업들...;
		 *		case 열거타입상수2 : 수행할 작업들...;
		 *		case 열거타입상수n : 수행할 작업들...;
		 * 	  }	
		 * */
		
		BadWeek badWeek = new BadWeek();
		// Setter 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도
		// 상수 호출만으로 해당 정수 사용 및 전달이 가능
		badWeek.setMyWeek(BadWeek.WEEK_TUESDAY);	// 화요일(1) 설정
		
		if(badWeek.getMyWeek() == BadWeek.WEEK_TUESDAY) {
			System.out.println("오늘은 화요일 입니다!");
		}
		
		// 요일 정보를 상수로 관리하는 경우의 문제점
		// => 상수 데이터들이 정수일 경우 해당 정수를 전달받은 메서드(Setter) 호출 시
		//    상수 범위 값이 아닌 다른 값을 전달해도 컴파일에러(문법적 오류)가 발생하지 않는다!
		badWeek.setMyWeek(10);	// 10이라는 정수값을 갖는 요일은 없으나
		// int 타입 파라미터 이므로 컴파일 시점에서는 아무런 문제가 발생하지 않는다!
		// 그러나, 해당 데이터를 사용하기 위한 시점에는 문제가 발생할 수 있다.
		// => 따라서, 별도로 해당 범위 내의 데이터인지 판별하여 추가적인 작업을 수행해야함

		EnumWeek myWeek = EnumWeek.FRIDAY;
		System.out.println(myWeek+"입니다.");
		if(myWeek == EnumWeek.FRIDAY) {
			System.out.println("오늘은 금요일 입니다.");
		}
		
		System.out.println("---------------------");
		//열거타입을 활용하는 클래스 사용
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(EnumWeek.FRIDAY);
//		System.out.println(gw.getMyWeek());
		gw.printWeek();
		
		System.out.println("---------------------");

		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getMonthValue());
		Month month = today.getMonth();
		System.out.println(month);
		System.out.println(today.getDayOfWeek());
		
		switch (month) {
			case JANUARY :
				
				break;
	
			default:
				break;
		}
	}

}

//열거타입 정의
enum EnumWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//열거타입을 사용하는 클래스
class GoodWeek {
	EnumWeek myWeek;//클래스 내 선언가능 
	
	public EnumWeek getMyWeek() {
		return myWeek;
	}
	
	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
	public void printWeek() {
		//저장된 요일 판별하여 출력
		switch (myWeek) {
			case MONDAY    : System.out.println("월요일"); break;
			case TUESDAY   : System.out.println("화요일"); break;
			case WEDNESDAY : System.out.println("수요일"); break;
			case THURSDAY  : System.out.println("목요일"); break;
			case FRIDAY    : System.out.println("금요일"); break;
			case SATURDAY  : System.out.println("토요일"); break;
			case SUNDAY    : System.out.println("일요일"); break;
		}
	}
	
}

// --------------------------------------------------------
// 열거타입을 사용하지 않고, 상수만 사용하는 경우
class BadWeek {
	// 요일 정보를 상수로 관리하는 경우의 장점
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명)만으로 값을 사용 가능하며
	//    클래스명만으로 접근 가능하여 접근이 쉬움. 또한, 값 변경이 불가능하여 안전함
	public static final int WEEK_MONDAY 	= 0;
	public static final int WEEK_TUESDAY 	= 1;
	public static final int WEEK_WEDNESDAY 	= 2;
	public static final int WEEK_THURSDAY 	= 3;
	public static final int WEEK_FRIDAY 	= 4;
	public static final int WEEK_SATURDAY 	= 5;
	public static final int WEEK_SUNDAY 	= 6;
	
	private int myWeek;
	
	public int getMyWeek() {
		return myWeek;
	}
	
	public void setMyWeek(int myWeek) {
//		this.myWeek = myWeek;
		// 요일에 대한 정상 범위 판별 없이 저장작업을 수행할 경우
		// 실제 저장된 요일을 꺼내서 사용하는 시점에는 문제가 발생할 수 있다!
		// 따라서, 조건문 등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요함
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) {
			this.myWeek = myWeek;
		} else {
			System.out.println("요일 입력 에러!");
		}
		
		
		
		
	}
}












