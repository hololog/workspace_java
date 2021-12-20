public class Test4_1 {

	public static int isPass(int[] arr) {
		int n = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				n = i;
				break;
			}
		}
		return n;
	}
	
	public static String indexof(int[] arr) {
		String s = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				s += i;
			}
		}
		return s;
	}
	
	public static int[] threeNumber(int a, int b, int c) {

		int arr[] = new int[3];
		
		arr[0] = (a < b) && (a < c)? a : b < c? b : c;
		arr[2] = (a > b) && (a > c)? a : b > c? b : c;
		arr[1] = a+b+c-arr[0]-arr[2];
		
		return arr;
	}
	
	public static int distance(int a, int b, int c) {
		return ((b-c+12) > (c-a)) && ((a-b+12) > (c-a)) ? (c-a) : (b-c+12) > (a-b+12) ? (a-b+12) : (b-c+12);
	}

	public static void main(String[] args) {

		// 입력 예시)
		// 1 1 0 0 0 0 0 0 0 0 0 0
		// 0 0 1 0 0 0 0 0 0 0 0 0
		// 1 0 0 0 0 0 0 0 0 0 0 0
		// 출력 예시)
		// 2 회전수
		// 1 0 0 0 0 0 0 0 1 0 0 0
		// 0 0 0 0 0 0 1 0 0 0 0 0
		// 0 0 0 0 0 1 0 0 0 0 0 0
		// 3
		// 1 0 0 0 0 0 0 0 0 0 0 0
		// 0 0 0 0 0 0 0 0 0 0 0 1
		// 0 1 0 0 0 0 0 0 0 0 0 0
		// 2
		
		//일단 하나의 값만 가진다고 가정
		int[] arr1 = { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 };
		int[] arr2 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
		int[] arr3 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		//1이 있는 배열의 인덱스값 
		int a = isPass(arr1);
		int b = isPass(arr2);
		int c = isPass(arr3);

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println();
		//인덱스값 오름차순 정렬
		int[] result = threeNumber(a, b, c);
		
//		for (int i : result) {
//			System.out.println(i);
//		}
		
		//세 인덱스간의 거리중 가장 짧은 거리
		System.out.println(distance(result[0], result[1], result[2]));
				
		//배열에 두개이상일때 반복문?
//		for (int i=0; i<arr1.length; i++) {
//			if (arr1[i] == 1) {
//				System.out.println(i);
//			}
//				
//		}
		
		System.out.println(indexof(arr1));
		System.out.println(indexof(arr2));
		System.out.println(indexof(arr3));
			
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
