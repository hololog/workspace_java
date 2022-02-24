package jeongseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex11_8 {
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int preRank = -1;
		int preTotal = -1;
		int length = list.size();
		
		/*
		(2) . 아래의 로직에 맞게 코드를 작성하시오
		1. list Student . 반복문을 이용해서 에 저장된 객체를 하나씩 읽는다
		
		1.1  총점 (total)이 이전총점 (prevTotal) 과 같으면
		이전 등수(prevRank) 를 등수(schoolRank) 로 한다   .
		
		1.2 , 총점이 서로 다르면
		등수(schoolRank) 의 값을 알맞게 계산해서 저장한다  .
		이전에 동점자 였다면 그 다음 등수는 동점자의 수를 고려해야 한다 , .
		
		(실행결과 참고 ) 
		1.3   현재 총점과 등수를 이전총점(prevTotal) 과 이전등수 에 (prevRank)
		저장한다.
		*/
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
		list.add(new Student1("이자바",2,1,70,90,70)); 
		list.add(new Student1("안자바",2,2,60,100,80)); 
		list.add(new Student1("홍길동",1,3,100,100,100)); 
		list.add(new Student1("남궁성",1,1,90,70,80)); 
		list.add(new Student1("김자바",1,2,80,80,90)); 
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());

	}
}
