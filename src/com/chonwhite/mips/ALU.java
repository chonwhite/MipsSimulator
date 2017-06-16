package com.chonwhite.mips;

import java.util.ArrayList;
import java.util.Scanner;

public class ALU {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Register> registers = new ArrayList<>();

    {
        for(int i = 0;i < 32;i++){
            registers.add(new Register(i));
        }
    }

    public int execute(Instruction statement, int pc) {
        OPCode opCode = statement.getOPCode();

        switch (statement.type()){
            case TypeR:{
                RInstruction instruction = (RInstruction) statement;
                Register destination = registers.get(instruction.getRd());
                Register second = registers.get(instruction.getRs());
                Register third = registers.get(instruction.getRt());
                switch (instruction.getFunction()) {
                    case ADD:
                        destination.setIntValue(second.getIntValue() + third.getIntValue());
                        System.out.println("add :" + destination);
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
                }
                pc+=4;
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
                        if (target.getIntValue() == source.getIntValue()){
                            pc = immediateValue;
                        }
                        break;
                    case BNE:
                        if (target.getIntValue() != source.getIntValue()){
                            pc = immediateValue;
                        }
                        break;
                    case ADDI:
                        target.setIntValue(source.getIntValue() + immediateValue);
                        System.out.println("addi :" + target);
                        break;
                }
                break;
            }
            case TypeJ:{
                JInstruction instruction = (JInstruction) statement;
                pc = instruction.getAddress();
                if (instruction.getOPCode() == OPCode.JAL) {
                    //TODO save the current registers into stack?
                }
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
                        System.out.println("" + registers.get(Register.$a0).getIntValue());
                        break;
                    }
                }

            }
        }
        return pc;
    }
}
