package static_var;

class NormalClass{
	
}

class Car{
	private static Car instance;
	private Car() {
		
	}
	
	static Car getInstance() {
		if(instance == null)
			instance = new Car();
		return instance;
	}
}

public class Ex5 {
	
	public static void main(String[] args) {
		NormalClass a = new NormalClass();
		NormalClass b = new NormalClass();
		System.out.println(a==b);
		
		
	}
}
