package lesson22.homework.Task01;

public class RemoteControl {
    private int frequency;

    public RemoteControl(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void switchChannelForward(Television tv) {
        if (frequency == tv.getFrequency()) {
            tv.switchChannelForward();
        }
    }

    public void switchChannelBack(Television tv) {
        if (frequency == tv.getFrequency()) {
            tv.switchChannelBack();
        }
    }

    public void switchToChannel(Television tv, int channel) {
        if (frequency == tv.getFrequency() && channel >= 0) {
            tv.switchToChannel(channel);
        }
    }
}
