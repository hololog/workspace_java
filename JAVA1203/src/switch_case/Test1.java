package switch_case;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		int score = 0;
		String grade;
		
		if(score<=100 && score>=0) {
			switch (score/10) {
				case 10:
				case 9:
					grade ="A";
					break;
				case 8:
					grade ="B";
					break;
				case 7:
					grade ="C";
					break;
				case 6:
					grade ="D";
					break;
				default:
					grade ="F";
			}
			System.out.println(grade+"학점");
		} else {
			System.out.println("점수입력 오류!");
		}
	}

}
