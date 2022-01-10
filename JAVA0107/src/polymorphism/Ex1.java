package polymorphism;

public class Ex1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234-5678", "IOS");
		
		sp.call();
		sp.KakaoTalk();
		sp.sms();
		//instancof 연산자 활용
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone이다");
		} else {
			System.out.println("sp는 SmartPhone가 아니다");
		}
		System.out.println("-------------------");
		//
		HandPhone hp = new HandPhone("010-1234-5678");
		hp.call();
		hp.sms();
//		hp2.kakaoTalk();
		if(hp instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone이다");

		} else {
			System.out.println("hp2는 SmartPhone가 아니다");
			System.out.println("그러므호 SmartPhone로 형변환이 불가능하다.");

		}
		
		System.out.println("-------------------");
		
		HandPhone hp2 = new SmartPhone("010-1234-5678", "안드로이드");
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk();
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone이다");
			System.out.println("그러므호 SmartPhone로 형변환이 가능하다.");
			
			SmartPhone sp2 = (SmartPhone) hp2;

		} else {
			System.out.println("hp2는 SmartPhone가 아니다");

		}
		
		System.out.println("-------------------");
		
		if(hp2 instanceof HandPhone) {
			System.out.println("hp2는 HandPhone이다");

		} else {
			System.out.println("hp2는 HandPhone이 아니다.");

		}
		
		
	}
}

class HandPhone {
	String number;

	public HandPhone(String number) {
		this.number = number;
	}
	
	public void call() {
		System.out.println("전화");
	}
	
	public void sms() {
		System.out.println("문자");
	}
}

class SmartPhone extends HandPhone {
	String osName;

	public SmartPhone(String number, String osName) {
		super(number);
		this.osName = osName;
	}

	public void KakaoTalk() {
		System.out.println("카톡");
	}
	
}