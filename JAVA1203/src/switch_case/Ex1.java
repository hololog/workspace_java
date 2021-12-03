package switch_case;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch문 조건식이 저수 문자열 Enum 상수만 올수있다. 범위지정이 불간으하고 값만 사용가능
		 * 
		 */

		int num = 3;

		switch (num) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("나머지");
				break;
		}
		
		
		String init = "c";
		switch (init) {
			case "U":
				System.out.println("USA");
				break;
			case "K":
				System.out.println("KOREA");
				break;
			case "C":
				System.out.println("CANADA");
				break;
	
		}

	}

}
