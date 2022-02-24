package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test5 {
	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\source.txt");
//		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String str = br.readLine();
			int count = 1;
			
			while(str != null) {
				System.out.println(count++ + " " + str);
				str = br.readLine();
			}
			
//			for (int i=1; str!=null; i++) {
//				sb.append(i)
//				  .append(" ")
//				  .append(str)
//				  .append("\n");
//				str = br.readLine();
//			}
			
//			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
