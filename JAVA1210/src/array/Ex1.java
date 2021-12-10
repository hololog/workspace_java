package array;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * Array 배열
		 *  - 같은타입 데이터 여러개를 하나의 변수명을 사용하여 연속된 공간으로 다루는 것.
		 *  - 기본 데이터 하입이랑 참조 데이터타입 모두 저장 가능
		 *  - 자동부여된 index로 각 요소로 접근가능(0부터 시작)
		 *  - 배열 선언 생성 초기화의 과정르 거쳐서 사용함
		 *  - 한번 생성된 배열의 크기 변경이 불가능 
		 *  
		 *  문법
		 *   1.타입[] 변수명; //선언 - 스택영역에 참조변수(주소값넣을 공간)공간만 생성
		 *   
		 *   
		 *   2.변수명 = new 타입[배열크기]; //생성
		 *    - 배열의 주소값을 변수명에 저장
		 *    - 각 배열 공간은 자동으로 지정된 데이터타입의 기본값으로 초기화수행됨
		 *    - 인덱스 자동 부여 0부터
		 *   3.배열이름[인덱스] //접근
		 *   4. 타입[] 변수명 = new 타입[배열크기]; //변수선언과 생성을 한번에(데이터 타입의 기본값으로 초기화)\
		 *   5. 타입[] 변수명 = {데이터1, ...., 데이터n}; //기본값 외의 데이터로 초기화가능
		 *   
		 *   배열의 크기는 생성시 결정 , 변경x 
		 *   6.변수명 = new 타입[]{데이터1, ...., 데이터n};
		 *    - 배열선언을 먼저 수행후 별도로 한꺼번에 초기화하는 경우(배열크기는 지정하지 않도록 주의!!!!!)=잘안쓰임
		 */
		
//		String s1;
		String s1 = "김성기"; //참조변수?기본데이터타입이 아닌데 스택에?
		String s2 = new String("김성기");
		String s3 = "김성기";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("--------------------");
		
		System.out.println("s1==s2 :" + (s1==s2));
		System.out.println("s1==s3 :" + (s1==s3));
		
		int[] score; //참조변수선언
		// 스택 공간에 배열 주소를 저장할 참조데이터 타입 변수 생성
		// 이때 int는 각 배열 공간에 저장할 데이터타입을 의미
//		score = 10;
		
		score = new int[5]; //배열 생성
//		int[] score = new int[5]; //선언과 생성 동시에
		
		System.out.println(score); //참조변수의 주소값 출력
		System.out.println(score.length);
		System.out.println("0번 index요소: " + score[0]);
		System.out.println("0번 index요소: " + score[1]);
		System.out.println("0번 index요소: " + score[2]);
		System.out.println("0번 index요소: " + score[3]);
		System.out.println("0번 index요소: " + score[4]);
//		System.out.println("0번 index요소: " + score[5]); //컴파일에러x 런타임에러o
		
		System.out.println("--------------------");

		// 배열 초기화 
		for (int i=0; i<score.length; i++) {
			System.out.println(i + "번 index요소: " + score[i]);
		}
		
		System.out.println("--------------------");

		
		//  초기화도 동시에 수행
		
		int[] arr2 = {10,20,30};
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		System.out.println(arr2[1]);
		System.out.println(arr2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
