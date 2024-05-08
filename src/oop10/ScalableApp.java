package oop10;

public class ScalableApp {
	public static void main(String[] args) {		
		System.out.println("This program uses a Spale");
		Scalable scalable1 = new Circle(10, 4, 6);
		System.out.println("Circle area before grow " + scalable1.getArea());
		System.out.println("Circle perimeter before grow " + scalable1.getPerimeter());
		Scalable scalable2 = new Rectangle(10, 56, 4, 6);
		System.out.println("Rectangle area before grow " + scalable2.getArea());
		System.out.println("Rectangle perimeter before grow " + scalable2.getPerimeter());
		Scalable scalable3 = new Square(10, 4, 6);
		System.out.println("Square area before grow " + scalable3.getArea());
		System.out.println("Square perimeter before grow " + scalable3.getPerimeter());

		scalable1.grow(Scalable.PCT_200);
		scalable2.grow(Scalable.PCT_200);
		scalable3.grow(Scalable.PCT_200);

		System.out.println("Circle area after grow " + scalable1.getArea());
		System.out.println("Circle perimeter after grow " + scalable1.getPerimeter());
		System.out.println("Rectangle area after grow " + scalable2.getArea());
		System.out.println("Rectangle perimeter after grow " + scalable2.getPerimeter());
		System.out.println("Square area after grow " + scalable3.getArea());
		System.out.println("Square perimeter after grow " + scalable3.getPerimeter());

		System.out.println("Number of circles: "+ Circle.getCount());
		System.out.println("Number of rectangle: "+ Rectangle.getCount());
		System.out.println("Number of squares: "+ Square.getCount());
		System.out.println("Number of Shapes: " + Shape.getCount());
	}

}

