package navigator;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonNavigator extends JButton {

    public ButtonNavigator() {
        setContentAreaFilled(false);
        setIcon(new ImageIcon(getClass().getResource("/images/pin.png")));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(24, 24));
    }
}
