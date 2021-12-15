package array;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 
		 * 5명 학생 점수 배열 score저장 각 학생의 총점과 평균 출력
		 * 
		 * 1번 학생: 80점 2번 학생: 80점 1번 학생: 80점 1번 학생: 80점 1번 학생: 80점
		 * 
		 * 
		 * 
		 */

		int[] arr = { 1, 2, 3, 2, 1 };
//		String op = "";

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + ": ");

			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				String op = (arr[i] == arr[j]) ? "= " : (arr[i] > arr[j]) ? "> " : "< ";

				System.out.print(op);
			}
			System.out.println();
		}
		System.out.println("=================");

		int[] score = { 80, 100, 50, 90, 77 };
		String[] name = { "이순신", "홍길동", "강감찬", "김태희", "전지현" };

		int sum = 0; // 점수합
		int max = score[0]; // 최고점
		int min = score[0]; // 최저점

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 점수누적
			max = (max > score[i]) ? max : score[i]; // 최고점비교
//			if(max<score[i]) max = score[i];   
			min = (min < score[i]) ? min : score[i]; // 최저점비교
//			if(min>score[i]) min = score[i];

			System.out.printf("%s: %d점%n", name[i], score[i]);
		}

		System.out.println("-------------");

		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + (double) sum / score.length + "점"); // 평균 실수로 출력
		System.out.println("최고 점수: " + max + "점");
		System.out.println("최저 점수: " + min + "점");

	}
}
