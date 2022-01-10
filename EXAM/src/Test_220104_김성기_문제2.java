
public class Test_220104_김성기_문제2 {
	public static void main(String[] args) {
		System.out.println("< 출력 결과 >");
		
		for (int i=2; i<10; i++) {
			System.out.println("  < " + i + "단 >");
			
			for (int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
