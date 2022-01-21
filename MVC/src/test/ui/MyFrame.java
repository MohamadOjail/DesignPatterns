package test.ui;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private final MyPanel panel;

	public MyFrame(String title) {
		super(title);
		setLayout(null);
		setSize(560, 170);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.panel = new MyPanel();
		this.panel.setBounds(0, 0, 560, 170);
		add(panel);


		setVisible(true);
		setLocationRelativeTo(null);
	}

	public MyPanel getPanel() {
		return panel;
	}

}
