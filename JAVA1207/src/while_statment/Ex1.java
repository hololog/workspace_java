package while_statment;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=0;
//		while(i<13) {
//			System.out.println(i+"안녕");
//			i++;
//		}
		
		// 1 2 3 4 5 6 7 8 9 10 풀력
		int i = 1;
		while(i<11) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("======================================");
	
		//2 4 6 8 10
		i = 2;
		while(i<11) {
			System.out.print(i + " ");
			i+=2;
		}
		
		System.out.println();
		System.out.println("======================================");
		
		//10 9 8 7 6 5 4 3 2 1 
		i=10;
		while(i>0) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println();
		System.out.println("======================================");
		
		
	}

}
