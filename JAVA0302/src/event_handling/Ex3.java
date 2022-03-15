package event_handling;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 {
	public Ex3 () {
		showFrame();
		showFrame2();
	}
	public void showFrame() {
		JFrame f = new JFrame("Ex3");
		f.setBounds(600, 400, 400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn, BorderLayout.NORTH);
		
		//내부클래스(로컬변수위치)
		class MyLocalWindowAdapter extends WindowAdapter{

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
			
		}
		
		MyLocalWindowAdapter listener = new MyLocalWindowAdapter();
		f.addWindowListener(listener);
		
		
		f.setVisible(true);
	}
	public void showFrame2() {
		JFrame f = new JFrame("Ex3");
		f.setBounds(0, 0, 400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn, BorderLayout.NORTH);
		
		MyMemeberWindowAdapter listener = new MyMemeberWindowAdapter();
		f.addWindowListener(listener);
		f.setVisible(true);
	}
	
	class MyMemeberWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex3();
	}
}





































