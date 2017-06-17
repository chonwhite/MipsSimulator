package com.chonwhite.mips.assembler.antlr;

import com.chonwhite.mips.*;
import com.chonwhite.mips.MemoryImpl;
import com.chonwhite.mips.assembler.SInstruction;
import com.chonwhite.mips.assembler.antrl.MipsAsmBaseListener;
import com.chonwhite.mips.assembler.antrl.MipsAsmParser;
import com.chonwhite.mips.assembler.util.InstructionCreator;
import com.sun.tools.javac.util.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

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

    }

    @Override
    public void enterOp_addu(MipsAsmParser.Op_adduContext ctx) {

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
    public void enterOp_and(MipsAsmParser.Op_andContext ctx) {
        RInstruction instruction = InstructionCreator.and(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_or(MipsAsmParser.Op_orContext ctx) {
        RInstruction instruction = InstructionCreator.or(
                ctx.rd.getText(), ctx.rs.getText(), ctx.rt.getText());
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
    public void enterOp_slt(MipsAsmParser.Op_sltContext ctx) {
        RInstruction instruction = InstructionCreator.rInstruction(
                RInstruction.Function.SLT,ctx.rd.getText(),ctx.rs.getText(),ctx.rt.getText());
        instructionMemory.appendInstruction(instruction);
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
    public void enterOp_jr(MipsAsmParser.Op_jrContext ctx) {

    }

    @Override
    public void enterInstr_r(MipsAsmParser.Instr_rContext ctx) {

    }

    @Override
    public void enterOp_lw(MipsAsmParser.Op_lwContext ctx) {

    }

    //=========================== pseudo instructions =========================
    @Override
    public void enterOp_li(MipsAsmParser.Op_liContext ctx) {
//        System.out.println("enter li:" + ctx.getText());
        IInstruction instruction = InstructionCreator.addi(
                ctx.rt.getText(), "$zero", ctx.signed_imm().getText());
        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void enterOp_move(MipsAsmParser.Op_moveContext ctx) {
        RInstruction instruction = InstructionCreator.add(
                ctx.rt.getText(), Register.RZERO, ctx.rs.getText());
        instructionMemory.appendInstruction(instruction);
    }

    //========================== exit xxx ============================

    @Override
    public void exitInstr_r(MipsAsmParser.Instr_rContext ctx) {

    }

    @Override
    public void exitOp_add(MipsAsmParser.Op_addContext ctx) {
    }

    @Override
    public void exitOp_addi(MipsAsmParser.Op_addiContext ctx) {
    }

    @Override
    public void exitOp_addiu(MipsAsmParser.Op_addiuContext ctx) {

    }

    @Override
    public void exitOp_lw(MipsAsmParser.Op_lwContext ctx) {

    }

    @Override
    public void enterOp_lh(MipsAsmParser.Op_lhContext ctx) {

    }

    @Override
    public void exitOp_lh(MipsAsmParser.Op_lhContext ctx) {

    }

    @Override
    public void enterOp_lhu(MipsAsmParser.Op_lhuContext ctx) {

    }

    @Override
    public void exitOp_lhu(MipsAsmParser.Op_lhuContext ctx) {

    }

    @Override
    public void enterOp_lb(MipsAsmParser.Op_lbContext ctx) {

    }

    @Override
    public void exitOp_lb(MipsAsmParser.Op_lbContext ctx) {

    }

    @Override
    public void enterOp_lbu(MipsAsmParser.Op_lbuContext ctx) {

    }

    @Override
    public void exitOp_lbu(MipsAsmParser.Op_lbuContext ctx) {

    }

    @Override
    public void enterOp_sw(MipsAsmParser.Op_swContext ctx) {

    }

    @Override
    public void exitOp_sw(MipsAsmParser.Op_swContext ctx) {

    }

    @Override
    public void enterOp_sh(MipsAsmParser.Op_shContext ctx) {

    }

    @Override
    public void exitOp_sh(MipsAsmParser.Op_shContext ctx) {

    }

    @Override
    public void enterOp_sb(MipsAsmParser.Op_sbContext ctx) {

    }

    @Override
    public void exitOp_sb(MipsAsmParser.Op_sbContext ctx) {

    }

    @Override
    public void enterOp_lui(MipsAsmParser.Op_luiContext ctx) {

    }

    @Override
    public void exitOp_lui(MipsAsmParser.Op_luiContext ctx) {

    }

    @Override
    public void enterOp_andi(MipsAsmParser.Op_andiContext ctx) {

    }

    @Override
    public void exitOp_andi(MipsAsmParser.Op_andiContext ctx) {

    }

    @Override
    public void enterOp_ori(MipsAsmParser.Op_oriContext ctx) {

    }

    @Override
    public void exitOp_ori(MipsAsmParser.Op_oriContext ctx) {

    }

    @Override
    public void enterOp_nori(MipsAsmParser.Op_noriContext ctx) {

    }

    @Override
    public void exitOp_nori(MipsAsmParser.Op_noriContext ctx) {

    }

    @Override
    public void enterOp_slti(MipsAsmParser.Op_sltiContext ctx) {

    }

    @Override
    public void exitOp_slti(MipsAsmParser.Op_sltiContext ctx) {

    }

    @Override
    public void enterOp_beq(MipsAsmParser.Op_beqContext ctx) {

    }

    @Override
    public void exitOp_beq(MipsAsmParser.Op_beqContext ctx) {
        System.out.println("-------enter beq:" + ctx.getText());
    }

    @Override
    public void enterOp_ble(MipsAsmParser.Op_bleContext ctx) {
        String label = ctx.iden().getText();
        Integer location = labelMap.get(label);

        RInstruction sltInstruction = InstructionCreator.rInstruction(
                RInstruction.Function.SLT,Register.RAT,
                ctx.rt.getText(),ctx.rs.getText());
        instructionMemory.appendInstruction(sltInstruction);
        IInstruction bne = InstructionCreator.bne(Register.RAT, Register.RZERO);
        int insertLocation = instructionMemory.appendInstruction(bne);

        IInstruction beq = InstructionCreator.beq(ctx.rt.getText(),ctx.rs.getText());
        int beqLocation = instructionMemory.appendInstruction(beq);

        if (location == null) {
            location = -1;
            unresolvedLabels.add(new Pair<>(insertLocation,label));
            unresolvedLabels.add(new Pair<>(beqLocation,label));
        }
        bne.setIMM(location);
        beq.setIMM(location);
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
    public void exitOp_bne(MipsAsmParser.Op_bneContext ctx) {
        System.out.println("------exit bne:" + ctx.getText());
    }

    @Override
    public void enterOp_bgtz(MipsAsmParser.Op_bgtzContext ctx) {

    }

    @Override
    public void exitOp_bgtz(MipsAsmParser.Op_bgtzContext ctx) {

    }

    @Override
    public void enterInstr_i(MipsAsmParser.Instr_iContext ctx) {

    }

    @Override
    public void exitInstr_i(MipsAsmParser.Instr_iContext ctx) {

    }

    @Override
    public void enterOp_j(MipsAsmParser.Op_jContext ctx) {


        String label = ctx.target.getText();
        Integer location = labelMap.get(label);
        if (location == null){
            location = -1;
            int insertLocation = instructionMemory.getNextInstructionLocation();
            unresolvedLabels.add(new Pair<>(insertLocation,label));
        }
        JInstruction instruction = InstructionCreator.j(location);

        instructionMemory.appendInstruction(instruction);
    }

    @Override
    public void exitOp_j(MipsAsmParser.Op_jContext ctx) {

    }

    @Override
    public void enterOp_jal(MipsAsmParser.Op_jalContext ctx) {

    }

    @Override
    public void exitOp_jal(MipsAsmParser.Op_jalContext ctx) {

    }

    @Override
    public void enterInstr_j(MipsAsmParser.Instr_jContext ctx) {
        //System.out.println("enter Instr_j:" + ctx.getText());
    }

    @Override
    public void exitInstr_j(MipsAsmParser.Instr_jContext ctx) {

    }

    @Override
    public void enterInstr_p(MipsAsmParser.Instr_pContext ctx) {
//        System.out.println("enter Instr_p:" + ctx.getText());
    }

    @Override
    public void exitInstr_p(MipsAsmParser.Instr_pContext ctx) {

    }

    @Override
    public void enterOp_halt(MipsAsmParser.Op_haltContext ctx) {

    }

    @Override
    public void exitOp_li(MipsAsmParser.Op_liContext ctx) {

    }

    @Override
    public void exitOp_halt(MipsAsmParser.Op_haltContext ctx) {

    }

    @Override
    public void enterInstr(MipsAsmParser.InstrContext ctx) {
//        System.out.println("enter Instr:" + ctx.getText());
    }

    @Override
    public void exitInstr(MipsAsmParser.InstrContext ctx) {

    }

    //TODO not sure what to do

    @Override
    public void visitTerminal(TerminalNode node) {
//        System.out.println("visitTerminal:" + node.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("error:" + node);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }


    @Override
    public void enterProg(MipsAsmParser.ProgContext ctx) {
//        System.out.println("enterProg:" + ctx.getText());
    }

    @Override
    public void enterIden(MipsAsmParser.IdenContext ctx) {
//        System.out.println("enterIden:" + ctx.getText());
    }


    @Override
    public void enterLabel(MipsAsmParser.LabelContext ctx) {
        System.out.println("******enterLabel:" + ctx.iden().getText());
        int location = instructionMemory.getNextInstructionLocation();
        labelMap.put(ctx.iden().getText(),location);
    }

    @Override
    public void exitLabel(MipsAsmParser.LabelContext ctx) {
        super.exitLabel(ctx);
        System.out.println("******exitLabel:" + ctx.getText());
    }

    @Override
    public void enterReg(MipsAsmParser.RegContext ctx) {
//        System.out.println("enterReg:" + ctx.getText());
    }

    @Override
    public void enterUsigned_imm(MipsAsmParser.Usigned_immContext ctx) {
//        System.out.println("enter usigned imm:" + ctx.getText());
    }

    @Override
    public void enterSigned_imm(MipsAsmParser.Signed_immContext ctx) {
//        System.out.println("enter signed imm:" + ctx.getText());
    }

    @Override
    public void enterStat(MipsAsmParser.StatContext ctx) {
//        System.out.println("enter Stat:" + ctx.getText());
    }

    @Override
    public void exitSegment(MipsAsmParser.SegmentContext ctx) {
        super.exitSegment(ctx);
        System.out.println("exit segment");
    }
}
