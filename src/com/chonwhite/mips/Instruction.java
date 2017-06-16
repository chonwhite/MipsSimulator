package com.chonwhite.mips;

public interface Instruction {

    //https://en.wikibooks.org/wiki/MIPS_Assembly/Instruction_Formats


    /**
     Instruction Formats:
     Instruction formats: all 32 bits wide (one word):
     6 5 5 5 5 6
     +--------+--------+-------+-------+------+--------+
     R-type format| Op-code| Rs | Rt | Rd | SA |Funct-code|
     +--------+--------+-------+-------+------+--------+
     6 5 5 16
     +--------+--------+-------+------------------------+
     I-type format|Op-code | Rs | Rt | 2’s complement constant|
     +--------+--------+-------+------------------------+
     6 26
     +--------+-----------------------------------------+
     J-type format| Op-code| jump_target |
     +--------+-----------------------------------------+
     ^ ^
     | |
     bit 31 bit 0
     */

    enum InstructType{
        TypeR,
        TypeI,
        TypeJ,
        TypeS,
    }

    OPCode getOPCode();

    void setOPCode(OPCode code);

    InstructType type();
}
