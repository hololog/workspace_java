import java.util.Objects;

public class Test1 {
	public static void main(String[] args) {
		Account acc1 = new Account("111", "홍", 100);
		Object acc2 = new Account("111", "홍", 100);
		System.out.println(acc1.getClass());
		System.out.println(acc2.getClass());
		
		System.out.println(acc1.equals(acc2));
		System.out.println(acc2.equals(acc1));
		System.out.println(acc1.equals(null));
	}
}
 
class Account {
	String accountNO;
	String ownerName;
	int balance;
	
	public Account(String accountNO, String ownerName, int balance) {
		this.accountNO = accountNO;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNO=" + accountNO + ", ownerName=" 
	           + ownerName + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNO, balance, ownerName);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Account))
//			return false;
//		Account other = (Account) obj;
//		return Objects.equals(accountNO, other.accountNO) && balance == other.balance
//				&& Objects.equals(ownerName, other.ownerName);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Account other = (Account) obj;
//		return Objects.equals(accountNO, other.accountNO) && balance == other.balance
//				&& Objects.equals(ownerName, other.ownerName);
//	}
	
	@Override
	public boolean equals(Object obj) {
		//모든 멤버변수 값이 같을 경우 true리턴
		if (obj instanceof Account) {
			Account tmp = (Account) obj;
			
			if(this.accountNO.equals(tmp.accountNO) && 
			   this.ownerName.equals(tmp.ownerName) &&
			   this.balance==tmp.balance) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}