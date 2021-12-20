
class Account2 {
	String accountNo;
	String ownerName;
	int balance;

	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public void deposit(int amount) {
		if(amount<=0)
			return;
		
		balance += amount;
		
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	int withdraw(int amount) {
		if(amount < 0) {
			System.out.println("출금금액을 잘못 입력하셨습니다.");
			return 0;
		}
		
		System.out.println("출금할 금액 : " + amount + "원");
		
		if(balance < amount) {
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고: " + balance + "원)");
			return 0;
		} else {
			balance -= amount;
			System.out.println("출금후 현재잔고 : " + balance + "원");
			return amount;
		}
	}
}

public class Test2 {
	public static void main(String[] args) {
		
		Account2 acc = new Account2();
		
		acc.accountNo = "111-1111-111"; 
		acc.ownerName = "홍길동";
		acc.balance = 100000;
		
		acc.showAccountInfo();
		System.out.println("===============");
		
		acc.deposit(50000);
		System.out.println("===============");
		acc.deposit(0);
		System.out.println("===============");
		
		int money = acc.withdraw(500000);
		
		System.out.println("출금금액 : " + money + "원");
		System.out.println("===============");
		
		money = acc.withdraw(70000);
		
		System.out.println("출금금액 : " + money + "원");
		System.out.println("===============");
		
		money = acc.withdraw(-100);
		
		System.out.println("출금금액 : " + money + "원");
		System.out.println("===============");
		
		money = acc.withdraw(0);
		
		System.out.println("출금금액 : " + money + "원");
		System.out.println("===============");
	}
}
