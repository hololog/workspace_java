import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N>");
		int N = sc.nextInt();
		//화폐액
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
//		for (int i=0; i<money.length; i++) {
//			//해당금액의 수
//			System.out.println(money[i] + "원 : " + N / money[i] + "개");
//			//남은 금액
//			N %= money[i];
		
//		}
		int[] arr = change(money, N);
		
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(money[i] + "원 : " + arr[i] + "개");
		}
	}
	
	static int[] change(int[] money, int N) {
		int[] count = new int[money.length];
		
		for (int i=0; i<money.length; i++) {
			count[i] = N / money[i];
			N %= money[i];
		}
		return count; 
	}
}
