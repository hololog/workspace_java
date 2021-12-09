package for_statement;

public class Ex {
	public static void main(String[] args) {
		
//		5-11
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
		
		for (int j=0; j<score.length; j++) {
			for (int i=0; i<score[j].length; i++) {
				System.out.printf("%4d", score[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		//더큰 새 배열 생성
		int[][] sumArr = new int[score.length+1][score[0].length+1];
		
		//배열 복사
//		sumArr = System.arraycopy(score, 0, sumArr, 0, 0);
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				sumArr[i][j] = score[i][j];
				sumArr[i][score[0].length] += score[i][j];
				sumArr[score.length][j] += score[i][j];
				sumArr[score.length][score[0].length] += score[i][j];
			}
		}
		
//		for (int j=0; j<sumArr.length; j++) {
//			for (int i=0; i<sumArr[j].length; i++) {
//				System.out.printf("%4d", sumArr[j][i]);
//			}
//			System.out.println();
//		}
//		
//		//가로 더하기
//		for (int i=0; i<sumArr.length-1; i++) {    //0~4
//			for (int j=0; j<sumArr[i].length-1; j++) {    //0~2
//				sumArr[i][sumArr[0].length-1] += sumArr[i][j];				
//			}
//		}
//		
//		//세로더하기
//		for (int i=0; i<sumArr[i].length; i++) {   //0~3
//			for (int j=0; j<sumArr.length-1; j++) {   //0~5
//				sumArr[sumArr.length-1][i] += sumArr[j][i];				
//			}
//		}
		//출력
		for (int j=0; j<sumArr.length; j++) {       
			for (int i=0; i<sumArr[j].length; i++) {
				System.out.printf("%4d", sumArr[j][i]);
			}
			System.out.println();
		}
		
		
		
		//5-10
//		char[] abcCode = {'`', '~','!','@','#','$','%','^','&','*','(',')', '-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
//		
//		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//		
//		String src = "abc123";
//		String result = "";
//		
//		for (int i=0; i<src.length(); i++) {
//			//한글자씩 읽기
//			char ch = src.charAt(i);
//			// 변환
//			if('a'<=ch && ch<='z') {
//				result += abcCode[ch-'a'];
//			}
//			if('0'<=ch && ch<='9') {
//				result += numCode[ch-'0'];
//			}
//		}
//		System.out.println("src:"+src);
//		System.out.println("result:"+result);
//		
		//5-9
//		char [][] star = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//		};
//		
////		char[][] result = new char[5][4]; //수정
//		char[][] result = new char[star[0].length][star.length];
//		
//		for (int i=0; i<result.length; i++) {
//			for (int j=0; j<result[i].length; j++) {
//				
//				result[i][j] = star[star.length-j-1][i];
//			}
//			
//		}
//		
//		for (int i=0; i<star.length; i++) {
//			System.out.println(star[i]);
//		}
//		
//		System.out.println();
//		
//		for (int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//		}
	}
}