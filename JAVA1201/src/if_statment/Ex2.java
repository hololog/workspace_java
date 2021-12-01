package if_statment;

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 조건문 조건에 따라{}를 실행여부 결정
		 * 
		 * IF문
		 *  조건식 판별 결과가 트루이면 블ㄹ고{}을 실행하고 false면 생략
		 *  
		 *  <기본문법>
		 *  문장1;
		 *  if(조건식){
		 *     문장2;
		 *  }
		 *  문장3;
		 *  
		 *  참일때 문장1->문장2->문장3 순서로 실행
		 *  거짓일때 문장1에서 바로 문장3으로 넘어감
		 * 
		 * */
		
		int num = 3; // num이 5보다 크면 
		
		if(num >5) {
			System.out.println("num이 5보다 크다!");
		} else {
			System.out.println("num이 5보다 크지않다.");
		}
		
		System.out.println("num = "+ num);
	}
}
