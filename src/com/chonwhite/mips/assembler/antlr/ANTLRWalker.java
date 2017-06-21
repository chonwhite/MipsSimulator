package com.chonwhite.mips.assembler.antlr;

import com.chonwhite.mips.*;
import com.chonwhite.mips.assembler.SInstruction;
import com.chonwhite.mips.assembler.antrl.MipsAsmBaseListener;
import com.chonwhite.mips.assembler.antrl.MipsAsmParser;
import com.chonwhite.mips.assembler.util.InstructionCreator;
import com.sun.tools.javac.util.Pair;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ANTLRWalker extends MipsAsmBaseListener {

    private InstructionMemory instructionMemory = new MemoryImpl();
    private HashMap<String,Integer> labelMap = new HashMap<>();
    private ArrayList<Pair<Integer,String>> unresolvedLabels = new ArrayList<>();

    public InstructionMemory getInstructionMemory() {
        return instructionMemory;
    }

    public void onFinish(){

        for (String key : labelMap.keySet()) {
            System.out.println("" + key + "@" + labelMap.get(key));
        }

        for (Pair<Integer,String> label : unresolvedLabels) {
            int location = label.fst;
            String name = label.snd;

            System.out.println("label:" + label);

            Integer resolvedLocation = labelMap.get(name);

            if (resolvedLocation == null) {
                throw new IllegalArgumentException("cannot resolve label:" + name);
            }

            Instruction instruction = instructionMemory.get(location);
            if (instruction.type() == Instruction.InstructType.TypeJ) {
                ((JInstruction)instruction).setAddress(resolvedLocation);
            }else if(instruction.type() == Instruction.InstructType.TypeI){
                ((IInstruction)instruction).setIMM(resolvedLocation);
            }
        }
    }

    private void resolveAddress(IInstruction instruction, String label) {
        Integer location = labelMap.get(label);
        int beqLocation = instructionMemory.appendInstruction(instruction);

        if (location == null) {
            location = -1;
            unresolvedLabels.add(new Pair<>(beqLocation,label));
        }
        instruction.setIMM(location);
    }

    private void resolveAddress(JInstruction instruction, String label) {
        Integer location = labelMap.get(label);
        int beqLocation = instructionMemory.appendInstruction(instruction);

        if (location == null) {
            location = -1;
            unresolvedLabels.add(new Pair<>(beqLocation,label));
        }
        instruction.setAddress(location);
    }

    @Override
    public void enterOp_add(MipsAsmParser.Op_addContext ctx) {
        RInstruction instruction = InstructionCreator.add(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_addi(MipsAsmParser.Op_addiContext ctx) {
        IInstruction instruction = InstructionCreator.addi(
                ctx.rt.getText(), ctx.rs.getText(), ctx.signed_imm().getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_addiu(MipsAsmParser.Op_addiuContext ctx) {
        IInstruction instruction = InstructionCreator.addiu(
                ctx.rt.getText(), ctx.rs.getText(), ctx.usigned_imm().getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_addu(MipsAsmParser.Op_adduContext ctx) {
        RInstruction instruction = InstructionCreator.addu(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_and(MipsAsmParser.Op_andContext ctx) {
        RInstruction instruction = InstructionCreator.and(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_andi(MipsAsmParser.Op_andiContext ctx) {
        IInstruction instruction = InstructionCreator.andi(
            ctx.rt.getText(),ctx.rs.getText(),ctx.usigned_imm().getText());
        instructionMemory.appendInstruction(instruction);
    }


    @Override
    public void enterOp_sub(MipsAsmParser.Op_subContext ctx) {
        RInstruction instruction = InstructionCreator.sub(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_syscall(MipsAsmParser.Op_syscallContext ctx) {
        SInstruction instruction = new SInstruction();
        instructionMemory.appendInstruction(instruction);
    }


    @Override
    public void enterOp_or(MipsAsmParser.Op_orContext ctx) {
        RInstruction instruction = InstructionCreator.or(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }


    @Override
    public void enterOp_slt(MipsAsmParser.Op_sltContext ctx) {
        RInstruction instruction = InstructionCreator.rInstruction(
                RInstruction.Function.SLT,ctx.rd.getText(),ctx.rs.getText(),ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_nor(MipsAsmParser.Op_norContext ctx) {

    }

    @Override
    public void enterOp_xor(MipsAsmParser.Op_xorContext ctx) {

    }

    @Override
    public void enterOp_nand(MipsAsmParser.Op_nandContext ctx) {

    }

    @Override
    public void enterOp_sll(MipsAsmParser.Op_sllContext ctx) {

    }

    @Override
    public void enterOp_srl(MipsAsmParser.Op_srlContext ctx) {

    }

    @Override
    public void enterOp_sra(MipsAsmParser.Op_sraContext ctx) {

    }

    @Override
    public void enterOp_lw(MipsAsmParser.Op_lwContext ctx) {

    }

    //=========================== pseudo instructions =========================
    @Override
    public void enterOp_li(MipsAsmParser.Op_liContext ctx) {
        IInstruction instruction = InstructionCreator.addi(
                ctx.rt.getText(), "$zero", ctx.signed_imm().getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_move(MipsAsmParser.Op_moveContext ctx) {
        RInstruction instruction = InstructionCreator.add(
                ctx.rt.getText(), Register.R_ZERO, ctx.rs.getText());
        instructionMemory.appendInstruction(instruction);
    }

    //TODO
    @Override
    public void enterOp_ble(MipsAsmParser.Op_bleContext ctx) {
        //ble is an I instruction, so rs map to rt,and rt map to rs;
        RInstruction sltInstruction = InstructionCreator.rInstruction(
                RInstruction.Function.SLT,Register.R_AT,
                ctx.rs.getText(),ctx.rt.getText());
        instructionMemory.appendInstruction(sltInstruction);

        IInstruction beq = InstructionCreator.beq(Register.R_AT,Register.R_ZERO);
        resolveAddress(beq,ctx.iden().getText());
    }


    @Override
    public void enterOp_lh(MipsAsmParser.Op_lhContext ctx) {

    }

    @Override
    public void enterOp_lhu(MipsAsmParser.Op_lhuContext ctx) {

    }

    @Override
    public void enterOp_lb(MipsAsmParser.Op_lbContext ctx) {

    }

    @Override
    public void enterOp_lbu(MipsAsmParser.Op_lbuContext ctx) {

    }

    @Override
    public void enterOp_sw(MipsAsmParser.Op_swContext ctx) {

    }

    @Override
    public void enterOp_sh(MipsAsmParser.Op_shContext ctx) {

    }

    @Override
    public void enterOp_sb(MipsAsmParser.Op_sbContext ctx) {

    }

    @Override
    public void enterOp_lui(MipsAsmParser.Op_luiContext ctx) {

    }

    @Override
    public void enterOp_ori(MipsAsmParser.Op_oriContext ctx) {

    }

    @Override
    public void enterOp_nori(MipsAsmParser.Op_noriContext ctx) {

    }

    @Override
    public void enterOp_slti(MipsAsmParser.Op_sltiContext ctx) {

    }

    @Override
    public void enterOp_beq(MipsAsmParser.Op_beqContext ctx) {
        IInstruction instruction = InstructionCreator.beq(ctx.rt.getText(), ctx.rs.getText());
        resolveAddress(instruction, ctx.iden().getText());
    }

    // TODO
    @Override
    public void enterOp_bge(MipsAsmParser.Op_bgeContext ctx) {
        IInstruction instruction = InstructionCreator.bge(ctx.rt.getText(), ctx.rs.getText());
        resolveAddress(instruction, ctx.target.getText());
    }

    @Override
    public void enterOp_bne(MipsAsmParser.Op_bneContext ctx) {
        String label = ctx.iden().getText();
        Integer location = labelMap.get(label);
        IInstruction instruction = InstructionCreator.bne(ctx.rt.getText(),ctx.rs.getText());
        int insertLocation = instructionMemory.appendInstruction(instruction);
        if (location == null) {
            location = -1;
            unresolvedLabels.add(new Pair<>(insertLocation,label));
        }
        instruction.setIMM(location);
    }

    @Override
    public void enterOp_bgtz(MipsAsmParser.Op_bgtzContext ctx) {

    }

    @Override
    public void enterOp_j(MipsAsmParser.Op_jContext ctx) {
        String label = ctx.target.getText();
        JInstruction instruction = InstructionCreator.j();
        resolveAddress(instruction, label);
    }

    @Override
    public void enterOp_jal(MipsAsmParser.Op_jalContext ctx) {
        JInstruction instruction = InstructionCreator.jal();
        resolveAddress(instruction,ctx.target.getText());
    }

    @Override
    public void enterOp_jr(MipsAsmParser.Op_jrContext ctx) {
        RInstruction instruction = InstructionCreator.jr(ctx.rs.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_halt(MipsAsmParser.Op_haltContext ctx) {

    }

    @Override
    public void enterLabel(MipsAsmParser.LabelContext ctx) {
        System.out.println("******enterLabel:" + ctx.iden().getText());
        int location = instructionMemory.getNextInstructionLocation();
        labelMap.put(ctx.iden().getText(),location);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
        System.out.println("error:" + node);
    }
}
