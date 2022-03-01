package swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Ex2 {
	public Ex2() {
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame();
		//1
		Dimension d = new Dimension(600, 400);
//		f.setSize(d);
//		
		Point p = new Point(800, 300);
//		f.setLocation(p);
		
		//========================================
		//2
//		f.setBounds(800, 300, 600, 400);
		//3
		Rectangle r = new Rectangle(p, d);
		f.setBounds(r);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex2();
	}
}
