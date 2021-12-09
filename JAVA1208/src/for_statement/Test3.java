package for_statement;

public class Test3 {
	public static void main(String[] args) {
		
		//for문을 사용해서 구구단 출력
		for (int dan=2; dan<10; dan++) {
			System.out.printf(" < %d단 >%n", dan);
			
			for (int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan*i);
			}
			
			System.out.println();
			
		}
	}
}
