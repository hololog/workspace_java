package if_statment;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 삼항연산자의 중첩 -경우의 수가 3가지 이상일때 <문법> (조건식) ? 값1 : (조건식2 ? 값2 : 값3);
		 * 
		 */
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		String result1 = num1 == 0     ? "0" : 
						 num1 % 2 == 0 ? "짝수" : "홀수";
		String result2 = num2 == 0     ? "0" : 
						 num2 % 2 == 0 ? "짝수" : "홀수";
		String result3 = num3 == 0     ? "0"   : 
                         num3 % 2 == 0 ? "짝수" : "홀수";

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
