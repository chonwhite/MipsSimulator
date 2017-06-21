package com.chonwhite;

import com.chonwhite.mips.*;
import com.chonwhite.mips.assembler.antlr.AntrlrParser;

import java.io.File;
import java.util.HashMap;

import static com.chonwhite.mips.Register.*;


public class Main {


    static int baseAddress = 0;

    static void incrementBaseAddress(){
        baseAddress+= 4;
    }

    static IInstruction addi(int rt,int rs,int value){
        IInstruction instruction = new IInstruction();
        instruction.setOPCode(OPCode.ADDI);
        instruction.setRt(rt);
        instruction.setRs(rs);
        instruction.setIMM(value);

        return instruction;
    }

    static RInstruction add(int rd,int rs, int rt){
        RInstruction instruction = new RInstruction();
        instruction.setOPCode(OPCode.ADD);
        instruction.setFunction(RInstruction.Function.ADD);
        instruction.setRt(rt);
        instruction.setRs(rs);
        instruction.setRd(rd);
        return instruction;
    }

    public static void main(String[] args) {
	// write your code here

//        for (String s: args) {
//            System.out.println(s);
//        }

        File testDir = new File("test/asm");
//        File asmFile = new File(testDir,"for_loop.asm");
        File asmFile = new File(testDir,"function_call.asm");

        System.out.println("s:" + asmFile.getAbsolutePath());

        VirtualMachine virtualMachine = new VirtualMachine();


        HashMap<Integer,Instruction> statements = new HashMap<>();

        statements.put(baseAddress,addi($t1,$t2,100));
        incrementBaseAddress();
        statements.put(baseAddress,addi($t2,$t3,100));
        incrementBaseAddress();
        statements.put(baseAddress,add($t4,$t2,$t1));
        incrementBaseAddress();

//        virtualMachine.setStatements(statements);
//        virtualMachine.run();


        String filePath = asmFile.getAbsolutePath();
        AntrlrParser parser = new AntrlrParser();
        InstructionMemory memory = parser.parse(new File(filePath));
        virtualMachine.setStatements(memory);
        virtualMachine.run();

    }
}
