package wrapper;

public class Test4 {
	public static void main(String[] args) {
		
		char[] chArr = {'A', 'a', '5', ' ', '#'};
		
		String result ="";

		for(char c : chArr) {
			if(Character.isUpperCase(c))      result = "대문자";
			else if(Character.isLowerCase(c)) result = "소문자";
			else if(Character.isDigit(c))     result = "숫자";
			else if(Character.isSpaceChar(c)) result = "공백문자";
			else                              result = "기타문자";
			
			System.out.println(result.toString());
		}
		
		
	}
}
