package com.chonwhite.mips;

public enum OPCode {

    J("j",0x02),        //Jump to Address	J
    JAL("jal",0x03),    //Jump and Link
    JR("jr",0x00000),    //TODO

    ADD("add",0x00),
    SUB("addi",0x08), //TODO
    MUL("mul",1),
    DIV("div",1),

    BEQ("beq",0x04),
    BNE("bne",0x05),
    BGE("bge",0x1111),//TODO
    ADDI("addi",0x08),
    ADDIU("addiu",0x09),
    ANDI("andi",0x0c),

    LW("lw",0x23),//TODO check;
    SW("sw",0x2b),//TODO check;


    //======== persuade instruction;
    ;

    OPCode(String name,int opCode){
        this.name = name;
        this.opCode = opCode;
    }

    private String name;
    private int opCode;

}
