import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4344 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int stuNum = Integer.parseInt(st.nextToken());
			int[] score = new int[stuNum];
			int sum = 0; 
			double overAvg = 0;
			
			for (int j=0; j<score.length ; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			
			for (int j : score) {
				if(j > (sum/stuNum)) overAvg++;
			}
			
			System.out.printf("%5.3f%%%n", (int)(overAvg/stuNum*100000+0.5)/1000.0);
			
		}
		
	}
	
}
