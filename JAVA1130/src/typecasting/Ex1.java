package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 * 
		*/
		
		short s = 65;
		char c = (char)65;
		System.out.println(s);
		System.out.println(c);
		
		short s2 = 0;
		char c2 = (char)s2;
		System.out.println(s2);
		System.out.println(c2); //'0'은 공백?
		
		short s3 = 10000;
		char c3 = (char)s3;
		System.out.println(s3);
		System.out.println(c3);
		
		short s4 = -100;
		char c4 = (char)s4;
//		char c4 = -100; ?????????????????????????????????????????????????
		System.out.println(s4);
		System.out.println(c4);
		
		int a = 3;
		float f = 1.0F;
		double d = a + f; // double d = (double)((float)a + f);
		System.out.println(d);
		
//		float f2 = 100.0; //접미사 없음
		float f2 = 100.0F;
		
		
		
	}

}
