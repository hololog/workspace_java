import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11654 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		
//		System.out.println(br.readLine().charAt(0));
		
		 Person p = new Person();
		 p.name = "홍길동";
		 p.age = 20;
		 p.print();
	}
}

class Person {
	String name;
	int age;
	
	public void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}