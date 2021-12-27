package method;

class AbsNum {
//절대값 리턴하는 메서드 정의
	public int abs(int num) {
		return (num < 0)? -num : num;
	}
	
	public double abs(double num) {
		return (num < 0)? -num : num;
	}
	
	public long abs(long num) {
		return (num < 0)? -num : num;
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 메서도 오버로딩 (다중정의)
		 *  - 동일한 이름의 매개변수가 다른 매서들ㄹ 여려개저의하는 것
		 *  - 동일한 이름으로 서로 다른 파라미터를 전달받아 다른 작어을 처리하도록 하는것
		 *  - 규칙1, 매서드명은 동일
		 *    규칙2, 매개변수의 타입이나 갯수가 달라야함
 		 *    규칙3. 리턴다입이 다른 것은 오버로딩과 무관함
 		 *    규칙4. 매개변수의 변수명만 다른것은 오버로딩과 무관함
		 *     => 즉 메서드 호출 시점에서 전달되는 데이터에 따라 가가 다른 메서드를 호출하도록 구분되어야함
		 */
		
		
		
	}
}
