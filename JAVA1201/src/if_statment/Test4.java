package if_statment;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		int num1 = -5; // 양수 음수 0판별
		int num2 = 5; // 홀짝0 판별
		char ch = 'd'; // 대소문자 변화 아니면 "ch는 영문자가 아닙니다!"

		String s = (num1 == 0) ? "0" : 
			       (num1 > 0) ? "양수" : "음수";
		System.out.println("num1은 " + s + "입니다.");

		String s1 = (num2 == 0) ? "0" : 
			        (num2 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("num2은 " + s1 + "입니다.");
		System.out.println("==============");
		
		System.out.println("ch = "+ ch);
		String result = "ch = "; 
		
		if('A'<=ch && ch<='Z') {
			ch += 32;
//			System.out.println("ch의 소문자는 "+ch+"입니다.");
			result += ch;
		}
		else if('a'<=ch && ch<='z') {
			ch -= 32;
//			System.out.println("ch의 대문자는 "+ch+"입니다.");
			result += ch;
		}
		else System.out.println("ch는 영문자가 아닙니다!");
		
		System.out.println(result);
		System.out.println("=============================================");
		
		int score;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
//		score = Integer.parseInt(sc.nextLine());
		
		String grade;
		
		if(score<0 || 100<score) grade="-";
		else if(90<=score)       grade="A";
		else if(80<=score)       grade="B";
		else if(70<=score) 		 grade="C";
		else if(60<=score) 		 grade="D";
		else               		 grade="F";
		
		System.out.printf("\"%s학점\"%n",grade);
		
		System.out.println("=============================================");

		

	}

}
