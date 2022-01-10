package jeongseok;

import java.util.Arrays;

public class Ex9_10 {
	public static String format(String str, int length, int alignment) {
		//1. 길이가 더 작으면 (매개변수 유효성)
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);

		//2. 1이 아니면 길이의 배열생성
		char[] source = str.toCharArray();
		char[] arr = new char[length];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = ' ';
		}
		
		//정렬 기준에 따라 배열 복사하기
//		if(alignment == 0) {
//			System.arraycopy(source, 0, arr, 0, str.length());
//		}
		switch (alignment) {
			case 0  :
			default : System.arraycopy(source, 0, arr, 0, source.length);
				break;
			case 1  : System.arraycopy(source, 0, arr, diff/2, source.length);
				break;
			case 2  : System.arraycopy(source, 0, arr, diff, source.length);
				break;
		} 
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String str = "가나다";

		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
		System.out.println(format(str,-7,2));
	}
}
