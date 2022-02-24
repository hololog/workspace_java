package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test4 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\readme.txt");
		System.out.println("입력(:wq 입력시 종료)>");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new FileWriter(file))){
			
			String str = br.readLine();
			
			while(!str.equals(":wq")) {
				//ctrl+z가 종료조건일 경우 null로 조건
				pw.println(str);
				str = br.readLine();
			}
			System.out.println("입력종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
