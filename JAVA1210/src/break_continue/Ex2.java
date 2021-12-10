package break_continue;

import java.util.Iterator;

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 중첩반복문 내에서 break, continue\
		 * label을 이용하여 중첩반복문을 종료가능
		 * 
		 */
		
		OUTER: //레이블1
		for (int dan=2; dan<10; dan++) {
			System.out.println("< " + dan + "단 >");
			
			INNER: //레이블2
			for (int i = 1; i < 10; i++) {
				if(dan==6) {
//					break;  
//					continue;
					
//					break OUTER;
					continue OUTER;
					
				}
				
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		}
	}
}
