package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 19);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Object[] objArr = {p1,p2};
		
		for (int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
			if(objArr[i] instanceof Person) {
				Person p = (Person)objArr[i];
				System.out.println(p.getName().toString()+", "+p.getAge());
			}
		}
		System.out.println("=====================================");
		
		MemberBean b1 = new MemberBean("id1", "1234", "홍길동", "abc@naver.copm","부산" ,"051-123-4567", "010-1234-5678");
		MemberBean b2 = new MemberBean("id2", "1234", "이순신", "efg@naver.copm","광주" ,"051-123-4567", "010-1234-5678");
		MemberBean b3 = new MemberBean("id3", "1234", "강감찬", "hig@naver.copm","제주" ,"051-123-4567", "010-1234-5678");
		
		List<MemberBean> beanList = new ArrayList<MemberBean>();
		
		beanList.add(b1);
		beanList.add(b2);
		beanList.add(b3);
		
		for (MemberBean mBean : beanList) {
			System.out.println(mBean.toString());
		}
	}
}
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
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
	
}
class MemberBean {
	private String id;
	private String pass;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String mobile;
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", mobile=" + mobile + "]";
	}
	public MemberBean(String id, String pass, String name, String email, String address, String phone, String mobile) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}