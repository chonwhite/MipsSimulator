package com.chonwhite.mips;

public class VirtualMachine {

    private InstructionMemory statements;

    public void setStatements(InstructionMemory statements){
        this.statements = statements;
    }

    private int pc = 0;

    private ALU alu = new ALU();

    public void run(){
        Instruction statement;
        while ((statement = statements.get(pc)) != null){
            pc = alu.execute(statement,pc);
        }
    }
}
