package airconditional;

public class AirCondition {
    private boolean currentAirConditionState;
    private double temperature;

    public AirCondition() {
        currentAirConditionState = false;
        temperature = 16;
    }
    public String turnOn() {
        if (!currentAirConditionState) {
            currentAirConditionState = true;
            return "it is on";
        } else {
            return "still on";
        }
    }

    public String turnOff() {
        if (currentAirConditionState) {
            currentAirConditionState = false;
            return "it is off";
        }
        else  {
            return "still off";
        }
    }

    public void airCondiionTemperature(double temperature) {
        this.temperature += temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
