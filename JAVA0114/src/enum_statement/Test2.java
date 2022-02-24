package enum_statement;

public class Test2 {
	public static void main(String[] args) {
		
		Week week = Week.일;
		
		compareEnum(week);
		
	}
	
	public static void compareEnum(Week week) {
		int result = week.토.compareTo(week);
		
		if(result <= 0) {
			System.out.println("이미 주말!!!");
		} else {
			System.out.println("오늘은 " + week + "요일...  주말까지 " + result + "일 남았다!");
		}
	}
}

//enum Week2 {
//	월, 화, 수, 목, 금, 토, 일
//}

