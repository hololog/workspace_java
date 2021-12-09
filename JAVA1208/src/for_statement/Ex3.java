package for_statement;

public class Ex3 {
	public static void main(String[] args) {
		/*
		 * 중첩 for문  
		 * 
		 */
		
		//시계 구현
		int hour=0, min=0, sec=0;
//		
//		for (min=0; min<60; min++) {
//			
//			for (sec=0; sec<60; sec++) {
//				
//				System.out.println(min + "분" + sec + "초");
//			}
//		}
		
		for (hour=0; hour<24; hour++) {
			for (min=0; min<60; min++) {
				for (sec=0; sec<60; sec++) 
					System.out.println(hour + "시" + min + "분" + sec + "초");
			}
		}
	}
}
