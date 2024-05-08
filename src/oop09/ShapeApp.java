
package oop09;

public class ShapeApp {
	public static void main(String[] args) {		
		System.out.println("This program uses a Spale");
		Circle circ = new Circle(10, 4, 6);
		printCircle(circ);

		Rectangle rect = new Rectangle(10, 56, 4, 6);
		printRectangle(rect);

		Square square = new Square(10, 4, 6);
		printRectangle(square);

		
		System.out.println("Number of circles: "+ Circle.getCount());
		System.out.println("Number of rectangle: "+ Rectangle.getCount());
		System.out.println("Number of squares: "+ Square.getCount());
		System.out.println("Number of Shapes: " + Shape.getCount());
	}

	private static void printCircle(Circle circ1) {
		System.out.println("Radius: " + circ1.getRadius());
		System.out.println("X: " + circ1.getX());
		System.out.println("Y: " + circ1.getY());
		System.out.println("Area: " + circ1.getArea());
		System.out.println("Perimeter: " + circ1.getPerimeter());
	}

	private static void printRectangle(Rectangle rect1) {
		System.out.println("Height: " + rect1.getHeight());
		System.out.println("Width: " + rect1.getWidth());
		System.out.println("X: " + rect1.getX());
		System.out.println("Y: " + rect1.getY());
		System.out.println("Area: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());
	}
}

