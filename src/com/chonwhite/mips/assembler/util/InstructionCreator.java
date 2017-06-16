package com.chonwhite.mips.assembler.util;

import com.chonwhite.mips.IInstruction;
import com.chonwhite.mips.OPCode;
import com.chonwhite.mips.RInstruction;

import static com.chonwhite.mips.Register.getIndex;

public class InstructionCreator {

    public static RInstruction rInstruction(RInstruction.Function function, int rd, int rs, int rt) {
        RInstruction instruction = new RInstruction();
        instruction.setRd(rd);
        instruction.setRs(rs);
        instruction.setRt(rt);
        instruction.setFunction(function);
        return instruction;
    }

    private static IInstruction iInstruction(OPCode code, int rt, int rs, int value) {
        IInstruction instruction = new IInstruction();
        instruction.setOPCode(code);
        instruction.setRt(rt);
        instruction.setRs(rs);
        instruction.setIMM(value);
        return instruction;
    }

    //======================== R Instructions =======================//

    public static RInstruction add(int rd, int rs, int rt) {
        return rInstruction(RInstruction.Function.ADD, rd, rs, rt);
    }

    public static RInstruction add(String rd, String rs, String rt) {
        return add(getIndex(rd), getIndex(rs), getIndex(rt));
    }

    public static RInstruction and(int rd, int rs, int rt) {
        return rInstruction(RInstruction.Function.AND, rd, rs, rt);
    }

    public static RInstruction and(String rd, String rs, String rt) {
        return and(getIndex(rd), getIndex(rs), getIndex(rt));
    }

    public static RInstruction or(int rd, int rs, int rt) {
        return rInstruction(RInstruction.Function.OR, rd, rs, rt);
    }

    public static RInstruction or(String rd, String rs, String rt) {
        return or(getIndex(rd), getIndex(rs), getIndex(rt));
    }

    public static RInstruction sub(int rd, int rs, int rt) {
        RInstruction instruction = rInstruction(RInstruction.Function.SUB, rd, rs, rt);
        instruction.setOPCode(OPCode.SUB);
        return instruction;
    }

    public static RInstruction sub(String rd, String rs, String rt) {
        return sub(getIndex(rd), getIndex(rs), getIndex(rt));
    }


    //========================== I Instructions ===========================//
    public static IInstruction addi(int rt, int rs, int value) {
        return iInstruction(OPCode.ADDI, rt, rs, value);
    }

    public static IInstruction addi(String rt, String rs, String value) {
        return addi(getIndex(rt), getIndex(rs), Integer.valueOf(value));
    }
}
