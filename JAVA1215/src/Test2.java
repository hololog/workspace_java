import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//마방진: 가로세로대각선의 합이 같은 nxn의 표
		/*
		 * 홀수 n 
		 * 1. 첫행 한가운데 1을 둔다
		 * 2, 행을 감소 열을 증가하면서 수를 넣는다
		 * 3. c첫행보다 작아지는 경우 마지막행으로 넘어간다
		 * 4. 마지막 열보다 커지는 경우 첫열로 
		 * 5. 넣은 수가 n의 배수이면 행만 증가 열은 변화x 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n마방진>");
		
		int n = sc.nextInt();
		
		int[][] magicSqr = new int[n][n];
		//행 한가운데 1을 둔다
		int row = 0;
		int col = n/2;
		
		
//		//행을 감소하면서 열을 증가하면서 수를 넣는다
		
//		int num = 1;
//		//내고민
//		while(num <= (n * n)) {
//			magicSqr[row][col] = num;
//			
//			if(num % n == 0) {
//				row++;
//			 else {
//				row--;
//				col++;
//			}
//				
//			if(row==0) {
//				row=n-1;
//			}
//			if(col==n-1) {
//				col=0;
//			}
//			
//			num++;
//		}
		//강사님 정답
//		for (int i=0; i<(n*n); i++) {
//			magicSqr[row][col] = num;
//			
//			if(num % n == 0) {
//				row++;
//			} else {
//				row--;
//				col++;
//			}
//			
//			num++;
//			
//			if(row < 0) row = n-1;
//			if(col > n-1) col = 0;
//		}
		
		int[][] arr = makeSqr(n);
		
		for (int[] c : arr) {
			for (int b : c) {
				System.out.print(b + "  ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] makeSqr(int n){
		int[][] arr = new int[n][n];
		
		int row = 0;
		int col = n/2;
		
		for (int i=1; i<=(n*n); i++) {
			arr[row][col] = i;
			
			if(i % n == 0) {
				row++;
			} else {
				row--;
				col++;
			}
			
			
			if(row < 0) row = n-1;
			if(col > n-1) col = 0;
		}
		
		return arr;
	}
}
