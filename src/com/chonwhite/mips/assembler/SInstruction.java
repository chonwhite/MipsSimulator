package com.chonwhite.mips.assembler;

import com.chonwhite.mips.Instruction;
import com.chonwhite.mips.OPCode;

public class SInstruction implements Instruction {
    @Override
    public OPCode getOPCode() {
        return null;
    }

    @Override
    public void setOPCode(OPCode code) {

    }

    @Override
    public InstructType type() {
        return InstructType.TypeS;
    }
}
