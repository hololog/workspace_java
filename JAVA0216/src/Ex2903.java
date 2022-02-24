import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2903 {
	public static void main(String[] args) throws Exception {
		//첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
		//두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
		//입력 734 893
		//출력 437
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		//역순
		int a = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
		//비교
		System.out.println((a > b)? a:b);
	}
}
