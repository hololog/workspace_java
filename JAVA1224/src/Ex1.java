
class Num{
	int x; //기본형
	int y;
}

class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print() {
		System.out.println(year+"-"+month+"-"+day);
	}
}

class PassValue {
	
	public void changeValue(int x) {
		System.out.println("changeValue 변경전 x"+ x);
		x = 999;
		System.out.println("changeValue 변경후 x"+ x);
	}
	
	public void changeReference(Num num) {
		System.out.println("cahngeReference 변경전 num"+ num);
		num.x = 999;
		System.out.println("cahngeReference 변경후 num"+ num);
	}
}

public class Ex1 {
	public static void main(String[] args) {
//		 기본형 변수와 참조형 변수의 차이 
//		 - 기본형 변수는 실제값(리터럴)을 저장하며
//		   참조형 변수는 실제값이 저장된 인스턴스의 조소값(참조값=레퍼런스)을 저장
//		 기본형 변수와 참조형 변수의 값을 복사(전달) 할때 차이점
//		 1. 기본형 변수의 값을 복사할 경우
//		    - 변수에 저장되 실제 값을 복사 = pass by value
//		    - 실제 값을 복사하게 되면 원본 값과 동일한 값이 별도로 생성되어 전달되므로
//		      복사된 값을 변경하더라도 원본 값과 상관이 없기 때문에 우너본값은 변경되지 않는다.
//		 2. 참조형 변수의 값을 복사할 경우
//		    - 변수에 저장되 ㄴ인스턴스 주소값을 복사 (전달) = PASS by reference
//		    - 주소값을 복사하게 되면 원본값에 저장된 주소와 동일한 주소가 전달되므로 
//		      실제 인스턴스 하나를 함께 공유하게 된다.
//		      따라서 한쪽에서 인스턴스에 접근하여 저장된 값을 변경할 경우 
//		      동일한 주소값을 참조하는 쪽에도 영향을 받게 된다.
		
		
		int x = 10;
		int y = x;
		System.out.println(x+","+y);
		
		y = 99; // 
		System.out.println(x+","+y);		
		System.out.println("-------------------");
		
		Num n = new Num();
		
		n.x = 10;
		n.y = n.x; //인스턴스내의 기본형변수의 !값의 복사!가 일어남
		System.out.println(n.x+","+n.y);
		
		n.y = 99;
		System.out.println(n.x+","+n.y);
		  //인스턴스 내에 있는 기본형 변수의 값을 변경하더라도 원본 데이터 기본형 변수x 의 값은 변경되지 않음
		System.out.println("-------------------");
		Num n2 = new Num();
		
		n2.x = 10;
		n2.y = 10;
		
		Num n3 = n2;  //Num타입 참조형 변수 n3에 참조형 변수 n2의 !주소값!을 복사
		
		System.out.println(n2.x+","+n2.y);
		System.out.println(n3.x+","+n3.y);

		n3.y = 99;
		System.out.println(n2.x+","+n2.y);
		System.out.println(n3.x+","+n3.y);
		//한쪽에서 인스턴스 변수값을 변경하면 다른쪽의 인스턴스도 동일하므로 똑같이 변경되 사항이 적용됨
		System.out.println("-------변경 전-----------");
		
		MyDate d1 = new MyDate(2021, 12, 24);
		d1.print();
		
		MyDate d2 = d1;
		d2.print();
		System.out.println("-------변경 후-----------");
		
		d2.year = 1999;
		d1.print();
		d2.print();

		
		System.out.println("=====================================");
		
		
		PassValue pv = new PassValue();
		
		int xNum = 10;
		System.out.println("changeValue 메소드 호출전"+x);
		pv.changeValue(xNum);
		System.out.println("changeValue 메소드 호출후"+x);
		
		System.out.println("=====================================");
		
		Num num = new Num();
		num.x = 10;
		
		pv.changeReference(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
