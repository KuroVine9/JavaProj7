package javaproj8_1;

public class test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10, 100, 100);
        Rectangle r2 = new Rectangle(0, 10, 100, 100);
        Rectangle r3 = new Rectangle(10, 10, 10, 100);
        Rectangle r4 = new Rectangle(10, 10, 100, 100);
        r1.display();
        r2.display();
        System.out.println("두 Rectangle 객체는 동일한가? " + r1.equals(r2));
        System.out.println();

        r3.display();
        r4.display();
        System.out.println("두 Rectangle 객체는 동일한가? " + r3.equals(r4));
        System.out.println();

        r1.display();
        r4.display();
        System.out.println("두 Rectangle 객체는 동일한가? " + r1.equals(r4));
        System.out.println();

        Circle c1 = new Circle(20, 30, 100);
        Circle c2 = new Circle(10, 30, 10);
        Circle c3 = new Circle(20, 30, 100);

        c1.display();
        c2.display();
        System.out.println("두 Circle 객체는 동일한가?" + c1.equals(c2));
        System.out.println();

        c1.display();
        c3.display();
        System.out.println("두 Circle 객체는 동일한가?" + c1.equals(c3));
        System.out.println();

        r1.display();
        c1.display();
        System.out.println("Rectangle 객체와 Circle 객체는 동일한가?" + r1.equals(c1));
        System.out.println("Circle 객체와 Rectangle 객체는 동일한가?" + c1.equals(r1));
    }
}
