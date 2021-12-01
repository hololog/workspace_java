package if_statment;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if문
		 * 정수형 변수 num에 대한 절대값을 계산하여 출력
		 * => ex)num이 5일때 -> "변수 num = 5"
		 *    ex)num이 -15일때 -> "변수 num = 15"
		 * => 
		 * */
		
		int num = 15;
		
//		if(num>=0) {                     // 필요없었음 if문 하나로 가능
//			System.out.println("\"변수 num = " + num + "\"");
////			
//		}
		if(num<0) {
			num = -num;
//			num = (-1)*num;
//			num = Math.abs(num);
		}
		System.out.println("\"변수 num = " + num + "\"");
		System.out.printf("\"변수 num = %d\n\"", num);
		
		System.out.println("===================================");
		
		char ch = 'A';

		if('A'<=ch && ch<='Z') {
//			ch = (char)(ch + 32); +연산자로 자동형변환했기때문에 다시 형변환필요
			ch += 32; //복합대입연산자는 자동형변환이 일어나지 않는다
			
		}
		
		System.out.println("ch = "+ ch);
		 
	}

}
