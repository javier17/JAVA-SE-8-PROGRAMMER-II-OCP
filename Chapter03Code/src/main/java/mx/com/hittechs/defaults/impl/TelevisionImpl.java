package mx.com.hittechs.defaults.impl;

import mx.com.hittechs.defaults.Television;

public class TelevisionImpl implements Television {

    private int channel;

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
