import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1 {
	public static void main(String[] args) {
		
		Stack<String> url = new Stack<>();
		url.push("www.naver.com");
		url.push("www.daum.net");
		url.push("www.google.com");
		url.push("www.amazon.com");
		url.push("www.kakao.com");
		
		System.out.println(url);
		System.out.println(url.pop());
		System.out.println(url.pop());
		System.out.println(url.pop());
		System.out.println(url.pop());
		System.out.println(url);
		
		Queue file = new LinkedList();
		
		file.offer(1);
		file.offer(2);
		file.offer(3);
		file.offer(4);
		file.offer(5);
		
		System.out.println(file);
		
		System.out.println(file.poll());
		System.out.println(file.poll());
		System.out.println(file.poll());
		System.out.println(file.poll());
		System.out.println(file);
		
		
	}
}
