package Lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex6 {
	public static void main(String[] args) {
		Predicate<String> predicate = name -> name.contains("Java");
		predicate.test("Javascript");
		System.out.println(predicate.test("Javascript"));
		
		Predicate<String> predicate2= new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.contains("java");
			}
		};
		System.out.println(predicate2.test("Javascript"));
		
		PredicateTest pt = new PredicateTest();
		pt.printSome(new IntPredicate() {
			
			@Override
			public boolean test(int num) {
				return num%3 == 0;
			}
		});
		
		pt.printSome(num -> num%3 == 0);
		pt.printSome(num -> num > 5);
		
	}
}

class PredicateTest {
	int[] nums = {1,2,3,4,5,6,7,8,9,10};
	
	public void printSome(IntPredicate pred) {
		for (int num : nums) {
			if(pred.test(num)) {
				System.out.println(num+"\t");
			}
		}
	}
}