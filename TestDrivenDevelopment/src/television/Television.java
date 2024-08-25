package television;

public class Television {

    private final String name;
    private boolean televisionState;
    private final int totalNumberOfChannel;
    private final int minimumNumberOfChannels;
    private String televisionSize;
    private int channelNumber;
    private int currentVolume;
    private int maximumVolume;
    private final int minimumVolume;


    public Television(String name, int totalNumberOfChannel) {
        this.name = name;
        this.totalNumberOfChannel = totalNumberOfChannel;
        minimumNumberOfChannels = 1;
        televisionState = false;
        currentVolume = 0;
        maximumVolume = 10;
        minimumVolume = 0;
        channelNumber = 1;

    }

    public String getName() {
        return name;
    }
    public int getTotalNumberOfChannel() {
        return totalNumberOfChannel;
    }

    public String power() {
        if(!televisionState) {
            televisionState = true;
            return "television is on";
        }else {
            televisionState = false;
            return "television is off";
        }
    }
    public void volumeUp() {
        if(currentVolume < maximumVolume && televisionState) {
            currentVolume = currentVolume + 1;
        }else {
            currentVolume = maximumVolume;
        }
    }
    public void volumeDown() {
        if(currentVolume > minimumVolume && televisionState) {
            currentVolume = currentVolume - 1;
        }else {
            currentVolume = minimumVolume;
        }
    }
    public int getVolume() {
        return currentVolume;
    }

    public void changeChannelForward() {
        if(channelNumber < totalNumberOfChannel && televisionState) {
            channelNumber = channelNumber + 1;
        }else {
            channelNumber = totalNumberOfChannel;
        }
    }
    public int getChannel() {
        return channelNumber;
    }

    public void changeChannelBackward() {
        if(channelNumber > 1) {
            channelNumber = channelNumber - 1;
        }else {
            channelNumber = minimumNumberOfChannels;
        }
    }
}
