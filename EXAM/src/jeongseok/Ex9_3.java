package jeongseok;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fillName = "";

		int pos = fullPath.lastIndexOf('\\');
		System.out.println( pos);
		path = fullPath.substring(0, pos);
		fillName = fullPath.substring(pos+1);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fillName:"+fillName);
	}
}
