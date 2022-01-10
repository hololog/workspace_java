import java.io.IOException;

public class Ex10818 {
	public static void main(String[] args) throws IOException {
		StringBuilder result = new StringBuilder();
		
		int N = readInt();
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for (int i=0; i<N; i++) {
			int a = readInt();
			
			if(a>max)
		}
		
	}
	
	static int readInt() throws IOException {
		boolean isNegative = false;
		int sum = 0;
		
		while(true) {
			int input = System.in.read();
			if (input == '\n' || input == ' ') {
				return isNegative? -1*sum : sum;
			} else if(input == '-') {
				isNegative = true;
			} else {
				sum = (sum*10) + (input - '0');
			}
		}
	}
}
