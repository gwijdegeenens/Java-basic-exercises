package oop09;

public class Rectangle extends Shape {
   public static final int ANGLES = 4;
   private static int count = 0;
   private int width;
   private int height;

   public Rectangle() {
      this(0,0,0,0);
   }
   
   public Rectangle(int width, int height) {
      this(width,height,0,0);
   }

   public Rectangle(int width, int height, int x, int y) {
      super(x, y);
      this.height = height;
      this.width = width;
      count++;
   }
   
   public Rectangle(Rectangle rect) {
      this(rect.width,rect.height,rect.getX(),rect.getY());
   }
      
   public void setWidth(int width) {
      this.width = (width < 0) ? -width : width;
   }

   public int getWidth() {
      return width;
   }

   public void setHeight(int height) {
      this.height = (height < 0) ? -height : height;
   }

   public int getHeight() {
      return height;
   }

   public void grow(int d) {
      width += d;
      height += d;
      if (width < 0) {
         width = 0;
      }
      if (height < 0) {
         height = 0;
      }
   }
   
   public double getArea() {
      return width * height;
   }

   public double getPerimeter() {
      return (width + height) * 2;
   }
   
   public static int getCount() {
      return count;
   }

}
