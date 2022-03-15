package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ex5 {
	public Ex5() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
			
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex5();
	}

	WindowAdapter listener = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}
		
	};


}
