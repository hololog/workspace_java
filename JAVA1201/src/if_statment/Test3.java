package if_statment;

public class Test3 {
	public static void main(String[] args) {

		/*
		 * 정수형 변수 num 에 대한 양수ㅡ음수 판별 0은 양수로 양수라면 "X : 양수!" 음수라면 "X : 음수!" 출력
		 * 
		 */

		int num = 2;

		String s = (num>=0) ? "양수!": "음수!";
		System.out.println("X : " + s);
		System.out.println("=============================");
		
		/*
		 * 
		 * ch가 대문자면 소문자로 소문잠ㄴ 대문자로 
		 * "ch = X"출력
		 * 
		 * 
		 * */
		char ch = 'ㅁ';
		
		if('A'<= ch && ch<='Z') ch +=32;
		
		else if('a'<= ch && ch<='z') ch -=32;
		
		else System.out.println("알파벳이 아닙니다.");
		
		System.out.println("\"ch = "+ch+"\"");
	
			
		
		
		
		
		
		

	}
}
