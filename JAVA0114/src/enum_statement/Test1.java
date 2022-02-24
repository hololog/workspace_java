package enum_statement;


public class Test1 {
	public static void main(String[] args) {
		Week week = Week.월;
		
		switch (week) {
			case 금: System.out.println("불금"); break;
			case 토: 
			case 일: System.out.println("주말"); break;
			case 월: 
			case 화: 
			case 수: 
			case 목: System.out.println("하아..."); break;
		}
		
	}
}

enum Week {
	월, 화, 수, 목, 금, 토, 일
}
