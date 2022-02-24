package big;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		Date now = new Date();
		String pattern = "yyyy년 MM월 dd일(E) a hh시mm분ss초";
		
		System.out.println(new SimpleDateFormat(pattern).format(now));
		
		System.out.println("-------------------------------------");		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		
	}
}
