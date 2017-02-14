// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, ID=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'sin'", "'tan'", "'('", "')'", "'*'", "'cos'", "'+'", "'-'", "'='", 
		"INT", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "ID", "WS"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\6\f9\n\f\r\f\16\f:\3\r\3\r\7\r?\n\r\f\r\16\rB\13\r\3\16\6\16E\n\16\r"+
		"\16\16\16F\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7#\3\2\2"+
		"\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21\61\3\2\2\2\23\63"+
		"\3\2\2\2\25\65\3\2\2\2\278\3\2\2\2\31<\3\2\2\2\33D\3\2\2\2\35\36\7\61"+
		"\2\2\36\4\3\2\2\2\37 \7u\2\2 !\7k\2\2!\"\7p\2\2\"\6\3\2\2\2#$\7v\2\2$"+
		"%\7c\2\2%&\7p\2\2&\b\3\2\2\2\'(\7*\2\2(\n\3\2\2\2)*\7+\2\2*\f\3\2\2\2"+
		"+,\7,\2\2,\16\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7u\2\2\60\20\3\2\2\2\61\62"+
		"\7-\2\2\62\22\3\2\2\2\63\64\7/\2\2\64\24\3\2\2\2\65\66\7?\2\2\66\26\3"+
		"\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\30\3\2\2"+
		"\2<@\t\3\2\2=?\t\4\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\32\3\2"+
		"\2\2B@\3\2\2\2CE\t\5\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\b\16\2\2I\34\3\2\2\2\6\2:@F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}