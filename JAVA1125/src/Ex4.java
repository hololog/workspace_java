
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 변수 (variable)
		 * - 자바에서 사용되는 데이터를 저장하는 메모리공간
		 * - 한 번에 하나의 데이터만 저장 가능
		 * - 선언후 저장가능
		 * - 변수에 데이터를 최초로 저장하는것을 변수 초기화ㅏ 라고 함. 
		 * - 명명은 식별자 작성 규칙을 따른다
		*/

		int a; //변수 선언 (타입명 변수명;)
		a = 1; //초기화 변수값 할당 (대입연산자(=): 우변의 데이터를 좌변에 저장)
		
		System.out.println(a+1);
		
		a = 2; //초기화x 그냥 변수값할당
		
		System.out.println(a+1);

//		int c = 10; //선언과 동시에 할당
//		int d = 20;

//		int c,d; //여러번수를 동시에 선언가능
//		c = 10;
//		d = 20;
		
		int c=10, d=20; // 여러변수를 선언과 동시에 초기화도 가능
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);
		
//		String name;
//		name = "김성기";
		
		String name = "김성기";
		
		System.out.println(name);
	
		
	}

}
