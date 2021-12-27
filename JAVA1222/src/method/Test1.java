package method;

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int mount) {
		balance += mount;
		System.out.println("입금할 금액 : " + mount + "원");
		System.out.println("입금 후 현재잔고 : " + balance + "원");
	}
	
}

public class Test1 {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.deposit(10000);
		System.out.println("--------------------------");
		System.out.println("계좌전호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance() + "원");
		
		
	}
	
}
