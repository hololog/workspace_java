import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		//범위 -1000~1000
		boolean[] arr = new boolean[2001];
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())+1000]=true;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i])
				sb.append(i-1000).append('\n');
		}
		System.out.println(sb);
		
		
		
	}
}

