package constructor;

class Account {

	String accountNo;
	String ownerName;
	int balance;

//	Account(String accountNo, String owerName, int balance){
//		this.accountNo = accountNo;
//		this.ownerName = owerName;
//		this.balance = balance;
//	}

	public Account() {
		this("111-1111-111", "홍길동", 10000);
	}
//	Account() {
//		accountNo = "111-1111-111";
//		ownerName = "홍길동";
//		balance = 10000;
//	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

}

public class Test1 {
	public static void main(String[] args) {
		Account acc = new Account();

		Account acc2 = new Account("222-2222-222", "이순신", 22000);

		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance);
		
		System.out.print
		
	}
}
