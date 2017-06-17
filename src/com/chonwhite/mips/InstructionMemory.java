package com.chonwhite.mips;

public interface InstructionMemory {
    Instruction get(int address);
    int appendInstruction(Instruction instruction);
    int getNextInstructionLocation();
}
