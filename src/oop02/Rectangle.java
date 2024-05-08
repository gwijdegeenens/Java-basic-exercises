package oop02;

public class Rectangle {
	public int width;
	public int height;
	public int x;
	public int y;

	public void setX(int x) {
      this.x = x;
   }
   
   public void setY(int y) {
      this.y = y;
   }
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
		
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public void grow(int d) {
		width+=d;
		height+=d;
	}	
}
