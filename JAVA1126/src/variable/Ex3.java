package variable;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String 타입
		 * - 문자열을 표현하기위한 데이터 타입
		 * - 참조형 (Reference type)
		 * - 1개 이상이 문자열은 큰 따음표로 표현
		 * - null string 가능("")<->공백이랑 다름(" ") 
		 * - 덧셈 연산자로 문자열 결합 가능
		 * - 
		 * 
		*/
		String s1 =  "String 타입은 char 타입과 다르다.";
		System.out.println(s1);
		
		String s2 = "";   //null
		System.out.println(s2);
		
		String s3 = "안녕하세요. \n제 이름은 \t '차동원'입니다.";
		System.out.println(s3);
		
		String s4 = "a"+"b";//덧셈연산자 사용해서 문자열 결합
		System.out.println(s4);
		
		//어떤 데이터와 문자열을 결합시 자동 형변환하여 문자열로 표현
		System.out.println(1+"문자열"); //정수가 문자열로 자동형변환 
		System.out.println(1+'2'+"a"); //연산자 순서대로 연산
		System.out.println('2'+"a"); //연산자 순서대로 연산
		System.out.println(1+2+"a"); //연산자 순서대로 연산
		System.out.println("a"+1+2); //연산자 순서대로 연산
		
		
	}

}
