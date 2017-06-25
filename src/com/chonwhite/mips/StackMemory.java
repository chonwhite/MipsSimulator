package com.chonwhite.mips;

import java.util.HashMap;

public class StackMemory implements Memory<Integer> {

    private HashMap<Integer,Integer> stack = new HashMap<>();

    @Override
    public void setBaseAddress(int address) {

    }

    @Override
    public Integer get(int address) {
        return stack.get(address);
    }

    @Override
    public void set(int address, Integer value) {
        stack.put(address, value);
    }
}
