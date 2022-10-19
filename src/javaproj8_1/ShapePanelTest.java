package javaproj8_1;

public class ShapePanelTest {
    public static void main(String[] args) {
        ShapePanel panel = new ShapePanel();

        panel.add(new Rectangle(20, 20, 3, 4));
        panel.add(new Circle(10, 10, 10));
        panel.display();

        panel.add(new Rectangle(10, 10, 2, 3)); // Rectangle 객체 추가
        panel.add(new Rectangle(20, 20, 3, 4)); // 이미 배열에 추가된 것과 동일하므로, 추가 안함
        panel.display();

        panel.add(new Circle(100, 100, 2)); // Circle 객체 추가
        panel.add(new Circle(10, 10, 10)); // 이미 배열에 추가된 것과 동일하므로, 추가 안함
        panel.delete(new Circle(10, 10, 10)); // Circle 객체 삭제
        panel.display();
    }
}
