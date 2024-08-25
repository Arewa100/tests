package television;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {

    @BeforeEach
    public void setUp() {
        Television television = new Television("sharp", 3, "15");
    }

    @Test
    public void testToGetTelevisionName() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("sharp", television.getName());
    }

    @Test
    public void testToGetTelevisionTotalNumberOfChannels() {
        Television television = new Television("sharp", 3, "15");
        assertEquals(3, television.getTotalNumberOfChannel());
    }
    @Test
    public void testToGetTelevisionSize() {
        Television television = new Television("sharp", 3,"15");
        assertEquals("15", television.getSize());
    }
    @Test
    public void testThatTelevisionIsOn() {
        Television television = new Television("sharp", 3, "15");
        String feedback = television.power();
        assertEquals("television is on", feedback);
    }
    @Test
    public void testToSeeIfTelevisionWillGoOffWhenPowerButtonIsCalledAgain() {
        Television television = new Television("sharp", 3, "15");
        television.power();
        assertEquals("television is off", television.power());
    }
    @Test
    public void testToSeeIfTelevisionWillComeOnWhenOff() {
        Television television = new Television("sharp", 3, "15");
        television.power();
        television.power();
        assertEquals("television is on", television.power());
    }

    @Test
    public void testToIncreaseTelevisionVolume() {
        Television television = new Television("sharp", 3,"15");
        assertEquals("television is on", television.power());
        television.volumeUp();
        assertEquals(1, television.getVolume());
    }
    @Test
    public void testToConFirmIfTelevisionVolumeIncreasesForEveryTimeVolumeUpIsCalled() {
        Television television = new Television("sharp", 3,"15");
        assertEquals("television is on", television.power());
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        assertEquals(4, television.getVolume());
    }
    @Test
    public void testThatWhenVolumeIsMaximumTheVolumeUpButtonShouldMaintainMaximum() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        assertEquals(10, television.getVolume());
    }
    @Test
    public void testToDecreaseTelevisionVolumeWhenVolumeIsFive() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        television.volumeUp();
        assertEquals(5, television.getVolume());
        television.volumeDown();
        assertEquals(4, television.getVolume());
    }
    @Test
    public void testToDecreaseTelevisionVolumeWhenVolumeIsZeroMinimum() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.volumeUp();
        television.volumeUp();
        assertEquals(2, television.getVolume());
        television.volumeDown();
        television.volumeDown();
        assertEquals(0, television.getVolume());
        television.volumeDown();
        assertEquals(0, television.getVolume());
    }
    @Test
    public void testToChangeTelevisionChannelForward() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.changeChannelForward();
        assertEquals(2, television.getChannel());
    }
    @Test
    public void testToSeeThatMaximumNumberOfChannelIsMaintainedWhenMaxChannelIsReached() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.changeChannelForward();
        television.changeChannelForward();
        television.changeChannelForward();
        television.changeChannelForward();
        assertEquals(3, television.getChannel());
    }
    @Test
    public void testToChangeTelevisionChannelBackward ()  {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.changeChannelForward();
        assertEquals(2, television.getChannel());
        television.changeChannelBackward();
        assertEquals(1, television.getChannel());
    }
    @Test
    public void testToSeeThatMinimumNumberOfChannelIsMaintainedWhenMinChannelIsReached() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        television.changeChannelForward();
        assertEquals(2, television.getChannel());
        television.changeChannelBackward();
        assertEquals(1, television.getChannel());
        television.changeChannelBackward();
        assertEquals(1, television.getChannel());
    }
    @Test
    public void testToEnsureThatTelevisionIsOnBeforeYouCanChangeChannelForward() {
        Television television = new Television("sharp", 3, "15");
        assertEquals("television is on", television.power());
        assertEquals("television is off", television.power());
        assertEquals("television is on", television.power());
        television.changeChannelForward();
        assertEquals(2, television.getChannel());

    }
    @Test
    public void testToEnsureThatTelevisionIsOnBeforeYouCanChangeVolume() {
        Television television = new Television("sharp", 3,"15");
        assertEquals("television is on", television.power());
        assertEquals("television is off", television.power());
        assertEquals("television is on", television.power());
        television.volumeUp();
        assertEquals(1, television.getVolume());
    }
    @Test
    public void testToSeeThatTelevisionIsOnBeforeYouCanDecreaseVolume() {
        Television television = new Television("sharp", 3, "15");

    }
}