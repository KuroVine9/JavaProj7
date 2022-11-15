package javaproj11;

import javax.swing.*;

public class PanelC extends JPanel {
    public PanelC(PanelA pa) {
        add(new PanelB(pa));
    }
}
