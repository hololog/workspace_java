import java.util.Scanner;

public class Test3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력=");
		int n = sc.nextInt();
		
		int[] num = new int[n*2];

		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			num[i] = a;
			num[n+i] = a;
		}
		
		for (int i=0; i<n; i++) {
			for (int j=i; j<i+n; j++) {
				System.out.print(num[j]+" ");
			}
			System.out.println();
		}
	}
	
}
