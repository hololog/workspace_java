package for_statement;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		//구구단의 특정단 출력
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		System.out.printf(" < %d단 >%n", dan);
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
		
	}
}
