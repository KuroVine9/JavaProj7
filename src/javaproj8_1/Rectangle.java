package javaproj8_1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        setWidth(width);
        setHeight(height);
    }

    public String toString() {
        return String.format("P: (%d, %d) S: %d x %d", super.getX(), super.getY(), width, height);
    }

    public void display() {
        System.out.printf("%s\n", toString());
    }

    public boolean equals(Object o) { // equals 재정의
        if (o == this)
            return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return rectangle.x == x && rectangle.y == y && width == rectangle.width && height == rectangle.height;
    }

    public void set(int x, int y, int width, int height) {
        super.setX(x);
        super.setY(y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
