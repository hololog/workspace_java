import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/* 파스칼 삼각형
		 * 크기 N을 입력받고 N크기의 ㅏ스칼 삼각형 출력
		 * 
		 * 입력 6
		 * 출력
		 * 1
		 * 1 1 
		 * 1 2 1 
		 * 1 3 3 1 
		 * .......
		 * 규칙찾기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		int N = sc.nextInt();
		
		int[][] arr = new int[N][];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
			
			for (int j=0; j<arr[i].length; j++) {
				if(j==0 || i==j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		
//		int[][] arr2 = new int[N][2*N-1];
//		
//		arr2[0][N-1] = 1;
//		arr2[1][N-2] = 1;
//		arr2[1][N] = 1;
//		
//		
//		for (int i=2; i<arr2.length; i++) {
//			
//			for (int j=0; j<arr2.length; j++) {
//				arr2[i][N-1-i] = 1; 
//				arr2[i][N-1+i] = 1; 
//				
////				arr2[i][j] = arr2[i-1][j-1] + arr2[i-1][j+1];
//			}
//			
//			for (int j=2; j<arr2.length-2; j++) {
//				arr2[i][j] = arr2[i-1][j-1] + arr2[i-1][j+1];
//			}
//		}
		
		
////		00 01 02 03 04 
//		    10 11 12 13 14 
//		    20 21 22 23 24 
////		
	        	
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//다른 출력
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				for (int k=0; k<arr.length-k; k++) {
					System.out.print("0");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
//		for (int[] a : arr2) {
//			for (int b : a) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}
	}

}
