package review;

public class Ex2 {
	public static void main(String[] args) {
		
		/*
		 *  
		 * 
		 * 
		*/
		
//		byte b = 128;
		long i = 2150000000L;
		
		/*
		 *  type casting
		 *  
		 *  1. 자동형변환
		 *   큰 데이터 다입으로 형변환시 / 기본타입에서만 가능
		 *  
		 *  2. 강제형변환
		 *   작은 데이터 타입으로 형변환시 - 데이터 손실발생 가능성때문에(overflow)
		 *   
		*/
		
		int j = 128;
		byte b = (byte)i;
		System.out.println(b);
		
		float f = 9.1234567f;
		double d = 9.1234657;
		double d2 = f;
		System.out.println(f);
		System.out.println(d);
		System.out.println(d2);
	}
}
