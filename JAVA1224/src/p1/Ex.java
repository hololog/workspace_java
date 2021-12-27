package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			if(a==0 && b==0) {
//				sc.close();
//				break;
//			}
//			
//			System.out.println(a+b);
//		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
//			String[] s = str.split(" ");  
//			int a = Integer.parseInt(s[0]);
//			int b = Integer.parseInt(s[1]);
			
			if(a==0 && b==0) {
				br.close();
				break;
			}
			sb.append(a+b+"\n");
		
			
		}
		System.out.println(sb.toString());			
	}
}

