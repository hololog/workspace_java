package jeongseok;

class Student implements Comparable {
	String name;
	int ban, no, kor, eng, math, total, schoolRank, classRank;
	
	public Student(String name, int ban, int no, int kor, int ent, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = ent;
		this.math = math;
		
		total = kor + ent + math;
	}

	int getTotal() {
		return total;
	}
	
	double getAvg() {
		return (int)(getTotal()/3.0*10+0.5)/10.0;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student) o;
			return s.total - this.total;
		} else {
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return name+","+ ban+","+ no+","+ kor+","+ eng+","+ math+","
	           +getTotal()+","+getAvg()+","+classRank;
	}
		
}