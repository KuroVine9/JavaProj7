package javaproj7_1;

import java.util.ArrayList;

public class FigureEditor {
    ArrayList<Rectangle> rectangles;
    private int numOfRect;
    private ArrayList<Circle> circles;
    private int numOfCircle;

    public FigureEditor() { // 동적할당으로 저장
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
        numOfRect = 0;
        numOfCircle = 0;
    }

    public void add(Rectangle r) {
        if (rectangles.contains(r) == false) { // 오버라이딩한 .equals()를 사용해 비교
            rectangles.add(r);
            numOfRect++;
        }
    }

    public void add(Circle c) {
        if (!circles.contains(c)) {
            circles.add(c);
            numOfCircle++;
        }
    }

    public void display() {
        System.out.printf("----------Rectangles----------\n");
        for (int i = 0; i < numOfRect; i++) { // 클래스에 굳이 numOf~ 정수값을 쓰지 않고 .size()를 이용하는 것이 효율적일 것으로 보임
            System.out.printf("%s\n", rectangles.get(i).toString());
        }

        System.out.printf("----------Circles----------\n");
        for (int i = 0; i < numOfCircle; i++) {
            System.out.printf("%s\n", circles.get(i).toString());
        }
        System.out.printf("\n\n");
    }

}
