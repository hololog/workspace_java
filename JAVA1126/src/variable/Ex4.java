package variable;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <print(), printf(), println()>
		 * 1. print()와 println() 출력후 줄바꿈여부차이
		 * - print()메서드는 아무데이터없으면 출력 불가능
		 * 
		 * 2. printf()
		 * - 출력할 형식(format)을 미리 지정하여 원하는 형태로 데이터 출력
		 * - 출력할 형식은 " 안에 형식을 지정문자를 사용하여 형식을 지정한 뒤 (,)다음에 실제 데이터 지정
		 * 
		 * 
		 * 
		*/
		
		System.out.printf("%d\n",12345); //%d는 정수형
		
		String s1 = "java";
		String s2 = "프로그래밍";
		System.out.printf("%s %s\n", s1, s2); //%s는 문자열 타입 \n줄바꿈
		System.out.println(s1 + " " + s2);
		 
		String name = "차동원";
		int age = 40;
		
		System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 나이는 %d세입니다.\n", name, age);
		
		System.out.println("안녕하세요, 제 이름은 " + name + "입니다.\n"+"제 나이는 "+ age +"세입니다.");
		
		System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 "+ age +"세입니다.");
		
		
		
	}

}
