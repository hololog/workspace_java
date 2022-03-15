package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	public Test3() {
		showFrame();
	
	}
	public void showFrame() {
		JFrame f = new JFrame("연습");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
//		MyActionListener listener = new MyActionListener();
		
//		btn.addActionListener(listener);
		
		
		//익명 클래스로
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("action");
//				
//			}
//		});
		
		//람다식
		btn.addActionListener(e -> System.out.println("action"));
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test3();
	}
	
//	class MyActionListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("action");
//			
//		}
//		
//	}
}
