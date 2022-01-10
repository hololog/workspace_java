package jeongseok;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_14 {
	public static void main(String[] args) {
		String[] phoneNumber = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();//  결과값 저장
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")) {//str.length()==0
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				//강제종료
				System.exit(0);
			}
			// 패턴12
			String pattern = ".*"+input+".*";
			Pattern p = Pattern.compile(pattern);
			
			for (int i=0; i<phoneNumber.length; i++) {
				String phoneNum = phoneNumber[i];
				String tmp = phoneNum.replace("-","");
				
				Matcher m = p.matcher(tmp);
				
				if(m.matches()) {
					list.add(phoneNum);
				}
			}
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
			
		}
	}
}
























