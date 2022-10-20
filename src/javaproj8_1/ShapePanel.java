package javaproj8_1;

import java.util.ArrayList;

public class ShapePanel {
    private ArrayList<Shape> shapes;
    private int numOfShape;

    public ShapePanel() {
        shapes = new ArrayList<>();
        numOfShape = 0;
    }

    public void add(Shape s) {
        if (!shapes.contains(s)) {
            shapes.add(s);
            numOfShape++;
        }
    }

    public void delete(Shape s) { // ArrayList의 remove 메소드를 활용하면 쉽게 구현 가능하다.
        shapes.remove(s);
        numOfShape--;
    }

    public void display() {
        System.out.printf("----------Shapes----------\n");
        for (int i = 0; i < numOfShape; i++) {
            System.out.printf("%s\n", shapes.get(i).toString());
        }
        System.out.printf("\n\n");
    }
}
