import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1 {
	public Ex1() {
		showFrame();
	}
	
	public void showFrame() {
		/*
		 *  레이아웃
		 * 	- 화면을 구성하는 형태
		 *  - 다양한 레이아웃을 사용하여 요소들의 배치 형태를 결정 가능
		 *  - 각 레이아웃을 지원하는 객체 사용하여 레이아웃 적용 가능
		 *  - BorderLayout, FlowLayout, GridLayout, CardLayout 등
		 *  
		 *  BorderLayout
		 *  - 대상 컨테이너의 동서남북중앙 5개의 영역으로 분할하여 컴포넌트를 배치
		 *  - JFrame객체의 기본 레이아웃
		 *  	별도의 설정이 없을 경우 기본적으로 적용
		 *  - 배치할 영역을 지정하는 경우 add메서드의 두번째 ㅏ라미터로 BorderLayout.xxx상수를 사용하여 위치지정 가능
		 *      또는 "North", 등의 문자열도 사용 가능하나 오타로 읺나 오류 가능성 있음
		 *      만약 영역지엉을 생략할 경우 기본 영역이 center로 지정
		 *  - 한 
		 *  
		 */
		JFrame f =  new JFrame("레이아웃 기초");
		f.setBounds(200, 200, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("Center");
		
//		f.add(btnCenter, "Center");
		f.add(btnCenter, BorderLayout.CENTER);//상수사용을 권장
		
//		JButton btnCenter2 = new JButton("Center2");
//		
//		f.add(btnCenter2, BorderLayout.CENTER);

		JButton btnNorth = new JButton("North");
		f.add(btnNorth, BorderLayout.NORTH);
		JButton btnEast = new JButton("East");
		f.add(btnEast, BorderLayout.EAST);
		JButton btnWest = new JButton("West");
		f.add(btnWest, BorderLayout.WEST);
		JButton btnSouth = new JButton("South");
		f.add(btnSouth, BorderLayout.SOUTH);
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1();
	}
}
