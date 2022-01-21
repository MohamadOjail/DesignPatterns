package test.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputChecker implements KeyListener{

	private final JTextField field1, field2, field3;
	private final JButton calcBtn;
	private final JLabel errLable;

	public InputChecker(MyPanel myPanel) {
		this.field1 = myPanel.getNum1Field();
		this.field2 = myPanel.getNum2Field();
		this.field3 = myPanel.getResultField();
		this.calcBtn = myPanel.getBtn();
		this.errLable = myPanel.getErrLable();
		this.field1.addKeyListener(this);
		this.field2.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != '.') {
			errLable.setText("Only numbers please");
			errLable.setVisible(true);
			e.consume();
		} else if (e.getKeyChar() == '.' && ((JTextField) e.getSource()).getText().contains(".")) {
			errLable.setText("Only one decimal . allowed");
			errLable.setVisible(true);
			e.consume();
		} else
			errLable.setVisible(false);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if( e.isControlDown() ) e.consume(); // detect control key to prevent paste
		this.field3.setText("");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if( e.getKeyChar() == '.' ) {
			if( ( (JTextField) e.getSource() ).getText().startsWith(".") ) {
				( (JTextField) e.getSource() ).setText("0.");
			}
		}
		enabler();
	}

	private void enabler() {
		field2.setEnabled(!field1.getText().isBlank() || !field1.getText().isEmpty());
		calcBtn.setEnabled(!field2.getText().isBlank() || !field2.getText().isEmpty());
	}

}
