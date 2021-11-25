class Shape{
	void area() {
		System.out.println("All shapes have area");
	}
	void dimension() {
		System.out.println("All shapes are 2D(Dimension)");
	}
}

class Circle extends Shape {
	void circumference() {
		System.out.println("Circle has Circumference");
	}
}

class Rectangle extends Shape{
	void allSide() {
		System.out.println("All sides of Rectangle are not equal");
	}
}

class Square extends Shape{
	void allSidequal() {
		System.out.println("All sides of Square are equal");
	}
}

class ShapeObj{
	static void callShape(Shape shape){
		shape.area();
		shape.dimension();
		if (shape instanceof Circle) {
			((Circle) shape).circumference();
		}else if(shape instanceof Rectangle) {
			((Rectangle) shape).allSide();
		}else if(shape instanceof Square) {
			((Square) shape).allSidequal();
		}
		System.out.println("*************************************");
	}
}
public class ISA_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeObj.callShape(new Circle());
		ShapeObj.callShape(new Rectangle());
		ShapeObj.callShape(new Square());
	}

}
