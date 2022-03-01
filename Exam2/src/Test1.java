import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		
		
		String pattern = "[0-9a-zA-Z!@#$%]{8,16}";
		String pwd = "";

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			pwd = br.readLine();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		//1 matches()
//		boolean result = pwd.matches(pattern);
		//2
		Pattern p = Pattern.compile(pattern);
		Pattern.matches(pattern, pwd);
		boolean result = p.matches(pattern, pwd);
		//3
		Matcher m = p.matcher(pwd);
		m.matches();
		
		if(m.matches()) {
			//1
			String[] patterns = {"[a-z]", "[A-Z]", "[0-9]", "[!@#$%]"};
			int count = 0;
			
			for (int i=0; i<patterns.length; i++) {
				pwd.matches(patterns[i]);
				count += (Pattern.compile(patterns[i]).matcher(pwd).find())? 1:0;
						
			}
		}
	}
}	






































