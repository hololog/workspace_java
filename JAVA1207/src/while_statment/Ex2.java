package while_statment;

public class Ex2 {

	public static void main(String[] args) {
		//중첩 while
		int i=1;
		
		while(i<60) {
			System.out.println("i = "+i);
			
			int j=1; 
			while(j<=60) {
				System.out.println("-----j = "+j);	
				j++;
			}
			i++;
		}
		
		
	}

}
