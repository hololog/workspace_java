package if_statement;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * (1) square
		 * (2) square root
		 * (3) log
		 * 원하는 메뉴(1~3)를 선택하세요.(종료:0)>
		 * 계산할 값을 입력하세요. (계산 종료:0, 전체종료:99)>
		 * 
		 * 계산 결과는 "result=결과값" 출력-> 다시 계산입력반복
		 * 
		 * 계산종료시 다시 메뉴선택, 전체종료시 종료
		 * 
		 */
		int menu;
		int num;
		
		Scanner sc  = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(menu<1 || menu>3)
				continue;
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요. (계산 종료:0, 전체종료:99)>");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				if(num==0) {
					break;
				}
				if(num==99) {
					System.out.println("프로그램을 종료합니다.");
					break outer;
				}
				switch(menu) {
					case 1:
						System.out.println(num*num);
						break;
					case 2:
						System.out.println(Math.sqrt(num));
						break;
					case 3:
						System.out.println(Math.log(num));
						break;
				}
				
				
			}
			
		}
		
		
		
	}

}
