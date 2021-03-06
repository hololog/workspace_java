package operator;

public class Ex6 {
	public static void main(String[] args) {
		
		/*
		 * 논리연산자 (&& || ! ^) boolean타입으로 return
		 * 
		 * AND 연산자 : 둘다 true 일때 true
		 * OR : 둘중 하나가 true 일때 true
		 * XOR : 둘이 다를때 true
		 * NOT : 반대 
		 * 
		 * */
		
		boolean a = false;
		boolean b = true;
		
		System.out.println("false && false = "+(a&&a));
		System.out.println("false && true = "+(a&&b));
		System.out.println("true && false = "+(b&&a));
		System.out.println("true && true = "+(b&&b));
		System.out.println("================================");

		System.out.println("false || false = "+(a||a));
		System.out.println("false || true = "+(a||b));
		System.out.println("true || false = "+(b||a));
		System.out.println("true || true = "+(b||b));
		System.out.println("================================");

		System.out.println("false ^ false = "+(a^a));
		System.out.println("false ^ true = "+(a^b));
		System.out.println("true ^ false = "+(b^a));
		System.out.println("true ^ true = "+(b^b));
		System.out.println("================================");

		System.out.println("!false= "+(!a));
		System.out.println("!true = "+(!b));
	}
}
