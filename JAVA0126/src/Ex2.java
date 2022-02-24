import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.util.regex 패키지의 클래스를 활용하여 "정규표현식" 활용 가능 
		 * 
		 * 1. Pettern 클래스
		 * - 정규표현식에 사용되는 패턴 문자열을 객체로 관리하는 클래스
		 * - compile() 메서드를 사용하여 정규표현식 패턴 문자열을 갖는 객체 생성
		 *   matches() 메서드를 사용하여 특정 문자열을 대상으로 정규표현식 패턴 검사
		 * 
		 * */
		
		// 정규표현식으로 사용할 패턴 문자열 작성
		// => 주의! 패턴에 사용되는 \ 기호 사용 시 문자열 내에서 이스케이프 문자로 인식되므로
		//    반드시 \\ 형태로 사용해야만 패턴 문자열로 인식 됨
		
		// 1. 전화번호(휴대폰) 형식 검증
		//		1) ^(010|011) : 010 또는 011로 시작
		//      2) [-\\s] : - 기호 또는 공백이 포함될 수도 있고, 포함되지 않을 수도 있음
		//		3) \d{3,4} : 숫자 3자리 또는 4자리
		//		4) \d{4}$ : 숫자 4자리로 끝
		String regex1 = "^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
		
//		String phone = "019-1234-5678";	// 검사에 사용할 문자열
		// Pattern 클래스의 static 메서드인 matches() 메서드를 호출하여 검사 수행
		// 파라미터로 정규 표현식 패턴 문자열과 검사할 문자열 전달 => 리턴타입 : boolean
//		boolean result = Pattern.matches(regex, phone);
//		System.out.println(phone + " 번호는 유효한 전화번호인가? " + result);
		
		String[] phoneNumbers = {
				"010-1234-5678", "010-1234-56789", "010-1234 5678", "01012345678",
				"010-1234-567a", "010)1234-5678"
		};
		
		for(String phone : phoneNumbers) {
			boolean result = Pattern.matches(regex1, phone);
			System.out.println(phone + " 번호는 유효한 전화번호 인가? " + result);
		}
		
		
		/*
		 * 2. Matcher 클래스
		 * - 정규표현식에 해당하는 패턴 해석 및 문자열 일치 여부 파악
		 * - Pattern 클래스는 문자열 전체에 대한 검증만 수행하지만,
		 *   Matcher 클래스는 부분 검증도 가능
		 * - Pattern 클래스의 compile() 메서드를 통해 Pattern 객체를 생성하고
		 *   matcher() 메서드를 호출하여 Matcher 타입 객체 리턴 받아 사용 가능
		 *   
		 * < 메서드 >
		 * 1) matches() : 원본 문자열이 정규표현식과 일치하는지 판별(전체 일치 검사)
		 * 2) lookingAt() : 원본 문자열 시작이 정규표현식과 일치하는지 판별(시작 일치 검사)
		 * 3) find() : 원본 문자열 내에 정규표현식이 포함되는지 판별(부분 일치 검사)
		 * 4) reset() : Matcher 객체 정보를 리셋하여 인덱스 번호를 0으로 초기화
		 * => 주의! 2번, 3번 메서드 수행 후에는 검사에 사용되는 인덱스 번호가
		 *    검사에 사용된 부분 이후로 변경되므로 다른 검사 수행시 영향이 있을 수 있다!
		 *    따라서, reset() 메서드를 통해 인덱스를 초기화한 후 다른작업을 수행하는 것이 좋다
		 *    또는, find() 메서듸 경우 파라미터로 시작인덱스 지정이 가능하므로
		 *    find(0) 형태로 0번 인덱스부터 검사를 수행하도록 설정할 수도 있음    
		 * ------------------------------------------------------------    
		 * 
		 * 
		 * */
		String source = "Java and Javascript has no relation";	// 검사할 문자열
		String regex = "Java";	// 패턴 문자열
		
		// 1. 정규표현식 패턴 문자열을 Pattern 객체로 변환(생성)
		Pattern pattern = Pattern.compile(regex);
		
		// 2. 정규표현식이 포함된 Pattern 객체의 matcher() 메서드를 호출하여
		//    원본 문자열을 파라미터로 전달한 뒤 Matcher 타입 객체 리턴 받음
		Matcher matcher = pattern.matcher(source);
		
		// 3. Matcher 객체의 다양한 메서드를 통해 정규표현식 검사 수행
		System.out.println("문자열이 정규표현식에 완전히 부합되는가? " + matcher.matches());
		// => 정규 표현식 "JAVA"는 원본 문자열과 완전히 일치하지 않으므로 false 리턴됨
		System.out.println("문자열이 정규표현식으로 시작되는가? " + matcher.lookingAt());
		// => 정규 표현식 "JAVA" 문자열이 원본 문자열 시작과 같으므로 true 리턴됨
		
		// 주의사항!
		// 만약, lookingAt() 메서드 등을 사용하여 부분 검색 수행 후에는
		// 시작 인덱스 번호가 변경되므로 인덱스 리셋 필요함 => reset() 메서드 호출 필요
//		matcher.reset();
		System.out.println("문자열이 정규표현식을 포함하는가? " + matcher.find());
		// => 0번 인덱스부터 검사하므로 "JAVA" 문자열 포함되어 true리턴됨
		System.out.println("문자열이 정규표현식을 포함하는가? " + matcher.find());
		// => 이미 앞에서 "JAVA" 문자열을 검사했으므로 해당 위치 뒷부분부터 검사됨
		//    따라서, 뒷부분 문자열에 "JAVA" 가 존재하지 않으므로 false리턴됨
		
		System.out.println("문자열이 정규표현식을 포함하는가? " + matcher.find(0));
		
		
		
		
		
		
		
	}

}
