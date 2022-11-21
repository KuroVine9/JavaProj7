package javaproj11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class PanelB extends JPanel {
    JButton square;
    JButton line;
    JButton circle;
    PanelA pa;
    final HashMap<String, Byte> drawModeMap = new HashMap<>() {{
        put("사각",(byte)0);
        put("직선",(byte)1);
        put("타원",(byte)2);
    }};

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
            pa.drawMode = drawModeMap.get(e.getActionCommand());
        }

    }
}
