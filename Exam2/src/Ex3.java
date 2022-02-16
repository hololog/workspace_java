
public class Ex3 {
	public static void main(String[] args) {
		String id = "admin";
		String jumin = "901010-1234567";
		String company = "아이티윌 부산 교육 센터";
		//1
		if(id.equalsIgnoreCase("ADMIN")) {
			System.out.println("아이디가 일치합니다.");
		} else {
			System.out.println("아이디가 일치하지 안ㅅ흡니다.");
		}
		//2
		char ch = jumin.split("-")[1].charAt(0);
		//switch
		//3
		String result = company.split(" ")[1];
		System.out.println(result);
		
		company.indexOf("부");
		company.lastIndexOf("부");
		company.indexOf("부산");//
		company.substring(company.indexOf("부산"),company.indexOf("부산")+2);
		
	}
}
