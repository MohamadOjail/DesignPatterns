package ui;

import data.Builder;
import data.WordProxy;

public class Controller {

    private MyPanel panel;
    private final Builder builder = new Builder();
    private final WordProxy wordProxy= new WordProxy();

    public void injectPanel (MyPanel panel){
        this.panel = panel;
    }

    public void setText(){
        panel.getUncensoredField().setText(builder.buildString());
        panel.getCensoredField().setText(builder.buildStringProxy());
        panel.getWarning().setVisible(wordProxy.isUnwanted(panel.getUncensoredField().getText().split(" ")[2]));
    }
}
