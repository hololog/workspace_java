package if_statment;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  if else 문
		 *  if블록과 else블록은 동시에 실행 불가
		 * 
		 * 
		 * */
		
		int num = 3;
		
		// 정수형 변수 num >=100 면 "너무크다"출력
		// 아니면 "적당함"출력
		
		if(num>=10)	System.out.println("너무 크다.");
		 
		if(num<=3) System.out.println("너무 작다");
		
		else System.out.println("적당함");
		
		num = 100;
		String result = num >= 10 ? "너무 크다" : "적당함";
		System.out.println(result);
		
	}

}
