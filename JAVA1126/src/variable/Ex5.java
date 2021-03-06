package variable;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 형변환 :타입변환(Type Casting)
		 * - ex) "문자열" + 1 -> "문자열" + "1" (묵시적형변환)
		 * 기본형끼리의 형변환, 참조형끼리의 형변환
		 * 
		 * 1. 묵시적 형변환 (=암시적, 자동)\
		 *  - 작은 데이터 타입에서 큰 데이터 타입으로 변환하는 경우
		 *  - 별도의 형변환 연산자 불요.
		 *  - 오류가 발생하지 않으며 원본데이터 그대로 변환됨
		 *  
		 * 2. 명시적 형변환	(강제 형변환)
		 *  - 큰 데이터타입에서 작은 데이터 타입으로 변환하는 경우 
		 *  - 형변환 연산자 필요 (우변의 데이터앞)
		 *  - 강제변환 과정에서 원본데이터의 넘침(Overflow)발생하여 원본데이터가 아닌 다른 데이터가 저장될수 있다.
		 * 
		 * 
		*/
		
		int a = (int) 100L;
		System.out.println(a);
		
		int b = (int) 2147483647L; 
		int c = (int) 2147483648L; //Overflow발생
//		int b = 22000000000L; //형변환 연산자 필요(명시적 형변환)
		System.out.println(b);
		System.out.println(c+" : Overflow");
		System.out.println();
		
		int a1 = 128;
		byte a2 = 127;
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(byte) : "+a2 );
		
		a1 = a2; 
//		a1 = (int) a2; //형변환 연산자 생략 가능 사용해도 됨
		a2 = (byte) a1;
		
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(byte) : "+a2 );
		System.out.println("------------------------------------");
		
		
		int b1 = 128;
		byte b2 = 127;
		System.out.println("변환 전 b1(int) : " + b1 + ", b2(byte) : "+b2 );
		
//		b2 = b1; //overflow 발생우려도 자동형변환안됨
		b2 = (byte) b1;//강제로 형변환
		System.out.println("변환 전 b1(int) : " + b1 + ", b2(byte) : "+b2 );
		System.out.println("------------------------------------");

		int c1 = 10;
		byte c2 = 0;
		
		System.out.println("변환전 c1(int) : "+c1+", c2(byte) : "+c2);
		c2 = (byte) c1;
//		c2 = c1; // 값은  byte로 표현가능하지만 type을 강제변환해줘야함
		System.out.println("변환전 c1(int) : "+c1+", c2(byte) : "+c2);


		
	}

}
