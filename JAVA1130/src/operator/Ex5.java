package operator;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 비교연산자 대소관계비교하여 true or false
		 * 
		 */

		int a = 10, b = 5;
		System.out.println("a>b인가 " + (a > b));
		System.out.println("a<b인가 " + (a < b));
		System.out.println("a>=b인가 " + (a >= b));
		System.out.println("a<=b인가 " + (a <= b));
		System.out.println("a!=b인가 " + (a != b));
		System.out.println("a==b인가 " + (a == b));
		System.out.println("===================");
		//char 타입을 비교연산자에 사용시 정수갓을 비교
		System.out.println('A' >'B');
//		System.out.println("A" >"B");
		System.out.println('A'==65);
		System.out.println(3==3.0);
		
		
		System.out.println("===================");
		System.out.println(0.1==0.1f); //실수는 근사치이기때문에 다른값취급 float 7자리 double 15자리
		System.out.println((float)0.1==0.1f); //실수는 같은 타입으로 비교해야함
	
		
		
		
	}

}
