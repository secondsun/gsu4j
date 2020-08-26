package dev.secondsun.snes.gsu4j;

public class Register {
    private int data; //short
    private boolean modified = false;

    public int getData() {
        return data  & 0xFFFF;
    }

    public int assign(int value) {
        modified = true;
        this.data = value & 0xFFFF;
        return this.data;
    }


}
