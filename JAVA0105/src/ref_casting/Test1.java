package ref_casting;

public class Test1 {
	public static void main(String[] args) {
		//
		스마트폰 갤럭시노트 = new 스마트폰();
		갤럭시노트.전화();
		갤럭시노트.문자();
		갤럭시노트.카톡();
		
		핸드폰 어머니폰 = new 핸드폰();
		어머니폰.전화();
		어머니폰.문자();
		System.out.println("----------------------------------");
		//업캐스팅
		어머니폰 = 갤럭시노트;
		
		System.out.println("----------------------------------");
		핸드폰 어머니폰2 = new 스마트폰();
		
		스마트폰 갤럭시노트2 = (스마트폰)어머니폰;
		
//		전화기 집전화 = new 전화기();
//		집전화.전화();
		
	}
}

class 전화기 {
	public void 전화( ) {
		System.out.println("전화 걸기!");
	}
}
class 핸드폰 extends 전화기 {
	public void 문자( ) {
		System.out.println("문자 전송!");
	}
}
class 스마트폰 extends 핸드폰 {
	public void 카톡( ) {
		System.out.println("카톡 보내기!");
	}
}

