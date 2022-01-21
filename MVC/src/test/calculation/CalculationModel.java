package test.calculation;

public class CalculationModel {

	private Number result;

	public CalculationModel(int firstNumber, int secondNumber){
		result = firstNumber + secondNumber;
	}
	public CalculationModel(double firstNumber, int secondNumber){
		result = firstNumber + secondNumber;
	}
	public CalculationModel(int firstNumber, double secondNumber){
		result = firstNumber + secondNumber;
	}
	public CalculationModel(double firstNumber, double secondNumber){
		result = firstNumber + secondNumber;
	}

	public Number getResult() {
		return result;
	}
}
