package for_statement;

public class Ex1 {
	public static void main (String args[]) {
		/*
		 * 반복문
		 * 
		 * 주어진 조건에 따라 블럭을 반복
		 * for문과 while문은 서로 전환 가능
		 * for 반복횟수가 정해진 상황에 주로 사용
		 * while 반복횟수가 정해지지 않은 상황에 주로 사용 
		 * 초기 변수가 반복문안에서만 사용되는냐 차이 있음 
		 * for(초기식;조건식;증감식){
		 *	 조건식이 true일때 반복실행될 문장 
		 * }
		 * 
		 */
		
		for (int i=0; i<10; i++) {
			System.out.println( i+1 + " : Hello World!");
		}
		
//		System.out.println(i); //오류 선언된 변수가 아님
		System.out.println("----------------------------");
		
		int j = 0;
		while (j<10) {
			
			System.out.println(j+1 + " : Hello World!");
			j++;
		}
		
		System.out.println(j);
		
		//2~10 2씩증가
		for (int i=2; i<=10; i+=2) 
			System.out.println("i=" + i);
		
		System.out.println("----------------------------");
		
		//10->1
		for (int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("----------------------------");
		
		//for문에서 구성요서 제외 가능
		int i = 0;
		for (;i<10; i++) {
			
		}//무한반복식도 가능
		
		
	}
}
