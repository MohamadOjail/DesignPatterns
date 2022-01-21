package test.app;
 import test.ui.InputChecker;
import test.ui.MyFrame;

public class Main {

	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame("Test");
		new InputChecker(myFrame.getPanel());
		new DataController(myFrame);
	}
}
