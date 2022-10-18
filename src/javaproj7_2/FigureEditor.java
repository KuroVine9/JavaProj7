package javaproj7_2;

import java.util.ArrayList;

public class FigureEditor {
    private ArrayList<Rectangle> rectangles;
    private int numOfRect;
    private ArrayList<Circle> circles;
    private int numOfCircle;

    public FigureEditor() {
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
        numOfRect = 0;
        numOfCircle = 0;
    }

    // public void add(Rectangle r) {
    // if (rectangles.contains(r) == false) {
    // rectangles.add(r);
    // numOfRect++;
    // }
    // }

    // public void add(Circle c) {
    // if (!circles.contains(c)) {
    // circles.add(c);
    // numOfCircle++;
    // }
    // }

    public void add(Object o) {
        if (o instanceof Rectangle && !rectangles.contains(o)) {
            rectangles.add((Rectangle) o);
            numOfRect++;
        } else if (o instanceof Circle && !circles.contains(o)) {
            circles.add((Circle) o);
            numOfCircle++;
        }
    }

    public void display() {
        System.out.printf("----------Rectangles----------\n");
        for (int i = 0; i < numOfRect; i++) {
            System.out.printf("%s\n", rectangles.get(i).toString());
        }

        System.out.printf("----------Circles----------\n");
        for (int i = 0; i < numOfCircle; i++) {
            System.out.printf("%s\n", circles.get(i).toString());
        }
        System.out.printf("\n\n");
    }

}
