package method;

public class Test1 {
	public static void main(String[] args) {
		//1
		hello();
		System.out.println("=======================");
		//2
//		String str = "안녕하세요";
//		int n = 7;
//		hello2(str, n);
		hello2("안녕하세요", 7);
		System.out.println("=======================");
		//3
		System.out.println("1~10까지의 합: " + sum());
		System.out.println("=======================");
		//4
		int n = 100;
		System.out.printf("1~%d까지의 합: %d%n",n, sum2(n));
		System.out.println("=======================");
		//5
		int[] array = getArray();
		
//		for (int i=0; i<gerArray().length; i++) {
//			System.out.println(array[i]);
//			
//		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=======================");
		//6
		int start = 1;
		int end = 100;
		int[] arr = getArray2(start, end);
		
		for (int i : arr) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static int[] getArray2(int start, int end) {
		int[] array = new int[end-start+1];
		
		for (int i=0; i<array.length; i++) 
			array[i] = start;
			start++;
		
		return array;
	}
	
	public static int[] getArray() {
		int[] array = new int[5];
		
		for (int i=0; i<array.length; i++) 
			array[i] = i+1;
		
		return array; 
	}

	public static int sum2(int num) {
		int sum = 0;
		
		for (int i=1; i<=num; i++) 
			sum += i;	
		
		return sum;
	}

	public static int sum() {
		int sum = 0;
		
		for (int i=1; i<=10; i++) 
			sum += i;
		
		return sum;
	}
	
	public static void hello2(String str, int num) {
		for (int i=0; i<num; i++) {
			System.out.println( (i+1) + " \"" + str + "\"");
		}
	}

	public static void hello() {
		for (int i=0; i<10; i++) {
			System.out.println((i+1) + " \"Hello, World!\"");
		}
	}
	

	
}
