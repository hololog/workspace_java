package switch_case;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 3; // 회원등급
		int pee = 50000; // 할인율
		String result = "결재금액 : ";// 결재금액

		// 출력값 결재금액
		// 회원등급이 아닐경우 "회원 등급 오류!" 출력

//		if (grade == 1) {
//			result = pee / 100 * 95;
//			System.out.println("결재 금액 : "+result+"원");
//		} else if (grade == 2) {
//			result = pee / 100 * 85;
//			System.out.println("결재 금액 : "+result+"원");
//		} else if (grade == 3) {
//			result = pee / 100 * 70;
//			System.out.println("결재 금액 : "+result+"원");
//		} else {
//			System.out.println("회원 등급 오류!");
//		}

//		if (grade >= 1 && grade <= 3) {
//			if (grade == 1) 
//				result = pee / 100 * 95;
//			else if (grade == 2)
//				result = pee / 100 * 85;
//			else 
//				result = pee / 100 * 70;
//			System.out.println("결재 금액 : "+result+"원");
//		} else {
//			System.out.println("회원 등급 오류!");
//
//		}
		
		switch(grade) {
			case 1:
				result += (pee / 100 * 95)+"원";
				break;
			case 2:
				result += (pee / 100 * 85)+"원";
				break;
			case 3:
				result += (pee / 100 * 70)+"원";
				break;
			default	:
				result = "오류";
		}
		System.out.println(result);
	
	}

}
