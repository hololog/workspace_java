package variable;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1 = 'A';
		System.out.println(ch1);
		
//		char ch2 = '65';
		char ch2 = 65; //아스키코드
		System.out.println(ch2);
		
		char ch3 = '\u0041'; //유니코드
		System.out.println(ch3);
		
		char ch4 = '\uAC00';
		System.out.println(ch4);
		
		char 이름 = '\uAC00';//변수명 한글 가능
		System.out.println(이름);
		
		char ch5 = '\'';//escape
		System.out.println(ch5);
		
	}

}
