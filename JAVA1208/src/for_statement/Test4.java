package for_statement;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		//정수 n을 앱력받아 n층의 별계단 출력
		
//		**
//		 **
//		  **
//		   **
//		    **
		    
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    
		    for (int i=0; i<n; i++) {
		    	for (int j=0; j<i; j++) {
		    		
					System.out.print(" ");
					
				}
		    	System.out.println("**");
			}
		    
		    
		    
	}
}
