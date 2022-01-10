package polymorphism;

public class Ex2 {
	public static void main(String[] args) {
		Employee e = new Employee("홍길동", 3000);
		
		System.out.println(e.getEmployee());
		System.out.println("----------------------------------------");
		
		Manager m = new Manager("이순신", 4000, "개발");
		
		System.out.println(m.getEmployee());
		System.out.println("----------------------------------------");
		e = m;
		
		System.out.println(e.getEmployee());
		System.out.println("----------------------------------------");
		
		
		Employee e2 = new Manager("홍길동", 3000, "기획");
		
		System.out.println(e2.getEmployee());
		System.out.println("----------------------------------------");
		
		
	}
}

class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
//		this("홍길동", 3000);
	}

	public String getEmployee() {
		return name +", "+ salary;
	}
}

class Manager extends Employee {
	String depart;

	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.depart = department;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + depart;
	}
}

class Engineer extends Employee {
	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + skill;
	}
	
	
}