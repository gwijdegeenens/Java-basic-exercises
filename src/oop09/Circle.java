package oop09;

public class Circle extends Shape {
   public static final int ANGLES = 0;
   private static int count = 0;
   private int radius;

   public Circle() {
      this(0, 0, 0);
   }

   public Circle(int radius) {
      this(radius, 0, 0);
   }

   public Circle(int radius, int x, int y) {
      super(x, y);
      this.radius = radius;
      count++;
   }

   public Circle(Circle circ) {
      this(circ.radius, circ.getX(), circ.getY());
   }

   public void setRadius(int radius) {
      this.radius = (radius < 0) ? -radius : radius;
   }

   public int getRadius() {
      return radius;
   }

   public void grow(int dr) {
      radius += dr;
      if (radius < 0) {
         radius = 0;
      }
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }

   public static int getCount() {
      return count;
   }
}