package com.chonwhite.mips;

public interface MemoryPipeline {
    void save(int address, int value);
    int load(int address);
}
