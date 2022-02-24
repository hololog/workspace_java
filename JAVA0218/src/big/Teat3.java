package big;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Teat3 {
	public static void main(String[] args) throws ParseException {
		int money = 128000;
		String pattern = "###,###원";
		
		DecimalFormat df = new DecimalFormat(pattern);
		
		String str = df.format(money);
		System.out.println(str);
		
		int orgin = (int)df.parse(str);
		System.out.println(orgin);
	}
}
