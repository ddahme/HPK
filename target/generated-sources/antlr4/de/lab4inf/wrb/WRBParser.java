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
		ADD=1, SUB=2, DIV=3, MUL=4, EXP=5, MOD=6, COLONE=7, SEMICOLONE=8, DOT=9, 
		COMMA=10, ASSIGN=11, UNDERLINE=12, LPAREN=13, RPAREN=14, LBRACK=15, RBRACK=16, 
		INFINITY=17, ID=18, DOUBLE_=19, INTEGER=20, WS=21;
	public static final int
		RULE_eval = 0, RULE_program = 1, RULE_programPart = 2, RULE_functionCreate = 3, 
		RULE_functionCall = 4, RULE_assigntion = 5, RULE_expr = 6, RULE_addTerm = 7, 
		RULE_mulTerm = 8, RULE_expTerm = 9, RULE_atom = 10, RULE_constant = 11, 
		RULE_number = 12;
	public static final String[] ruleNames = {
		"eval", "program", "programPart", "functionCreate", "functionCall", "assigntion", 
		"expr", "addTerm", "mulTerm", "expTerm", "atom", "constant", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'/'", "'*'", null, "'%'", "':'", "';'", "'.'", "','", 
		"'='", "'_'", "'('", "')'", "'['", "']'", "'Infinity'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "SUB", "DIV", "MUL", "EXP", "MOD", "COLONE", "SEMICOLONE", 
		"DOT", "COMMA", "ASSIGN", "UNDERLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
			setState(26);
			program();
			setState(27);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public List<TerminalNode> SEMICOLONE() { return getTokens(WRBParser.SEMICOLONE); }
		public TerminalNode SEMICOLONE(int i) {
			return getToken(WRBParser.SEMICOLONE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			programPart();
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					match(SEMICOLONE);
					setState(31);
					programPart();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			_la = _input.LA(1);
			if (_la==SEMICOLONE) {
				{
				setState(37);
				match(SEMICOLONE);
				}
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

	public static class ProgramPartContext extends ParserRuleContext {
		public AssigntionContext assigntion() {
			return getRuleContext(AssigntionContext.class,0);
		}
		public FunctionCreateContext functionCreate() {
			return getRuleContext(FunctionCreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterProgramPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitProgramPart(this);
		}
	}

	public final ProgramPartContext programPart() throws RecognitionException {
		ProgramPartContext _localctx = new ProgramPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programPart);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assigntion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				functionCreate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				expr();
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

	public static class FunctionCreateContext extends ParserRuleContext {
		public Token name;
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(WRBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WRBParser.COMMA, i);
		}
		public FunctionCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterFunctionCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitFunctionCreate(this);
		}
	}

	public final FunctionCreateContext functionCreate() throws RecognitionException {
		FunctionCreateContext _localctx = new FunctionCreateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCreate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((FunctionCreateContext)_localctx).name = match(ID);
			setState(46);
			match(LPAREN);
			{
			setState(47);
			match(ID);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(48);
				match(COMMA);
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RPAREN);
			setState(56);
			match(ASSIGN);
			setState(57);
			((FunctionCreateContext)_localctx).body = expr();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WRBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WRBParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((FunctionCallContext)_localctx).name = match(ID);
			setState(60);
			match(LPAREN);
			{
			setState(61);
			expr();
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				expr();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(RPAREN);
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

	public static class AssigntionContext extends ParserRuleContext {
		public AssigntionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigntion; }
	 
		public AssigntionContext() { }
		public void copyFrom(AssigntionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarToVarContext extends AssigntionContext {
		public Token left;
		public Token sign;
		public Token right;
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public VarToVarContext(AssigntionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterVarToVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitVarToVar(this);
		}
	}
	public static class VarToExprContext extends AssigntionContext {
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarToExprContext(AssigntionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterVarToExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitVarToExpr(this);
		}
	}

	public final AssigntionContext assigntion() throws RecognitionException {
		AssigntionContext _localctx = new AssigntionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assigntion);
		int _la;
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VarToVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((VarToVarContext)_localctx).left = match(ID);
				setState(72);
				match(ASSIGN);
				setState(74);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(73);
					((VarToVarContext)_localctx).sign = match(SUB);
					}
				}

				setState(76);
				((VarToVarContext)_localctx).right = match(ID);
				}
				break;
			case 2:
				_localctx = new VarToExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN);
				setState(79);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public AddTermContext addTerm() {
			return getRuleContext(AddTermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			addTerm();
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

	public static class AddTermContext extends ParserRuleContext {
		public List<MulTermContext> mulTerm() {
			return getRuleContexts(MulTermContext.class);
		}
		public MulTermContext mulTerm(int i) {
			return getRuleContext(MulTermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(WRBParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(WRBParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(WRBParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(WRBParser.SUB, i);
		}
		public AddTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterAddTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitAddTerm(this);
		}
	}

	public final AddTermContext addTerm() throws RecognitionException {
		AddTermContext _localctx = new AddTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			mulTerm();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				mulTerm();
				}
				}
				setState(91);
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

	public static class MulTermContext extends ParserRuleContext {
		public List<ExpTermContext> expTerm() {
			return getRuleContexts(ExpTermContext.class);
		}
		public ExpTermContext expTerm(int i) {
			return getRuleContext(ExpTermContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(WRBParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(WRBParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(WRBParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(WRBParser.DIV, i);
		}
		public MulTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterMulTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitMulTerm(this);
		}
	}

	public final MulTermContext mulTerm() throws RecognitionException {
		MulTermContext _localctx = new MulTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			expTerm();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MUL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(94);
				expTerm();
				}
				}
				setState(99);
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

	public static class ExpTermContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> EXP() { return getTokens(WRBParser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(WRBParser.EXP, i);
		}
		public ExpTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterExpTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitExpTerm(this);
		}
	}

	public final ExpTermContext expTerm() throws RecognitionException {
		ExpTermContext _localctx = new ExpTermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			atom();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				{
				setState(101);
				match(EXP);
				}
				setState(102);
				atom();
				}
				}
				setState(107);
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
	public static class FunctionAtomContext extends AtomContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterFunctionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitFunctionAtom(this);
		}
	}
	public static class ValueContext extends AtomContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitValue(this);
		}
	}
	public static class ParensContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(WRBParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WRBParser.RPAREN, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public ParensContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitParens(this);
		}
	}
	public static class IdContext extends AtomContext {
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public IdContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitId(this);
		}
	}
	public static class SetConstantContext extends AtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public SetConstantContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterSetConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitSetConstant(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		int _la;
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(108);
					match(SUB);
					}
				}

				{
				setState(111);
				match(LPAREN);
				setState(112);
				expr();
				setState(113);
				match(RPAREN);
				}
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(115);
					match(SUB);
					}
				}

				setState(118);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				number();
				}
				break;
			case 4:
				_localctx = new SetConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				constant();
				}
				break;
			case 5:
				_localctx = new FunctionAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				functionCall();
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

	public static class ConstantContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode SEMICOLONE() { return getToken(WRBParser.SEMICOLONE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBParserListener ) ((WRBParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			number();
			setState(125);
			match(SEMICOLONE);
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
		enterRule(_localctx, 24, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(127);
				match(SUB);
				}
			}

			setState(130);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\5\3)\n\3\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6C\n\6\f\6\16"+
		"\6F\13\6\3\6\3\6\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b"+
		"\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13"+
		"\n\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\f\5\fp\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\16\5\16\u0083"+
		"\n\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\3"+
		"\4\3\2\5\6\3\2\25\26\u008b\2\34\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2\b/\3\2"+
		"\2\2\n=\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22^\3\2\2\2\24f\3\2"+
		"\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0082\3\2\2\2\34\35\5\4\3\2\35\36\7\2"+
		"\2\3\36\3\3\2\2\2\37$\5\6\4\2 !\7\n\2\2!#\5\6\4\2\" \3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2\2\')\7\n\2\2(\'\3\2\2\2()\3\2"+
		"\2\2)\5\3\2\2\2*.\5\f\7\2+.\5\b\5\2,.\5\16\b\2-*\3\2\2\2-+\3\2\2\2-,\3"+
		"\2\2\2.\7\3\2\2\2/\60\7\24\2\2\60\61\7\17\2\2\61\66\7\24\2\2\62\63\7\f"+
		"\2\2\63\65\7\24\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\679\3\2\2\28\66\3\2\2\29:\7\20\2\2:;\7\r\2\2;<\5\16\b\2<\t\3\2\2"+
		"\2=>\7\24\2\2>?\7\17\2\2?D\5\16\b\2@A\7\f\2\2AC\5\16\b\2B@\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\20\2\2H\13\3\2\2\2"+
		"IJ\7\24\2\2JL\7\r\2\2KM\7\4\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NS\7\24\2"+
		"\2OP\7\24\2\2PQ\7\r\2\2QS\5\16\b\2RI\3\2\2\2RO\3\2\2\2S\r\3\2\2\2TU\5"+
		"\20\t\2U\17\3\2\2\2V[\5\22\n\2WX\t\2\2\2XZ\5\22\n\2YW\3\2\2\2Z]\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^c\5\24\13\2_`\t\3\2\2`"+
		"b\5\24\13\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ec\3\2"+
		"\2\2fk\5\26\f\2gh\7\7\2\2hj\5\26\f\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2l\25\3\2\2\2mk\3\2\2\2np\7\4\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2q"+
		"r\7\17\2\2rs\5\16\b\2st\7\20\2\2t}\3\2\2\2uw\7\4\2\2vu\3\2\2\2vw\3\2\2"+
		"\2wx\3\2\2\2x}\7\24\2\2y}\5\32\16\2z}\5\30\r\2{}\5\n\6\2|o\3\2\2\2|v\3"+
		"\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\27\3\2\2\2~\177\5\32\16\2\177\u0080"+
		"\7\n\2\2\u0080\31\3\2\2\2\u0081\u0083\7\4\2\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\t\4\2\2\u0085\33\3\2\2"+
		"\2\20$(-\66DLR[ckov|\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}