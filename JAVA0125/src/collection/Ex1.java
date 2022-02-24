package collection;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
//		HashSet set = new HashSet();
		Set set = new HashSet();
//		Collection set = new HashSet();
		
		 System.out.println("set비어있나? " + set.isEmpty());
		 System.out.println("set의 크기는? " + set.size());
		 System.out.println("set 객체의 모든 요수 문자열로 " + set.toString());
		 
		 set.add(1);
		 set.add(3.14);
		 set.add(10);
		 set.add(2);
		 System.out.println("추가성고? "+ set.add(1));
		 System.out.println("set비어있나? " + set.isEmpty());
		 System.out.println("set의 크기는? " + set.size());
		 System.out.println("set 객체의 모든 요수 문자열로 " + set);
		
		 System.out.println("------------------------------------------");
		 System.out.println("Set객체의 3.14가 포함되는가?"+ set.contains(3.14));
		 
		 System.out.println(set.remove(3.14));
		 System.out.println(set.remove(3.14));
		 System.out.println("set 객체의 모든 요수 문자열로 " + set);
		 
		 Object[] obj = set.toArray();
		 System.out.println(Arrays.toString(obj));
		 
		 Set set2 = new HashSet();
		 set2.add(1);
		 set2.add(9);
		 set2.add(11);
		 set2.add(15);
		 System.out.println(set2.toString());
		 set2.addAll(set);
		 System.out.println(set2.toString());
		 
		 Set<Integer> set3 = new HashSet<>();
		 
		 set2.clear();
		 System.out.println(set2);
		 
		 set3 = new HashSet(set);
		 System.out.println(set3);
		 
		 System.out.println(set==set3);
		 System.out.println(set.equals(set3));

		 System.out.println("==================================");
		 Set set4 = new HashSet<>();
		 
		 set4.add(100);
		 set4.add(99);
		 set4.add(50);
		 set4.add(2);
		 set4.add(999);
		 set4.add(35);
	
		 System.out.println(set4);
		 
		 Set<Integer> set5 = new TreeSet<>(set4);
		 System.out.println(set5);
		 
		 System.out.println("==================================");
		 
		 
		 for(Object o : set5)
			 System.out.println(o);
		 
		 
		 Iterator it=set5.iterator();		
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
	}
}












































































