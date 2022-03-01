import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test_220225_김성기_문제2 {
	public static void main(String[] args) {
		
		//1
		Random random = new Random();
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		while(myLotto.size() < 6) {
			myLotto.add(random.nextInt(45)+1);
		}
		
		//2
		ArrayList<Integer> thisWeekLotto = new ArrayList<Integer>(Arrays.asList(35,21,29,10,3,44));
		Collections.sort(thisWeekLotto);
		
		//3
		int count = 0;
		for (Integer n : thisWeekLotto) {
			if(myLotto.contains(n)) count++;
		}
		
		String result = "";
		switch (count) {
		case 0:
		case 1:
		case 2: 
		case 3: result = "꽝" ; break;
		case 4: result = "3등 당첨" ; break;
		case 5: result = "2등 당첨" ; break;
		case 6: result = "1등 당첨" ; break;
		}
		
		String thisWeekNum = "1등 번호 : ";
		for (Integer n : thisWeekLotto) {
			thisWeekNum += n + ", "; 
		}
		String myNum = "내 번호 : ";
		for (Integer n : myLotto) {
			myNum += n + ", "; 
		}
		System.out.println(myNum);
		System.out.println(thisWeekNum);
		System.out.println("일치 개수 : " + count + "개 (결과 : " + result + ")");
	}
}
