package com.ojail.model;

import com.ojail.ui.Controller;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SensorHub implements PropertyChangeListener {

    private Controller controller;
    public void injectController (Controller controller){
        this.controller = controller;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        this.controller.setTemp(evt.getNewValue().toString());
    }
}
