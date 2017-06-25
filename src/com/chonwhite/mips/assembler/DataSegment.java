package com.chonwhite.mips.assembler;

import com.chonwhite.mips.Memory;

public class DataSegment implements Memory<byte[]> {

    private byte[] bytes;

    @Override
    public void setBaseAddress(int address) {

    }

    @Override
    public byte[] get(int address) {
        return new byte[0];
    }

    @Override
    public void set(int address, byte[] value) {

    }

    public byte[] getBytes(int address,int size) {
        byte[] copy = new byte[size];
        return copy;
    }
}
