package dev.secondsun.snes.gsu4j;

import java.util.concurrent.atomic.AtomicInteger;

//Status Flag Register
public class SFR {
    AtomicInteger data = new AtomicInteger(0);//short
    BitField z = new BitField(16, 1, data);  //zero flag
    BitField cy = new BitField(16, 2, data);  //carry flag
    BitField s = new BitField(16, 3, data);  //sign flag
    BitField ov = new BitField(16, 4, data);  //overflow flag
    BitField g = new BitField(16, 5, data);  //go flag
    BitField r = new BitField(16, 6, data);  //ROM r14 flag
    BitField alt1 = new BitField(16, 8, data);  //alt1 instruction mode
    BitField alt2 = new BitField(16, 9, data);  //alt2 instruction mode
    BitField il = new BitField(16, 10, data);  //immediate lower 8-bit flag
    BitField ih = new BitField(16, 11, data);  //immediate upper 8-bit flag
    BitField b = new BitField(16, 12, data);  //with flag
    BitField irq = new BitField(16, 15, data);  //interrupt flag

    BitRange alt = new BitRange(16,8,9, data);  //composite instruction mode

    public int getData() {
        return data.get() & 0x9f7e;
    }

    public void setData(int data) {
        auto& operator=(const uint value) { return data = value, *this; }
    }
}
