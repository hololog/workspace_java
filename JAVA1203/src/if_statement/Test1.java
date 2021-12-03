package if_statement;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 중첩IF사용 영문자 판별
		 */
		char ch = 'z';
		boolean big = ch>='A' && ch<='Z';
		boolean small = ch>='A' && ch<='Z';

		if (big || small) {
			if (big) ch += 32;
			else     ch -= 32;
			System.out.println(ch);
		} else
			System.out.println("입력 오류!");
	}
}
