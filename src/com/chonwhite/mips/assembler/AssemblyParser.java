package com.chonwhite.mips.assembler;

import com.chonwhite.mips.InstructionMemory;

import java.io.File;

public interface AssemblyParser {
    InstructionMemory parse(File file);
}
