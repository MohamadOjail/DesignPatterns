package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyButton extends JButton {

    public MyButton(Controller controller) {
        setText("Randomize!");
        setIcon(new ImageIcon("src/ui/icon.png"));
        setIconTextGap(10);
        setFont(new Font("", Font.BOLD, 20));
        setSize( 400, 50);

        setHorizontalTextPosition(JButton.RIGHT);
        setVerticalTextPosition(JButton.CENTER);

        setBorderPainted(false);
        setFocusPainted(false);

        setForeground(Color.white);
        setBackground(new Color(30, 46, 189));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.setText();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(new Color(241, 245, 7));
                setBackground(new Color(0, 143, 21));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(Color.white);
                setBackground(new Color(30, 46, 189));
            }
        });
    }
}
