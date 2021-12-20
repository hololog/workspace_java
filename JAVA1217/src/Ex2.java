
//하나의 소스파일(.java)내에 복수개의 클래스 저의가능
//단. 파일명과 동일한 클래스에만 public접근제한자를 붙이고
//나머지 클래스에는 public을 붙이지 않는다

//Animal클래스 정의
// - 멤버변수로 이름 나이  메서도로 cry() 리턴없고 파라미터없음

class Animal  {
	String name;
	int age;
	
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		/*
		 *  
		 * 
		 */
		Animal dog = new Animal();
		
		dog.name = "럭키";
		dog.age = 2;
		System.out.println(dog.name  + dog.age);
		dog.cry();
		
		Animal cat = new Animal();
		
		cat.name = "나비";
		cat.age = 19;
		System.out.println("이름 : " + cat.name + ", 나이 : " + cat.age);
		cat.cry();
		System.out.println("============================");
		
		Student s1 = new Student();
		System.out.println("이름 : " + s1.name);
		System.out.println("학번 : " + s1.id);
		System.out.println("나이 : " + s1.age);
		System.out.println("============================");
		
		Student s2 = new Student();//힙에 다른 인스턴스 생성
		
		System.out.println("이름 : " + s2.name);
		System.out.println("학번 : " + s2.id);
		System.out.println("나이 : " + s2.age);
		System.out.println("============================");
		
		System.out.println(s1 == s2);//주소값비교
		System.out.println(s1.name == s2.name);
		System.out.println("============================");

		s1.id = "a87987";
		s1.age = 20;
		s1.kor = 100;
		s1.eng = 80;
		s1.mat = 60;
		
//		System.out.println("이름 : " + s1.name);
//		System.out.println("학번 : " + s1.id);
//		System.out.println("나이 : " + s1.age);
//		System.out.println("국어점수 : " + s1.kor);
//		System.out.println("영어점수 : " + s1.eng);
//		System.out.println("수학점수 : " + s1.mat);
//		System.out.println("============================");
		s1.showStudentInfo();
		s2.showStudentInfo();
		System.out.println("============================");
		System.out.println("합계 : " + s1.getTotal());
		System.out.println("평균 : " + s1.getAverage());
		
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		System.out.println(s1);
		System.out.println(s1);

		
	}
}

//Student클래스 정의

class Student {
	// 초기값을 지정하는 경우 인스턴스 생싱시 해당 초기밧을 초기화
	//초기값읎으면 기본값으로 초기화
	String name = "홍길동"; //모든 인스턴스의 기본값
	String id = "a546548";
	int age;
	int kor;
	int eng;
	int mat;
	
	public void showStudentInfo() {
		//자신의 클래스에서 선언된 
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + id);
		System.out.println("나이 : " + age);
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
	}
	
	public int getTotal() {
		int sum = kor + eng + mat;
		return sum;
		
	}
	
	public double getAverage() {
		return getTotal() / 3.0;
	}
	
}
