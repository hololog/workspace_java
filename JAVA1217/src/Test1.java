/*
 * Account클래스 정의
 * 멤버변수
 *  계좌번호 accountNo, 문자열
 * 
 */
class Account {
	String accountNo;
	String ownerName;
	int balance;
}

public class Test1 {
	public static void main(String[] args) {
		/*
		 *  Account클래스의 인스턴스 생성
		 *  초기화출력예시
		 * 
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원
		 * 
		 */
		Account a1 = new Account();
		
		a1.accountNo = "111-1111-111";
		a1.ownerName = "홍길동";
		a1.balance = 100000;
		
		System.out.println("계좌번호 : " + a1.accountNo);
		System.out.println("예금주명 : " + a1.ownerName);
		System.out.println("현재잔고 : " + a1.balance + "원");
		
	}
}
