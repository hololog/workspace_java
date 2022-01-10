import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.StringTokenizer;

public class Ex1546 {
	public static void main(String[] args) throws IOException {
		/*  1. 첫줄 과목의 개수 N<=1000
		 *  2. 최대값M 고르기
		 *  3. 각과목 /M *100 의 평균 = 모든 과목의 합 *100 / (m*n)
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<N; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		
		for(int a : arr) {
			sum += a;
			if(a > max) max = a;
		}
		
		System.out.println(sum * 100.0 / (max * N));
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st; 
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		st = new StringTokenizer(br.readLine());
//		int sum = 0;
//		int max = 0;
//		
//		while(st.hasMoreTokens()) {
//			int a = Integer.parseInt(st.nextToken());
//			sum += a;
//			
//			if(a > max) max = a;
//		}
//		
//		System.out.println(sum * 100.0 / (max * N));
	}
}
