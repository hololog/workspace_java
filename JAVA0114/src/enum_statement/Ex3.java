package enum_statement;

class Ex3 {
	public static void main(String[] args) {
		Area 부산 = Area.부산;
		System.out.println(부산.value);
	}
	
}

enum Area {
	서울("02"), 부산("051");
	
	String value;
	
	private Area(String value) {
		this.value = value;
	}
}

enum Status {
	Y(1, true,"T"), N(0,false, "F");
	
	int value1;
	boolean value2;
	String value3;
	
	private Status(int value1, boolean value2, String value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	
	
}