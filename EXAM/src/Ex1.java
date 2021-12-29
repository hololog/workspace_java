import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().replace(" ","");
		String[] str = s.split(",");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		String result = "";
		
		for (int i=a; i<=b; i++) {
			if (i%2 != 0) 
				result += ", " + i;
		}

		System.out.println(result.substring(2));
		
//		//구분자가 없을때
//		System.out.print(">>");
//
//		Scanner sc = new Scanner(System.in);
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		String result = "";
//
//		for (int i=a; i<=b; i++) {
//			if (i%2 != 0)
//				result += ", " + i;
//		}
//		
//		System.out.println(result.substring(2));
	
		
	}
}