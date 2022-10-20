package javaproj8_1;

public class Circle extends Shape { // shape클래스를 상속
    private int radius;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public String toString() {
        return String.format("P: (%d, %d) R: %d", super.getX(), super.getY(), radius);
    }

    public void display() {
        System.out.printf("%s\n", toString());
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return circle.x == x && circle.y == y && radius == circle.radius;
    }

    public void set(int x, int y, int radius) {
        super.setX(x);
        super.setY(y);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
