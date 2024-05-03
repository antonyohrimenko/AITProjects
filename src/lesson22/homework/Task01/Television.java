package lesson22.homework.Task01;

public class Television {
    private int frequency;
    private int currentChannel;
    private int maxChannel;

    public Television(int frequency, int maxChannel) {
        this.frequency = frequency;
        this.maxChannel = maxChannel;
        this.currentChannel = 0;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }



    public void switchChannelForward() {
        currentChannel = (currentChannel == maxChannel) ? 1 : currentChannel + 1;
    }

    public void switchChannelBack() {
        currentChannel = (currentChannel == 1) ? maxChannel : currentChannel - 1;
    }

    public void switchToChannel(int channel) {
        if (channel >= 1 && channel <= maxChannel) { // Проверяем, что канал в диапазоне от 1 до максимального
            currentChannel = channel;
        }
    }
}
