package while_statment;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=1, odd=0, even=0;
		
//		while(i<=100) {
//			if (i%2==0) even += i; 
//			else        odd  += i;
//			i++;
//		}
//		
//		System.out.println("1~100까지 홀수의 합: " + odd);
//		System.out.println("1~100까지 짝수의 합: " + even);
		
		
		while(i<=100) {
			odd += i;
			i++;
			even += i;
			i++;
		}
		System.out.println("1~100까지 홀수의 합: " + odd);
		System.out.println("1~100까지 짝수의 합: " + even);
		
		
		//합
//		int sum = 0;
//		int i = 1;
//		
//		while(i<11) {
//			sum += i;
//			i++;
//		} 
//		
//		System.out.println("1~10까지의 합: " + sum);
		
		
		// 구구단2단
//		int i = 2, dan = 1;
//		
//		System.out.printf(" < %d단 >%n", i);
//		
//		while(dan<10) {
//			System.out.println(i + " * " + dan + " = " + i*dan);
//			dan++;
//		}
		
		//1~100까지 짝수의 합
//		int i = 0, sum = 0;
		
//		while(i<=100) {
//			//짝수냐
//			if (i%2==0) sum += i; 
//			i++;
//		}
		
//		while(i<101) {
//			sum +=i;
//			i += 2;
//		}
//		System.out.println("1~100까지 짝수의 합: " + sum);
		
		
	}

}
