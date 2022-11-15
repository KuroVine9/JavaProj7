package javaproj11;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelA extends JPanel {
    byte drawMode;
    Point start, end;
    ArrayList<DrawStruct> saved;
    int x, y, width, height;

    public PanelA() {
        drawMode = 0;
        start = null;
        end = null;
        saved = new ArrayList<>();
        setBackground(Color.YELLOW);
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (start == null)
            return;
        x = Math.min(start.x, end.x);
        y = Math.min(start.y, end.y);
        width = Math.abs(start.x - end.x);
        height = Math.abs(start.y - end.y);

        for (DrawStruct d : saved) {
            switch (d.type) {
                case 0:
                    g.drawRect(d.x, d.y, d.w, d.h);
                    break;
                case 1:
                    g.drawLine(d.x, d.y, d.w, d.h);
                    break;
                case 2:
                    g.drawOval(d.x, d.y, d.w, d.h);
                    break;
                default:
                    System.out.println("Unknown Type!");
                    System.exit(0);
            }
        }

        switch (drawMode) {
            case 0:
                g.drawRect(x, y, width, height);
                break;
            case 1:
                x = start.x;
                y = start.y;
                width = end.x;
                height = end.y;
                g.drawLine(x, y, width, height);
                break;
            case 2:
                g.drawOval(x, y, width, height);
                break;
            default:
                System.out.println("Unknown Button Input!");
                System.exit(0);
        }
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            start = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            end = e.getPoint();
            repaint();
        }

        public void mouseReleased(MouseEvent e) {
            saved.add(new DrawStruct(x, y, width, height, drawMode));
        }
    }

    class DrawStruct {
        private int x, y, w, h;
        private byte type;

        public DrawStruct(int x, int y, int w, int h, byte type) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.type = type;
        }
    }
}
