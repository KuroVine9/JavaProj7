package javaproj10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelB extends JPanel {
    JButton square;
    JButton line;
    JButton circle;
    PanelA pa;

    public PanelB(PanelA pa) {
        this.pa = pa;
        setBackground(Color.BLUE);
        setLayout(new GridLayout(3, 1, 5, 5));

        square = new JButton("사각");
        line = new JButton("직선");
        circle = new JButton("타원");

        add(square);
        add(line);
        add(circle);

        ActionListener listener = new MyActionListener();
        square.addActionListener(listener);
        line.addActionListener(listener);
        circle.addActionListener(listener);
    }

    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.printf("%s\n", e.getActionCommand());
            pa.label.setText(e.getActionCommand());
        }

    }
}
