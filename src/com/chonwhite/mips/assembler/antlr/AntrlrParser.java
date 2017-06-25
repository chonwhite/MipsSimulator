package com.chonwhite.mips.assembler.antlr;

import com.chonwhite.mips.InstructionMemory;
import com.chonwhite.mips.assembler.AssemblyParser;
import com.chonwhite.mips.assembler.antrl.MipsAsmLexer;
import com.chonwhite.mips.assembler.antrl.MipsAsmParser;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.ByteBuffer;

public class AntrlrParser implements AssemblyParser {
    @Override
    public InstructionMemory parse(File file) {

        try{
            MipsAsmLexer lexer = new MipsAsmLexer( CharStreams.fromFileName(file.getAbsolutePath()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            MipsAsmParser parser = new MipsAsmParser(tokens);

            ANTLRWalker antlrWalker = new ANTLRWalker();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(antlrWalker, parser.prog());
            antlrWalker.onFinish();
            System.out.println("instructions:\n" + antlrWalker.getInstructionMemory().toString());
            return antlrWalker.getInstructionMemory();

        }catch (IOException e){
            System.err.println("Error handling input or output files");
            e.printStackTrace();
        }

        return null;
    }
}
