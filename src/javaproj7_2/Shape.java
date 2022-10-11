package javaproj7_2;

public class Shape {
    private int x;
    private int y;

    public Shape() {
        x = 0;
        y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y;
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

}
