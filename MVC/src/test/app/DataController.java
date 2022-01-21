package test.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.calculation.CalculationModel;
import test.ui.MyFrame;

public class DataController implements ActionListener{

	private CalculationModel model;
	private final MyFrame myFrame;

	public DataController(MyFrame myFrame) {
		super();
		this.myFrame = myFrame;
		this.myFrame.getPanel().getBtn().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String x = myFrame.getPanel().getNum1Field().getText();
		String y = myFrame.getPanel().getNum2Field().getText();

		if ( isInt(x) && isInt(y)) this.model = new CalculationModel(parseInt(x), parseInt(y));
		else {
			if( !isInt(x) && isInt(y)) this.model = new CalculationModel(parseDouble(x),parseInt(y));
			if(isInt(x) && !isInt(y)) this.model = new CalculationModel(parseInt(x), parseDouble(y));
			if( !isInt(x) && !isInt(y)) this.model = new CalculationModel(parseDouble(x), parseDouble(y));
		}

		this.myFrame.getPanel().setResult(model.getResult().toString());
	}

	private boolean isInt(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private int parseInt(String input) {
		return Integer.parseInt(input);
	}
	private double parseDouble(String input) {
		return Double.parseDouble(input);
	}
}
