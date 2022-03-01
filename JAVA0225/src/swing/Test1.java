package swing;

import javax.swing.JFrame;

public class Test1 {
	
	public Test1() {
		showFrame();
	}
	public void showFrame() {
		JFrame j = new JFrame("JFrame 생성연습");
		j.setSize(400, 400);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test1();
		
	}
}
