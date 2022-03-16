import java.awt.*;
import java.awt.event.*;
import java.nio.*;
import java.util.*;

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
		// EnterKey 이벤트 -> 조회(select)
		sName.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)	select();
			}
			
		});
		
		// 조회조건 sAge 입력 패널
		JPanel panelAge = new JPanel();
		pNorth.add(panelAge);	// 부모패널(북쪽 큰패널) 부착
		
		panelAge.add(new JLabel("나이")); // 레이블 부착
		sAge = new JTextField();
		panelAge.add(sAge);	// TextField 부착
		sAge.setColumns(10);
		// EnterKey 이벤트 -> 조회(select)
		sAge.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)	select();
			}
			
		});
		
		
		// 조회조건 sJumin 패널
		JPanel panelJumin = new JPanel();
		pNorth.add(panelJumin);
		
		panelJumin.add(new JLabel("주민"));
		
		sJumin = new JTextField();
		panelJumin.add(sJumin);
		sJumin.setColumns(10);
		// EnterKey 이벤트 -> 조회(select)
		sJumin.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)	select();
			}
			
		});
		
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
		tfIdx.setEditable(false); // 번호 입력 불가능하도록 잠금
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
		
		// 테이블의 셀 클릭 시 클릭된 셀이 위치한 행(레코드) 데이터를
		// 좌측 회원 정보 입력창에 표시
		// => 테이블을 마우스로 클릭했을 때 이벤트를 MouseListener 로 처리
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 테이블 객체의 클릭된 행, 열 번호 가져와서 테이블로부터 검색 후 표시
				// => 행번호 : getSelectedRow(), 열번호: getSelectedColumn()
//				System.out.println(table.getSelectedRow() + ", " + table.getSelectedColumn());
				
				// 테이블 데이터 가져오기 : getValueAt(행번호, 열번호)
//				System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
				
				// 클릭된 행의 행번호는 고정하고, 열번호를 0 ~ 4 까지 변화하면서 각 열 데이터 가져오기
				// 가져온 각각의 열 데이터를 JTextField에 표시
				int row = table.getSelectedRow();
				tfIdx.setText(table.getValueAt(row, 0).toString());		// 번호 가져와서 idx에 바인딩
				tfName.setText(table.getValueAt(row, 1).toString());	// 이름 가져와서 name에 바인딩
				tfAge.setText(table.getValueAt(row, 2).toString());		// 나이 가져와서 age에 바인딩
				tfEmail.setText(table.getValueAt(row, 3).toString());	// 이메일 가져와서 email에 바인딩
				tfJumin.setText(table.getValueAt(row, 4).toString());	// 주민번호 가져와서 jumin에 바인딩
			}
			
		});
		
		// --------------------------------------------------------------
		
		// ----------------- SOUTH 영역(버튼 영역) --------------------------
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		btnInsert = new JButton("회원추가");
		btnDelete = new JButton("회원삭제");
		
		pSouth.add(btnInsert);
		pSouth.add(btnDelete);
		
		// 회원 추가 버튼 클릭 시 insert() 메서드 호출
		btnInsert.addActionListener(e -> insert());
		// 회원 삭제 버튼 클릭 시 delete() 메서드 호출
		btnDelete.addActionListener(e -> delete());
		
		// --------------------------------------------------------------
		
		f.setVisible(true);
	}
	
	// 추가
	public void insert() {
		String name = tfName.getText();
		int age = Integer.parseInt(tfAge.getText());
		String email = tfEmail.getText();
		String jumin = tfJumin.getText();
		
		// CustomerDTO 객체에 입력 데이터 저장
		CustomerDTO dto = new CustomerDTO("", name, age, email, jumin);
		
		// CustomerDAO 객체 생성 후 insert() 메서드에 DTO 객체를 전달하여 회원 추가 작업 요청
		CustomerDAO dao = new CustomerDAO();
		boolean isInsertSuccess = dao.insert(dto);
		
		if(isInsertSuccess) { // 작업 성공시
			JOptionPane.showMessageDialog(
					f, "회원 추가 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			select();
		} else { // 작업 실패시
			JOptionPane.showMessageDialog(
					f, "회원 추가 실패", "실패", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	// 삭제
	public void delete() {
		// InputDialog를 사용하여 삭제할 회원번호(idx)를 입력받아
		// CustomerDAO의 delete() 메서드에 전달하여 회원 삭제 작업 요청
		// => 삭제 결과를 boolean 타입으로 리턴받아
		//    삭제 성공/실패를 MessageDialog로 출력
		// => 삭제 성공일 경우 회원목록 갱신(select())
		String idx = JOptionPane.showInputDialog(f, "삭제할 회원 번호를 입력하세요.");
		
		// 취소, x => null
		if(idx == null) return; 
		
		// 입력 번호가 없을 경우(널스트링 또는 길이 0) 오류 메세지 출력 
		if(idx.length() == 0) {
			JOptionPane.showMessageDialog(
					f, "번호 입력 필수!", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		// IDX값이 1부터 증가되므로 0데이터도 오류 메세지 출력
		if(idx.equals("0")) {
			JOptionPane.showMessageDialog(
					f, "번호는 1이상 입력!", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		// 입력 데이터가 있을 경우 CustomerDAO 객체의 delete() 메서드에 번호 전달
		CustomerDAO dao = new CustomerDAO();
		boolean isDeleteSuccess = dao.delete(Integer.parseInt(idx));
		
		if(isDeleteSuccess) {	// 삭제 성공시
			JOptionPane.showMessageDialog(
					f, "회원 삭제 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			// 회원 목록 갱신 => select() 메서드 호출
			select();
		} else {	// 삭제 실패 시
			JOptionPane.showMessageDialog(
					f, "회원 삭제 실패", "실패", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	// 조회
	public void select() {
		CustomerDAO dao = new CustomerDAO();
		
		Map<String, String> param = new HashMap();
		param.put("NAME", sName.getText());
		param.put("AGE", sAge.getText());
		param.put("JUMIN", sJumin.getText());
		
		Vector<Vector> data = dao.select(param);
		
		// table객체에 DefaultTableModel 객체를 가져오기
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		// Model 객체의 행번호를 0으로 초기화(표시된 회원 목록 초기화)
		dtm.setRowCount(0);
		
		// Vector 객체(data)만큼 반복을 통해 저장된 Vector 객체(rowData)를 가져온 후
		// DefaultTableModel 객체의 addRow() 메서드로 데이터 추가
//		for(int i = 0; i < data.size(); i++) {
//			Vector rowData = data.get(i); // 177Line에 제네릭 미사용시 형변환 필수
//			// Vector rowData = (Vector)data.get(i);
//			dtm.addRow(rowData);
//		}
		
		// 향상된 for문 사용시
		for(Vector rowData : data) {	// 177Line에 제네릭 미사용시 Object로 받아야함
			// Object로 받은 후 다운캐스팅 필수!
			dtm.addRow(rowData);
		}
		
	}
	
	public static void main(String[] args) {
		new CustomerGUI();
	}

}




