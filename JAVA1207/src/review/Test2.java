package review;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		//30분 전시간
		// 30분이후라면
//		if(m-30<0) {
//			m += 30;
//			h--;
//		} else {
//			m -= 30;
//		}
		
		m -= 30;
		
		if(m<0) {
			m += 30;
			h--;
		}
		
		 int m2 = (m<30)? (m+=30) : (m-=30);
		 int h2 = (m<30)? h-- : h ;
		 
		System.out.println(h + " " + m);
		System.out.println(h2 + " " + m2);
	}
}

