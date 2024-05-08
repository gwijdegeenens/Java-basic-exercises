package oop10;

public abstract class Shape implements Scalable {

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
