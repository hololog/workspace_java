
public class Ex5 {
	int money = 10000;
	int apple = 1000;
	int n = 0;
	
	public int price() {
		return apple*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 돈 10000원 사과 1000원
		*/
//		int money = 10000;
//		int apple = 1000;
//		int n = 0;
//		int price = apple*n;
		Ex5.price();
		
		int pocket = money-price;
		int max = money/apple;
		double point = (1000*n)*0.01;
		
		//최대구매가능 갯수 돈/사과
		System.out.println(max);
		
		//사과3개 가격
		n = 3;
		price = apple*n;
		System.out.println(price);
		// 5사고 남는금액
		n = 5;
		price = apple*n;
		pocket = money-price;
		System.out.println(pocket);
		//5개 사고 적립금
		n = 5;
		point = (1000*n)*0.01;
		System.out.println(point);
		
		//객체화하기
		
	}

}
