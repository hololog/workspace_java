package operator;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 산술연산시 자동 형변환
		 * 
		 * 산술연산을 수행하기 전 피연산자들끼리의 데이터 타입을 "일치"시킨수에 연산 수행
		 * 
		 * 1. int보다 작은 정수끼리 연산 = 연산산출타입은 int
		 *  ex) char + int = int
		 * 2. int보다 큰 타입끼리 연산 = 큰 타입
		 *  ex) int + double = double
		 *      int + long = long
		 * 
		 * 
		*/
		
		char ch = 'A';
		System.out.println(ch+2);
		System.out.println((char)(ch+2));

		char ch2 = (char)(ch+2);
		System.out.println(ch2);
		
		System.out.println(ch+2);
		System.out.println((char)(ch+2));
		
		int i = 100;
		long l = 300;
//		int i2 = i + l; //오류
		
		int i2 = (int)(i + l);
		System.out.println(i2);
		
		float f = 3.14f;
		System.out.println(f);
		long l2 = (long)(l +f);
		System.out.println(l +f);
//		long l2 = l + f; //오류
		System.out.println(l2);
		System.out.println("=====================");
		System.out.println((double)10/3);
		
		
		
	}

}
