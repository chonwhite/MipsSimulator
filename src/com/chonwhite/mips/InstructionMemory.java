package com.chonwhite.mips;

public interface InstructionMemory extends Memory<Instruction>{

    Memory<byte[]> getDataSegment();
    Instruction get(int address);
    int appendInstruction(Instruction instruction);
    int getNextInstructionLocation();
}
