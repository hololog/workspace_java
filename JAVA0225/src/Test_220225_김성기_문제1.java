
public class Test_220225_김성기_문제1 {
	public static void main(String[] args) {
		String id = "admin";
		String jumin = "901010-1234567";
		String company = "아이티윌 부산 교육센터";
		
		//1----------------------------------------
		if(id.equalsIgnoreCase("ADMIN")) {
			System.out.println("아이디가 일치합니다");
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		//2-----------------------------------------
		String result = "";
		
		switch (jumin.split("-")[1].charAt(0)) {
			case '1':
			case '3': result = "남성입니다."; break;
			case '2':
			case '4': result = "여성입니다."; break;
			case '5':
			case '6': result = "외국인입니다."; break;
			default : result = "알수없는 값입니다"; break;
		}
		System.out.println(result);
		
		//3------------------------------------------------
		int n = company.indexOf("부산");
		System.out.println(company.substring(n, n+2));
		
		
	}
}
