package swing;

import javax.swing.JFrame;

public class Ex1 extends JFrame {
	public Ex1() {
		showFrame();
	}
	
	//화면을 표시하는 기능을 수행할 show
	public void showFrame() {
		setSize(300, 200);
		setLocation(100, 150);
		setTitle("JFrame을 상속받아 생성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JFrame f = new JFrame("JFrame으로 생성한 프레임");
		f.setSize(600, 400);
		f.setLocation(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex1();
	}
}
