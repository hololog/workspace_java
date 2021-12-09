package for_statement;

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 반복문을 사용한 연산의 누적
		 */
		
		//1~100까지 합
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("sum:" + sum);
		System.out.println("========================================");
		
		//1~10짝수의 합만 누적
		int sum2 = 0;
		
		for (int i=0; i<=10; i++) {
			if(i%2==0) sum2 += i;
		}
		
		System.out.println("sum2:" + sum2);
		
		
	}
	
}
