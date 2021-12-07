package review;

public class Test1 {
	
	public static String evenOrOdd (int a) {
		String str = "";
		
		if(a%2==0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int month = sc.nextInt();
//		int days;
//				
//		switch (month) {
//		    case 2:  days = 28;
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11: days = 30;
//				break;
//			default: days = 31;
//		}
//		
//		System.out.printf("%d월은 %d일까지 입니다.%n", month, days);
		
		
		
		int n1 = 5, n2 = 8;
		
//		String sum = "";
//		String s1 = ""; 
//		String s2 = "";
		
			
//		if(n1%2==0) {
//			s1 = "짝수";
//		} else {
//			s1 = "홀수";
//		}
		
//		if(n2%2==0) {
//			s2 = "짝수";
//		} else {
//			s2 = "홀수";
//		}
//		
//		if ((n1+n2)%2==0) {
//			sum = "짝수";//짝수
//		} else {
//			sum = "홀수";
//		}
		
		String s1 = evenOrOdd (n1);
		String s2 = evenOrOdd (n2);		
		String sum = evenOrOdd (n1*n2);	
		
		System.out.printf("%s + %s = %s%n", s1,s2,sum);
		
//		String result ="";
//		
//		result += (n1%2==0) ? "짝수 + ":"홀수 + ";
//		result += (n2%2==0) ? "짝수 = ":"홀수 = ";
//		result += ((n1+n2)%2==0) ? "짝수":"홀수";
//		
		
//		
//		if(n1%2==0) {
//			result = "짝수 + ";
//			if((n1+n2)%2==0) result +="짝수 = 짝수";
//			else 		  	 result +="홀수 = 홀수";
//			
//		} else {
//			result = "홀수 + ";
//			if((n1+n2)%2==0) result +="짝수 = 홀수";
//			else 			 result +="홀수 = 짝수";
//			
//		}
//		System.out.println(result);
		
	}
}
