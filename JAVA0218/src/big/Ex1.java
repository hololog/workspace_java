package big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		Integer i = 10;
		
//		BigInteger bi = 10;
		BigInteger bi = new BigInteger("9999999999999999999999999999");
		
		System.out.println(bi.toString());
		
		int num = bi.intValue();
		
		System.out.println(num);
		
		BigInteger bi2 = new BigInteger("55555555555555555555");
		
		//연산
		System.out.println(bi.add(bi2));
		System.out.println(bi.subtract(bi2));
		System.out.println(bi.multiply(bi2));
		System.out.println(bi.divide(bi2));
		System.out.println(Arrays.toString(bi.divideAndRemainder(bi2)));
		System.out.println(bi.remainder(bi2));
		System.out.println(bi.mod(bi2));
		
		System.out.println("======================");
		
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1-d2);//정확도가 낮음
		
//		BigDecimal bc1 = new BigDecimal(2.0);
	//	BigDecimal bc2 = new BigDecimal(1.1);
		BigDecimal bc1 = new BigDecimal("2.0");
		BigDecimal bc2 = new BigDecimal("1.1");
		
		System.out.println(bc1);
		System.out.println(bc2);
		
		System.out.println(bc1.subtract(bc2));
		
		
		double d3 = 1.1;
//		BigDecimal bc3 = new BigDecimal(d3 + "");
//		BigDecimal bc3 = new BigDecimal(Double.toString(d3));
		BigDecimal bc3 = new BigDecimal(String.valueOf(d3));;
		
		System.out.println(d3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
