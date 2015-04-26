// Generated from Simple.g4 by ANTLR 4.2

package com.ags.antlrtest.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, EQU=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, FLOAT=10, 
		NL=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'='", "'*'", "'/'", "'+'", "'-'", "ID", "INT", "FLOAT", 
		"NL", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "EQU", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "FLOAT", 
		"NL", "WS", "DIGIT"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\6\t-\n\t\r\t\16\t.\3\n\6\n\62\n\n\r\n\16\n\63\3\13"+
		"\6\13\67\n\13\r\13\16\138\3\13\3\13\7\13=\n\13\f\13\16\13@\13\13\3\13"+
		"\3\13\6\13D\n\13\r\13\16\13E\5\13H\n\13\3\f\5\fK\n\f\3\f\3\f\3\r\6\rP"+
		"\n\r\r\r\16\rQ\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\2\3\2\5\3\2C|\3\2\13\13\3\2\62;]\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'"+
		"\3\2\2\2\17)\3\2\2\2\21,\3\2\2\2\23\61\3\2\2\2\25G\3\2\2\2\27J\3\2\2\2"+
		"\31O\3\2\2\2\33U\3\2\2\2\35\36\7+\2\2\36\4\3\2\2\2\37 \7*\2\2 \6\3\2\2"+
		"\2!\"\7?\2\2\"\b\3\2\2\2#$\7,\2\2$\n\3\2\2\2%&\7\61\2\2&\f\3\2\2\2\'("+
		"\7-\2\2(\16\3\2\2\2)*\7/\2\2*\20\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\22\3\2\2\2\60\62\5\33\16\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\24\3\2\2\2\65\67\5\33\16\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:>\7\60\2\2;=\5\33"+
		"\16\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?H\3\2\2\2@>\3\2\2\2AC\7"+
		"\60\2\2BD\5\33\16\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"G\66\3\2\2\2GA\3\2\2\2H\26\3\2\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3"+
		"\2\2\2LM\7\f\2\2M\30\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2Q"+
		"R\3\2\2\2RS\3\2\2\2ST\b\r\2\2T\32\3\2\2\2UV\t\4\2\2V\34\3\2\2\2\13\2."+
		"\638>EGJQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}