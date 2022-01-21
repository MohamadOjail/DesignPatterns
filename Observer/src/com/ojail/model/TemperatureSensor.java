package com.ojail.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class TemperatureSensor {

    private int temperature;
    private final PropertyChangeSupport propertyChangeSupport;

    private static final TemperatureSensor instance = new TemperatureSensor();
    public static TemperatureSensor getInstance(){return instance;};

    private TemperatureSensor(){
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.temperature = 0;
    }

    public void addListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature() {
        int oldTemperature = this.temperature;
        this.temperature = new Random().nextInt(47) ;
        this.propertyChangeSupport.firePropertyChange("temperature", oldTemperature, this.temperature);
    }
}
