package event_handling;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test5 {
	public Test5() {
		showFrame();
	
	}
	public void showFrame() {
		JFrame f = new JFrame("이벤트 처리 연습-5");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		f.add(btn1);
		f.add(btn2, BorderLayout.SOUTH);
		
		btn1.addActionListener(this.listener);
		
		btn2.addActionListener(e->System.out.println("람다식 로컬action"));
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test4();
	}
	
	ActionListener listener = e-> System.out.println("람다식 멤버action");
}
