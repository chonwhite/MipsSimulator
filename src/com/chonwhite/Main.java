package com.chonwhite;

import com.chonwhite.mips.*;
import com.chonwhite.mips.assembler.antlr.AntrlrParser;

import java.io.File;
import java.util.HashMap;

import static com.chonwhite.mips.Register.*;


public class Main {
    public static void main(String[] args) {
        String fileName = "fib.asm";

        File testDir = new File("test/asm");
        File asmFile = new File(testDir,fileName);

//        File asmFile = new File(testDir,".asm");
//        File asmFile = new File(testDir,"stack.asm");
//        File asmFile = new File(testDir,"function_call.asm");

        System.out.println("s:" + asmFile.getAbsolutePath());

        VirtualMachine virtualMachine = new VirtualMachine();

        String filePath = asmFile.getAbsolutePath();
        AntrlrParser parser = new AntrlrParser();
        InstructionMemory memory = parser.parse(new File(filePath));
        virtualMachine.setStatements(memory);
        virtualMachine.run();

    }
}
