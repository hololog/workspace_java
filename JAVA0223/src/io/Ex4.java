package io;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ex4 {
	public static void main(String[] args) {
		//키보드로 입력받은 데이터를 파일로 출력
		//1. 키보드로 입력받기
		System.out.println("입력>");
		File file = new File("c:\\temp\\readme.txt");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new FileWriter(file))) {
			
			String str = br.readLine();
			System.out.println(str);
			pw.print(str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
