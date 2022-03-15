import java.awt.*;
import java.awt.event.*;
import java.nio.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class CustomerGUI {

	// North 영역
	private JTextField sName, sAge, sJumin;
	private JButton btnSelect;
	
	// Center 영역
	private JTable table;
	
	// West 영역
	private JTextField tfIdx, tfName, tfAge, tfEmail, tfJumin;
	private JFrame f;
	
	// South 영역
	private JButton btnInsert, btnDelete;
	
	
	// 생성자
	public CustomerGUI() {
		showFrame();
	}
	
	public void showFrame() {
		f = new JFrame("고객 관리 프로그램");
		f.setBounds(500, 300, 900, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// ------------ North 영역 (조회조건) ----------------
		JPanel pNorth = new JPanel();
		f.add(pNorth, BorderLayout.NORTH);
		pNorth.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		pNorth.setLayout(new GridLayout(0, 4, 0, 0));
		
		// 조회조건 sName 입력 패널
		JPanel panelName = new JPanel();
		pNorth.add(panelName);	// 부모패널(북쪽 큰패널) 부착
		
		panelName.add(new JLabel("이름"));	// 레이블 부착
		sName = new JTextField();
		panelName.add(sName);	// TextField 부착
		sName.setColumns(10);
		
		// 조회조건 sAge 입력 패널
		JPanel panelAge = new JPanel();
		pNorth.add(panelAge);	// 부모패널(북쪽 큰패널) 부착
		
		panelAge.add(new JLabel("나이")); // 레이블 부착
		sAge = new JTextField();
		panelAge.add(sAge);	// TextField 부착
		sAge.setColumns(10);
		
		// 조회조건 sJumin 패널
		JPanel panelJumin = new JPanel();
		pNorth.add(panelJumin);
		
		panelJumin.add(new JLabel("주민"));
		
		sJumin = new JTextField();
		panelJumin.add(sJumin);
		sJumin.setColumns(10);
		
		btnSelect = new JButton("조회");
		pNorth.add(btnSelect);
		// select() 메서드 호출할 수 있도록 이벤트 연결
		btnSelect.addActionListener(e -> select());	
		// ------------------------------------------------
		
		
		// ------------- WEST 영역 (회원 정보 입력 영역) ----------------
		JPanel pWest = new JPanel(new GridLayout(5, 0, 0, 0));
		f.add(pWest, BorderLayout.WEST);
		
		// --- 각 입력 항목에 대한 패널 생성 ---
		// 번호(IDX) 패널
		JPanel pIdx = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pIdx);
		
		pIdx.add(new JLabel("번 호"));
		
		tfIdx = new JTextField(10);
		pIdx.add(tfIdx);
		
		// 이름(NAME) 패널
		JPanel pName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pName);
		
		pName.add(new JLabel("이 름"));
		
		tfName = new JTextField(10);
		pName.add(tfName);
		
		// 나이(AGE) 패널
		JPanel pAge = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pAge);
		
		pAge.add(new JLabel("나 이"));
		
		tfAge = new JTextField(10);
		pAge.add(tfAge);
		
		// 이메일(EMAIL) 패널
		JPanel pEmail = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pEmail);
		
		pEmail.add(new JLabel("E-Mail"));
		
		tfEmail = new JTextField(10);
		pEmail.add(tfEmail);
		
		// 주민번호(JUMIN) 패널
		JPanel pJumin = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pJumin);
		
		pJumin.add(new JLabel("주민번호"));
		
		tfJumin = new JTextField(10);
		pJumin.add(tfJumin);
		// --------------------------------------------------------
		
		// ---------------- CENTER 영역(회원 정보 표시 영역) ------------------
		// 스크롤바 기능 추가를 위해 JScrollPane 객체 생성 후
		// 프레임에 추가한 뒤, JTable 객체는 JScrollPane에 추가
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		// 테이블 옵션 설정
		// 셀 위치 이동 불가 설정
		table.getTableHeader().setReorderingAllowed(false);
		
		// 컬럼 제목을 표시하기 위해 DefaultTableModel 객체 생성
		// 배열을 사용하여 제목을 생성한 뒤 Model 객체에 추가
		String[] columnNames = {"번 호", "이 름", "나 이", "E-Mail", "주민번호"};
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		// DefaultTableModel 객체를 JTable 객체에 전달
		table.setModel(dtm);
		// --------------------------------------------------------------
		
		// ----------------- SOUTH 영역(버튼 영역) --------------------------
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		btnInsert = new JButton("회원추가");
		btnDelete = new JButton("회원삭제");
		
		pSouth.add(btnInsert);
		pSouth.add(btnDelete);
		// --------------------------------------------------------------
		
		f.setVisible(true);
	}
	
	// 추가
	public void insert() {
		
	}
	// 삭제
	public void delete() {
		
	}
	
	// 조회
	public void select() {
		CustomerDAO dao = new CustomerDAO();
		dao.select(null);
	}
	
	public static void main(String[] args) {
		new CustomerGUI();
	}

}




