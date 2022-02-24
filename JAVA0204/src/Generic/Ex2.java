package Generic;

public class Ex2 {
	public static void main(String[] args) {
		NormalIntegerClass nic = new NormalIntegerClass();
		
		nic.data = 10;
		
		NormalObjectClass noc = new NormalObjectClass();
		
		GenericClass<Integer> gc = new GenericClass<>();
	}
}

class NormalIntegerClass{
	int data;
	
}
class NormalObjectClass{
	Object data;
	
}
class GenericClass<T> {
	private T data;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}