package javaproj10;

import java.awt.BorderLayout;
import javax.swing.*;

public class FigureEditor extends JFrame {
    public FigureEditor() {
        setTitle("FigureEditor.java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        add(new PanelA(), BorderLayout.CENTER);
        add(new PanelC(), BorderLayout.LINE_START);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FigureEditor();
    }
}
