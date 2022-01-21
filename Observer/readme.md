# Observer Pattern 👀️

> a simple JavaFx app that randomizes temperature.

## Preview

![]()

![](preview.gif)


### Fire Event:

```java
public void setTemperature() {
        int oldTemperature = this.temperature;
        this.temperature = new Random().nextInt(47) ;
        this.propertyChangeSupport.firePropertyChange("temperature", oldTemperature, this.temperature);
    }
```

### Injecting the FXML Controller into SensorHub:

```java
private Controller controller;
    public void injectController (Controller controller){
        this.controller = controller;
    }
  
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
      
        this.controller.setTemp(evt.getNewValue().toString());
    }
```
