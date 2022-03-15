package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ex2 {
	
	public Ex2 () {
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame("어댑터 클래스");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyWindowAdapter adapter = new MyWindowAdapter();
		
		f.addWindowListener(adapter);
		
		
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex2();
	}
}
class MyWindowAdapter extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}
	
}