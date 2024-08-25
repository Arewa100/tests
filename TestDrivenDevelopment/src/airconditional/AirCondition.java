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

    public void airConditionTemperature(double temperature) {
        if (temperatureIsInRange(temperature)) {
            this.temperature = temperature;
        }else if(temperature > 30 && !temperatureIsInRange(temperature)) {
            this.temperature = 30;
        }
    }

    public double getTemperature() {
        return temperature;
    }
    private boolean temperatureIsInRange(double temperature) {
        boolean temperatureIsLessThanThirtyAndGreaterThanSixteen = (temperature <= 30 && temperature >= 16);
        return temperatureIsLessThanThirtyAndGreaterThanSixteen ?  true : false;

    }
}
