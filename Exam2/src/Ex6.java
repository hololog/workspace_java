import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
	public static void main(String[] args) {
		//정규표현식
		
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		String pattern = "[a-zA-Z0-9!@#$%]{8,16}";
		
//		System.out.println(Pattern.compile(pattern).matches(pattern, pwd));
		Pattern.compile(pattern).matches(pattern, pwd);
		Pattern.matches(pattern, pwd);//내부적으로 complie하도록 되어 있음
		pwd.matches(pattern);
		boolean result = pwd.matches(pattern);
		
		if(result) {
			//일치갯수확인
//			String pattern1 = "[a-z]";
//			String pattern2 = "[A-Z]";
//			String pattern3 = "[0-9]";
//			String pattern4 = "[!@#$%]";
			//방법1
//			String[] patterns = {"[a-z]", "[A-Z]","[0-9]","[!@#$%]"};
//			int count = 0;
//			for (String regex : patterns) {
////				Pattern.compile(regex).matches(pattern);//전부 일치
//				count += Pattern.compile(regex).matcher(pwd).find()? 1:0;//일부만 일치해도 됨
//			}
			
			//방법2
			String[] patterns = {".*[a-z].*", ".*[A-Z].*",".*[0-9].*",".*[!@#$%].*"};
			int count = 0;
			for (String regex : patterns) {
				count += pwd.matches(regex)? 1:0;
			}
			
			String msg = "";
			switch(count) {
			case 1: msg += "사용불가능한 패스워드"; break;
			case 2:break;
			case 3:break;
			case 4:break;
			}
			
		} else {
			System.out.println("");
		}
	}
}
