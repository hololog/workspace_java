package operator;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 산술연산자 일반적인 사칙연산이랑 동일 % 나머지 연산자
		 * 
		 */

		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2);
		System.out.println(10 % 3);

		// 자동형변환
		
		byte b1=10, b2=20, b3;
		System.out.println(b1 + b2);
//		b3 = b1 + b2; // 정수연산의 산출값이 int로 자동 형변환
		b3 = (byte) (b1 + b2);
		System.out.println(b3);

		System.out.println("===================================");
		//비트연산자
		
		
		System.out.println(Integer.toBinaryString(45));//101101
		System.out.println(Integer.toBinaryString(25));//011001
	
		
		System.out.println(45 & 25);
		System.out.println(Integer.toBinaryString(9));
		System.out.println(45|25); //001001
		System.out.println(Integer.toBinaryString(61));
		System.out.println(45^25);
		System.out.println(Integer.toBinaryString(52));
		System.out.println(~45);
		System.out.println(Integer.toBinaryString(-46));

	}

}
