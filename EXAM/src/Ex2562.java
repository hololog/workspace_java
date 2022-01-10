import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2562 {
	public static void main(String[] args) throws IOException{
		/* 9개 자연수<100
		 * 최대값 . 몇번째 출력
		 *  한줄에 하나씩
		 * 
		 */
		//1배열 없이  scanner
//		Scanner sc = new Scanner(System.in);
//		
//		int max = Integer.MIN_VALUE;
//		int countNum = 0;
//
//		for (int i=1; sc.hasNextInt(); i++) {
//			int n = sc.nextInt();
//			if(n > max) {
//				max = n;
//				countNum = i;
//			}
//		}
//		sc.close();
//		
//		System.out.println(max);
//		System.out.println(countNum);
		
		//2배열이용 버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] n = new int[9];
		
		for (int i=0; i<9; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		int max = 0;
		int maxCount = 0;
		
		for(int value : n) {
			count++;
			
			if(value > max) {
				max = value;
				maxCount = count;
			}
		}
		
		System.out.println(max);
		System.out.println(maxCount);
		
	}
}
