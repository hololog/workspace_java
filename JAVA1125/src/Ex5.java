
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
		 * �� 10000�� ��� 1000��
		*/
//		int money = 10000;
//		int apple = 1000;
//		int n = 0;
//		int price = apple*n;
		Ex5.price();
		
		int pocket = money-price;
		int max = money/apple;
		double point = (1000*n)*0.01;
		
		//�ִ뱸�Ű��� ���� ��/���
		System.out.println(max);
		
		//���3�� ����
		n = 3;
		price = apple*n;
		System.out.println(price);
		// 5��� ���±ݾ�
		n = 5;
		price = apple*n;
		pocket = money-price;
		System.out.println(pocket);
		//5�� ��� ������
		n = 5;
		point = (1000*n)*0.01;
		System.out.println(point);
		
		//��üȭ�ϱ�
		
	}

}