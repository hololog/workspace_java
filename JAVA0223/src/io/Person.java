package io;

import java.io.Serializable;
//직렬화를 위한 클래스 정의할떄 직렬화 인터페이스 상속필수
//별도의 추상메서드가 없는 단순한 마커용도의 인터페이스
class Person implements Serializable {
	String name;
	int age;
	transient String jumin;
	
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
}