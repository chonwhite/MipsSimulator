package com.chonwhite.mips;

public interface InstructionMemory {
    Instruction get(int address);
    void appendInstruction(Instruction instruction);
}
