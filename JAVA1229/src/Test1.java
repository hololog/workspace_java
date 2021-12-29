
public class Test1 {
	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		
		ib.showAccountInfo();
		
		ib.accountNo = "2554-+548-548";
		ib.insureName = "이순신";
		ib.balance = 685_548_548;
		ib.showAccountInfo();
		
		ib.contract("아이티윌");
		System.out.println(ib.withdraw(5000));
	}
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this("111-1111-111", "홍길동", 500_000);
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance   = balance;
	}
	
	void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌명의 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	void deposit(int amount) {
		if(amount <= 0) {
			System.out.println("입금금액을 잘못입력했습니다.");
			return;
		}
			
		balance += amount;
	}
	
	int withdraw (int amount) {
		if(balance < amount) {
			System.out.println("잔고가 부족합니다.");
			return 0;
		}
		return amount;
	}
}

class ItwillBank extends Account {
	String insureName;
	
	public ItwillBank() {
//		super("222-2222-222", "이순신", 100_000);
//		this.insureName = "IB";
		this("IB");
	}
	
	public ItwillBank(String insureName) {
		this.insureName = insureName;
	}
	
	void contract(String insureName) {
		this.insureName = insureName;
//		this.showAccountInfo();
		System.out.println("계약하신 보험명 : " + this.insureName + "보험");
	}
}