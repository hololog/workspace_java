package collection;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
//		♠♥♣◆
		
		
		String[] marks = {"♠","♥","♣","◆"};
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9","J", "Q","K"};
		
		List cards = new ArrayList();

		for (String o : marks) {
			for (String n : numbers) {
				cards.add(o+n);
			}
		}
		System.out.println(cards);
		
		Collections.shuffle(cards);
		System.out.println(cards);
		
		System.out.println("------------------------------");
		
		String[] p1 = new String[5]; 
		String[] p2 = new String[5]; 
		String[] p3 = new String[5];
		
		for (int i=0;i<p1.length;i++) {
			p1[i] = cards.remove(0).toString();
			p2[i] = cards.remove(0).toString();
			p3[i] = cards.remove(0).toString();
		}
		System.out.println(Arrays.toString(p1));
		System.out.println(Arrays.toString(p2));
		System.out.println(Arrays.toString(p3));
		System.out.println(cards);
		
		
	}
}























