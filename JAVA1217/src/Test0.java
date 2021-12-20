import java.util.Scanner;

public class Test0 {
	

	// 인덱스값 오름차순 정렬
	public static int[] ascNumber(int a, int b, int c) {
		int arr[] = new int[3];

		arr[0] = (a < b) && (a < c) ? a : b < c ? b : c;
		arr[2] = (a > b) && (a > c) ? a : b > c ? b : c;
		arr[1] = a + b + c - arr[0] - arr[2];

		return arr;
	}
	// 세 인덱스간의 최단 거리
	public static int calDistance(int a, int b, int c, int size) {
//		int aToc = c - a;//a~c의 거리
//		int bToa = a - b + size;//b~a의 거리
//		int cTob = b - c + size;//c~b의 거리
		//메소도 호출해서 
		int[] arr = ascNumber(a, b, c);
		
		int aToc = arr[2] - arr[0];//a~c의 거리
		int bToa = arr[0] - arr[1] + size;//b~a의 거리
		int cTob = arr[1] - arr[2] + size;//c~b의 거리
		
		return (cTob > aToc) && (bToa > aToc) ? aToc : (cTob > bToa) ? bToa : cTob;
	}
	
	public static void main(String[] args) {
		// 입력 예시)
		// 1 1 0 0 0 0 0 0 0 0 0 0
		// 0 0 1 0 0 0 0 0 0 0 0 0
		// 1 0 0 0 0 0 0 0 0 0 0 0
		// 출력 예시)
		// 2 회전수
		// 1 0 0 0 0 0 0 0 1 0 0 0
		// 0 0 0 0 0 0 1 0 0 0 0 0
		// 0 0 0 0 0 1 0 0 0 0 0 0
		// 3
		// 1 0 0 0 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0 0 0 0 1
		// 0 1 0 0 0 0 0 0 0 0 0 0
		// 2
		
//		int[] safeLock1 = { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 };
//		int[] safeLock2 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
//		int[] safeLock3 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키값을 입력해주세요");

		//2차원배열로 다시고침
		int[][] safeLock = new int[3][12];
		//키값 입력받기
		for (int i=0; i<safeLock.length; i++) {
			for (int j=0; j<safeLock[i].length; j++) 
				safeLock[i][j] = sc.nextInt();
		}
		sc.close();
		
		int min = 999;
		// 배열에 두개이상일때 반복문?
		for (int i=0; i<safeLock[0].length; i++) {
			if(safeLock[0][i]==1) {
				
				for (int j=0; j<safeLock[0].length; j++) {
					if(safeLock[1][j]==1) {
						
						for (int k=0; k<safeLock[0].length; k++) {
							if(safeLock[2][k]==1) {
//								int[] result = ascNumber(i, j, k);
//								int n = calDistance(result[0], result[1], result[2], safeLock[0].length);
								int n = calDistance(i, j, k, safeLock[0].length);
								
								System.out.printf("키값이 %d, %d, %d 일때의 회전수: %d%n", i, j, k, n);
								
								if(min>n) min = n;
							}
						}
					}
				}
			}
		}
		
		System.out.println("< 최소 회전수 = " + min + " >");
		
		//1차원 배열로
//		int[] safeLock1 = new int[12];
//		int[] safeLock2 = new int[12];
//		int[] safeLock3 = new int[12];
//		
//		for (int i=0; i<safeLock1.length; i++) 
//			safeLock1[i] = sc.nextInt();
//		
//		for (int i=0; i<safeLock1.length; i++) 
//			safeLock2[i] = sc.nextInt();
//		
//		for (int i=0; i<safeLock1.length; i++) 
//			safeLock3[i] = sc.nextInt();
//		
//
//		int[] result;
//		int min = 999;
//		// 배열에 두개이상일때 반복문?
//		for (int i=0; i<safeLock1.length; i++) {
//			if(safeLock1[i]==1) {
//				
//				for (int j=0; j<safeLock2.length; j++) {
//					if(safeLock2[j]==1) {
//						
//						for (int k=0; k<safeLock3.length; k++) {
//							if(safeLock3[k]==1) {
//								result = ascNumber(i, j, k);
//								int n = calDistance(result[0], result[1], result[2]);
//								
//								System.out.printf("각 번호가 %d, %d, %d 일때 최소회전수: %d%n", i, j, k, n);
//								
//								if(min>n) min = n;
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		System.out.println("< 최소 회전수 = " + min + " >");
//
	}
}
