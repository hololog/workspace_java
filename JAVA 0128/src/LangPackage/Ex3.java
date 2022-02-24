package LangPackage;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
//		String s3 = new String("홍길동");
//		String s4 = new String("홍길동");
//		System.out.println(s3==s4);//false
//		System.out.println(s3.equals(s4));
		
		String s1 = "Java Programing";
		String s2 = "           아이티월       부산교육센터            ";
		String s3 = "자바/JSP/안드로이드";
		
		System.out.println(s1.length());
		System.out.println(s1.equals("java programing"));
		System.out.println(s1.equalsIgnoreCase("java programing"));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(0, 5));
		System.out.println(s1.substring(5));
		
		System.out.println(s1.concat("!"));
		
		System.out.println(s1.indexOf(s3, 0));
		String[] sArr =s1.split(".");
		String[] sArr2 =s1.split("\\.");
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(sArr2));
		System.out.println(s2.strip());
		
		System.out.println(s1.contains(s3));
		
		String name = "홍길동";
		int age = 20;
		double height = 180.5;
		
		
	}
}
