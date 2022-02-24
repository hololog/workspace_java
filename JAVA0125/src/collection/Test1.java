package collection;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		
		int witCount = 0;
		Set<Integer> myLotto = new TreeSet<>();
		
		Random r = new Random();
		
		while(myLotto.size()<6) {
			myLotto.add(r.nextInt(45)+1);
		}
		
//		while(myLotto.size()<6) {
//			myLotto.add((int) (Math.random()*45+1));
//		}
		
		System.out.println(myLotto.toString());
		System.out.println("-------------------------");
		
		Set<Integer> thisWeekLotto = new TreeSet<>();
		
		thisWeekLotto.add(3);
		thisWeekLotto.add(7);
		thisWeekLotto.add(12);
		thisWeekLotto.add(21);
		thisWeekLotto.add(33);
		thisWeekLotto.add(40);
		System.out.println(thisWeekLotto);
		System.out.println("-------------------------");

		
		int count = 0;
		for(int a : myLotto) {
			if(thisWeekLotto.contains(a)) {
				System.out.println(a);
				count++;
			}
		}
		System.out.println(count);
		
		switch (count) {
		case 6: System.out.println("1등"); break;
		case 5: System.out.println("2등"); break;
		case 4: System.out.println("3등"); break;
		case 3: System.out.println("4등"); break;
		default: System.out.println("꼴등"); break;
		}
		
		witCount++;
		System.out.println("---------------------------------------------");
	}
}
