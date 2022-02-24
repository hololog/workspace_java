package jeongseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student1 && o2 instanceof Student1) {
			Student1 a = (Student1) o1;
			Student1 b = (Student1) o2;
			
			int result = a.ban - b.ban;
			
			if(result==0) 
				return a.no - b.no;
			
			return result;
		}
		return -1;
		
	}
}

public class Ex11_7 {
		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			list.add(new Student1("이자바", 2,1,70,90,70));
			list.add(new Student1("안자바", 2,2,60,100,80));
			list.add(new Student1("홍길동", 1,3,100,100,100));
			list.add(new Student1("남궁성", 1,1,90,70,80));
			list.add(new Student1("김자바", 1,2,80,80,90));
			
			Collections.sort(list, new BanNoAscending());
			
			Iterator it = list.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
}
