// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, ID=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'sin'", "'tan'", "'('", "')'", "'*'", "'cos'", "'+'", 
		"'-'", "'='", "INT", "ID", "WS"
	};
	public static final int
		RULE_input = 0, RULE_setVar = 1, RULE_plusMinus = 2, RULE_mulDiv = 3, 
		RULE_atom = 4;
	public static final String[] ruleNames = {
		"input", "setVar", "plusMinus", "mulDiv", "atom"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetContext extends InputContext {
		public SetVarContext setVar() {
			return getRuleContext(SetVarContext.class,0);
		}
		public SetContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateContext extends InputContext {
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			setState(12);
			switch (_input.LA(1)) {
			case 2:
			case 3:
			case 4:
			case 7:
			case INT:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10); plusMinus(0);
				}
				break;
			case ID:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11); setVar();
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

	public static class SetVarContext extends ParserRuleContext {
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
	 
		public SetVarContext() { }
		public void copyFrom(SetVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends SetVarContext {
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public VariableContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setVar);
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(ID);
			setState(15); match(10);
			setState(16); plusMinus(0);
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

	public static class PlusMinusContext extends ParserRuleContext {
		public PlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinus; }
	 
		public PlusMinusContext() { }
		public void copyFrom(PlusMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMulDivContext extends PlusMinusContext {
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public ToMulDivContext(PlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitToMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends PlusMinusContext {
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public PlusContext(PlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends PlusMinusContext {
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public MinusContext(PlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusContext plusMinus() throws RecognitionException {
		return plusMinus(0);
	}

	private PlusMinusContext plusMinus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusMinusContext _localctx = new PlusMinusContext(_ctx, _parentState);
		PlusMinusContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_plusMinus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMulDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(19); mulDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new PlusMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusMinus);
						setState(21);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(22); match(8);
						setState(23); mulDiv(0);
						}
						break;

					case 2:
						{
						_localctx = new MinusContext(new PlusMinusContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_plusMinus);
						setState(24);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(25); match(9);
						setState(26); mulDiv(0);
						}
						break;
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MulDivContext extends ParserRuleContext {
		public MulDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDiv; }
	 
		public MulDivContext() { }
		public void copyFrom(MulDivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends MulDivContext {
		public MulDivContext mulDiv(int i) {
			return getRuleContext(MulDivContext.class,i);
		}
		public List<MulDivContext> mulDiv() {
			return getRuleContexts(MulDivContext.class);
		}
		public DivContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends MulDivContext {
		public MulDivContext mulDiv(int i) {
			return getRuleContext(MulDivContext.class,i);
		}
		public List<MulDivContext> mulDiv() {
			return getRuleContexts(MulDivContext.class);
		}
		public MulContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends MulDivContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivContext mulDiv() throws RecognitionException {
		return mulDiv(0);
	}

	private MulDivContext mulDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivContext _localctx = new MulDivContext(_ctx, _parentState);
		MulDivContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_mulDiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(33); atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(41);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new MulDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36); match(6);
						setState(37); mulDiv(4);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new MulDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
						setState(38);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(39); match(1);
						setState(40); mulDiv(3);
						}
						break;
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TanContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalcParser.INT, 0); }
		public TanContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends AtomContext {
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalcParser.INT, 0); }
		public CosContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalcParser.INT, 0); }
		public SinContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(CalcParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(4);
				setState(47); plusMinus(0);
				setState(48); match(5);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(INT);
				}
				break;
			case 7:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(7);
				setState(52); match(4);
				setState(53); match(INT);
				setState(54); match(5);
				}
				break;
			case 2:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55); match(2);
				setState(56); match(4);
				setState(57); match(INT);
				setState(58); match(5);
				}
				break;
			case 3:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59); match(3);
				setState(60); match(4);
				setState(61); match(INT);
				setState(62); match(5);
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
		case 2: return plusMinus_sempred((PlusMinusContext)_localctx, predIndex);

		case 3: return mulDiv_sempred((MulDivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean plusMinus_sempred(PlusMinusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulDiv_sempred(MulDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\2\4\6\b\7\2\4"+
		"\6\b\n\2\2G\2\16\3\2\2\2\4\20\3\2\2\2\6\24\3\2\2\2\b\"\3\2\2\2\nA\3\2"+
		"\2\2\f\17\5\6\4\2\r\17\5\4\3\2\16\f\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2"+
		"\20\21\7\16\2\2\21\22\7\f\2\2\22\23\5\6\4\2\23\5\3\2\2\2\24\25\b\4\1\2"+
		"\25\26\5\b\5\2\26\37\3\2\2\2\27\30\f\5\2\2\30\31\7\n\2\2\31\36\5\b\5\2"+
		"\32\33\f\4\2\2\33\34\7\13\2\2\34\36\5\b\5\2\35\27\3\2\2\2\35\32\3\2\2"+
		"\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\37\3\2\2\2\"#\b\5"+
		"\1\2#$\5\n\6\2$-\3\2\2\2%&\f\5\2\2&\'\7\b\2\2\',\5\b\5\6()\f\4\2\2)*\7"+
		"\3\2\2*,\5\b\5\5+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t"+
		"\3\2\2\2/-\3\2\2\2\60\61\7\6\2\2\61\62\5\6\4\2\62\63\7\7\2\2\63B\3\2\2"+
		"\2\64B\7\r\2\2\65\66\7\t\2\2\66\67\7\6\2\2\678\7\r\2\28B\7\7\2\29:\7\4"+
		"\2\2:;\7\6\2\2;<\7\r\2\2<B\7\7\2\2=>\7\5\2\2>?\7\6\2\2?@\7\r\2\2@B\7\7"+
		"\2\2A\60\3\2\2\2A\64\3\2\2\2A\65\3\2\2\2A9\3\2\2\2A=\3\2\2\2B\13\3\2\2"+
		"\2\b\16\35\37+-A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}