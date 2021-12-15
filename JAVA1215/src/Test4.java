import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 *  문자열 공백없이 입력
		 *  시작위치인덱스 와 글자개수 입력
		 *  
		 *  출력
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String s = sc.nextLine();
		int start = sc.nextInt();
		int count = sc.nextInt();
		
//		System.out.println(s.substring(start, count));
		
		System.out.println(mySubstr(s, start, count));
		
	}
	
	public static String mySubstr(String s, int start, int count) {
		if(s.length() < (start + count)) {
			return null;
		}
		
		String str = "";
		
		for (int i=0; i<count; i++) {
			str += s.charAt(start);
			start++;
		}
		
		return str;
	}
}

