package break_continue;

public class Ex1 {
	public static void main(String[] args) {
		
		/*
		 * break & continue
		 *  반복문은 제어하는데 사용
		 *  주로 조건식과 결합하여 사용
		 *  
		 *  1.break문
		 *   현재 반복문을 종료(아래 문장 실행안함)
		 *   
		 *  2.continue
		 *   현재실행중인 반복문의 특정문장 실행을 생략하는데 사용
		 *   반복문 종료x 다음 반복 계속 진행
		 *   for문에서 증감식으로 이동하고 조건식으로  while문은 조건식으로 이동함.
		 *   
		 */
		int i = 1;
		
//		for(;;) {
//			
//		}  //for문의 무한루프
		
		while(true) {
			System.out.println(i);
			
			if(i==5) {
				break;
			}
			
			i++;
		}
		System.out.println("=========================");
		
		for (i=0;  i<10 ; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		i=0;
		
		while(i<=10) {
			i++;
			
			if(i%2==1) {
				continue;
			}
			
//			i++;  //증감식 위치 
			System.out.println(i);
		}
		
		

		
		
		
	}
}
