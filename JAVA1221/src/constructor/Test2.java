package constructor;

class Account2 {
	public String accountNo;
	public String ownerName;
	public int balance;
	
	public Account2() {
		this("111-1111-111", "홍길동", 0);
	}
	
	public Account2(String accountNo) {
		this(accountNo, "홍길동", 0);
	}
	
	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
	}
	
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
		System.out.println("--------------------------");
	}
	
	
}

public class Test2 {
	public static void main(String[] args) {
		
		Account2 acc1 = new Account2();
		Account2 acc2 = new Account2("222-2222-222");
		Account2 acc3 = new Account2("333-3333-333", "이순신");
		Account2 acc4 = new Account2("444-4444-444", "김구", 5000);
		
		acc1.showAccountInfo();
		acc2.showAccountInfo();
		acc3.showAccountInfo();
		acc4.showAccountInfo();
	}	
}
