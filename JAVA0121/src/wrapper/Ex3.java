package wrapper;

public class Ex3 {
	public static void main(String[] args) {
//		 int limit = -Integer.MAX_VALUE;
//		 int limit2 = -Integer.MIN_VALUE;
//		 System.out.println(limit);
//		 System.out.println(limit2);
//		 
//		 int a = Integer.max(limit, limit2);
//		 int b = Integer.compare(limit, limit2);
//		 System.out.println(a);
//		 System.out.println(b);
////		 limit.com
//		
//		Integer a = 10;
//		Integer b = 20;//오토박싱
//		System.out.println(a.compareTo(b));
//		
//		Integer.toHexString(0)\
		char ch = '가';
		System.out.println(Character.isUpperCase(ch)); //대문자인가
		System.out.println(Character.isLowerCase(ch)); //대문자인가
		System.out.println(Character.isDigit(ch)); //숫자인가(0~9)
		System.out.println(Character.isSpaceChar(ch)); //공백문자인가
		System.out.println(Character.isLetter(ch)); //기타문자
		System.out.println(Character.isWhitespace(ch)); //기타문자
		
	}
}
