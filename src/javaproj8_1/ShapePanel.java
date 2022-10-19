package javaproj8_1;

import java.util.ArrayList;

public class ShapePanel {
    private ArrayList<Shape> shapes;
    private int numOfShape;

    public ShapePanel() {
        shapes = new ArrayList<>();
        numOfShape = 0;
    }

    public void add(Shape s) { // 이미 .equals()에서 형변환을 작성해 구조변경할 필요 없음
        if (!shapes.contains(s)) {
            shapes.add(s);
            numOfShape++;
        }
    }

    public void delete(Shape s) {
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
