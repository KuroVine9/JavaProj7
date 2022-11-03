package javaproj10;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PanelA extends JPanel {

    public PanelA() {
        setBackground(Color.YELLOW);
        JLabel label = new JLabel("Place to Draw Graf.");
        add(label);
    }
}
