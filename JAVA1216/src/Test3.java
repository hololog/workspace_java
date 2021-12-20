import java.util.Scanner;

public class Test3 {
	
//	void arr(int[] arr) { 
//		for (int i=0; i<arr.length; i++) 
//			arr[i] = sc.nextInt();
//	}
	
	public static boolean existNum(int[] a, int b) {
		boolean result = false;
		for (int i=0; i<a.length; i++) {
			if(a[i] == b) {
				result = true;
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		/*
		 *  기억력
		 *  N개 숫자 입력
		 *  M번 숫자 입력받아 그숫자가 있으면 1 없으면 0
		 */
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력:");
		
		int N = sc.nextInt();
		int[] arrN = new int[N];
		
		for (int i=0; i<arrN.length; i++) 
			arrN[i] = sc.nextInt();
		
		//질문 입력
		int M = sc.nextInt();
		int[] arrM = new int[M];
	
		for (int i=0; i<arrM.length; i++) 
			arrM[i] = sc.nextInt();
		
		
		//비교 나의 답안
		String str = "";
		Loop:
		for (int i=0; i<arrM.length; i++) {
			for (int j=0; j<arrN.length; j++) {
				
				if(arrM[i] == arrN[j]) {
//					System.out.print(1+ " ");
					str += 1 + " ";
					continue Loop;
				}
			}
//			System.out.print(0+ " ");
			str += 0 + " ";
		}
		System.out.println(str);
		//예시답안
//		for (int i=0; i<arrM.length; i++) {
//			int b = 0;
//			for (int j=0; j<arrM.length; j++)  {
//				if(arrM[j] == arrN[0]) {
//					b = 1;
//					break;
//				}
//			}
//			System.out.println(b + " ");
//		}
		//메서도로 예시답안2
		for (int i=0; i<arrM.length; i++) {
			boolean result = existNum(arrN, arrM[i]);
			if(result) System.out.print("1 ");
			else       System.out.print("0 ");
		}	
		//예시답안3
		for (int i=0; i<arrM.length; i++) {
			System.out.println(existNum(arrN, arrM[i])? "1":"0");	
		}
		//강사님 이중for문 만들기전 규칙찾기
//		int b = 0;
//		for (int i=0; i<arrM.length; i++)  {
//			if(arrM[i] == arrN[0]) {
//				b = 1;
//				break;
//			}
//		}
//		
//		System.out.println(b + " ");
//		b = 0;
//		for (int i=0; i<arrM.length; i++)  {
//			if(arrM[i] == arrN[1]) {
//				b = 1;
//				break;
//			}
//		}
//		System.out.println(b + " ");
//		
//		b = 0;
//		for (int i=0; i<arrM.length; i++)  {
//			if(arrM[i] == arrN[2]) {
//				b = 1;
//				break;
//			}
//		}
//		
//		System.out.println(b + " ");
//		
//		b = 0;
//		for (int i=0; i<arrM.length; i++)  {
//			if(arrM[i] == arrN[3]) {
//				b = 1;
//				break;
//			}
//		}
//		System.out.println(b + " ");
	}
}
