package switch_case;

public class Test3 {
	public static void main(String[] args) {
		
		int n1=60, n2=25, n3=300;
		int max;
		
		//최대값 출력
		//어떻게 비교할까 삼항?
		
//		1.n1>n2 참 n1>n3 참 n1최대값 아니면 n3 chleoqkt
		
//		if (n1>n2) {
//			if(n1>n3) System.out.println(n1);
//			 else System.out.println(n3);
//		} else {
//			if(n2>n3) System.out.println(n2);
//			else System.out.println(n3);
//		}
		
		
//		max = n1>n2 ? n1 : n2;
//		max = max>n3 ? max : n3;
//		System.out.println(max);
		
		max = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2 :n3;
		System.out.println(max);
		
		
		int max2 = n1;
		
		if(max2<n2) max2=n2;
		if(max2<n3) max2=n3;
		System.out.println("최대값 = "+max2);
		
		
		
	}
}
