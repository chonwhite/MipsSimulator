package com.chonwhite.mips;
public class IInstruction implements Instruction {

    /**
     I instructions are called in the following way:
     OP rt, rs, IMM
     Where rt is the target register, rs is the source register,
     and IMM is the immediate value. The immediate value can be up to 16 bits long.
     For instance, the addi instruction can be called as:
     addi $s1, $s2, 100
     */

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
        return InstructType.TypeI;
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

    public int getIMM() {
        return IMM;
    }

    public void setIMM(int imm){
        this.IMM = imm;
    }

    private OPCode opCode;
    private int rs;
    private int rt;
    private int IMM;

}
