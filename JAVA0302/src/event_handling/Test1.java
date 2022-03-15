package event_handling;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
	public Test1() {
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame("이벤트");
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn, BorderLayout.CENTER);
		
		
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
		
//		=====================================
//		
//		JFrame f1 = new JFrame("버튼 연습");
//		f1.setBounds(300, 300, 300, 300);
//		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JButton btn2 = new JButton("버튼2");
//		f1.add(btn2, BorderLayout.CENTER);
//		
//		btn2.addActionListener(listener);
//		
//		
//		f1.setVisible(true);
				
	}
	
	public static void main(String[] args) {
		new Test1();
	}
}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼클릭");
	}
	
}