package aircondtional;

import airconditional.AirCondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void testingIfAirConditionIsOn() {
        AirCondition airCondition = new AirCondition();
        String feedback = airCondition.turnOn();
        assertEquals("it is on", feedback);
    }

    @Test
    public void testingToConfirmIfAirConditionIsStillOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        String feedback = airCondition.turnOn();
        assertEquals("still on", feedback);
    }

    @Test
    public void testingIfAirConditionIsOff() {
        AirCondition airCondition = new AirCondition();
        assertEquals("it is on", airCondition.turnOn());
        String feedback = airCondition.turnOff();
        assertEquals("it is off", feedback);
    }

    @Test
    public void testingToConfirmIfAirConditionIsStillOff() {
        AirCondition airCondition = new AirCondition();
        assertEquals("it is on", airCondition.turnOn());
        airCondition.turnOff();
        String feedback = airCondition.turnOff();
        assertEquals("still off", feedback);
    }

    @Test
    public void testThatTemperatureIsIncreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.airConditionTemperature(20);
        double feedback = airCondition.getTemperature();
        assertEquals(20, feedback);
    }

    @Test
    public void testThatTemperatureIsDecreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.airConditionTemperature(18);
        assertEquals(18,airCondition.getTemperature());
    }

    @Test
    public void testingThatAirConditionTempRemainsThirtyForTempAboveThirty() {
        AirCondition airCondition = new AirCondition();
        airCondition.airConditionTemperature(40);
        assertEquals(30, airCondition.getTemperature());
    }
    @Test
    public void testingThatAirConditionTempRemainsSixteenForTempBelowThirty() {
        AirCondition airCondition = new AirCondition();
        airCondition.airConditionTemperature(15);
        assertEquals(16, airCondition.getTemperature());
    }
}
