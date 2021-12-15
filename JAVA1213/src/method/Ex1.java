package method;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 메소드(method)
		 *  - 객체의 동작을 나타내는 최소단위
		 *  - 호출로 사용
		 *  - 호출하는 메소드를 caller, 호출당하는 worker
		 *  - 인자(argument): 호출할때 전닳는 값
		 *  - 매개변수(parameter) : 인자를 전달받기위해 선언하는 변수
		 *   -> 매개변수가 없을수도 있음
		 *  - 수행이 끝난후 호출한 곳으로 전달할 값을 리턴값이라고 하면 데이터다입을 명시해야한다.
		 *   -> 리턴값이 없을수도 있음 (void 리턴타입)
		 *   -> 리턴값은 하나만 가능 (수식의 결과나 배열도 가능)
		 * 
		 * <메소드 정의 방법 따른 분류>
		 * 1. 둘 다 없는 경우 void method명()
		 * 2. 매개변수가 없고 리턴값은 있는경우 데이터타입 method()
		 * 3. 매개변수가 있고 리턴값이 없는경우 void method(type a)
 		 * 4. 둘 다 있는 경우 데이터타입 method(type a)
		 * 
		 */
		
		System.out.println("1");
		sister_1();
		System.out.println("2");
		System.out.println("------------------");
		
		System.out.println("물좀줘");
//		String result = sister_2();
//		System.out.println(result);
		System.out.println(sister_2());
		System.out.println("------------------");
		
//		int money = 1000;
//		sister_3(money);
		sister_3(1000);	
		System.out.println("------------------");
		
		System.out.println("동생아 1000원 줄께 새우깡 사와");
		String result = sister_4(1000);
		System.out.println(result);
		System.out.println(sister_4(1000));
		
	}
	
	//1. 둘 다 없는 경우 : void method명()
	// 리턴값이 없으므로 호출결과를 저장할 변수를 선언하거나
	//출력문 등의 내부에서 호출 불가능마여 단독으로 호출해야한다.!!!!!!!!!!!
	public static void sister_1() {
		System.out.println("3");
	}
	//2. 매개변수가 없고 리턴값은 있는경우 : 데이터타입 method()
	public static String sister_2() {
//		String result = "물";
//		return result;
		return "물";
	}
	//3. 매개변수가 있고 리턴값이 없는경우 void method(type a)
	public static void sister_3(int money) {
		money -= 200;
		System.out.println(money + "남았다.");
	}
	//4. 둘 다 있는 경우 데이터타입 method(type a)
	public static String sister_4(int money) {
		money -= 200;
		return "새우깡";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
