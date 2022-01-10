package jeongseok;

import java.util.ArrayList;

public class Ex11_1 {
	public static void main(String[] args) {
		//교집합 차집합 합집합
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList hap = new ArrayList();
		ArrayList cha = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		
//		for (int i=0; i<list2.size(); i++) {
//			if(!hap.contains(list2.get(i))) {
//				hap.add(list2.get(i));
//			}
//		}	
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
		
	}
}
