package while_statment;

public class Test2 {
	public static void main(String[] args) {
		//99단 2~9단까지
		
		int dan = 2;
		
		while(dan<10) {
			
			System.out.printf(" < %d단 >%n", dan);
			
			int i = 1;
			
			while(i<10) {
				System.out.printf("%d * %d = %d%n", dan, i, i*dan);
				i++;
			}
			
			System.out.println();
			dan++;
		}
	}
}
