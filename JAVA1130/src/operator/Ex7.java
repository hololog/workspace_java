package operator;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 삼항연산자 : 조건 연산자
		 * if else과 동일한 기능이지만 차이있음
		 * - (조건식)? true일때 return값:false일때 return값
		 * 
		 * */
		
		int a = 10;
		String result = (a%2 ==0)? "짝수":"홀수";
		System.out.println(result);

		a=11;
		result = (a%2 ==0)? "짝수":"홀수";
		System.out.println(result);
		
		a=10;
		int b = 20;
		
		int max = a>b? a:b;
		int min = a<b? a:b;
		System.out.println(max);
		System.out.println(min);
		
//		max = a<b? System.out.println(max):System.out.println(min); 
		// 삼항연산자는 결과값을 받아야함
		String s = a<b? "max":"min"; 
		System.out.println(s);
		
	
	}

}
