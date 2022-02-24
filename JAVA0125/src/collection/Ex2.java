package collection;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add("one");
		list.add(2);
		list.add(3.14);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println("--------------------");
		
		list.add(3.14);
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println("--------------------");

//		System.out.println(list.remove((Object)2));
//		System.out.println(list.toString());
	
		List subList = list.subList(2, 3);
		System.out.println(subList.toString());
		
		list.toArray();
		
		list.add(2);
		System.out.println(list.toString());
		System.out.println(list.lastIndexOf(2));
		System.out.println("--------------------");
		
		List arrayList= Arrays.asList(1,2,3,4,5,6);
		System.out.println(arrayList);
		int[] iArr = {1,2,3,5,6};
		List arrayList2= Arrays.asList(Arrays.toString(iArr));
		System.out.println(arrayList2);
		Integer[] iArr2 = {1,2,3,5,6};
		List arrayList3= Arrays.asList(iArr2);
		System.out.println(arrayList3);
		
		System.out.println("-----------------");
		
		List list3 = new ArrayList();
		list3.add(5);
		list3.add(3);
		list3.add(7);
		list3.add(1);
		list3.add(100);
		list3.add(3);
		list3.add(14);
		list3.add(0);
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		
	}
}

























