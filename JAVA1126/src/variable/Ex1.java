package variable;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 데이터 타입: 메모리의 효율적 사용을 위해 
		 * 8가지 기본타입
		 * 
		 * 1. 정수형 :byte short int long
		 * 2. 문자형 :char(정수형)
		 * 3. 논리형 : boolean
		 * 4. 실수형 : float double
		 * 
		 * 정수형 표현가능 범위 -2^(n-1)~2^(n-1)*-1 (n은 메모리크기bit)
		 * 실수형 
		 * float 타입 : 10^28 (long 보다 더 큰 정수 범위가능)
		 * double : 10^308
		 * 
		*/
		 byte b = 127;
//		 byte b = 128; // 범위보더 커서 오류
		 System.out.println(b);
		
		 short s = 128;
//		 s = 32768; //범위보더 커서 오류
		 System.out.println(s);
	
		 int i = 32768;
//		 i= 2148485358; //범위보더 커서 오류
		 System.out.println(i);
		 
//		 long l = 2148485358; //L접미사없어서 int로 취급(소문자는 쓰지않음)
		 long l = 2148485358L;
		 System.out.println(l);
		 
//		 i = 100L; //데이버타입이 일치하지 않음
		 
//		 float f = 3.14; //접미사없음 오류(대소문자 둘다가능)
		 float f = 3.14f;
		 double d = 3.14;
		 System.out.println(f);
		 System.out.println(d);
		 
		 char c = 'A';
//		 char c = ''; // 값이 없어서 오류,공백이라도 있어야함
//		 char c = 'AB'// 하나의 문자만 가능
		 c = 'A'+1; //유니코드 다음문자
		 
		 System.out.println(c);
				 
		 boolean bool = true; //다른언어에서는 1을 true로 
//		 boolean bool = "true"; //문자열로 인식
		 System.out.println(bool);
		 bool = false; //다른언어에서는 0을 false로 
		 System.out.println(bool);
	}

}
