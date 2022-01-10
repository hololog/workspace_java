package interface_statement;

public class Ex1 {
	public static void main(String[] args) {
//		Myinterface mi = new Myinterface(); 
			
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		
//		MySubClass.NUM1 = 10;
//		MySubClass.NUM1 = 10;
		Myinterface mi = new MySubClass();//업캐스팅
		//업캐스팅후에는 참조영역이 축소되므로 상속된 메서드만 호출가능하지만 모두 오버라이딩 되기 떄문에 모든 메서드를 호출 가능ㅎㅏㅁ
		
		
	}
}

interface Myinterface {
	int NUM2 = 20;
	int NUM1 = 10;
	void method1();
	void method2();
}

class MySubClass implements Myinterface {
	@Override
	public void method1() {
		System.out.println("추상메서드 구현");
	}

	@Override
	public void method2() {
		
	}
	
}