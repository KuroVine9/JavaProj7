package javaproj10;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class PanelA extends JPanel {
    JLabel label;

    public PanelA() {
        setBackground(Color.YELLOW);
        label = new JLabel("Place to Draw Graf.");
        add(label);
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
        setLayout(null);
        label.setSize(50, 20);
        label.setLocation(30, 30);
    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            // System.out.printf("%d, %d\n", e.getX(), e.getY());
            label.setLocation(e.getX(), e.getY());
        }
    }

    class MyMouseMotionListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            // System.out.printf("Dragged\n");
            label.setLocation(e.getX(), e.getY());
        }
    }
}
