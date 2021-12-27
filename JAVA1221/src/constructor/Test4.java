package constructor;

class Account3 {
	String accountNo;
	String ownerName;
	int balance;

	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public Account3(String accountNo, String ownerName) {
		this(accountNo, ownerName, 10000);
	}

	public Account3(String accountNo) {
		this(accountNo, "홍길동", 10000);
	}

	public Account3() {
		this("111-1111-111", "홍길동", 10000);
	}
	
	public String toString() {
		return "[" + accountNo + ", " + ownerName + ", " + balance +"원"+ "]";
	}

}

public class Test4 {
	public static void main(String[] args) {
		Account3 acc1 = new Account3();
		Account3 acc2 = new Account3("222-222-2222");
		Account3 acc3 = new Account3("333-3333-333", "김원봉");
		Account3 acc4 = new Account3("444-4444-44444", "이순신", 50000);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println(acc4);
	}
}
