package array;

public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 배열사용시 주의사항
		 * 1. []는 변수명 뒤에 올수도 있으나 주로 타입명 뒤로 위치
		 * 2. 배열크기를 확장시 새배열 생성후 복사해야함 
		 * 
		 * 향상된 for문
		 */
		
		int[] a;
		int b[];
		
		int[] c, d;
		int e, f[]; //참조변수 f만 배열 선언
		
		int[] arr = {10, 20,30};
		int[] arr2 = new int[4];//새배열 생성
		
		for(int i=0; i<arr.length; i++) { //반복문을 이용한 복사
			arr2[i] = arr[i];
			System.out.println(arr2[i]);
		}
		
		arr2[3] = 40;
		System.out.println(arr2[3]);
		
		System.out.println("-------------------");
		
		int aNum = 10;
		int bNum = 30;
		bNum = aNum;  //데이터를 저장 기존 30은 제거됨
		
		int[] aArr = {1,2,3};
		int[] bArr = {4,5,6};
		int[] cArr = {7,8,9};
		
		aArr = bArr; //bArr에 저장된 주소값을 aArr에 저장, 
		             //기존에 aArr이 가르키던 메모리공간은 참조하는 변수가 없으므로 가비지컬렉터가 자동제거함
		bArr = cArr;
			
		System.out.println("-------------------");

		
		
		
	}
}
