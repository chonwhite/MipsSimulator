package com.chonwhite.mips;

public class JInstruction implements Instruction {

    @Override
    public OPCode getOPCode() {
        return opCode;
    }

    @Override
    public void setOPCode(OPCode code) {
        this.opCode = code;
    }

    @Override
    public InstructType type() {
        return InstructType.TypeJ;
    }

    private OPCode opCode;

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    private int address;
}
