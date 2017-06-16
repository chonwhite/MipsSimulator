package com.chonwhite.mips;

public class RInstruction implements Instruction {

    /**
     * All R-type instructions have the following format:
     OP rd, rs, rt
     Where "OP" is the mnemonic for the particular instruction. rs, and rt are the source registers,
     and rd is the destination register. As an example, the add mnemonic can be used as:
     add $s1, $s2, $s3
     */




    public enum Function{
        SLL(0x00),  //Logical Shift Left
        SRL(0x02),	//Logical Shift Right (0-extended)
        SRA(0x03),	//Arithmetic Shift Right (sign-extended)
        JR(0x08),   //Jump to Address in Register
        MFHI(0x10),	//Move from HI Register
        MFLO(0x12),	//Move from LO Register
        MULT(0x18),	//Multiply
        MULTU(0x19),//Unsigned Multiply
        DIV(0x1A),	//Divide
        DIVU(0x1B),	//Unsigned Divide
        ADD(0x20),	//Add
        ADDU(0x21),	//Add Unsigned
        SUB(0x22),	//Subtract	R	0x00
//        subu	Unsigned Subtract	R	0x00	0x23
        AND(0x24),	//Bitwise AND	R	0x00
        OR(0x25),	//Bitwise OR	R	0x00
        xor(0x26),	//Bitwise XOR (Exclusive-OR)
//        nor	Bitwise NOR (NOT-OR)	R	0x00	0x27
//        slt	Set to 1 if Less Than	R	0x00	0x2A
        sltu(0x2B);//	Set to 1 if Less Than Unsigned
        Function(int code){

        }
        private int code;
    }

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
        return InstructType.TypeR;
    }

    private OPCode opCode;

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public int getRs() {
        return rs;
    }

    public void setRs(int rs) {
        this.rs = rs;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    private int rd;
    private int rs;
    private int rt;

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    private Function function;
}
