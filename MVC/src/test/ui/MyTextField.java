package test.ui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class MyTextField extends JTextField {

	public MyTextField(boolean enabled, boolean editable) {

		setFont(new Font("", Font.PLAIN, 26));
		setSize(80, 50);
		setHorizontalAlignment(JTextField.CENTER);
		setForeground(Color.decode("#34b349"));
		
		setEditable(editable);
		setEnabled(enabled);
	}
}
