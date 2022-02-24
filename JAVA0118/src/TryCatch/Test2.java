package TryCatch;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			
			int num = (int)(Math.random()*10);
			
			try {
				System.out.print("10/"+ num + " = ");
				System.out.println(10/num);
			} catch(ArithmeticException e) {
				System.out.println("피연사자가 0이므로 연산에서 제외됩니다.!");
			}
		}
		
		System.out.println("---------------------------------------");
		
		Random r = new Random();
		
		for (int i=0; i<10; i++) {
			
			int num = r.nextInt(10);
			
			try {
				System.out.print("10/"+ num + " = ");
				System.out.println(10/num);
			} catch(Exception e) {
				System.out.println("피연사자가 0이므로 연산에서 제외됩니다.!");
				e.printStackTrace();
			}
		}
		
		
	}
}
