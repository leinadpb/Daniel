// Generated from Daniel.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DanielParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, MAY=26, MIN=27, NUMERO=28, COMPARACION=29, BOOLEANO=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_mientras = 2, RULE_condicional = 3, 
		RULE_argumentIf = 4, RULE_function = 5, RULE_privacy = 6, RULE_functionType = 7, 
		RULE_argumentFunc = 8, RULE_dataTypes = 9, RULE_assign = 10, RULE_print = 11, 
		RULE_additionExp = 12, RULE_multiplyExp = 13, RULE_atomExp = 14;
	public static final String[] ruleNames = {
		"program", "statement", "mientras", "condicional", "argumentIf", "function", 
		"privacy", "functionType", "argumentFunc", "dataTypes", "assign", "print", 
		"additionExp", "multiplyExp", "atomExp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mientras'", "'('", "')'", "'{'", "'}'", "'si'", "'sino si'", "'sino'", 
		"'=='", "'publico'", "'privado'", "'protegido'", "'vacio'", "','", "'cadena'", 
		"'entero'", "'decimal'", "'booleano'", "'='", "'imprimir'", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "MAY", "MIN", "NUMERO", "COMPARACION", "BOOLEANO", "WS"
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
	public String getGrammarFileName() { return "Daniel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DanielParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				assign();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				print();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				function();
				}
				break;
			case T__1:
			case NUMERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				additionExp();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				condicional();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				mientras();
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

	public static class MientrasContext extends ParserRuleContext {
		public ArgumentIfContext argumentIf() {
			return getRuleContext(ArgumentIfContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(T__1);
			setState(45);
			argumentIf();
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__4);
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

	public static class CondicionalContext extends ParserRuleContext {
		public List<ArgumentIfContext> argumentIf() {
			return getRuleContexts(ArgumentIfContext.class);
		}
		public ArgumentIfContext argumentIf(int i) {
			return getRuleContext(ArgumentIfContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(57);
			match(T__1);
			setState(58);
			argumentIf();
			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0)) {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__4);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(68);
				match(T__6);
				setState(69);
				match(T__1);
				setState(70);
				argumentIf();
				setState(71);
				match(T__2);
				setState(72);
				match(T__3);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0)) {
					{
					{
					setState(73);
					statement();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__4);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(86);
				match(T__7);
				setState(87);
				match(T__3);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					statement();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0) );
				setState(93);
				match(T__4);
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

	public static class ArgumentIfContext extends ParserRuleContext {
		public TerminalNode COMPARACION() { return getToken(DanielParser.COMPARACION, 0); }
		public List<TerminalNode> ID() { return getTokens(DanielParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DanielParser.ID, i);
		}
		public TerminalNode BOOLEANO() { return getToken(DanielParser.BOOLEANO, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(DanielParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(DanielParser.NUMERO, i);
		}
		public ArgumentIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterArgumentIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitArgumentIf(this);
		}
	}

	public final ArgumentIfContext argumentIf() throws RecognitionException {
		ArgumentIfContext _localctx = new ArgumentIfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				match(COMPARACION);
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(100);
				match(ID);
				setState(101);
				match(T__8);
				setState(102);
				match(BOOLEANO);
				}
				break;
			case 3:
				{
				setState(103);
				match(BOOLEANO);
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

	public static class FunctionContext extends ParserRuleContext {
		public PrivacyContext privacy() {
			return getRuleContext(PrivacyContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DanielParser.ID, 0); }
		public ArgumentFuncContext argumentFunc() {
			return getRuleContext(ArgumentFuncContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			privacy();
			setState(107);
			functionType();
			setState(108);
			match(ID);
			setState(109);
			match(T__1);
			setState(110);
			argumentFunc();
			setState(111);
			match(T__2);
			setState(112);
			match(T__3);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__19) | (1L << ID) | (1L << NUMERO))) != 0) );
			setState(118);
			match(T__4);
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

	public static class PrivacyContext extends ParserRuleContext {
		public PrivacyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privacy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterPrivacy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitPrivacy(this);
		}
	}

	public final PrivacyContext privacy() throws RecognitionException {
		PrivacyContext _localctx = new PrivacyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_privacy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionType);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__12);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				dataTypes();
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

	public static class ArgumentFuncContext extends ParserRuleContext {
		public DataTypesContext dataTypes() {
			return getRuleContext(DataTypesContext.class,0);
		}
		public TerminalNode ID() { return getToken(DanielParser.ID, 0); }
		public ArgumentFuncContext argumentFunc() {
			return getRuleContext(ArgumentFuncContext.class,0);
		}
		public ArgumentFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterArgumentFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitArgumentFunc(this);
		}
	}

	public final ArgumentFuncContext argumentFunc() throws RecognitionException {
		ArgumentFuncContext _localctx = new ArgumentFuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(126);
				dataTypes();
				setState(127);
				match(ID);
				}
				break;
			case 2:
				{
				setState(129);
				dataTypes();
				setState(130);
				match(ID);
				setState(131);
				match(T__13);
				setState(132);
				argumentFunc();
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

	public static class DataTypesContext extends ParserRuleContext {
		public DataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterDataTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitDataTypes(this);
		}
	}

	public final DataTypesContext dataTypes() throws RecognitionException {
		DataTypesContext _localctx = new DataTypesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DanielParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DanielParser.ID, i);
		}
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(T__18);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case NUMERO:
				{
				setState(140);
				additionExp();
				}
				break;
			case ID:
				{
				setState(141);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintContext extends ParserRuleContext {
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(DanielParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__19);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case NUMERO:
				{
				setState(145);
				additionExp();
				}
				break;
			case ID:
				{
				setState(146);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AdditionExpContext extends ParserRuleContext {
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitAdditionExp(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			multiplyExp();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(150);
					match(T__20);
					setState(151);
					multiplyExp();
					}
					break;
				case T__21:
					{
					setState(152);
					match(T__21);
					setState(153);
					multiplyExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(158);
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitMultiplyExp(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			atomExp();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(160);
					match(T__22);
					setState(161);
					atomExp();
					}
					break;
				case T__23:
					{
					setState(162);
					match(T__23);
					setState(163);
					atomExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
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
		public TerminalNode NUMERO() { return getToken(DanielParser.NUMERO, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DanielListener ) ((DanielListener)listener).exitAtomExp(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomExp);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(NUMERO);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__1);
				setState(171);
				additionExp();
				setState(172);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n"+
		"\4\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5"+
		"D\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5\7\5"+
		"T\n\5\f\5\16\5W\13\5\3\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\5\3\5\5\5b\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\6\7u\n\7\r\7\16\7v\3\7\3\7\3\b\3\b\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0091\n"+
		"\f\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u009d\n\16"+
		"\f\16\16\16\u00a0\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17"+
		"\16\17\u00aa\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\4\2\33\33\36\36\3\2\f\16\3"+
		"\2\21\24\2\u00bb\2!\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b:\3\2\2\2\nj\3\2\2"+
		"\2\fl\3\2\2\2\16z\3\2\2\2\20~\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2"+
		"\2\26\u008c\3\2\2\2\30\u0092\3\2\2\2\32\u0097\3\2\2\2\34\u00a1\3\2\2\2"+
		"\36\u00b0\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$\3\3\2\2\2%,\5\26\f\2&,\5\30\r\2\',\5\f\7\2(,\5\32\16\2),\5\b\5\2*,\5"+
		"\6\4\2+%\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5"+
		"\3\2\2\2-.\7\3\2\2./\7\4\2\2/\60\5\n\6\2\60\61\7\5\2\2\61\65\7\6\2\2\62"+
		"\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"8\3\2\2\2\67\65\3\2\2\289\7\7\2\29\7\3\2\2\2:;\7\b\2\2;<\7\4\2\2<=\5\n"+
		"\6\2=>\7\5\2\2>B\7\6\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2CE\3\2\2\2DB\3\2\2\2EU\7\7\2\2FG\7\t\2\2GH\7\4\2\2HI\5\n\6\2IJ\7\5"+
		"\2\2JN\7\6\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2"+
		"\2\2PN\3\2\2\2QR\7\7\2\2RT\3\2\2\2SF\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2Va\3\2\2\2WU\3\2\2\2XY\7\n\2\2Y[\7\6\2\2Z\\\5\4\3\2[Z\3\2\2\2\\]\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\7\2\2`b\3\2\2\2aX\3\2\2\2ab\3"+
		"\2\2\2b\t\3\2\2\2cd\t\2\2\2de\7\37\2\2ek\t\2\2\2fg\7\33\2\2gh\7\13\2\2"+
		"hk\7 \2\2ik\7 \2\2jc\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\5\16\b"+
		"\2mn\5\20\t\2no\7\33\2\2op\7\4\2\2pq\5\22\n\2qr\7\5\2\2rt\7\6\2\2su\5"+
		"\4\3\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\7\2\2y\r"+
		"\3\2\2\2z{\t\3\2\2{\17\3\2\2\2|\177\7\17\2\2}\177\5\24\13\2~|\3\2\2\2"+
		"~}\3\2\2\2\177\21\3\2\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\33\2\2\u0082"+
		"\u0089\3\2\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\33\2\2\u0085\u0086"+
		"\7\20\2\2\u0086\u0087\5\22\n\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2"+
		"\u0088\u0083\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\t\4\2\2\u008b\25\3\2"+
		"\2\2\u008c\u008d\7\33\2\2\u008d\u0090\7\25\2\2\u008e\u0091\5\32\16\2\u008f"+
		"\u0091\7\33\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\27\3\2\2"+
		"\2\u0092\u0095\7\26\2\2\u0093\u0096\5\32\16\2\u0094\u0096\7\33\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\31\3\2\2\2\u0097\u009e\5\34\17"+
		"\2\u0098\u0099\7\27\2\2\u0099\u009d\5\34\17\2\u009a\u009b\7\30\2\2\u009b"+
		"\u009d\5\34\17\2\u009c\u0098\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\33\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a8\5\36\20\2\u00a2\u00a3\7\31\2\2\u00a3\u00a7"+
		"\5\36\20\2\u00a4\u00a5\7\32\2\2\u00a5\u00a7\5\36\20\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b1\7\36\2"+
		"\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7\5\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\37\3\2\2"+
		"\2\25#+\65BNU]ajv~\u0088\u0090\u0095\u009c\u009e\u00a6\u00a8\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}