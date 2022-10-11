package javaproj7_1;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle() {
        x = 0;
        y = 0;
        radius = 0;
    }

    public Circle(int x, int y, int radius) { // 초기화 시 set함수 이용
        set(x, y, radius);
    }

    public String toString() {
        return String.format("P: (%d, %d) R: %d", x, y, radius);
    }

    // public boolean equals(Circle c) {
    // if ((this.x == c.x) && (this.y == c.y) && (this.radius == c.radius)) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    public boolean equals(Object o) { // arrayList의 .contains() 메소드를 이용하기 위해 Object를 매개변수로 받고 형변환해 비교
        if (o == this)
            return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    public void set(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
