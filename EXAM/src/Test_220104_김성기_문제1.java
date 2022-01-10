
public class Test_220104_김성기_문제1 {
	public static void main(String[] args) {
		int pee = 50000;
		int age = 22;
		
		if(age < 5 || age > 65) {
			pee *= 0.5;
		} else if(age >= 5 && age <= 19) {
			pee *= 0.7;
		} 
//		else {
//			pee = 50000;
//		}
		
		System.out.printf("나이가 %d세이므로 입장료는 %d원 입니다.", age, pee);
	}
}
