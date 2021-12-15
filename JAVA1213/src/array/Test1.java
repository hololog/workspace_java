package array;

public class Test1 {
	public static void main(String[] args) {
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		int[][] score = {
				{ 80,  80,  80},
				{ 90,  80,  77},
				{ 60,  50,  60},
				{100, 100, 100},
				{ 50,  80, 100},
		};
		
		int[] sum = new int[5];
		
		System.out.println("      국어	영어	수학");
		
		for (int i=0; i<score.length; i++) {
			String result = "";
			result += names[i] + "  ";
			
			for (int j=0; j<score[i].length; j++) {
				result += score[i][j] + "	";
				sum[i] += score[i][j]; 
			}
			
			System.out.println(result);
		}
		
		System.out.println("------------------------");
		
		System.out.println("< 학생별 총점 >");
		
		for (int i=0; i<sum.length; i++) {
			System.out.println(names[i] + ": " + sum[i] + "점");
		}
		
		
//		System.out.println("        국어 영어 수학");
//		for (int i=0; i<score.length; i++) {
//			
//			System.out.print(names[i] + "  ");
//			
//			for (int j=0; j<score[i].length; j++) {
//				System.out.printf("%4d", score[i][j]);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("------------------------");
//		
//		System.out.println("< 학생별 총점 >");
//		
//		for (int i=0; i<score.length; i++) {
//			System.out.print(names[i] + ": ");
//			int sum = 0;
//			for (int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				
//			}
//			System.out.print(sum);
//			System.out.println("점");
//		}
		
	}
}
