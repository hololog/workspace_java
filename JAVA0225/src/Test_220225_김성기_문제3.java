
public class Test_220225_김성기_문제3 {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 300; i++) {
					System.out.println(i + " : 작업");
				}
			}
		})
		.start();
	}
}
