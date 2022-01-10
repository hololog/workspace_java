

public class Test1 {
	public static void main(String[] args) {
  
		ItwillBank it = new ItwillBank();
		it.accountNo = "111-1111";
		it.ownerName = "홍길동";
		it.deposit(1000);
		System.out.println("================");

		it.showAccountInfo();
		
		System.out.println("================");
		it.withdraw(50000);
	}
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance +"원");
	}
	
	public void deposit(int amount) {
		balance += amount;
		
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + amount + "원");
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금후 현재잔고 : " + balance + "원");
			return 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금후 현재잔고 : " + balance + "원");
			return amount;
		}
	}
}

class ItwillBank extends Account {

	@Override
	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금할 금액 : " + amount + "원");
		System.out.println("출금후 현재잔고 : " + balance + "원");
		return amount;
	}	
}

class Car {
	int speed;
	int maxspeed;
	
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("자동차의 속도 증가");
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("자동차의 속도 감소");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 공급");
	}
	
}

class Taxi extends Car {
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("택시의 속도 증가");
	}
	
	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("택시의 속도 감소");
	}
}

class Truck extends Car {
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("트럭의 속도 증가");
	}
	
	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("트럭의 속도 감소");
	}
}

class ElectricCar extends Car {
	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 충전!");
	}
}

class DiselCar extends Car {
	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
}



















