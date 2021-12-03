package if_statement;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * 중첩 if문 = 중첩제한없음
		 * 
		 */

		// 학생 점수 (score)에 대한 학점 (grade)판별

		int score = 101;
		String grade = "";

//		if(score>=90 && score<=100) grade="A학점";
//		else if(score>=80) grade="B학점";
//		else if(score>=70) grade="C학점";
//		else if(score>=60) grade="D학점";
//		else if(score>=0) grade="F학점";
//		else grade = "점수입력오류";
//		
//		System.out.println(grade);
//		
		if (score >= 0 && score <= 100) {
			if (score >= 90)
				grade = "A학점";
			else if (score >= 80)
				grade = "B학점";
			else if (score >= 70)
				grade = "C학점";
			else if (score >= 60)
				grade = "D학점";
			else
				grade = "F학점";
			System.out.println(grade);
		} else
			System.out.println("점수입력오류");

	}

}
