package Lambda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Ex5 {
	public static void main(String[] args) {
		UnaryOperator<Double> op1 = x -> Math.pow(x, 2);
		
		UnaryOperator<Double> op2 = new UnaryOperator<Double>() {

			@Override
			public Double apply(Double x) {
				return Math.pow(x, 2);
			}
			
		};
		
		System.out.println(op1.apply(10.0));
		
		DoubleBinaryOperator op3 = new DoubleBinaryOperator() {
			
			@Override
			public double applyAsDouble(double x, double y) {
				return Math.pow(x, y);
			}
		};
		
		DoubleBinaryOperator op4 = (x, y) -> Math.pow(x, y);
	}
}
