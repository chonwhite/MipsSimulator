package com.chonwhite.mips;

import java.util.ArrayList;
import java.util.Scanner;

public class ALU {

    private Scanner scanner = new Scanner(System.in);
    private MemoryPipeline memoryPipeline;

    private ArrayList<Register> registers = new ArrayList<>();

    {
        for(int i = 0;i < 32;i++){
            registers.add(new Register(i));
        }
        registers.get(Register.$sp).setIntValue(2147479548);
    }

    public void setMemoryPipeline(MemoryPipeline pipeline) {
        this.memoryPipeline = pipeline;
    }

    public int execute(Instruction statement, int pc) {
        OPCode opCode = statement.getOPCode();

        switch (statement.type()){
            case TypeR:{
                RInstruction instruction = (RInstruction) statement;
                Register destination = registers.get(instruction.getRd());
                Register second = registers.get(instruction.getRs());
                Register third = registers.get(instruction.getRt());
                pc+=4;
                switch (instruction.getFunction()) {
                    case ADD:
                        destination.setIntValue(second.getIntValue() + third.getIntValue());
                        System.out.println("add :" + second + "+" + third);
                        System.out.println(destination.toString());
                        break;
                    case SUB:
                        destination.setIntValue(second.getIntValue() - third.getIntValue());
                        break;
                    case MULT:
                        destination.setIntValue(second.getIntValue() * third.getIntValue());
                        break;
                    case DIV:
                        destination.setIntValue(second.getIntValue() / third.getIntValue());
                        break;
                    case SLT:
                        destination.setIntValue(second.getIntValue() < third.getIntValue() ? 1 : 0);
                        System.out.println("slt");
                        // 1 <= 3;
                        break;
                    case JR:
                        System.out.println("JR:" + second.getIntValue());
                        pc = second.getIntValue();
                        break;
                }

                break;
            }
            case TypeI:{
                IInstruction instruction = (IInstruction) statement;
                Register target = registers.get(instruction.getRt());
                Register source = registers.get(instruction.getRs());
                int immediateValue = instruction.getIMM();
                pc+=4;//normal case;
                switch (opCode) {
                    case BEQ:
                        System.out.println(target.getIntValue() + "==" + source.getIntValue());
                        System.out.println("beq:" + (target.getIntValue() == source.getIntValue()));
                        if (target.getIntValue() == source.getIntValue()){
                            pc = immediateValue;
                        }
                        break;
                    case BNE:
                        if (target.getIntValue() != source.getIntValue()){
                            pc = immediateValue;
                        }
                        break;
                    case BGE://TODO
                        System.out.println(target.getIntValue() + ">=" + source.getIntValue());
                        System.out.println("bge:" + (target.getIntValue() >= source.getIntValue()));
                        if (target.getIntValue() >= source.getIntValue()){
                            pc = immediateValue;
                        }
                        break;
                    case ADDI:
                        target.setIntValue(source.getIntValue() + immediateValue);
                        System.out.println("addi :" + target);
                        break;
                    case LW: {
                        int address = source.getIntValue() + immediateValue;
                        int value = memoryPipeline.load(address);
                        target.setIntValue(value);
                        break;
                    }
                    case SW: {
                        int address = source.getIntValue() + immediateValue;
                        int value = target.getIntValue();
                        memoryPipeline.save(address, value);
                        break;
                    }
                }
                break;
            }
            case TypeJ:{
                JInstruction instruction = (JInstruction) statement;
                if (instruction.getOPCode() == OPCode.JAL) {
                    //TODO save the current registers into stack?
                    System.out.println("JAL" + (pc + 4));
                    registers.get(Register.$ra).setIntValue(pc + 4);
                }
                pc = instruction.getAddress();
                break;
            }
            case TypeS:{
                int code = registers.get(Register.$v0).getIntValue();
                pc += 4;
                switch (code) {
                    case 5: {//TODO input int
                        int value = scanner.nextInt();
                        System.out.println("value");
                        registers.get(Register.$v0).setIntValue(value);
                        System.out.println("**** user input : " + value);
                        break;
                    }
                    case 1:{//TODO print int
                        System.out.println("print Int:" + registers.get(Register.$a0).getIntValue());
                        break;
                    }
                    case 10:
                        System.exit(0);
                        break;
                }

            }
        }
        return pc;
    }
}
