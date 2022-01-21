package test.ui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class MyLabel extends JLabel {

	public MyLabel(int fontSize, String text, boolean red, boolean visible, int width) {

		setFont(new Font("", Font.PLAIN, fontSize));
		setText(text);
		if (red) setForeground(Color.red);
		setVisible(visible);
		setSize(width, 50);
	}
}
