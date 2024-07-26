package navigator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

public class MyNavigator extends DefaultWaypoint {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public MyNavigator(String name, EventNavigator event, GeoPosition coord) {
        super(coord);
        this.name = name;
        initButton(event);
    }

    public MyNavigator() {
    }

    private String name;
    private JButton button;

    private void initButton(EventNavigator event) {
        button = new ButtonNavigator();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(MyNavigator.this);
            }
        });
    }
}
