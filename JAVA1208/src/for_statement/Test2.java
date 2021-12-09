package for_statement;

public class Test2 {
	public static void main(String[] args) {
		
		//1~100 3의배수의 합 
//		int sum3 = 0;
//		
//		for(int i=1; i<=100; i++) {
//			//3배수
//			if(i%3==0) {
//				sum3 += i;
//				System.out.print(i + " ");
//			}
//		}
//		
//		System.out.println();
//		System.out.println("1~100 3의 배수의 합 : " + sum3);
		
		
//		//두정수 a ~ b까지의 3의 배수 합
//		int sum = 0;
//		int a=4, b=10;
//		
//		for(int i=a; i<=b; i++) {
//			//3배수
//			if(i%3==0) {
//				sum += i;
//				System.out.print(i + ", ");
//			}
//		}
//		
//		System.out.println();
//		System.out.printf("%d~%d 3의 배수의 합 : %d", a, b, sum);
		
		//3,6,9 게임
//		for (int i=1; i<=10000; i++) {
//			int num = i%10;
//			
//			while (num>10) num %= 10;
//			
//			if (num==3 || num==6 || num==9) System.out.print("짝 "); 			
//			else                            System.out.print(i + " ");
//			
//		}
//		
//		System.out.println();
		
		//7의 갯수
		int n = 247427723;
		int count = 0;
		
//		while (n>0) {
//			
//			if(n%10==7) count++;
//			
//			n /= 10;
//		}
		
		for ( ;n>0 ; n/=10) {
			
			if(n%10 == 7) count++;
			
		}
		
		System.out.println("7의 개수: " + count);
		
		//합 50넘으면 중단
//		int sum = 0;
//		
//		for (int i=1; i<100; i++) {
//			sum += i;
//			
//			if(sum > 50) {
//				System.out.println("i: " + i);
//				break;
//			}
//			
//		}
//		
//		System.out.println("sum: " + sum);
		
		//1~10 짝수 홀수 각각 누적합
//		int odd = 0, even = 0;
//		
//		for (int i=1; i<=10; i++) {
//			//조건문
//			if(i%2==0) even += i;
//			else       odd += i;
//		}
//		
//		System.out.println("홀수합: " + odd );
//		System.out.println("짝수합: " + even );
		
//		for (int i=1; i<=10; i++) {
//			odd += i;
//			i++;
//			even += i;
//		}
//		
//		System.out.println("홀수합: " + odd );
//		System.out.println("짝수합: " + even );
		
//		for (int i=1; i<=10; i+=2) {
//			odd += i;
//			even += i+1;
//		}
//		
//		System.out.println("홀수합: " + odd );
//		System.out.println("짝수합: " + even );
	}
}
