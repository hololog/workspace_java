package jeongseok;

public class Ex9_12 {
	 public static void main(String[] args) {
		 for (int i=0; i<20; i++) {
			System.out.print(getRand(1,-3)+",");
		}
	}

	static int getRand(int from, int to) {
//		if(from > to) {
//			int temp = from;
//			from = to;
//			to = temp;
//		}
		int a = Math.abs(from-to);
		
		return (int)(Math.random()*(a+1))+Math.min(from, to);
	}
}
