package array;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열 
		 * 일반적으로 2차원 배열이 쓰임= 행, 열의 구조로 이루어진 배열
		 * 
		 * 배열크기
		 * 
		 */
		int[][] arr;//2차원 행열 선언
		arr = new int[2][3];//행열 생성 , 참조변수 할당
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println("===================");
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//배열의 크기
		System.out.println("배열 arr의 행 크기: " + arr.length);
		System.out.println("배열 arr의 0번째 \"열\" 크기: " + arr[0].length);
		System.out.println("배열 arr의 1번재 \"열\" 크기: " + arr[1].length);
		
		System.out.println("===================");
		
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		//열의 길이가 서로다른 다차원배열 가능
		
//		int[][] arr3 = {
//				{1,2,3,},
//				{4,5},
//				{6,7,8,9,10}
//		};
		
		int[][] arr4 = new int[3][];
		arr4[0] = new int[3];
		arr4[1] = new int[2];
		arr4[2] = new int[5];
		arr4[0] = new int[] {1,2,3};
		arr4[1] = new int[] {4,5};
		arr4[2] = new int[] {6,7,8,9,10};
		
		for (int i=0; i<arr4.length; i++) {
			for (int j=0; j<arr4[i].length; j++) {
				
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
