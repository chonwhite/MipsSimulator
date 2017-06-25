// Generated from /Users/baidu/test/Java_LongFormASR_1.0.0001.0/MIPSSimulator/antlr/MipsAsm.g4 by ANTLR 4.7
package com.chonwhite.mips.assembler.antrl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MipsAsmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, WS=54, NEWLINE=55, COMMENT=56, NUM=57, HEX_NUM=58, ALPHA=59, 
		NAME=60, QUOTED_STRING=61, IMM_REG=62, S_REG=63, T_REG=64, V_REG=65, A_REG=66, 
		K_REG=67;
	public static final int
		RULE_prog = 0, RULE_text_segment = 1, RULE_data_segment = 2, RULE_iden = 3, 
		RULE_label = 4, RULE_reg = 5, RULE_usigned_imm = 6, RULE_signed_imm = 7, 
		RULE_stat = 8, RULE_op_add = 9, RULE_op_addu = 10, RULE_op_sub = 11, RULE_op_and = 12, 
		RULE_op_or = 13, RULE_op_nor = 14, RULE_op_xor = 15, RULE_op_nand = 16, 
		RULE_op_slt = 17, RULE_op_sll = 18, RULE_op_srl = 19, RULE_op_sra = 20, 
		RULE_op_jr = 21, RULE_instr_r = 22, RULE_op_addi = 23, RULE_op_addiu = 24, 
		RULE_op_lw = 25, RULE_op_lh = 26, RULE_op_lhu = 27, RULE_op_lb = 28, RULE_op_lbu = 29, 
		RULE_op_sw = 30, RULE_op_sh = 31, RULE_op_sb = 32, RULE_op_lui = 33, RULE_op_andi = 34, 
		RULE_op_ori = 35, RULE_op_nori = 36, RULE_op_slti = 37, RULE_op_beq = 38, 
		RULE_op_bne = 39, RULE_op_bgtz = 40, RULE_instr_i = 41, RULE_op_j = 42, 
		RULE_op_jal = 43, RULE_instr_j = 44, RULE_op_syscall = 45, RULE_instr_s = 46, 
		RULE_op_ble = 47, RULE_op_blt = 48, RULE_op_bge = 49, RULE_op_bgt = 50, 
		RULE_op_li = 51, RULE_op_la = 52, RULE_op_move = 53, RULE_instr_p = 54, 
		RULE_op_halt = 55, RULE_instr = 56, RULE_segment = 57;
	public static final String[] ruleNames = {
		"prog", "text_segment", "data_segment", "iden", "label", "reg", "usigned_imm", 
		"signed_imm", "stat", "op_add", "op_addu", "op_sub", "op_and", "op_or", 
		"op_nor", "op_xor", "op_nand", "op_slt", "op_sll", "op_srl", "op_sra", 
		"op_jr", "instr_r", "op_addi", "op_addiu", "op_lw", "op_lh", "op_lhu", 
		"op_lb", "op_lbu", "op_sw", "op_sh", "op_sb", "op_lui", "op_andi", "op_ori", 
		"op_nori", "op_slti", "op_beq", "op_bne", "op_bgtz", "instr_i", "op_j", 
		"op_jal", "instr_j", "op_syscall", "instr_s", "op_ble", "op_blt", "op_bge", 
		"op_bgt", "op_li", "op_la", "op_move", "instr_p", "op_halt", "instr", 
		"segment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.text'", "'.data'", "':'", "'$zero'", "'$sp'", "'$fp'", "'$ra'", 
		"'-'", "'add'", "','", "'addu'", "'sub'", "'and'", "'or'", "'nor'", "'xor'", 
		"'nand'", "'slt'", "'sll'", "'srl'", "'sra'", "'jr'", "'addi'", "'addiu'", 
		"'lw'", "'('", "')'", "'lh'", "'lhu'", "'lb'", "'lbu'", "'sw'", "'sh'", 
		"'sb'", "'lui'", "'andi'", "'ori'", "'nori'", "'slti'", "'beq'", "'bne'", 
		"'bgtz'", "'j'", "'jal'", "'syscall'", "'ble'", "'blt'", "'bge'", "'bgt'", 
		"'li'", "'la'", "'move'", "'halt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS", "NEWLINE", "COMMENT", "NUM", 
		"HEX_NUM", "ALPHA", "NAME", "QUOTED_STRING", "IMM_REG", "S_REG", "T_REG", 
		"V_REG", "A_REG", "K_REG"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MipsAsm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MipsAsmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				stat();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << NEWLINE) | (1L << COMMENT) | (1L << NAME))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_segmentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MipsAsmParser.NEWLINE, 0); }
		public Text_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterText_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitText_segment(this);
		}
	}

	public final Text_segmentContext text_segment() throws RecognitionException {
		Text_segmentContext _localctx = new Text_segmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__0);
			setState(122);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_segmentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MipsAsmParser.NEWLINE, 0); }
		public Data_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterData_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitData_segment(this);
		}
	}

	public final Data_segmentContext data_segment() throws RecognitionException {
		Data_segmentContext _localctx = new Data_segmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__1);
			setState(125);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdenContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MipsAsmParser.NAME, 0); }
		public IdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitIden(this);
		}
	}

	public final IdenContext iden() throws RecognitionException {
		IdenContext _localctx = new IdenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MipsAsmParser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				iden();
				setState(130);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				iden();
				setState(133);
				match(T__2);
				setState(134);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				iden();
				setState(137);
				match(T__2);
				setState(138);
				match(NEWLINE);
				setState(139);
				stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				iden();
				setState(142);
				match(T__2);
				setState(143);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegContext extends ParserRuleContext {
		public TerminalNode S_REG() { return getToken(MipsAsmParser.S_REG, 0); }
		public TerminalNode T_REG() { return getToken(MipsAsmParser.T_REG, 0); }
		public TerminalNode A_REG() { return getToken(MipsAsmParser.A_REG, 0); }
		public TerminalNode V_REG() { return getToken(MipsAsmParser.V_REG, 0); }
		public TerminalNode K_REG() { return getToken(MipsAsmParser.K_REG, 0); }
		public TerminalNode IMM_REG() { return getToken(MipsAsmParser.IMM_REG, 0); }
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitReg(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__4 - 4)) | (1L << (T__5 - 4)) | (1L << (T__6 - 4)) | (1L << (IMM_REG - 4)) | (1L << (S_REG - 4)) | (1L << (T_REG - 4)) | (1L << (V_REG - 4)) | (1L << (A_REG - 4)) | (1L << (K_REG - 4)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usigned_immContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MipsAsmParser.NUM, 0); }
		public TerminalNode HEX_NUM() { return getToken(MipsAsmParser.HEX_NUM, 0); }
		public Usigned_immContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usigned_imm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterUsigned_imm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitUsigned_imm(this);
		}
	}

	public final Usigned_immContext usigned_imm() throws RecognitionException {
		Usigned_immContext _localctx = new Usigned_immContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_usigned_imm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==HEX_NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_immContext extends ParserRuleContext {
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public Signed_immContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_imm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterSigned_imm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitSigned_imm(this);
		}
	}

	public final Signed_immContext signed_imm() throws RecognitionException {
		Signed_immContext _localctx = new Signed_immContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signed_imm);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__7);
				setState(152);
				usigned_imm();
				}
				break;
			case NUM:
			case HEX_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				usigned_imm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MipsAsmParser.NEWLINE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MipsAsmParser.COMMENT, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				instr(0);
				setState(157);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				instr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				label();
				setState(161);
				instr(0);
				setState(162);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				label();
				setState(165);
				instr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_addContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_add(this);
		}
	}

	public final Op_addContext op_add() throws RecognitionException {
		Op_addContext _localctx = new Op_addContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__8);
			setState(172);
			((Op_addContext)_localctx).rd = reg();
			setState(173);
			match(T__9);
			setState(174);
			((Op_addContext)_localctx).rs = reg();
			setState(175);
			match(T__9);
			setState(176);
			((Op_addContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_adduContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_adduContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addu(this);
		}
	}

	public final Op_adduContext op_addu() throws RecognitionException {
		Op_adduContext _localctx = new Op_adduContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_addu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__10);
			setState(179);
			((Op_adduContext)_localctx).rd = reg();
			setState(180);
			match(T__9);
			setState(181);
			((Op_adduContext)_localctx).rs = reg();
			setState(182);
			match(T__9);
			setState(183);
			((Op_adduContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_subContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sub(this);
		}
	}

	public final Op_subContext op_sub() throws RecognitionException {
		Op_subContext _localctx = new Op_subContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__11);
			setState(186);
			((Op_subContext)_localctx).rd = reg();
			setState(187);
			match(T__9);
			setState(188);
			((Op_subContext)_localctx).rs = reg();
			setState(189);
			match(T__9);
			setState(190);
			((Op_subContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_andContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_and(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__12);
			setState(193);
			((Op_andContext)_localctx).rd = reg();
			setState(194);
			match(T__9);
			setState(195);
			((Op_andContext)_localctx).rs = reg();
			setState(196);
			match(T__9);
			setState(197);
			((Op_andContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_orContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_or(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__13);
			setState(200);
			((Op_orContext)_localctx).rd = reg();
			setState(201);
			match(T__9);
			setState(202);
			((Op_orContext)_localctx).rs = reg();
			setState(203);
			match(T__9);
			setState(204);
			((Op_orContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_norContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_norContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nor(this);
		}
	}

	public final Op_norContext op_nor() throws RecognitionException {
		Op_norContext _localctx = new Op_norContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_nor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__14);
			setState(207);
			((Op_norContext)_localctx).rd = reg();
			setState(208);
			match(T__9);
			setState(209);
			((Op_norContext)_localctx).rs = reg();
			setState(210);
			match(T__9);
			setState(211);
			((Op_norContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_xorContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_xor(this);
		}
	}

	public final Op_xorContext op_xor() throws RecognitionException {
		Op_xorContext _localctx = new Op_xorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__15);
			setState(214);
			((Op_xorContext)_localctx).rd = reg();
			setState(215);
			match(T__9);
			setState(216);
			((Op_xorContext)_localctx).rs = reg();
			setState(217);
			match(T__9);
			setState(218);
			((Op_xorContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_nandContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_nandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nand(this);
		}
	}

	public final Op_nandContext op_nand() throws RecognitionException {
		Op_nandContext _localctx = new Op_nandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_nand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__16);
			setState(221);
			((Op_nandContext)_localctx).rd = reg();
			setState(222);
			match(T__9);
			setState(223);
			((Op_nandContext)_localctx).rs = reg();
			setState(224);
			match(T__9);
			setState(225);
			((Op_nandContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sltContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rs;
		public RegContext rt;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_slt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_slt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_slt(this);
		}
	}

	public final Op_sltContext op_slt() throws RecognitionException {
		Op_sltContext _localctx = new Op_sltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_slt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__17);
			setState(228);
			((Op_sltContext)_localctx).rd = reg();
			setState(229);
			match(T__9);
			setState(230);
			((Op_sltContext)_localctx).rs = reg();
			setState(231);
			match(T__9);
			setState(232);
			((Op_sltContext)_localctx).rt = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sllContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sll(this);
		}
	}

	public final Op_sllContext op_sll() throws RecognitionException {
		Op_sllContext _localctx = new Op_sllContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_sll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__18);
			setState(235);
			((Op_sllContext)_localctx).rd = reg();
			setState(236);
			match(T__9);
			setState(237);
			((Op_sllContext)_localctx).rt = reg();
			setState(238);
			match(T__9);
			setState(239);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_srlContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_srlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_srl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_srl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_srl(this);
		}
	}

	public final Op_srlContext op_srl() throws RecognitionException {
		Op_srlContext _localctx = new Op_srlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_srl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__19);
			setState(242);
			((Op_srlContext)_localctx).rd = reg();
			setState(243);
			match(T__9);
			setState(244);
			((Op_srlContext)_localctx).rt = reg();
			setState(245);
			match(T__9);
			setState(246);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sraContext extends ParserRuleContext {
		public RegContext rd;
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sra(this);
		}
	}

	public final Op_sraContext op_sra() throws RecognitionException {
		Op_sraContext _localctx = new Op_sraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_sra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__20);
			setState(249);
			((Op_sraContext)_localctx).rd = reg();
			setState(250);
			match(T__9);
			setState(251);
			((Op_sraContext)_localctx).rt = reg();
			setState(252);
			match(T__9);
			setState(253);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_jrContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op_jrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_jr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_jr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_jr(this);
		}
	}

	public final Op_jrContext op_jr() throws RecognitionException {
		Op_jrContext _localctx = new Op_jrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_jr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__21);
			setState(256);
			((Op_jrContext)_localctx).rs = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_rContext extends ParserRuleContext {
		public Op_addContext op_add() {
			return getRuleContext(Op_addContext.class,0);
		}
		public Op_adduContext op_addu() {
			return getRuleContext(Op_adduContext.class,0);
		}
		public Op_subContext op_sub() {
			return getRuleContext(Op_subContext.class,0);
		}
		public Op_andContext op_and() {
			return getRuleContext(Op_andContext.class,0);
		}
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public Op_norContext op_nor() {
			return getRuleContext(Op_norContext.class,0);
		}
		public Op_xorContext op_xor() {
			return getRuleContext(Op_xorContext.class,0);
		}
		public Op_nandContext op_nand() {
			return getRuleContext(Op_nandContext.class,0);
		}
		public Op_sltContext op_slt() {
			return getRuleContext(Op_sltContext.class,0);
		}
		public Op_sllContext op_sll() {
			return getRuleContext(Op_sllContext.class,0);
		}
		public Op_srlContext op_srl() {
			return getRuleContext(Op_srlContext.class,0);
		}
		public Op_sraContext op_sra() {
			return getRuleContext(Op_sraContext.class,0);
		}
		public Op_jrContext op_jr() {
			return getRuleContext(Op_jrContext.class,0);
		}
		public Instr_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_r(this);
		}
	}

	public final Instr_rContext instr_r() throws RecognitionException {
		Instr_rContext _localctx = new Instr_rContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instr_r);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				op_add();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				op_addu();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				op_sub();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				op_and();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				op_or();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				op_nor();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				op_xor();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				op_nand();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				op_slt();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(267);
				op_sll();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(268);
				op_srl();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(269);
				op_sra();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(270);
				op_jr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_addiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addi(this);
		}
	}

	public final Op_addiContext op_addi() throws RecognitionException {
		Op_addiContext _localctx = new Op_addiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_addi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__22);
			setState(274);
			((Op_addiContext)_localctx).rt = reg();
			setState(275);
			match(T__9);
			setState(276);
			((Op_addiContext)_localctx).rs = reg();
			setState(277);
			match(T__9);
			setState(278);
			signed_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_addiuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_addiuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_addiu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_addiu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_addiu(this);
		}
	}

	public final Op_addiuContext op_addiu() throws RecognitionException {
		Op_addiuContext _localctx = new Op_addiuContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_addiu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__23);
			setState(281);
			((Op_addiuContext)_localctx).rt = reg();
			setState(282);
			match(T__9);
			setState(283);
			((Op_addiuContext)_localctx).rs = reg();
			setState(284);
			match(T__9);
			setState(285);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_lwContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lw(this);
		}
	}

	public final Op_lwContext op_lw() throws RecognitionException {
		Op_lwContext _localctx = new Op_lwContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_lw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__24);
			setState(288);
			((Op_lwContext)_localctx).rt = reg();
			setState(289);
			match(T__9);
			setState(290);
			signed_imm();
			setState(291);
			match(T__25);
			setState(292);
			((Op_lwContext)_localctx).rs = reg();
			setState(293);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_lhContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lh(this);
		}
	}

	public final Op_lhContext op_lh() throws RecognitionException {
		Op_lhContext _localctx = new Op_lhContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op_lh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__27);
			setState(296);
			((Op_lhContext)_localctx).rt = reg();
			setState(297);
			match(T__9);
			setState(298);
			signed_imm();
			setState(299);
			match(T__25);
			setState(300);
			((Op_lhContext)_localctx).rs = reg();
			setState(301);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_lhuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lhu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lhu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lhu(this);
		}
	}

	public final Op_lhuContext op_lhu() throws RecognitionException {
		Op_lhuContext _localctx = new Op_lhuContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_lhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__28);
			setState(304);
			((Op_lhuContext)_localctx).rt = reg();
			setState(305);
			match(T__9);
			setState(306);
			signed_imm();
			setState(307);
			match(T__25);
			setState(308);
			((Op_lhuContext)_localctx).rs = reg();
			setState(309);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_lbContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lb(this);
		}
	}

	public final Op_lbContext op_lb() throws RecognitionException {
		Op_lbContext _localctx = new Op_lbContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__29);
			setState(312);
			((Op_lbContext)_localctx).rt = reg();
			setState(313);
			match(T__9);
			setState(314);
			signed_imm();
			setState(315);
			match(T__25);
			setState(316);
			((Op_lbContext)_localctx).rs = reg();
			setState(317);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_lbuContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_lbuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lbu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lbu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lbu(this);
		}
	}

	public final Op_lbuContext op_lbu() throws RecognitionException {
		Op_lbuContext _localctx = new Op_lbuContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_lbu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__30);
			setState(320);
			((Op_lbuContext)_localctx).rt = reg();
			setState(321);
			match(T__9);
			setState(322);
			signed_imm();
			setState(323);
			match(T__25);
			setState(324);
			((Op_lbuContext)_localctx).rs = reg();
			setState(325);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_swContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_swContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sw(this);
		}
	}

	public final Op_swContext op_sw() throws RecognitionException {
		Op_swContext _localctx = new Op_swContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_sw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__31);
			setState(328);
			((Op_swContext)_localctx).rt = reg();
			setState(329);
			match(T__9);
			setState(330);
			signed_imm();
			setState(331);
			match(T__25);
			setState(332);
			((Op_swContext)_localctx).rs = reg();
			setState(333);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_shContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_shContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sh(this);
		}
	}

	public final Op_shContext op_sh() throws RecognitionException {
		Op_shContext _localctx = new Op_shContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_sh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__32);
			setState(336);
			((Op_shContext)_localctx).rt = reg();
			setState(337);
			match(T__9);
			setState(338);
			signed_imm();
			setState(339);
			match(T__25);
			setState(340);
			((Op_shContext)_localctx).rs = reg();
			setState(341);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sbContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_sb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_sb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_sb(this);
		}
	}

	public final Op_sbContext op_sb() throws RecognitionException {
		Op_sbContext _localctx = new Op_sbContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_sb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__33);
			setState(344);
			((Op_sbContext)_localctx).rt = reg();
			setState(345);
			match(T__9);
			setState(346);
			signed_imm();
			setState(347);
			match(T__25);
			setState(348);
			((Op_sbContext)_localctx).rs = reg();
			setState(349);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_luiContext extends ParserRuleContext {
		public RegContext rt;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op_luiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_lui; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_lui(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_lui(this);
		}
	}

	public final Op_luiContext op_lui() throws RecognitionException {
		Op_luiContext _localctx = new Op_luiContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_lui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__34);
			setState(352);
			((Op_luiContext)_localctx).rt = reg();
			setState(353);
			match(T__9);
			setState(354);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_andiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_andiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_andi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_andi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_andi(this);
		}
	}

	public final Op_andiContext op_andi() throws RecognitionException {
		Op_andiContext _localctx = new Op_andiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_andi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__35);
			setState(357);
			((Op_andiContext)_localctx).rt = reg();
			setState(358);
			match(T__9);
			setState(359);
			((Op_andiContext)_localctx).rs = reg();
			setState(360);
			match(T__9);
			setState(361);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_oriContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_oriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_ori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_ori(this);
		}
	}

	public final Op_oriContext op_ori() throws RecognitionException {
		Op_oriContext _localctx = new Op_oriContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_ori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__36);
			setState(364);
			((Op_oriContext)_localctx).rt = reg();
			setState(365);
			match(T__9);
			setState(366);
			((Op_oriContext)_localctx).rs = reg();
			setState(367);
			match(T__9);
			setState(368);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_noriContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Usigned_immContext usigned_imm() {
			return getRuleContext(Usigned_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_noriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_nori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_nori(this);
		}
	}

	public final Op_noriContext op_nori() throws RecognitionException {
		Op_noriContext _localctx = new Op_noriContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_nori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__37);
			setState(371);
			((Op_noriContext)_localctx).rt = reg();
			setState(372);
			match(T__9);
			setState(373);
			((Op_noriContext)_localctx).rs = reg();
			setState(374);
			match(T__9);
			setState(375);
			usigned_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sltiContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_sltiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_slti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_slti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_slti(this);
		}
	}

	public final Op_sltiContext op_slti() throws RecognitionException {
		Op_sltiContext _localctx = new Op_sltiContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_slti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__38);
			setState(378);
			((Op_sltiContext)_localctx).rt = reg();
			setState(379);
			match(T__9);
			setState(380);
			((Op_sltiContext)_localctx).rs = reg();
			setState(381);
			match(T__9);
			setState(382);
			signed_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_beqContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext rt;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_beqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_beq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_beq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_beq(this);
		}
	}

	public final Op_beqContext op_beq() throws RecognitionException {
		Op_beqContext _localctx = new Op_beqContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_beq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__39);
			setState(385);
			((Op_beqContext)_localctx).rs = reg();
			setState(386);
			match(T__9);
			setState(387);
			((Op_beqContext)_localctx).rt = reg();
			setState(388);
			match(T__9);
			setState(389);
			((Op_beqContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bneContext extends ParserRuleContext {
		public RegContext rs;
		public RegContext rt;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bne(this);
		}
	}

	public final Op_bneContext op_bne() throws RecognitionException {
		Op_bneContext _localctx = new Op_bneContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_bne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__40);
			setState(392);
			((Op_bneContext)_localctx).rs = reg();
			setState(393);
			match(T__9);
			setState(394);
			((Op_bneContext)_localctx).rt = reg();
			setState(395);
			match(T__9);
			setState(396);
			((Op_bneContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bgtzContext extends ParserRuleContext {
		public RegContext rs;
		public IdenContext target;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bgtzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bgtz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bgtz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bgtz(this);
		}
	}

	public final Op_bgtzContext op_bgtz() throws RecognitionException {
		Op_bgtzContext _localctx = new Op_bgtzContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_bgtz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__41);
			setState(399);
			((Op_bgtzContext)_localctx).rs = reg();
			setState(400);
			match(T__9);
			setState(401);
			((Op_bgtzContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_iContext extends ParserRuleContext {
		public Op_addiContext op_addi() {
			return getRuleContext(Op_addiContext.class,0);
		}
		public Op_addiuContext op_addiu() {
			return getRuleContext(Op_addiuContext.class,0);
		}
		public Op_lwContext op_lw() {
			return getRuleContext(Op_lwContext.class,0);
		}
		public Op_lhContext op_lh() {
			return getRuleContext(Op_lhContext.class,0);
		}
		public Op_lhuContext op_lhu() {
			return getRuleContext(Op_lhuContext.class,0);
		}
		public Op_lbContext op_lb() {
			return getRuleContext(Op_lbContext.class,0);
		}
		public Op_lbuContext op_lbu() {
			return getRuleContext(Op_lbuContext.class,0);
		}
		public Op_swContext op_sw() {
			return getRuleContext(Op_swContext.class,0);
		}
		public Op_shContext op_sh() {
			return getRuleContext(Op_shContext.class,0);
		}
		public Op_sbContext op_sb() {
			return getRuleContext(Op_sbContext.class,0);
		}
		public Op_luiContext op_lui() {
			return getRuleContext(Op_luiContext.class,0);
		}
		public Op_andiContext op_andi() {
			return getRuleContext(Op_andiContext.class,0);
		}
		public Op_oriContext op_ori() {
			return getRuleContext(Op_oriContext.class,0);
		}
		public Op_noriContext op_nori() {
			return getRuleContext(Op_noriContext.class,0);
		}
		public Op_sltiContext op_slti() {
			return getRuleContext(Op_sltiContext.class,0);
		}
		public Op_beqContext op_beq() {
			return getRuleContext(Op_beqContext.class,0);
		}
		public Op_bneContext op_bne() {
			return getRuleContext(Op_bneContext.class,0);
		}
		public Op_bgtzContext op_bgtz() {
			return getRuleContext(Op_bgtzContext.class,0);
		}
		public Instr_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_i(this);
		}
	}

	public final Instr_iContext instr_i() throws RecognitionException {
		Instr_iContext _localctx = new Instr_iContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_instr_i);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				op_addi();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				op_addiu();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				op_lw();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				op_lh();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				op_lhu();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(408);
				op_lb();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(409);
				op_lbu();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				op_sw();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				op_sh();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 10);
				{
				setState(412);
				op_sb();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 11);
				{
				setState(413);
				op_lui();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 12);
				{
				setState(414);
				op_andi();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 13);
				{
				setState(415);
				op_ori();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 14);
				{
				setState(416);
				op_nori();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 15);
				{
				setState(417);
				op_slti();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 16);
				{
				setState(418);
				op_beq();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 17);
				{
				setState(419);
				op_bne();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 18);
				{
				setState(420);
				op_bgtz();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_jContext extends ParserRuleContext {
		public IdenContext target;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_jContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_j(this);
		}
	}

	public final Op_jContext op_j() throws RecognitionException {
		Op_jContext _localctx = new Op_jContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_j);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__42);
			setState(424);
			((Op_jContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_jalContext extends ParserRuleContext {
		public IdenContext target;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_jalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_jal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_jal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_jal(this);
		}
	}

	public final Op_jalContext op_jal() throws RecognitionException {
		Op_jalContext _localctx = new Op_jalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_jal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__43);
			setState(427);
			((Op_jalContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_jContext extends ParserRuleContext {
		public Op_jContext op_j() {
			return getRuleContext(Op_jContext.class,0);
		}
		public Op_jalContext op_jal() {
			return getRuleContext(Op_jalContext.class,0);
		}
		public Instr_jContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_j(this);
		}
	}

	public final Instr_jContext instr_j() throws RecognitionException {
		Instr_jContext _localctx = new Instr_jContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_instr_j);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				op_j();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				op_jal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_syscallContext extends ParserRuleContext {
		public Op_syscallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_syscall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_syscall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_syscall(this);
		}
	}

	public final Op_syscallContext op_syscall() throws RecognitionException {
		Op_syscallContext _localctx = new Op_syscallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_op_syscall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_sContext extends ParserRuleContext {
		public Op_syscallContext op_syscall() {
			return getRuleContext(Op_syscallContext.class,0);
		}
		public Instr_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_s(this);
		}
	}

	public final Instr_sContext instr_s() throws RecognitionException {
		Instr_sContext _localctx = new Instr_sContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_instr_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			op_syscall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bleContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_ble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_ble(this);
		}
	}

	public final Op_bleContext op_ble() throws RecognitionException {
		Op_bleContext _localctx = new Op_bleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_ble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__45);
			setState(438);
			((Op_bleContext)_localctx).rt = reg();
			setState(439);
			match(T__9);
			setState(440);
			((Op_bleContext)_localctx).rs = reg();
			setState(441);
			match(T__9);
			setState(442);
			((Op_bleContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bltContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_blt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_blt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_blt(this);
		}
	}

	public final Op_bltContext op_blt() throws RecognitionException {
		Op_bltContext _localctx = new Op_bltContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_blt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__46);
			setState(445);
			((Op_bltContext)_localctx).rt = reg();
			setState(446);
			match(T__9);
			setState(447);
			((Op_bltContext)_localctx).rs = reg();
			setState(448);
			match(T__9);
			setState(449);
			((Op_bltContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bgeContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bge(this);
		}
	}

	public final Op_bgeContext op_bge() throws RecognitionException {
		Op_bgeContext _localctx = new Op_bgeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_bge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__47);
			setState(452);
			((Op_bgeContext)_localctx).rt = reg();
			setState(453);
			match(T__9);
			setState(454);
			((Op_bgeContext)_localctx).rs = reg();
			setState(455);
			match(T__9);
			setState(456);
			((Op_bgeContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_bgtContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public IdenContext target;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_bgtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bgt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_bgt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_bgt(this);
		}
	}

	public final Op_bgtContext op_bgt() throws RecognitionException {
		Op_bgtContext _localctx = new Op_bgtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_op_bgt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__48);
			setState(459);
			((Op_bgtContext)_localctx).rt = reg();
			setState(460);
			match(T__9);
			setState(461);
			((Op_bgtContext)_localctx).rs = reg();
			setState(462);
			match(T__9);
			setState(463);
			((Op_bgtContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_liContext extends ParserRuleContext {
		public RegContext rt;
		public Signed_immContext signed_imm() {
			return getRuleContext(Signed_immContext.class,0);
		}
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op_liContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_li; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_li(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_li(this);
		}
	}

	public final Op_liContext op_li() throws RecognitionException {
		Op_liContext _localctx = new Op_liContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_li);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__49);
			setState(466);
			((Op_liContext)_localctx).rt = reg();
			setState(467);
			match(T__9);
			setState(468);
			signed_imm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_laContext extends ParserRuleContext {
		public RegContext rt;
		public IdenContext target;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public Op_laContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_la; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_la(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_la(this);
		}
	}

	public final Op_laContext op_la() throws RecognitionException {
		Op_laContext _localctx = new Op_laContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_la);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__50);
			setState(471);
			((Op_laContext)_localctx).rt = reg();
			setState(472);
			match(T__9);
			setState(473);
			((Op_laContext)_localctx).target = iden();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_moveContext extends ParserRuleContext {
		public RegContext rt;
		public RegContext rs;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public Op_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_move(this);
		}
	}

	public final Op_moveContext op_move() throws RecognitionException {
		Op_moveContext _localctx = new Op_moveContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_op_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(T__51);
			setState(476);
			((Op_moveContext)_localctx).rt = reg();
			setState(477);
			match(T__9);
			setState(478);
			((Op_moveContext)_localctx).rs = reg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_pContext extends ParserRuleContext {
		public Op_bleContext op_ble() {
			return getRuleContext(Op_bleContext.class,0);
		}
		public Op_bltContext op_blt() {
			return getRuleContext(Op_bltContext.class,0);
		}
		public Op_bgeContext op_bge() {
			return getRuleContext(Op_bgeContext.class,0);
		}
		public Op_bgtContext op_bgt() {
			return getRuleContext(Op_bgtContext.class,0);
		}
		public Op_liContext op_li() {
			return getRuleContext(Op_liContext.class,0);
		}
		public Op_moveContext op_move() {
			return getRuleContext(Op_moveContext.class,0);
		}
		public Op_laContext op_la() {
			return getRuleContext(Op_laContext.class,0);
		}
		public Instr_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr_p(this);
		}
	}

	public final Instr_pContext instr_p() throws RecognitionException {
		Instr_pContext _localctx = new Instr_pContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_instr_p);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				op_ble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				op_ble();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				op_blt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				op_bge();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				op_bgt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				op_li();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(486);
				op_move();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(487);
				op_la();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_haltContext extends ParserRuleContext {
		public Op_haltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_halt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterOp_halt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitOp_halt(this);
		}
	}

	public final Op_haltContext op_halt() throws RecognitionException {
		Op_haltContext _localctx = new Op_haltContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_op_halt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public Instr_rContext instr_r() {
			return getRuleContext(Instr_rContext.class,0);
		}
		public Instr_iContext instr_i() {
			return getRuleContext(Instr_iContext.class,0);
		}
		public Instr_jContext instr_j() {
			return getRuleContext(Instr_jContext.class,0);
		}
		public Op_haltContext op_halt() {
			return getRuleContext(Op_haltContext.class,0);
		}
		public Instr_pContext instr_p() {
			return getRuleContext(Instr_pContext.class,0);
		}
		public Instr_sContext instr_s() {
			return getRuleContext(Instr_sContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MipsAsmParser.COMMENT, 0); }
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		return instr(0);
	}

	private InstrContext instr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstrContext _localctx = new InstrContext(_ctx, _parentState);
		InstrContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_instr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				{
				setState(493);
				instr_r();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				{
				setState(494);
				instr_i();
				}
				break;
			case T__42:
			case T__43:
				{
				setState(495);
				instr_j();
				}
				break;
			case T__52:
				{
				setState(496);
				op_halt();
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
				{
				setState(497);
				instr_p();
				}
				break;
			case T__44:
				{
				setState(498);
				instr_s();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instr);
					setState(501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(502);
					match(COMMENT);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SegmentContext extends ParserRuleContext {
		public Data_segmentContext data_segment() {
			return getRuleContext(Data_segmentContext.class,0);
		}
		public Text_segmentContext text_segment() {
			return getRuleContext(Text_segmentContext.class,0);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsAsmListener ) ((MipsAsmListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_segment);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				data_segment();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				text_segment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 56:
			return instr_sempred((InstrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instr_sempred(InstrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0203\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2x\n\2"+
		"\r\2\16\2y\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\5\t\u009d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0112\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01a8\n+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\5.\u01b2\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\58\u01eb"+
		"\n8\39\39\3:\3:\3:\3:\3:\3:\3:\5:\u01f6\n:\3:\3:\7:\u01fa\n:\f:\16:\u01fd"+
		"\13:\3;\3;\5;\u0201\n;\3;\2\3r<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\4\4\2\6\t@E\3"+
		"\2;<\2\u01fe\2w\3\2\2\2\4{\3\2\2\2\6~\3\2\2\2\b\u0081\3\2\2\2\n\u0093"+
		"\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u009c\3\2\2\2\22\u00ab\3"+
		"\2\2\2\24\u00ad\3\2\2\2\26\u00b4\3\2\2\2\30\u00bb\3\2\2\2\32\u00c2\3\2"+
		"\2\2\34\u00c9\3\2\2\2\36\u00d0\3\2\2\2 \u00d7\3\2\2\2\"\u00de\3\2\2\2"+
		"$\u00e5\3\2\2\2&\u00ec\3\2\2\2(\u00f3\3\2\2\2*\u00fa\3\2\2\2,\u0101\3"+
		"\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u011a\3\2\2\2\64\u0121\3\2\2"+
		"\2\66\u0129\3\2\2\28\u0131\3\2\2\2:\u0139\3\2\2\2<\u0141\3\2\2\2>\u0149"+
		"\3\2\2\2@\u0151\3\2\2\2B\u0159\3\2\2\2D\u0161\3\2\2\2F\u0166\3\2\2\2H"+
		"\u016d\3\2\2\2J\u0174\3\2\2\2L\u017b\3\2\2\2N\u0182\3\2\2\2P\u0189\3\2"+
		"\2\2R\u0190\3\2\2\2T\u01a7\3\2\2\2V\u01a9\3\2\2\2X\u01ac\3\2\2\2Z\u01b1"+
		"\3\2\2\2\\\u01b3\3\2\2\2^\u01b5\3\2\2\2`\u01b7\3\2\2\2b\u01be\3\2\2\2"+
		"d\u01c5\3\2\2\2f\u01cc\3\2\2\2h\u01d3\3\2\2\2j\u01d8\3\2\2\2l\u01dd\3"+
		"\2\2\2n\u01ea\3\2\2\2p\u01ec\3\2\2\2r\u01f5\3\2\2\2t\u0200\3\2\2\2vx\5"+
		"\22\n\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\3\3\2\2\2{|\7\3\2\2|"+
		"}\79\2\2}\5\3\2\2\2~\177\7\4\2\2\177\u0080\79\2\2\u0080\7\3\2\2\2\u0081"+
		"\u0082\7>\2\2\u0082\t\3\2\2\2\u0083\u0084\5\b\5\2\u0084\u0085\7\5\2\2"+
		"\u0085\u0094\3\2\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7\5\2\2\u0088\u0089"+
		"\79\2\2\u0089\u0094\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c\7\5\2\2\u008c"+
		"\u008d\79\2\2\u008d\u008e\5\22\n\2\u008e\u0094\3\2\2\2\u008f\u0090\5\b"+
		"\5\2\u0090\u0091\7\5\2\2\u0091\u0092\5\22\n\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0083\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0094\13\3\2\2\2\u0095\u0096\t\2\2\2\u0096\r\3\2\2\2\u0097\u0098"+
		"\t\3\2\2\u0098\17\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u009d\5\16\b\2\u009b"+
		"\u009d\5\16\b\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d\21\3\2\2"+
		"\2\u009e\u009f\5r:\2\u009f\u00a0\79\2\2\u00a0\u00ac\3\2\2\2\u00a1\u00ac"+
		"\5r:\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\5r:\2\u00a4\u00a5\79\2\2\u00a5"+
		"\u00ac\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7\u00a8\5r:\2\u00a8\u00ac\3\2\2"+
		"\2\u00a9\u00ac\79\2\2\u00aa\u00ac\7:\2\2\u00ab\u009e\3\2\2\2\u00ab\u00a1"+
		"\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5\f\7"+
		"\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3"+
		"\5\f\7\2\u00b3\25\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\f\7\2\u00b6"+
		"\u00b7\7\f\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\f"+
		"\7\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be"+
		"\7\f\2\2\u00be\u00bf\5\f\7\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5\f\7\2\u00c1"+
		"\31\3\2\2\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7\f\2"+
		"\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\f\7\2\u00c8\33"+
		"\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\5\f\7\2\u00cb\u00cc\7\f\2\2"+
		"\u00cc\u00cd\5\f\7\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\f\7\2\u00cf\35"+
		"\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2\5\f\7\2\u00d2\u00d3\7\f\2\2"+
		"\u00d3\u00d4\5\f\7\2\u00d4\u00d5\7\f\2\2\u00d5\u00d6\5\f\7\2\u00d6\37"+
		"\3\2\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\7\f\2\2"+
		"\u00da\u00db\5\f\7\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\5\f\7\2\u00dd!\3"+
		"\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e0\5\f\7\2\u00e0\u00e1\7\f\2\2\u00e1"+
		"\u00e2\5\f\7\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\f\7\2\u00e4#\3\2\2\2"+
		"\u00e5\u00e6\7\24\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9"+
		"\5\f\7\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\5\f\7\2\u00eb%\3\2\2\2\u00ec"+
		"\u00ed\7\25\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\5"+
		"\f\7\2\u00f0\u00f1\7\f\2\2\u00f1\u00f2\5\16\b\2\u00f2\'\3\2\2\2\u00f3"+
		"\u00f4\7\26\2\2\u00f4\u00f5\5\f\7\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\5"+
		"\f\7\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\5\16\b\2\u00f9)\3\2\2\2\u00fa\u00fb"+
		"\7\27\2\2\u00fb\u00fc\5\f\7\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\5\f\7\2"+
		"\u00fe\u00ff\7\f\2\2\u00ff\u0100\5\16\b\2\u0100+\3\2\2\2\u0101\u0102\7"+
		"\30\2\2\u0102\u0103\5\f\7\2\u0103-\3\2\2\2\u0104\u0112\5\24\13\2\u0105"+
		"\u0112\5\26\f\2\u0106\u0112\5\30\r\2\u0107\u0112\5\32\16\2\u0108\u0112"+
		"\5\34\17\2\u0109\u0112\5\36\20\2\u010a\u0112\5 \21\2\u010b\u0112\5\"\22"+
		"\2\u010c\u0112\5$\23\2\u010d\u0112\5&\24\2\u010e\u0112\5(\25\2\u010f\u0112"+
		"\5*\26\2\u0110\u0112\5,\27\2\u0111\u0104\3\2\2\2\u0111\u0105\3\2\2\2\u0111"+
		"\u0106\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109\3\2"+
		"\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112/\3\2\2\2\u0113\u0114\7\31\2\2\u0114\u0115\5\f\7\2\u0115\u0116"+
		"\7\f\2\2\u0116\u0117\5\f\7\2\u0117\u0118\7\f\2\2\u0118\u0119\5\20\t\2"+
		"\u0119\61\3\2\2\2\u011a\u011b\7\32\2\2\u011b\u011c\5\f\7\2\u011c\u011d"+
		"\7\f\2\2\u011d\u011e\5\f\7\2\u011e\u011f\7\f\2\2\u011f\u0120\5\16\b\2"+
		"\u0120\63\3\2\2\2\u0121\u0122\7\33\2\2\u0122\u0123\5\f\7\2\u0123\u0124"+
		"\7\f\2\2\u0124\u0125\5\20\t\2\u0125\u0126\7\34\2\2\u0126\u0127\5\f\7\2"+
		"\u0127\u0128\7\35\2\2\u0128\65\3\2\2\2\u0129\u012a\7\36\2\2\u012a\u012b"+
		"\5\f\7\2\u012b\u012c\7\f\2\2\u012c\u012d\5\20\t\2\u012d\u012e\7\34\2\2"+
		"\u012e\u012f\5\f\7\2\u012f\u0130\7\35\2\2\u0130\67\3\2\2\2\u0131\u0132"+
		"\7\37\2\2\u0132\u0133\5\f\7\2\u0133\u0134\7\f\2\2\u0134\u0135\5\20\t\2"+
		"\u0135\u0136\7\34\2\2\u0136\u0137\5\f\7\2\u0137\u0138\7\35\2\2\u01389"+
		"\3\2\2\2\u0139\u013a\7 \2\2\u013a\u013b\5\f\7\2\u013b\u013c\7\f\2\2\u013c"+
		"\u013d\5\20\t\2\u013d\u013e\7\34\2\2\u013e\u013f\5\f\7\2\u013f\u0140\7"+
		"\35\2\2\u0140;\3\2\2\2\u0141\u0142\7!\2\2\u0142\u0143\5\f\7\2\u0143\u0144"+
		"\7\f\2\2\u0144\u0145\5\20\t\2\u0145\u0146\7\34\2\2\u0146\u0147\5\f\7\2"+
		"\u0147\u0148\7\35\2\2\u0148=\3\2\2\2\u0149\u014a\7\"\2\2\u014a\u014b\5"+
		"\f\7\2\u014b\u014c\7\f\2\2\u014c\u014d\5\20\t\2\u014d\u014e\7\34\2\2\u014e"+
		"\u014f\5\f\7\2\u014f\u0150\7\35\2\2\u0150?\3\2\2\2\u0151\u0152\7#\2\2"+
		"\u0152\u0153\5\f\7\2\u0153\u0154\7\f\2\2\u0154\u0155\5\20\t\2\u0155\u0156"+
		"\7\34\2\2\u0156\u0157\5\f\7\2\u0157\u0158\7\35\2\2\u0158A\3\2\2\2\u0159"+
		"\u015a\7$\2\2\u015a\u015b\5\f\7\2\u015b\u015c\7\f\2\2\u015c\u015d\5\20"+
		"\t\2\u015d\u015e\7\34\2\2\u015e\u015f\5\f\7\2\u015f\u0160\7\35\2\2\u0160"+
		"C\3\2\2\2\u0161\u0162\7%\2\2\u0162\u0163\5\f\7\2\u0163\u0164\7\f\2\2\u0164"+
		"\u0165\5\16\b\2\u0165E\3\2\2\2\u0166\u0167\7&\2\2\u0167\u0168\5\f\7\2"+
		"\u0168\u0169\7\f\2\2\u0169\u016a\5\f\7\2\u016a\u016b\7\f\2\2\u016b\u016c"+
		"\5\16\b\2\u016cG\3\2\2\2\u016d\u016e\7\'\2\2\u016e\u016f\5\f\7\2\u016f"+
		"\u0170\7\f\2\2\u0170\u0171\5\f\7\2\u0171\u0172\7\f\2\2\u0172\u0173\5\16"+
		"\b\2\u0173I\3\2\2\2\u0174\u0175\7(\2\2\u0175\u0176\5\f\7\2\u0176\u0177"+
		"\7\f\2\2\u0177\u0178\5\f\7\2\u0178\u0179\7\f\2\2\u0179\u017a\5\16\b\2"+
		"\u017aK\3\2\2\2\u017b\u017c\7)\2\2\u017c\u017d\5\f\7\2\u017d\u017e\7\f"+
		"\2\2\u017e\u017f\5\f\7\2\u017f\u0180\7\f\2\2\u0180\u0181\5\20\t\2\u0181"+
		"M\3\2\2\2\u0182\u0183\7*\2\2\u0183\u0184\5\f\7\2\u0184\u0185\7\f\2\2\u0185"+
		"\u0186\5\f\7\2\u0186\u0187\7\f\2\2\u0187\u0188\5\b\5\2\u0188O\3\2\2\2"+
		"\u0189\u018a\7+\2\2\u018a\u018b\5\f\7\2\u018b\u018c\7\f\2\2\u018c\u018d"+
		"\5\f\7\2\u018d\u018e\7\f\2\2\u018e\u018f\5\b\5\2\u018fQ\3\2\2\2\u0190"+
		"\u0191\7,\2\2\u0191\u0192\5\f\7\2\u0192\u0193\7\f\2\2\u0193\u0194\5\b"+
		"\5\2\u0194S\3\2\2\2\u0195\u01a8\5\60\31\2\u0196\u01a8\5\62\32\2\u0197"+
		"\u01a8\5\64\33\2\u0198\u01a8\5\66\34\2\u0199\u01a8\58\35\2\u019a\u01a8"+
		"\5:\36\2\u019b\u01a8\5<\37\2\u019c\u01a8\5> \2\u019d\u01a8\5@!\2\u019e"+
		"\u01a8\5B\"\2\u019f\u01a8\5D#\2\u01a0\u01a8\5F$\2\u01a1\u01a8\5H%\2\u01a2"+
		"\u01a8\5J&\2\u01a3\u01a8\5L\'\2\u01a4\u01a8\5N(\2\u01a5\u01a8\5P)\2\u01a6"+
		"\u01a8\5R*\2\u01a7\u0195\3\2\2\2\u01a7\u0196\3\2\2\2\u01a7\u0197\3\2\2"+
		"\2\u01a7\u0198\3\2\2\2\u01a7\u0199\3\2\2\2\u01a7\u019a\3\2\2\2\u01a7\u019b"+
		"\3\2\2\2\u01a7\u019c\3\2\2\2\u01a7\u019d\3\2\2\2\u01a7\u019e\3\2\2\2\u01a7"+
		"\u019f\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7\u01a2\3\2"+
		"\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8U\3\2\2\2\u01a9\u01aa\7-\2\2\u01aa\u01ab\5\b\5\2\u01ab"+
		"W\3\2\2\2\u01ac\u01ad\7.\2\2\u01ad\u01ae\5\b\5\2\u01aeY\3\2\2\2\u01af"+
		"\u01b2\5V,\2\u01b0\u01b2\5X-\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2"+
		"\u01b2[\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4]\3\2\2\2\u01b5\u01b6\5\\/\2\u01b6"+
		"_\3\2\2\2\u01b7\u01b8\7\60\2\2\u01b8\u01b9\5\f\7\2\u01b9\u01ba\7\f\2\2"+
		"\u01ba\u01bb\5\f\7\2\u01bb\u01bc\7\f\2\2\u01bc\u01bd\5\b\5\2\u01bda\3"+
		"\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\5\f\7\2\u01c0\u01c1\7\f\2\2\u01c1"+
		"\u01c2\5\f\7\2\u01c2\u01c3\7\f\2\2\u01c3\u01c4\5\b\5\2\u01c4c\3\2\2\2"+
		"\u01c5\u01c6\7\62\2\2\u01c6\u01c7\5\f\7\2\u01c7\u01c8\7\f\2\2\u01c8\u01c9"+
		"\5\f\7\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\5\b\5\2\u01cbe\3\2\2\2\u01cc"+
		"\u01cd\7\63\2\2\u01cd\u01ce\5\f\7\2\u01ce\u01cf\7\f\2\2\u01cf\u01d0\5"+
		"\f\7\2\u01d0\u01d1\7\f\2\2\u01d1\u01d2\5\b\5\2\u01d2g\3\2\2\2\u01d3\u01d4"+
		"\7\64\2\2\u01d4\u01d5\5\f\7\2\u01d5\u01d6\7\f\2\2\u01d6\u01d7\5\20\t\2"+
		"\u01d7i\3\2\2\2\u01d8\u01d9\7\65\2\2\u01d9\u01da\5\f\7\2\u01da\u01db\7"+
		"\f\2\2\u01db\u01dc\5\b\5\2\u01dck\3\2\2\2\u01dd\u01de\7\66\2\2\u01de\u01df"+
		"\5\f\7\2\u01df\u01e0\7\f\2\2\u01e0\u01e1\5\f\7\2\u01e1m\3\2\2\2\u01e2"+
		"\u01eb\5`\61\2\u01e3\u01eb\5`\61\2\u01e4\u01eb\5b\62\2\u01e5\u01eb\5d"+
		"\63\2\u01e6\u01eb\5f\64\2\u01e7\u01eb\5h\65\2\u01e8\u01eb\5l\67\2\u01e9"+
		"\u01eb\5j\66\2\u01ea\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2"+
		"\2\2\u01ea\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebo\3\2\2\2\u01ec\u01ed\7\67\2\2"+
		"\u01edq\3\2\2\2\u01ee\u01ef\b:\1\2\u01ef\u01f6\5.\30\2\u01f0\u01f6\5T"+
		"+\2\u01f1\u01f6\5Z.\2\u01f2\u01f6\5p9\2\u01f3\u01f6\5n8\2\u01f4\u01f6"+
		"\5^\60\2\u01f5\u01ee\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f5"+
		"\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01fb\3\2"+
		"\2\2\u01f7\u01f8\f\3\2\2\u01f8\u01fa\7:\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcs\3\2\2\2"+
		"\u01fd\u01fb\3\2\2\2\u01fe\u0201\5\6\4\2\u01ff\u0201\5\4\3\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u01ff\3\2\2\2\u0201u\3\2\2\2\ry\u0093\u009c\u00ab\u0111"+
		"\u01a7\u01b1\u01ea\u01f5\u01fb\u0200";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}