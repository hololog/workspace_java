package method;

class Student {
	private String name;
	private int age;
	private int score;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 캡슐화 =은닉성 
		 *  - 객체 내부의 구조(멤버변수 및 메서드 처리과정)를 외부로부터 숨기고 
		 *    메세지만으로 객체와 통신하도록 하는것
		 *  - 클래스 정의시 멤버변수를 private 접근제한자를 사용하여 외부접근을 차단하고
		 *    public 접근제한자가 선ㅇ언된 getter/setter메서드를 정의하여
		 *    간접적으로 객체 내의 멤버변수에 접근하도록 하는것
		 *  - 모든 Getter/Setter메서드는 누구나 접근 가능하도록 접근제한자 public을 사용
		 *  - Getter 메서드는 내부 멤버변수 박응ㄹ 외부로 리턴하는 역할으 수행아며
		 *    메서드 이름은 getXXX() 형태로 하고
		 *    파라미터는 없고 리턴타입은 리턴할 멤벼변수의 데이터타입을 지정\
		 *  - Setter 메서드는 외부로부터 전달받은 값을 ㅐㄴ부 멤버변수에 저장하는 역할으 수행아며
		 *    파라미터는 전달받은 데이터의 데이터타입을 지정하고 리턴타입은 없으므로 void 지정      
		 */
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setScore(100);
		System.out.println(s.getName()+", "+s.getAge()+", "+s.getScore());
	}
}
