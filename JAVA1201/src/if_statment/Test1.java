package if_statment;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 삼항연삼자의 중첩 문자ch에 대해 대문자와 소문자 판별, 그 나머지는 "기타문자"라고 출력;
		 * 
		 * 
		 */

		char ch = '1'; // 65~90 97 122
		char ch2 = 'g';

		String result1 = (65 <= ch && ch <= 90)  ? "대문자" : 
			             (97 <= ch && ch <= 122) ? "소문자" : "기타문자";
		String result2 = ('A' <= ch2 && ch2 <= 'Z') ? "대문자" : 
			             ('a' <= ch2 && ch2 <= 'z') ? "소문자" : "기타문자";

		System.out.println(result1); // 그냥 문자로 비교 가능 , 굳이 정수로 바꿔줄필요가 없다.
		System.out.println(result2);

		/*
		 * 
		 * 1. 기본요금 price=30000원 
		 * 2. 손님나이 age 입력받는다 3. 할인조건 나이가 5세이하의 경우 70%할이요금계산 4.
		 * 최종적으로 뷔페요금 result 출력
		 * 
		 */
		System.out.println("========================");
		
		int price = 30000;
		
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine()); //리턴값이 기본형
//		int age = Integer.valueOf(sc.nextLine()); //  리턴값이 객체
		
		int result = (age <= 5) ? (price * 30 / 100) : price;
		System.out.println(result);

	}

}
