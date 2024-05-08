package oop09;

public abstract class Shape {

    private static int count = 0;
    private int x;
    private int y;

    public Shape() {
        this(0, 0);
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getCount() {
        return count;
    }
}
