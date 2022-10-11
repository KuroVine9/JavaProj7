package javaproj7_1;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    public Rectangle(int x, int y, int width, int height) {
        set(x, y, width, height);
    }

    public String toString() {
        return String.format("P: (%d, %d) S: %d x %d", x, y, width, height);
    }

    // public boolean equals(Rectangle r) {
    // if ((this.x == r.x) && (this.y == r.y) && (this.width == r.width) &&
    // (this.height == r.height)) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y && width == rectangle.width && height == rectangle.height;
    }

    public void set(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
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
