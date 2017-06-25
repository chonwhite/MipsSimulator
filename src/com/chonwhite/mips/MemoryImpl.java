package com.chonwhite.mips;

import java.util.HashMap;

public class MemoryImpl implements InstructionMemory {

    private int baseAddress = 0;
    private HashMap<Integer, Instruction> instructionMap = new HashMap<>();

    @Override
    public void setBaseAddress(int address) {
        this.baseAddress = address;
    }

    @Override
    public Memory<byte[]> getDataSegment() {
        return null;
    }

    @Override
    public Instruction get(int address) {
        return instructionMap.get(address);
    }

    @Override
    public void set(int address, Instruction value) {

    }

    @Override
    public int appendInstruction(Instruction instruction) {
        instructionMap.put(baseAddress, instruction);
        int location = baseAddress;
        baseAddress += 4;
        return location;
    }

    @Override
    public int getNextInstructionLocation() {
        return baseAddress;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Integer key:instructionMap.keySet()){
            s.append(key + ":" + instructionMap.get(key));
            s.append("\n");
        }
        return s.toString();
    }
}
