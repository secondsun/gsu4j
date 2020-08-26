package dev.secondsun.snes.gsu4j;

import java.util.concurrent.atomic.AtomicInteger;

public class BitField {

    private final int size;
    private final int index;
    private final AtomicInteger data;

    public BitField(int size, int index, AtomicInteger data) {
        this.size = size;
        this.index = index;
        this.data = data;
    }

    public int get() {
        return data.get()& 0x9f7e;
    }

    public BitField set(int data) {
        this.data.set(data);
        return this;
    }

}
