package Lambda;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Ex3 {
	public static void main(String[] args) {
		//2 supplier공급자
		Supplier<String> s = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
			
		};
		
		Supplier<String> s2 = () -> "Hello";
		
		System.out.println(s2.get());
		
		//PSupplier
		
		IntSupplier s3 = ()-> {
			Random random = new Random();
			return random.nextInt(6);
		};
		System.out.println(s3.getAsInt());
	}
}
