
public class Ex5 {
	public static void main(String[] args) {
		MyThead mt = new MyThead();
		mt.start();
		
		//runnable 인터페이스 구현
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 300; i++) {
					System.out.println(i);
				}
			}
		}).start();
		
		//람다식 표현
		new Thread(() -> {
				for (int i = 0; i < 300; i++) {
					System.out.println(i);
				}
		}).start();
	}
}
class MyThead extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(i);
		}
	}
	
}