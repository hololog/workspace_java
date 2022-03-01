import java.util.Scanner;

public class Test_220225_김성기_문제4 {
	public static void main(String[] args) {
		System.out.println("비밀번호 입력>");
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		String pattern = "[0-9a-zA-Z!@#$%]{8,16}";		
		
		if(pwd.matches(pattern)) {
			String[] patterns = {".*[a-z].*", ".*[A-Z].*", ".*[0-9].*", ".*[!@#$%].*"};
			int count = 0;

			for(String regex : patterns) {
				count += (pwd.matches(regex))? 1 : 0;
			}
			
			String result = "";
			switch (count) {
				case 1: result += "사용 불가능한 패스워드"; break;
				case 2: result += "위험"; break;
				case 3: result += "보통"; break;
				case 4: result += "안전"; break;
			}
			System.out.println(result);
		} else {
			System.out.println("영문자, 숫자, 특수문자(!@#$%) 조합 8 ~ 16자 필수!");
		}
	}
}
