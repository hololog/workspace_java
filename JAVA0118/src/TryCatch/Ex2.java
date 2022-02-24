package TryCatch;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작!");

		try {
			System.out.println("try 블록 시작");
			
			int num1 = 3;
			int num2 = 0;
			System.out.println(num1/num2);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException :" + e.getMessage());
		}
		
		System.out.println("프로그램 종료!");
	}
}
