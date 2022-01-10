package polymorphism;

public class Ex3 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.draw();
		s1=new Circle();
		s1.draw();
		
		Shape[] s = new Shape[3];
		
		polymorphism(s1);
	}
	
	public static void polymorphism(Shape s) {
		//
		if(s instanceof Circle) {
			System.out.println("circle객체");
			Circle c = (Circle)s;
		} else if(s instanceof Rectangle) {
			System.out.println("rectangle객체");
			Rectangle r = (Rectangle)s;
		} else if(s instanceof Triangle) {
			System.out.println("triangle객체");
			Triangle t = (Triangle) s;
		}
	}
}

class Shape {
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
	
}

