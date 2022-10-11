package javaproj7_3;

import java.util.ArrayList;
import javaproj7_2.Shape;

public class FigureEditor {
    private ArrayList<Shape> shapes;
    private int numOfShape;

    public FigureEditor() {
        shapes = new ArrayList<>();
        numOfShape = 0;
    }

    public void add(Shape s) { // 이미 .equals()에서 형변환을 작성해 구조변경할 필요 없음
        if (!shapes.contains(s)) {
            shapes.add(s);
            numOfShape++;
        }
    }

    public void display() {
        System.out.printf("----------Shapes----------\n");
        for (int i = 0; i < numOfShape; i++) {
            System.out.printf("%s\n", shapes.get(i).toString());
        }
        System.out.printf("\n\n");
    }

}
