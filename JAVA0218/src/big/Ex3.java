package big;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;

public class Ex3 {
	public static void main(String[] args) throws ParseException {
		String pattern = "￦#,###.###";
//		String pattern = "￦0,000.000";
//		String pattern = "￦#,###.000";
		double dNum = 1234.5;
		
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(dNum));
	
		String strNum = df.format(dNum);
		
//		Double.parseDouble(strNum);
		
		double parseNum = (double)df.parse(strNum);
		System.out.println(parseNum);
		
		System.out.println("-----------------------------");
		
		String messagePattern = "이름:{0}, 나이:{1}, 주민번호:{2}";
		//실제 데이터가 결합될 부분을 {순서번호} 형태로 표시
		
		String name = "홍길동";
		int age = 20;
		String jumin = "1111-1223456";
		
		String formatStr = MessageFormat.format(messagePattern, name, age, jumin);
		System.out.println(formatStr);
		
		Person[] pArr = {
			new Person("홍길동", 20, "9001010-1234567"),	
			new Person("이순신", 20, "9001010-1234567"),	
			new Person("강감찬", 20, "9001010-1234567")	
		};
		
		for (int i = 0; i < pArr.length; i++) {
			Person p = pArr[i];
			String formatStr2 = 
					MessageFormat.format(messagePattern, p.getName(), p.getAge(), p.getJumin());
			System.out.println(formatStr2);
		}
		
		for (Person p : pArr) {
			String formatStr2 = 
					MessageFormat.format(messagePattern, p.getName(), p.getAge(), p.getJumin());
			System.out.println(formatStr2);
		}
		String orginalData = 
				"홍길동:20:9001010-1234567,이순신:30:9001010-1234567,강감찬:40:9001010-1234567";
		String [] strArrDate = orginalData.split(",");
		for (int i = 0; i < strArrDate.length; i++) {
			String[] splitDate = strArrDate[i].split(":");
			
			String formatStr3 = MessageFormat.format(messagePattern, splitDate);
			System.out.println(formatStr3);
		}
		for (String s : strArrDate) {
			System.out.println(MessageFormat.format(messagePattern, s.split(":")));
		}
		
	}
}
class Person {
	private String name;
	private int age;
	private String jumin;
	
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJumin() {
		return jumin;
	}
	
	
	
	
}