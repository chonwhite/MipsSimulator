package com.chonwhite.mips;

public enum OPCode {

    J("j",0x02),        //Jump to Address	J
    JAL("jal",0x03),    //Jump and Link

    ADD("add",0x00),
    SUB("addi",0x08),
    MUL("mul",1),
    DIV("div",1),

    BEQ("beq",0x04),
    BNE("bne",0x05),
    ADDI("addi",0x08),


    //======== persuade instruction;
    ;

    OPCode(String name,int opCode){
        this.name = name;
        this.opCode = opCode;
    }

    private String name;
    private int opCode;

}
