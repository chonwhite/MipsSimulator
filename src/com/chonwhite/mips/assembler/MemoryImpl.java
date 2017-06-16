package com.chonwhite.mips.assembler;

import com.chonwhite.mips.Instruction;
import com.chonwhite.mips.InstructionMemory;

import java.util.HashMap;

public class MemoryImpl implements InstructionMemory {

    private int baseAddress = 0;
    private HashMap<Integer, Instruction> instructionMap = new HashMap<>();

    @Override
    public Instruction get(int address) {
        return instructionMap.get(address);
    }

    @Override
    public void appendInstruction(Instruction instruction) {
        instructionMap.put(baseAddress, instruction);
        baseAddress += 4;
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
