import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8958 {
	public static void main(String[] args) throws IOException {
		/*  1. 첫줄은 테스트 수 
		 *  2. 각 테스트는 0<N<80의 문자열
		 *  3. 연속된 O의 개수가 자리값 자리값의 합은?
		 * 
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int count = 0;
			int sum = 0;
			
			for(int j=0; j< str.length(); j++) {
				if(str.charAt(j)=='O') {
					sum += (++count);
				} else {
					count = 0;
				}
			}
			sb.append(sum).append("\n");
		} 
		
		System.out.println(sb);

//		String str = "OOXXOXXOOO";
//		int count = 0;
//		int sum = 0;
//		
//		for(int j=0; j< str.length(); j++) {
//			if(str.charAt(j)=='O') {
//				count++;
//				sum += count;
//			} else {
//				count = 0;
//			}
//		}
//		System.out.println(sum);
	}
}
