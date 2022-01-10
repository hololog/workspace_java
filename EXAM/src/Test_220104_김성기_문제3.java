
public class Test_220104_김성기_문제3 {
	public static void main(String[] args) {
		Account acc = new Account("123-4567-8900", "홍길동", 10000);
		acc.deposit(5000);
		System.out.println("----------------------------------------");
		acc.withdraw(5000);
		System.out.println("----------------------------------------");
		acc.withdraw(15000);
	}
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("\"입금금액 : " + amount + "원, 현재잔고 : "
		                   + balance + "원\"");
	}
	
	public int withdraw(int amount) {
		System.out.println("\"현재잔고 : " + balance + "원, 출금할 금액 : " 
	                       + amount + "원\"");
		
		if(balance < amount) {
			System.out.println("\"잔고가 부족하여 출금할 수 없습니다.\"");
			return 0;
		} else {
			balance -= amount;
			System.out.println("\"" + amount + " 원이 출금되었습니다 (현재잔고 : "
				             	+ balance + "원)\"");
			return amount;
		}
	}
}