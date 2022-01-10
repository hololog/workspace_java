package jeongseok;

public class Ex9_6 {
	public static String fillZero(String src, int length) {
		if(src==null || (src.length() == length)) 
			return src;
		else if(length <= 0)
			return "";
		else if(src.length() > length)
			return src.substring(0, length);
		else {
			String result="";
			for(int i=0; i<length-src.length();i++) {
				result += "0";
			}
			return result+src;
		}	
		
	}
	
	public static void main (String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}

