package LangPackage;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		int[] myLotto = {40,45,10,33,1,42};
		
		for (int i=0; i<myLotto.length; i++) {
			System.out.print(myLotto[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(myLotto));
		
		System.out.println("------------------");
		
		Arrays.sort(myLotto);
		System.out.println(Arrays.toString(myLotto));
		
		System.out.println("------------------");
		String[] subject = {"Java", "Oracle", "JSP", "HTML","Android"};
		Arrays.sort(subject);
		System.out.println(Arrays.toString(subject));
		
		System.out.println("------------------");
		
		
		
	}
}
