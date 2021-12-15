import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		/*
		 * n개의 숫자 입력
		 * n개의 숫자를 왼쪽으로 하나씩 돌려서 출력
		 * 
		 * 
		 * 
		 */
		
		//n까지의 숫자가 들어갈 배열
		Scanner sc = new Scanner(System.in);
		System.out.print("입력=");
		int n = sc.nextInt();
		//n까지의 숫자가 들어갈 배열
		int[] num = new int[n];

		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		//출력
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num.length; j++) {
				System.out.print(num[j]+" ");
			}
			//로테이션
//			int tmp = num[0];
//			for (int j=0; j<num.length-1; j++) {
//				num[j] = num[j+1]; 
//			}
//			num[num.length-1] = tmp;
			rotation(num);
			
			System.out.println();
		}
		
		//그냥 한칸씩 미루기
//		for (int i=0; i<num.length; i++) {
//			int tmp = num[0];
//			
//			if()
//			num[i] = num[i+1]; 
//		}
	}
	
	public static void rotation(int[] arr) {
		int tmp = arr[0];
		for (int j=0; j<arr.length-1; j++) {
			arr[j] = arr[j+1]; 
		}
		arr[arr.length-1] = tmp;
	}
}
