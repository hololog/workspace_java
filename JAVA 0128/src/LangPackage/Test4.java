package LangPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String jumin = br.readLine();
		
		String jumin = "888888-1211111";
		
		String result = "";
//		char ch = jumin.charAt(7);
		char ch = jumin.split("-")[1].charAt(0);;
		
		switch (ch) {
			case '1':
			case '3': result = "남성"; break;
			case '2':
			case '4': result = "여성"; break;
			case '5':
			case '6': result = "외국인"; break;
			default : result = "잘못입력"; break;
		}
		System.out.println(result);
		
		System.out.println("------------------------------------");
		String data1 = "Address:부산광역시 부산진구 동천로109";
		System.out.println(data1.split(":")[1].trim());
		//
		String data2 = "이름: 홍길동, 나이:20";
		System.out.println(data2.split(",")[0].split(":")[1].trim());
		//
		String data3 = "Address:서울특별시 용산구 XXX-xx, Tel:0518030909";
		System.out.println(data3.split(",")[0].substring(data3.indexOf(':')+1));
		
		//
		String data4 = "Address:부산광역시 부산진구 동천로109, Floor:7층, Tel:051-803-0909";
		String[] dArr = data4.replace("-", "").trim().split(",");
		
		for (String s : dArr) {
			System.out.print(s.substring(s.indexOf(':')+1)+" ");
		}
	}
}


enum Jumin{
	남성(1,3), 여성(2,4), 외국인(5,6);
	int num1;
	int num2;
	
	private Jumin(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
}





















