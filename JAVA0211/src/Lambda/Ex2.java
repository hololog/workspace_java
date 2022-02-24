package Lambda;

import java.util.function.Consumer;

class Student{
	String name;
	double score;
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
}

public class Ex2 {
	//학생을 출력할 것이다. 아직 방식은 미정
	//출력방식을 전달받는다(Consumet<Student> printer)
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}
	public static void main(String[] args) {
		//익명클래스방식
		Consumer<String> consumer= new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		};
		consumer.accept("hello");
		System.out.println("----------------------------");
		//람다식방식
		Consumer<String> consumer2 = t -> System.out.println(t);
		consumer2.accept("hello");
		System.out.println("----------------------------");
		
		Student s1 = new Student("홍길동", 80);
		
		printStudent(s1, s -> System.out.println(s.name));
		printStudent(s1, s -> s.score*=1.5 );
		printStudent(s1, s -> System.out.println(s.name+" : "+s.score));
		
	}
}
