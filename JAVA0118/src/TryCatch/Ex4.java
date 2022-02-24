package TryCatch;

public class Ex4 {
	public static void main(String[] args) {
		try {
			System.out.println("try블록 시각");
			
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1/num2);
			System.out.println("try블록 끝");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
