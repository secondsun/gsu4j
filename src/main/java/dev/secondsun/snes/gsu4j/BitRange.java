package dev.secondsun.snes.gsu4j;

import java.util.concurrent.atomic.AtomicInteger;

public class BitRange {

    private final int lo,hi,mask, shift;
    private final AtomicInteger data;

    public BitRange(int size, int start, int end, AtomicInteger data) {
        this.lo = start < 0 ? size + start : start ;
        this.hi = end < 0 ? size + end : end ;
        this.mask = (0xFFFFFFFF >>> 32 - (hi - lo + 1) << lo );
        this.shift = lo ;
        this.data = data;
    }

    public int get() {
        return (data.get() & mask) >> shift;
    }



}
