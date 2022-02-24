package big;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		String pattern = "yy년 M월 dd일 E HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String formattingNow = sdf.format(now);
		
		System.out.println(formattingNow);
		
		LocalDateTime now2 = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println(now2.format(dtf));
	}
}
