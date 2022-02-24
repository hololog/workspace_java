package Generic;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add(1);
		list.add("TWO");
		list.add(3.14);
		
		for (int i=0; i<list.size(); i++) { //object 타입
//			int data = list.get(i); //컴파일 에러
//			int data = (int) list.get(i); //런타입 에러
//			System.out.println(data);
			
			Object data = list.get(i);
			System.out.println(data.toString());
			
			if(data instanceof Integer) {
				int iData = (int)data;
				System.out.println(iData);
			}
			else if(data instanceof String) {
				String strData = (String)data;
				System.out.println(strData);
			}
			else if(data instanceof Double) {
				Double dData = (Double)data;
				System.out.println(dData);
			}
		}
		System.out.println("========================================");
	
		List<Integer> list2 = new ArrayList<Integer>();
	
		list2.add(1);
		list2.add(2);
		list2.add(3);
//		list2.add("TWO");
//		list2.add(3.14);
		
		for(int i=0; i<list2.size();i++) {
			int data = list2.get(i);
			System.out.println(data);
		}
		
		for(int data : list2) {
			System.out.println(data);
		}
	
		System.out.println("========================================");
		
		List<String> list3 = new ArrayList<String>();
		
		list3.add("홍길동");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "홍길동");
		
		
	}
}
























