package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4 {
	public Ex4() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		f.setVisible(true);
		
		JFrame f2 = new JFrame("버튼 프레임");
		f2.setBounds(200, 200, 500, 500);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn2 = new JButton("버튼2");
		f2.add(btn2);
		f2.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4();
	}
}
