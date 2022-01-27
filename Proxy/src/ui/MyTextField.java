package ui;

import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {

    public MyTextField() {
        setSize(400, 40);
        setFont(new Font("", Font.PLAIN, 22));
        setEditable(false);
        setMargin(new Insets(0,10,0,0));
    }
}
