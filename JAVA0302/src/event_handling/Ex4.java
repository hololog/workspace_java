package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4 {
	public Ex4() {
		showFrame();
	
	}
	public void showFrame() {
		JFrame f = new JFrame("연습");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 *  <이벤트 처리 4단계>
		 *  익명 내부 클래스 형태로 정의
		 *  - 리스너 인터페이스 또는 어댑터클래스를 구현하는 핸들러를 별도로 정의하지 않고 해당 리스너 
		 *    또는 어댑터의 이름을 그대로 사용하여 변수 선언 및 인스턴스 생성과 추상 메서드 구현까지 
		 *    한꺼번에 수행하는 방법
		 * 
		 */
		WindowAdapter listener = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("로컬windwoClosing");
				System.exit(0);
			}
			
		};
		f.addWindowListener(this.listener);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4();
	}
	
	WindowAdapter listener = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("멤버windwoClosing");
			System.exit(0);
		}
		
	};
	
}
