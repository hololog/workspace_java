package enum_statement;

public class Ex2 {
	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		ex2.compareEnum(Season.FALL);
		
		
	}
	
	public void compareEnum(Season season) {
		System.out.println(season.compareTo(Season.SPRING));
		
		System.out.println(season.name()+","+season.ordinal());
		
		if(season == Season.SPRING) {
			System.out.println("봄이네요");
		} else if (season.equals(Season.SUMMER)) {
			System.out.println("여름이네요");
		} else if (season.compareTo(Season.WINTER) >= -1) {
			System.out.println("겨울 또는 가을 입니다.");
		}
	}
}

enum Season {
	SPRING, SUMMER, FALL, WINTER
}