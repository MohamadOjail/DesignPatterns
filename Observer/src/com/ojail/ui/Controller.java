package com.ojail.ui;

import com.ojail.model.SensorHub;
import com.ojail.model.TemperatureSensor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller{

    @FXML private Label myLabel;

    private final SensorHub hub = new SensorHub();

    public void setTemp (String temperature){
        this.myLabel.setText(temperature + "°");
    }

    @FXML
    public void randomize(ActionEvent actionEvent) {
        TemperatureSensor.getInstance().setTemperature();
    }

    @FXML private void initialize(){
        hub.injectController(this);
        TemperatureSensor.getInstance().addListener(hub);
    }
}
