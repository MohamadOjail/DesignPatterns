package ui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() throws HeadlessException {
        MyPanel panel = new MyPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Name + adjective randomizer");
        setSize(460,350);
        setVisible(true);
        setResizable(false);
        setIconImage(new ImageIcon("src/ui/icon.png").getImage());

        add(panel);

        setLocationRelativeTo(null);
    }
}
