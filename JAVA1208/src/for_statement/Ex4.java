package for_statement;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//행번호 만큼 출력
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) System.out.print(j + " ");
			
			System.out.println();
			
		}
		
		System.out.println("============================");
		
		//별찍기
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println("============================");
		
		
	}

}
