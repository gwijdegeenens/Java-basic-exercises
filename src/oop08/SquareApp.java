package oop08;


public class SquareApp {
   public static void main(String[] args) {
      System.out.println("This program uses a Square");
      Square square1 = new Square();
      Square square2 = new Square(5);
      Square square3 = new Square(10, 4, 6);
      Square square4 = new Square(square3);

      square1.setWidth(-5);
      square1.setHeight(7);
      square1.setPosition(10, 20);
      square1.grow(5);

      printSquare(square1);
      printSquare(square2);
      printSquare(square3);
      printSquare(square4);

      System.out.println("Number of Squares: " + Square.getCount());
   }

   private static void printSquare(Square square1) {
      System.out.println("Height: " + square1.getHeight());
      System.out.println("Width: " + square1.getWidth());
      System.out.println("X: " + square1.getX());
      System.out.println("Y: " + square1.getY());
      System.out.println("Area: " + square1.getArea());
      System.out.println("Perimeter: " + square1.getPerimeter());
   }
}
