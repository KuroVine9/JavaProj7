import javax.swing.*;
import java.awt.*;

public class PanelB extends JPanel {
    public PanelB() {
        setBackground(Color.BLUE);
        setLayout(new GridLayout(3, 1, 5, 5));

        add(new JButton("사각"));
        add(new JButton("직선"));
        add(new JButton("타원"));
    }
}
