package static_var;


public class Ex4 {
	/*
	 *  0. 클래스가 메모리에 로딩
	 *  1. static 키워드가 선언ㅁ된 모든 멤버 가 메모리에 로딩
	 * 
	 * 
	 * 
	 */
	int b = check(2);
	
	static int a = check(1);
	
	
	public static int check(int i) {
		System.out.println("call :"+i);
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() :");
		Ex4 ex = new Ex4();
		check(4);
	}
	
	static int c = check(3);
}
