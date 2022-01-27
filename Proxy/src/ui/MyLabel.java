package ui;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {

    public MyLabel(String text, boolean visible, boolean isInfo) {

        setText(text);
        setSize(400, 50);
        setFont(new Font("", Font.PLAIN, 18));
        setForeground(new Color(0, 7, 212));

        setVisible(visible);
        if(isInfo){
            setSize(250, 50);
            setFont(new Font("", Font.PLAIN, 14));
            setForeground(new Color(212, 0, 60));
        }
    }
}
