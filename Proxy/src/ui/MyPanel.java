package ui;

import javax.swing.*;

public class MyPanel extends JPanel {

    private final MyTextField uncensoredField, censoredField;
    private final MyLabel infoNoProxy, warning, infoWithProxy;
    private final MyButton button;

    public MyPanel() {

        infoNoProxy = new MyLabel("Randomised name & adjective uncensored", true, false);
        infoNoProxy.setLocation(25,10);

        uncensoredField = new MyTextField();
        uncensoredField.setLocation(20, 55);

        warning = new MyLabel("Contains unwanted words", false, true);
        warning.setLocation(25, 85);

        infoWithProxy = new MyLabel("Randomised name & adjective censored (Proxy)", true, false);
        infoWithProxy.setLocation(25, 125);

        censoredField = new MyTextField();
        censoredField.setLocation(20, 170);

        Controller controller = new Controller();
        controller.injectPanel(this);

        button = new MyButton(controller);
        button.setLocation(20, 230);

        setLayout(null);
        setBounds(0, 0, 460, 600);

        add(infoNoProxy);
        add(uncensoredField);
        add(warning);
        add(infoWithProxy);
        add(censoredField);
        add(button);

    }

    public MyTextField getUncensoredField() {
        return uncensoredField;
    }

    public MyTextField getCensoredField() {
        return censoredField;
    }

    public MyLabel getInfoNoProxy() {
        return infoNoProxy;
    }

    public MyLabel getWarning() {
        return warning;
    }

    public MyLabel getInfoWithProxy() {
        return infoWithProxy;
    }

    public MyButton getButton() {
        return button;
    }
}
