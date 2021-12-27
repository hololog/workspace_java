package method;

import java.util.InputMismatchException;

/*
 * Calculator 정의
 *  덧셈 뺄셈
 */
class Calculator {
	public int calc(char operator, int... nums) {
//		if (nums == null) return 0;

		int result = 0;

		if (operator == '+')
			for (int a : nums) result += a;

		return result;
	}
}


public class Ex3 {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {};
		int[] arr3;
		
		System.out.println(cal.calc('+', 1,2,3,4,5));
		System.out.println(cal.calc('+', arr));
		System.out.println(cal.calc('+', arr2));
		System.out.println(cal.calc('+', null));
//		System.out.println(cal.calc('+', 54dfg));
		System.out.println(cal.calc('+', new int[3]));
		System.out.println(cal.calc('+'));
		
	}
}
