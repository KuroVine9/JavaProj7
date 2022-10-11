package javaproj7_1;

public class FigureEditorTest {
    public static void main(String[] args) {
        FigureEditor editor = new FigureEditor();

        Rectangle r1 = new Rectangle(1, 2, 3, 4);
        Rectangle r2 = new Rectangle(2, 3, 4, 5);
        Circle c1 = new Circle(3, 4, 5);
        Circle c2 = new Circle(4, 5, 6);

        editor.add(r1);
        editor.add(r2);
        editor.add(c1);
        editor.add(c2);
        editor.display();

        Rectangle r3 = new Rectangle(2, 3, 4, 5);
        editor.add(r3);
        editor.display();

        r3.setX(1);
        editor.add(r3);
        Circle c3 = new Circle(4, 5, 6);
        editor.add(c3);
        editor.display();
    }
}
