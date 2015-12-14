// Generated from de/lab4inf/wrb/WRBParser.g4 by ANTLR 4.5
package de.lab4inf.wrb;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WRBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, DIV=3, MUL=4, MOD=5, POW=6, COMMA=7, COLONE=8, SEMICOLONE=9, 
		DOT=10, ASSIGN=11, UNDERLINE=12, LPAREN=13, RPAREN=14, LBRACK=15, RBRACK=16, 
		INFINITY=17, ID=18, DOUBLE_=19, INTEGER=20, WS=21;
	public static final int
		RULE_eval = 0, RULE_declareVarExp = 1, RULE_assignVarToVar = 2, RULE_assignVar = 3, 
		RULE_assignFunc = 4, RULE_expr = 5, RULE_term = 6, RULE_atomExp = 7, RULE_number = 8;
	public static final String[] ruleNames = {
		"eval", "declareVarExp", "assignVarToVar", "assignVar", "assignFunc", 
		"expr", "term", "atomExp", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'/'", "'*'", "'%'", null, "','", "':'", "';'", "'.'", 
		"'='", "'_'", "'('", "')'", "'['", "']'", "'Infinity'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "SUB", "DIV", "MUL", "MOD", "POW", "COMMA", "COLONE", "SEMICOLONE", 
		"DOT", "ASSIGN", "UNDERLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"INFINITY", "ID", "DOUBLE_", "INTEGER", "WS"
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
	public String getGrammarFileName() { return "WRBParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WRBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public DeclareVarExpContext declareVarExp() {
			return getRuleContext(DeclareVarExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WRBParser.EOF, 0); }
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			declareVarExp();
			setState(19);
			match(EOF);
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

	public static class DeclareVarExpContext extends ParserRuleContext {
		public AssignVarToVarContext assignVarToVar() {
			return getRuleContext(AssignVarToVarContext.class,0);
		}
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public AssignFuncContext assignFunc() {
			return getRuleContext(AssignFuncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLONE() { return getTokens(WRBParser.SEMICOLONE); }
		public TerminalNode SEMICOLONE(int i) {
			return getToken(WRBParser.SEMICOLONE, i);
		}
		public List<DeclareVarExpContext> declareVarExp() {
			return getRuleContexts(DeclareVarExpContext.class);
		}
		public DeclareVarExpContext declareVarExp(int i) {
			return getRuleContext(DeclareVarExpContext.class,i);
		}
		public DeclareVarExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVarExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterDeclareVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitDeclareVarExp(this);
		}
	}

	public final DeclareVarExpContext declareVarExp() throws RecognitionException {
		DeclareVarExpContext _localctx = new DeclareVarExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declareVarExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(21);
				assignVarToVar();
				}
				break;
			case 2:
				{
				setState(22);
				assignVar();
				}
				break;
			case 3:
				{
				setState(23);
				assignFunc();
				}
				break;
			case 4:
				{
				setState(24);
				expr();
				}
				break;
			}
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(27);
						match(SEMICOLONE);
						setState(28);
						declareVarExp();
						}
						} 
					}
					setState(33);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				{
				{
				setState(35);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					match(SEMICOLONE);
					}
					break;
				}
				}
				}
				break;
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

	public static class AssignVarToVarContext extends ParserRuleContext {
		public Token left;
		public Token sign;
		public Token right;
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public AssignVarToVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVarToVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterAssignVarToVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitAssignVarToVar(this);
		}
	}

	public final AssignVarToVarContext assignVarToVar() throws RecognitionException {
		AssignVarToVarContext _localctx = new AssignVarToVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignVarToVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((AssignVarToVarContext)_localctx).left = match(ID);
			setState(40);
			match(ASSIGN);
			setState(42);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(41);
				((AssignVarToVarContext)_localctx).sign = match(SUB);
				}
			}

			setState(44);
			((AssignVarToVarContext)_localctx).right = match(ID);
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

	public static class AssignVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitAssignVar(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(ASSIGN);
			setState(48);
			expr();
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

	public static class AssignFuncContext extends ParserRuleContext {
		public Token name;
		public ExprContext value;
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(WRBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WRBParser.COMMA, i);
		}
		public AssignFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterAssignFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitAssignFunc(this);
		}
	}

	public final AssignFuncContext assignFunc() throws RecognitionException {
		AssignFuncContext _localctx = new AssignFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((AssignFuncContext)_localctx).name = match(ID);
			setState(51);
			match(LPAREN);
			setState(52);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RPAREN);
			setState(61);
			match(ASSIGN);
			setState(62);
			((AssignFuncContext)_localctx).value = expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddsubContext extends ExprContext {
		public Token ADD;
		public List<Token> operator = new ArrayList<Token>();
		public Token SUB;
		public Token _tset146;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(WRBParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(WRBParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(WRBParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(WRBParser.SUB, i);
		}
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitAddsub(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			_localctx = new AddsubContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			term();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(65);
				((AddsubContext)_localctx)._tset146 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddsubContext)_localctx)._tset146 = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((AddsubContext)_localctx).operator.add(((AddsubContext)_localctx)._tset146);
				setState(66);
				term();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultdivContext extends TermContext {
		public Token MUL;
		public List<Token> operator = new ArrayList<Token>();
		public Token DIV;
		public Token _tset170;
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(WRBParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(WRBParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(WRBParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(WRBParser.DIV, i);
		}
		public MultdivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterMultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitMultdiv(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			_localctx = new MultdivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			atomExp(0);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(73);
				((MultdivContext)_localctx)._tset170 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MUL) ) {
					((MultdivContext)_localctx)._tset170 = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((MultdivContext)_localctx).operator.add(((MultdivContext)_localctx)._tset170);
				setState(74);
				atomExp(0);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AtomExpContext extends ParserRuleContext {
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
	 
		public AtomExpContext() { }
		public void copyFrom(AtomExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends AtomExpContext {
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public IdContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitId(this);
		}
	}
	public static class ValContext extends AtomExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitVal(this);
		}
	}
	public static class FunctionAtomContext extends AtomExpContext {
		public Token name;
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(WRBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WRBParser.COMMA, i);
		}
		public FunctionAtomContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterFunctionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitFunctionAtom(this);
		}
	}
	public static class PowContext extends AtomExpContext {
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(WRBParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(WRBParser.POW, i);
		}
		public PowContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitPow(this);
		}
	}
	public static class ParensContext extends AtomExpContext {
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public ParensContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitParens(this);
		}
	}
	public static class InfinityContext extends AtomExpContext {
		public Token sign;
		public TerminalNode INFINITY() { return getToken(WRBParser.INFINITY, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public InfinityContext(AtomExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterInfinity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitInfinity(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		return atomExp(0);
	}

	private AtomExpContext atomExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomExpContext _localctx = new AtomExpContext(_ctx, _parentState);
		AtomExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_atomExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(81);
					match(SUB);
					}
				}

				{
				setState(84);
				match(LPAREN);
				setState(85);
				expr();
				setState(86);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				_localctx = new InfinityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(88);
					((InfinityContext)_localctx).sign = match(SUB);
					}
				}

				setState(91);
				match(INFINITY);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(92);
					match(SUB);
					}
				}

				setState(95);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				number();
				}
				break;
			case 5:
				{
				_localctx = new FunctionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((FunctionAtomContext)_localctx).name = match(ID);
				setState(98);
				match(LPAREN);
				setState(99);
				expr();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					expr();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowContext(new AtomExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_atomExp);
					setState(111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(114); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(112);
							match(POW);
							setState(113);
							atomExp(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(116); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public Token val;
		public TerminalNode INTEGER() { return getToken(WRBParser.INTEGER, 0); }
		public TerminalNode DOUBLE_() { return getToken(WRBParser.DOUBLE_, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(123);
				match(SUB);
				}
			}

			setState(126);
			((NumberContext)_localctx).val = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_ || _la==INTEGER) ) {
				((NumberContext)_localctx).val = (Token)_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return atomExp_sempred((AtomExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean atomExp_sempred(AtomExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3"+
		"\5\3&\n\3\5\3(\n\3\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7"+
		"F\n\7\f\7\16\7I\13\7\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t\5\tU"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\t\6\tu\n"+
		"\t\r\t\16\tv\7\ty\n\t\f\t\16\t|\13\t\3\n\5\n\177\n\n\3\n\3\n\3\n\2\3\20"+
		"\13\2\4\6\b\n\f\16\20\22\2\5\3\2\3\4\3\2\5\6\3\2\25\26\u008e\2\24\3\2"+
		"\2\2\4\33\3\2\2\2\6)\3\2\2\2\b\60\3\2\2\2\n\64\3\2\2\2\fB\3\2\2\2\16J"+
		"\3\2\2\2\20o\3\2\2\2\22~\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2"+
		"\2\2\27\34\5\6\4\2\30\34\5\b\5\2\31\34\5\n\6\2\32\34\5\f\7\2\33\27\3\2"+
		"\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\'\3\2\2\2\35\36\7\13"+
		"\2\2\36 \5\4\3\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"(\3\2"+
		"\2\2#!\3\2\2\2$&\7\13\2\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'!\3\2\2\2\'%"+
		"\3\2\2\2(\5\3\2\2\2)*\7\24\2\2*,\7\r\2\2+-\7\4\2\2,+\3\2\2\2,-\3\2\2\2"+
		"-.\3\2\2\2./\7\24\2\2/\7\3\2\2\2\60\61\7\24\2\2\61\62\7\r\2\2\62\63\5"+
		"\f\7\2\63\t\3\2\2\2\64\65\7\24\2\2\65\66\7\17\2\2\66;\7\24\2\2\678\7\t"+
		"\2\28:\7\24\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;"+
		"\3\2\2\2>?\7\20\2\2?@\7\r\2\2@A\5\f\7\2A\13\3\2\2\2BG\5\16\b\2CD\t\2\2"+
		"\2DF\5\16\b\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IG\3\2"+
		"\2\2JO\5\20\t\2KL\t\3\2\2LN\5\20\t\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P\17\3\2\2\2QO\3\2\2\2RT\b\t\1\2SU\7\4\2\2TS\3\2\2\2TU\3\2\2\2U"+
		"V\3\2\2\2VW\7\17\2\2WX\5\f\7\2XY\7\20\2\2Yp\3\2\2\2Z\\\7\4\2\2[Z\3\2\2"+
		"\2[\\\3\2\2\2\\]\3\2\2\2]p\7\23\2\2^`\7\4\2\2_^\3\2\2\2_`\3\2\2\2`a\3"+
		"\2\2\2ap\7\24\2\2bp\5\22\n\2cd\7\24\2\2de\7\17\2\2ej\5\f\7\2fg\7\t\2\2"+
		"gi\5\f\7\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2"+
		"mn\7\20\2\2np\3\2\2\2oR\3\2\2\2o[\3\2\2\2o_\3\2\2\2ob\3\2\2\2oc\3\2\2"+
		"\2pz\3\2\2\2qt\f\3\2\2rs\7\b\2\2su\5\20\t\2tr\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xq\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\21\3"+
		"\2\2\2|z\3\2\2\2}\177\7\4\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\t\4\2\2\u0081\23\3\2\2\2\22\33!%\',;GOT[_jovz~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}