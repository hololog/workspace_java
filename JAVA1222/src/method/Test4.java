package method;

class Calculator2 {
	
	public void calc(char opr, int...nums) {
		int result = nums[0];
		
		System.out.print(nums[0]);
		
		if(opr == '+') {
			for (int i=1; i<nums.length; i++) {
				
				result += nums[i];
				System.out.print(" + " + nums[i]);
				
			}
		} else if(opr == '-') {
			for (int i=1; i<nums.length; i++) {
				
				result -= nums[i];
				System.out.print(" - " + nums[i]);
				
			}
		} else if(opr == '*') {
			for (int i=1; i<nums.length; i++) {
				
				result *= nums[i];
				System.out.print(" * " + nums[i]);
				
			}
		} else if(opr == '/') {
			for (int i=1; i<nums.length; i++) {
				
				result /= nums[i];
				System.out.print(" / " + nums[i]);
				
			}
		}
		
		System.out.println(" = " + result);
	}
}

public class Test4 {
	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		
		cal.calc('+', 10, 20);
		cal.calc('+', 10, 20, 30);
		cal.calc('+', 10, 20, 30, 40);
		System.out.println("========================");
		cal.calc('-', 10, 20);
		cal.calc('-', 10, 20, 30);
		cal.calc('-', 10, 20, 30, 40);
		System.out.println("========================");
		cal.calc('*', 10, 20);
		cal.calc('*', 10, 20, 30);
		cal.calc('*', 10, 20, 30, 40);
		System.out.println("========================");
		cal.calc('/', 100, 10);
		cal.calc('/', 100, 10, 2);
		cal.calc('/', 100, 10, 2, 2);
		System.out.println("========================");
		
	}
}
