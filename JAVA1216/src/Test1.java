import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <입력>
		 * 4 
		 * 4
		 * 6
		 * 9
		 * 19
		 * <출력>
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][];
		//수정
		for (int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
			arr[i][0] = sc.nextInt();
			
			for (int j=1; j<arr[i].length; j++) 
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
		}
		
		sc.close();
		
		//수정전 버전
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = new int[i+1];
//			
//			for (int j=0; j<arr[i].length; j++) {
//				
//				if(j==0) {
//					arr[i][j] = sc.nextInt();
//				} else {
//					arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
//				}
//				
//			}
//		}
		
		//첫 구상
//		arr[0][0] = sc.nextInt();
//		arr[1][0] = sc.nextInt(); arr[1][1] = arr[1][0] - arr[0][0];
//		arr[2][0] = sc.nextInt();
//		arr[3][0] = sc.nextInt();
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				
//				if(j==0) {
//					arr[i][j] = sc.nextInt();
//				} else {
//					arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
//				}
//				
//			}
//		}
//		//출력
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b+ "  ");
			}
			System.out.println();
		}
//		
//		
//		4
//		6 2
//      9 3 1
//		19
	}
}
