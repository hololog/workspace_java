package collection;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		List list = new ArrayList(Arrays.asList(1,2,3,4,5));
		Set set = new HashSet(list);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		
		
	
	}
	public static void printElements (Collection c) {
		Iterator iterator= c.iterator;
		
	}

}
