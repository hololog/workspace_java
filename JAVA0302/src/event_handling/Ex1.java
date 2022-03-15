package event_handling;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/*
	 * 	이벤트(Event)
	 *  - 컴포넌트에서 사용자게 의해 어떤 상호작용이 일어나는 것
	 *  - 이벤트가 발생했을 때 어떤 동작을 수행하기 위해서는 대상 컴포넌트와 
	 *    이벤트를 처리하는 이벤트 리스너를 서로 연결해야함
	 *    => 각 컴포넌트에 따라 서로 다른 리스너가 제공됨
	 *    => 컴포넌트 객체의 addxxx()메서드를 호출하여 리스너 객체를 파라미터로 전달하여 연결
	 *       이때, xxx은 담당 리스너 인터페이스이름
	 * 
	 *  이벤트 처리
	 *   - 컴포넌트에 특정 이벤트가 발생했을때 수행할 동작을 지정하여 처리하는 것
	 *   - 리느서 인터페이스 구현을 통해 내부에 수행할 동작을 명시
	 *   	=> xxxListner인터페이스 또는 xxxAdapter클래스가 제공됨
	 *   - 리스너 객체를 직접 구현하거너ㅏ, 별도의 핸들러 클래스를 정의하영 리스너 인터페이스를 상속받아 구현
	 *   - 리스터 인터페이스 등은 주로 java.awt,event패키지 내에 위치함
	 *   
	 *   < 이벤트 처리 5단계 >
	 *   1. 리스너 인터페이스를 구현하는 구현체 클래스를 정의\
	 *    => 이벤트 발생시 수해할 동작을 구현체 내부의 메서드에 기술하고 
	 *        리스너 연결시 구현체 객체 생성하여 addxxxListner()메서드 파리미터로 전달
	 *        
	 * 
	 */
public class Ex1 {
	public Ex1() {
		showFrame();
	}
	public void showFrame() {
		JFrame f = new JFrame("이벤트 처리-1");
		f.setBounds(600, 400, 300, 200);
		//이벤트 처리 1단계 리스너를 구현한 핸들러 클래스 정의하여 사용
		// 연재 프레임 에 windowlistner 구현체 연결
		//1. 핸들러 객체 생성
		MyWindowListener listener = new MyWindowListener();
		//2. 이벤트 연결을 위한 대상 객체의 addxxxlistener()메서드를 호출하여 
		// 	 파라미터로 핸들러 객체를 전달 => 
		f.addWindowListener(listener);
		
		f.setVisible(true);
		
		JFrame f2 = new JFrame("이벤트 처리-2");
		f2.setBounds(600, 400, 300, 200);
		
		f2.addWindowListener(listener);
		
		f2.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1();
	}
}
class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		//프로그램 실행시 1회 호출되는 메서드
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//프로그램 종료시 1회 호출되는 메서드
		System.out.println("windowClosing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//프레임 최소화 버튼 클릭시 호출되는 메서드
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		//프레임 최소화 해제시 호출되는 메서드
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");

		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");

		
	}
	
}