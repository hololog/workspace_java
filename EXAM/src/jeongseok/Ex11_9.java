package jeongseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ex11_9 {
	public static void calculateClassRank(List list) {
		Collections.sort(list, new ClassTotalComparator());
		
		int preBan = -1;
		int preRank = -1;
		int preTotal = -1;
		int length = list.size();
		
		for (int i=0; i<length; i++) {
			
			Student s = (Student)list.get(i);
			if(s.ban!=preBan) {
				preRank = -1;
				preTotal = -1;
			} else if(total)
		}
		
	}
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int preRank = -1;
		int preTotal = -1;
		int length = list.size();
		
		for (int i = 0; i < length; i++) {
			Student s = (Student) list.get(i);
			
			if(s.total==preTotal) {
				s.schoolRank = preRank;
			} else {
				s.schoolRank = i+1;
			}
			preRank = s.schoolRank;
			preTotal = s.total;
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바", 2,1,70,90,70));
		list.add(new Student("안자바", 2,2,60,100,80));
		list.add(new Student("홍길동", 1,3,100,100,100));
		list.add(new Student("남궁성", 1,1,90,70,80));
		list.add(new Student("김자바", 1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}


class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.classRank - s2.classRank; 
		} else {
			return -1;
		}
	}
}








































