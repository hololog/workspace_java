package operator;

public class Ex1 {
	public static void main(String[] args) {

		/*
		 * 단항연산자 a++,a--,++a,--a (증감연산자) 후행(후위)연산자는 실행문 실행후 증감 산술연산자 + - * / % : 나머지 연산자
		 * 대입연산자 =, 복합대입연산자 +=,-=,*=,/=,%= 비교연산자 ==, !=, <,> 논리연산자 &&,||,!,^
		 * (true^false=true) 삼항연산자 조건식? true일때 값:false일때 값
		 * 비트연산자
		 * 
		 */

		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println("====================");

		int x1 = 5;
		int y1 = ++x1;

		int x2 = 5;
		int y2 = x2++;
		System.out.println("x1: " + x1 + ", y1: " + y1);
		System.out.println("x2: " + x2 + ", y2: " + y2);
		System.out.println("=====================");
		
		int x=10, y=5;
//		int z = ++x + y--;// 복잡하게 안씀
		++x;
		int z = x + y;
		y--;
		System.out.println(x+"+"+y+"+"+z);
		System.out.println("=====================");

		
	}

}
