
public class Test4 {
	public static int minTime(int[] a, int[] b, int n) {
		int sum = 0;

		for (int j = 0; j < b.length; j++) {
			if (n == j) {
				sum += a[j];
				sum += b[j];
			} else if (n > j) {
				sum += a[j];
			} else {
				sum += b[j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * 70, 80, 60, 20, 30, 50, 10, 80, 77, 89
		 * 
		 * 70, 60, 40, 50, 55, 65, 23, 44, 37, 88 소요시간이 같으면 낮은 다리 출력
		 */
		int[] north = { 70, 80, 60, 20, 30, 50, 10, 80, 77, 89 };
		int[] south = { 70, 60, 40, 50, 55, 65, 23, 44, 37, 88 };
		int[] bridge = { 2, 4, 6 };

		
		
		int result = 0;
		int min = 99999999;
		int bridgeNum = 0;

		for (int i = 0; i < bridge.length; i++) {
			result = minTime(north, south, bridge[i]);

			if (min > result) {
				min = result;
				bridgeNum = bridge[i];
			}
		}

		System.out.println("최소시간: " + min);
		System.out.println("다리번호: " + bridgeNum);

//		int min = 100000;
//		int bridge = 0;
//		
//		for (int i=0; i<north.length; i++) {
//			int totalSum = 0;
//			for (int j=0; j<south.length; j++) {
//				if(i==j) {
//					totalSum += north[j];
//					totalSum += south[j];
//				} else if(i>j) {
//					totalSum += north[j];
//				} else {
//					totalSum += south[j];
//				}
//			}
//			if(min>totalSum) {
//				min = totalSum;
//				bridge = i;
//			}
//		}
//		System.out.println("다리번호: "+ bridge );
//		System.out.println("최소시간: "+ min);

	}

}
