package jeongseok;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student1 implements Comparable {
	String name;
	int ban, no, kor, ent, math, total, schoolRank;
	
	public Student1(String name, int ban, int no, int kor, int ent, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.ent = ent;
		this.math = math;
		
		total = kor + ent + math;
	}

	int getTotal() {
//		return kor + ent + math;
		return total;
	}
	
	double getAvg() {
		return (int)(getTotal()/3.0*10+0.5)/10.0;
	}
	
	public String toString() {
		return name+","+ ban+","+ no+","+ kor+","+ ent+","+ math+","+getTotal()+","+getAvg();
	}
	//기본정렬
//	public int compareTo(Object o) {
//		if(o instanceof Student1) {
//			Student1 tmp = (Student1)o;
//			return this.name.compareTo(tmp.name);
//		} else {
//			return -1;
//		}
//	}
	
	//총점시준 내림차순 정렬
	public int compareTo(Object o) {
		//총점 접근
		if(o instanceof Student1) {
			Student1 tmp = (Student1)o;
			return tmp.total - this.total;
		}
		
		return -1;
	}
	
	
} //class Student

public class Ex11_6 {
	static int getGroupCount (TreeSet test, int from, int to) {
		Student1 s1 = new Student1("", 0, 0, from, from, from);
		Student1 s2 = new Student1("", 0, 0, to, to, to);
		
		return test.subSet(s1, s2).size();
	}
	
	public static void main(String[] args) {
		/* 학생들의 평균을 기준으로 정렬하도록 compare()과 
		 * 평균전ㅁ수의 버위를 주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라
		 */
		Comparator com = new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student1 && o2 instanceof Student1) {
					Student1 a = (Student1) o1;
					Student1 b = (Student1) o2;
					return (int)(a.getAvg() - b.getAvg());
				} else {
					return -1;
				}
			}//compare 메서드
		};
		TreeSet set = new TreeSet(com);
		
		set.add(new Student1("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student1("남궁성", 1, 2,  90,  70,  80));
		set.add(new Student1("김자바", 1, 3,  80,  80,  90));
		set.add(new Student1("이자바", 1, 4,  70,  90,  70));
		set.add(new Student1("아자바", 1, 5,  60, 100,  80));
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
		
	}//end main
}
