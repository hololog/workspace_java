package event_handling;

import javax.swing.JFrame;

public class Test2 {
	public Test2 () {
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습");
		f.setBounds(600, 400, 400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
}
