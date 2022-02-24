package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Ex7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int n= list.stream().filter(i -> i<6)
							.filter(i -> i%2 == 0)
							.map(i -> i*10)
							.findFirst().get();
		
		System.out.println(n);
		///////////////////////////
		int result = 0;
		for (Integer i : list) {
			if(i < 6) {
				if(i%2 == 0) {
					i*=10;
					result = i;
					break;
				}
			}
		}
		System.out.println(result);
		
		System.out.println("---------------------------------------");
		
		long startTime = System.currentTimeMillis();
		getValue(true, getExpensiveValue());
		getValue(false, getExpensiveValue());
		getValue(false, getExpensiveValue());
		getValue(false, getExpensiveValue());
		getValue(false, getExpensiveValue());
		System.out.println("passed time: "+ (System.currentTimeMillis()-startTime)/1000);
		
		long startTime2 = System.currentTimeMillis();
		getValue(true, () -> getExpensiveValue());
		getValue(false, () -> getExpensiveValue());
		getValue(false, () -> getExpensiveValue());
		getValue(false, () -> getExpensiveValue());
		getValue(false, () -> getExpensiveValue());
		System.out.println("passed time: "+ (System.currentTimeMillis()-startTime2)/1000);
		
		
		
		
	}
	//일반적인 방식
	private static void getValue(boolean valid, String value) {
		if(valid) {
			System.out.println("Success: the value is "+ value);
		} else {
			System.out.println("fail: invalid value");
		}
	}
	//함수형인터페이스 
	private static void getValue(boolean valid, Supplier<String> value) {
		if(valid) {
			System.out.println("Success: the value is "+ value.get());
		} else {
			System.out.println("fail: invalid value");
		}
	}
	
	private static String getExpensiveValue() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hello";
	} 
	
	
	
	
	
	
	
	
	
	
	
}
