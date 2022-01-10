package review;

public class Test1 {
	public static void main(String[] args) {
		ITwillbank ib = new ITwillbank("111-11-1111", "홍길동", 10000, true);
		
		ib.withdraw(8000);
		System.out.println("------------------------------");
		ib.withdraw(10000);
	}
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	// 입금기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {	// 출금 불가
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고 : " + balance + "원)");
			return 0;
		} else {	// 출금 가능
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
			return amount;
		}
	}
	
}//Account종료

class ITwillbank extends Account {
	//멤버변수
	boolean isVip;
	//생성자
	public ITwillbank (String accountNo, String ownerName, int balance, boolean isVip) {
		super(accountNo, ownerName, balance);
		this.isVip = isVip;
	}
	//메서드
	@Override
	public int withdraw(int amount) {
		if(isVip) {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
			return amount;
		} else {
			return super.withdraw(amount);
		}
	}
}//ITwillbank종료