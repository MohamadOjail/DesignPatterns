package test.ui;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	private JButton calcBtn;
	private MyTextField num1Field, num2Field, resultField;
	private MyLabel plusLabel, errLable;

	public MyPanel() {

		setLayout(null);
		setVisible(true);

		calcBtn = new JButton("Calculate");
		calcBtn.setEnabled(false);
		calcBtn.setFont(new Font("", Font.PLAIN, 22));

		num1Field = new MyTextField(true,true);
		num2Field = new MyTextField(false, true);
		resultField = new MyTextField(true, false);

		plusLabel = new MyLabel(28,"+", false, true, 20);
		errLable = new MyLabel(22,"",true,false, 400);

		add(num1Field);
		num1Field.setLocation(20, 20);

		add(plusLabel);
		plusLabel.setLocation(110, 20);

		add(num2Field);
		num2Field.setLocation(140, 20);

		add(calcBtn);
		calcBtn.setBounds(240,20,180,50);

		add(resultField);
		resultField.setLocation(440, 20);

		add(errLable);
		errLable.setLocation(20, 70);
	}

	public MyLabel getErrLable() {
		return errLable;
	}

	public MyTextField getNum1Field() {
		return num1Field;
	}

	public MyTextField getNum2Field() {
		return num2Field;
	}

	public MyTextField getResultField() {
		return resultField;
	}

	public void setResult(String value) {
		this.resultField.setText(value);
	}

	public JButton getBtn() {
		return this.calcBtn;
	}
}
