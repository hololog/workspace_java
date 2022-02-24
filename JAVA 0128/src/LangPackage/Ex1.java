package LangPackage;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		int num = -10;
		System.out.println(Math.abs(num));
		
		double dNum = 3.141532;
		System.out.println(Math.round(dNum));
		System.out.println(Math.floor(dNum));
		System.out.println(Math.round(-dNum));
		System.out.println(Math.floor(-dNum));
		System.out.println(Math.round(dNum*1000)/1000.0);
		
		for (int i =0; i<=10; i++) {
//			System.out.println((int)(Math.random()*10));
			System.out.println((int)(Math.random()*10)+1);
			
		}
	}
}
