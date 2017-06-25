package com.chonwhite.mips;

public interface Memory<T> {
    void setBaseAddress(int address);
    T get(int address);
    void set(int address, T value);
}
