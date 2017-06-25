package com.chonwhite.mips;

public class VirtualMachine {

    private MemoryImpl statements;
    private StackMemory stackMemory = new StackMemory();

    public void setStatements(InstructionMemory statements){
        this.statements = (MemoryImpl) statements;
    }

    private int pc = 0;

    private ALU alu = new ALU();

    {
        alu.setMemoryPipeline(new MemoryPipeline() {
            @Override
            public void save(int address, int value) {
                stackMemory.set(address, value);

                System.out.println("save:" + address + "=" + value);
//                byte[] bytes = intToByteArray(value);
//                statements.getDataSegment().set(address, bytes);
            }

            @Override
            public int load(int address) {
                return stackMemory.get(address);
//                byte[] bytes = statements.getDataSegment().get(address);
//                return byteArrayToInt(bytes);
            }
        });
    }

    public void run(){
        Instruction statement;
        while ((statement = statements.get(pc)) != null){
            pc = alu.execute(statement, pc);
        }
    }

    public static int byteArrayToInt(byte[] b) {
        return   b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }
    public static byte[] intToByteArray(int a) {
        return new byte[] {
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)
        };
    }
}
