package jeongseok;

public class Ex9_7 {
	
	public static boolean contains(String src, String target ) {
//		if(src.indexOf(target)==-1)
//			return false;
//		else 
//			return true;
		return src.contains(target);
	}
		
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
