// Generated from Expr.g4 by ANTLR 4.5.1

package org.sourcepit.expr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, Identifier=51, WS=52;
	public static final int
		RULE_packageName = 0, RULE_typeName = 1, RULE_packageOrTypeName = 2, RULE_expressionName = 3, 
		RULE_methodName = 4, RULE_ambiguousName = 5, RULE_type = 6, RULE_primitiveType = 7, 
		RULE_numericType = 8, RULE_integralType = 9, RULE_floatingPointType = 10, 
		RULE_referenceType = 11, RULE_classOrInterfaceType = 12, RULE_classType = 13, 
		RULE_interfaceType = 14, RULE_typeVariable = 15, RULE_arrayType = 16, 
		RULE_dims = 17, RULE_typeParameter = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_expression = 26, RULE_assignmentOperator = 27, 
		RULE_equalityOperator = 28, RULE_relationalOperator = 29, RULE_shiftOperator = 30, 
		RULE_additiveOperator = 31, RULE_multiplicativeOperator = 32;
	public static final String[] ruleNames = {
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "type", "primitiveType", "numericType", "integralType", 
		"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
		"interfaceType", "typeVariable", "arrayType", "dims", "typeParameter", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "expression", "assignmentOperator", "equalityOperator", 
		"relationalOperator", "shiftOperator", "additiveOperator", "multiplicativeOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", 
		"'float'", "'double'", "'['", "']'", "'extends'", "'&'", "'<'", "'>'", 
		"','", "'?'", "'super'", "'('", "')'", "'instanceof'", "'^'", "'|'", "'&&'", 
		"'||'", "':'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'<='", "'>='", 
		"'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Identifier", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(69);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(70);
					match(T__0);
					setState(71);
					match(Identifier);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeName);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				packageOrTypeName();
				setState(79);
				match(T__0);
				setState(80);
				match(Identifier);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageOrTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Identifier);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(T__0);
					setState(86);
					match(Identifier);
					}
					} 
				}
				setState(91);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionName);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				ambiguousName();
				setState(94);
				match(T__0);
				setState(95);
				match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Identifier);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ambiguousName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Identifier);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(T__0);
					setState(103);
					match(Identifier);
					}
					} 
				}
				setState(108);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitiveType);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				numericType();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__1);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numericType);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				integralType();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_referenceType);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classOrInterfaceType);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				interfaceType();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ExprParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ExprParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(Identifier);
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(135);
				typeArguments();
				}
				break;
			}
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(T__0);
					setState(139);
					match(Identifier);
					setState(141);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(140);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			classType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayType);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				primitiveType();
				setState(153);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				classOrInterfaceType();
				setState(156);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				typeVariable();
				setState(159);
				dims();
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

	public static class DimsContext extends ParserRuleContext {
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__9);
			setState(164);
			match(T__10);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(T__9);
					setState(166);
					match(T__10);
					}
					} 
				}
				setState(171);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExprParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Identifier);
			setState(174);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(173);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__11);
				setState(177);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__11);
				setState(179);
				classOrInterfaceType();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(180);
					additionalBound();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__12);
			setState(189);
			interfaceType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__13);
			setState(192);
			typeArgumentList();
			setState(193);
			match(T__14);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			typeArgument();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(196);
				match(T__15);
				setState(197);
				typeArgument();
				}
				}
				setState(202);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				referenceType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__16);
			setState(209);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__17) {
				{
				setState(208);
				wildcardBounds();
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__11);
				setState(212);
				referenceType();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__17);
				setState(214);
				referenceType();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InclusiveOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalEexpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalEexpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConditionalEexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConditionalEexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConditionalEexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalAndEexpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalAndEexpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConditionalAndEexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConditionalAndEexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConditionalAndEexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalOrEexpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalOrEexpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConditionalOrEexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConditionalOrEexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConditionalOrEexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShiftOperatorContext shiftOperator() {
			return getRuleContext(ShiftOperatorContext.class,0);
		}
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentEexpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentEexpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignmentEexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignmentEexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignmentEexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(218);
				match(T__18);
				setState(219);
				primitiveType();
				setState(220);
				match(T__19);
				setState(221);
				expression(15);
				}
				break;
			case 2:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__18);
				setState(224);
				referenceType();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(225);
					additionalBound();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__19);
				setState(232);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(T__9);
				setState(235);
				expression(0);
				setState(236);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(241);
						additiveOperator();
						setState(242);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(245);
						additiveOperator();
						setState(246);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249);
						shiftOperator();
						setState(250);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
						relationalOperator();
						setState(254);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(257);
						equalityOperator();
						setState(258);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(261);
						match(T__12);
						setState(262);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(264);
						match(T__21);
						setState(265);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new InclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(267);
						match(T__22);
						setState(268);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalAndEexpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270);
						match(T__23);
						setState(271);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalOrEexpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(273);
						match(T__24);
						setState(274);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalEexpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(T__16);
						setState(277);
						expression(0);
						setState(278);
						match(T__25);
						setState(279);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentEexpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(282);
						assignmentOperator();
						setState(283);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(286);
						match(T__20);
						setState(287);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ShiftOperatorContext extends ParserRuleContext {
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
			_errHandler.recoverInline(this);
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
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
		case 0:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		case 13:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0134\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5d\n\5\3\6\3\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\5"+
		"\br\n\b\3\t\3\t\5\tv\n\t\3\n\3\n\5\nz\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\5\r\u0083\n\r\3\16\3\16\5\16\u0087\n\16\3\17\3\17\5\17\u008b\n\17\3"+
		"\17\3\17\3\17\5\17\u0090\n\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a4"+
		"\n\22\3\23\3\23\3\23\3\23\7\23\u00aa\n\23\f\23\16\23\u00ad\13\23\3\24"+
		"\3\24\5\24\u00b1\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u00b8\n\25\f\25\16"+
		"\25\u00bb\13\25\5\25\u00bd\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u00c9\n\30\f\30\16\30\u00cc\13\30\3\31\3\31\5\31\u00d0"+
		"\n\31\3\32\3\32\5\32\u00d4\n\32\3\33\3\33\3\33\3\33\5\33\u00da\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00e5\n\34\f\34\16\34"+
		"\u00e8\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f1\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\7\34\u0123\n\34\f\34\16\34\u0126\13\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\4\2\66#\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\n\3\2\5\t\3\2"+
		"\n\13\3\2\35(\3\2)*\4\2\20\21+,\3\2-/\3\2\60\61\3\2\62\64\u013a\2D\3\2"+
		"\2\2\4T\3\2\2\2\6V\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16q\3\2\2"+
		"\2\20u\3\2\2\2\22y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u00a3"+
		"\3\2\2\2$\u00a5\3\2\2\2&\u00ae\3\2\2\2(\u00bc\3\2\2\2*\u00be\3\2\2\2,"+
		"\u00c1\3\2\2\2.\u00c5\3\2\2\2\60\u00cf\3\2\2\2\62\u00d1\3\2\2\2\64\u00d9"+
		"\3\2\2\2\66\u00f0\3\2\2\28\u0127\3\2\2\2:\u0129\3\2\2\2<\u012b\3\2\2\2"+
		">\u012d\3\2\2\2@\u012f\3\2\2\2B\u0131\3\2\2\2DE\b\2\1\2EF\7\65\2\2FL\3"+
		"\2\2\2GH\f\3\2\2HI\7\3\2\2IK\7\65\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM"+
		"\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OU\7\65\2\2PQ\5\6\4\2QR\7\3\2\2RS\7\65\2"+
		"\2SU\3\2\2\2TO\3\2\2\2TP\3\2\2\2U\5\3\2\2\2V[\7\65\2\2WX\7\3\2\2XZ\7\65"+
		"\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^d"+
		"\7\65\2\2_`\5\f\7\2`a\7\3\2\2ab\7\65\2\2bd\3\2\2\2c^\3\2\2\2c_\3\2\2\2"+
		"d\t\3\2\2\2ef\7\65\2\2f\13\3\2\2\2gl\7\65\2\2hi\7\3\2\2ik\7\65\2\2jh\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\r\3\2\2\2nl\3\2\2\2or\5\20\t\2p"+
		"r\5\30\r\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2sv\5\22\n\2tv\7\4\2\2us\3\2"+
		"\2\2ut\3\2\2\2v\21\3\2\2\2wz\5\24\13\2xz\5\26\f\2yw\3\2\2\2yx\3\2\2\2"+
		"z\23\3\2\2\2{|\t\2\2\2|\25\3\2\2\2}~\t\3\2\2~\27\3\2\2\2\177\u0083\5\32"+
		"\16\2\u0080\u0083\5 \21\2\u0081\u0083\5\"\22\2\u0082\177\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\31\3\2\2\2\u0084\u0087\5\34\17"+
		"\2\u0085\u0087\5\36\20\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\33\3\2\2\2\u0088\u008a\7\65\2\2\u0089\u008b\5,\27\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u0093\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008f"+
		"\7\65\2\2\u008e\u0090\5,\27\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\35\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\5\34\17\2\u0097\37\3\2\2\2\u0098\u0099\7\65\2\2\u0099!\3\2\2\2"+
		"\u009a\u009b\5\20\t\2\u009b\u009c\5$\23\2\u009c\u00a4\3\2\2\2\u009d\u009e"+
		"\5\32\16\2\u009e\u009f\5$\23\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\5 \21\2"+
		"\u00a1\u00a2\5$\23\2\u00a2\u00a4\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009d"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4#\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00ab\7\r\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00aa\7\r\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"%\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\65\2\2\u00af\u00b1\5(\25\2"+
		"\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\7"+
		"\16\2\2\u00b3\u00bd\5 \21\2\u00b4\u00b5\7\16\2\2\u00b5\u00b9\5\32\16\2"+
		"\u00b6\u00b8\5*\26\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00b2\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bd)\3\2\2\2\u00be\u00bf\7\17\2\2"+
		"\u00bf\u00c0\5\36\20\2\u00c0+\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3"+
		"\5.\30\2\u00c3\u00c4\7\21\2\2\u00c4-\3\2\2\2\u00c5\u00ca\5\60\31\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c9\5\60\31\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb/\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\5\30\r\2\u00ce\u00d0\5\62\32\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\61\3\2\2\2\u00d1\u00d3\7\23\2\2\u00d2"+
		"\u00d4\5\64\33\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\63\3\2"+
		"\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00da\5\30\r\2\u00d7\u00d8\7\24\2\2\u00d8"+
		"\u00da\5\30\r\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\65\3\2\2"+
		"\2\u00db\u00dc\b\34\1\2\u00dc\u00dd\7\25\2\2\u00dd\u00de\5\20\t\2\u00de"+
		"\u00df\7\26\2\2\u00df\u00e0\5\66\34\21\u00e0\u00f1\3\2\2\2\u00e1\u00e2"+
		"\7\25\2\2\u00e2\u00e6\5\30\r\2\u00e3\u00e5\5*\26\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\26\2\2\u00ea\u00eb\5\66\34"+
		"\20\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\5\66\34\2\u00ee"+
		"\u00ef\7\r\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00db\3\2\2\2\u00f0\u00e1\3\2"+
		"\2\2\u00f0\u00ec\3\2\2\2\u00f1\u0124\3\2\2\2\u00f2\u00f3\f\17\2\2\u00f3"+
		"\u00f4\5@!\2\u00f4\u00f5\5\66\34\20\u00f5\u0123\3\2\2\2\u00f6\u00f7\f"+
		"\16\2\2\u00f7\u00f8\5@!\2\u00f8\u00f9\5\66\34\17\u00f9\u0123\3\2\2\2\u00fa"+
		"\u00fb\f\r\2\2\u00fb\u00fc\5> \2\u00fc\u00fd\5\66\34\16\u00fd\u0123\3"+
		"\2\2\2\u00fe\u00ff\f\13\2\2\u00ff\u0100\5<\37\2\u0100\u0101\5\66\34\f"+
		"\u0101\u0123\3\2\2\2\u0102\u0103\f\n\2\2\u0103\u0104\5:\36\2\u0104\u0105"+
		"\5\66\34\13\u0105\u0123\3\2\2\2\u0106\u0107\f\t\2\2\u0107\u0108\7\17\2"+
		"\2\u0108\u0123\5\66\34\n\u0109\u010a\f\b\2\2\u010a\u010b\7\30\2\2\u010b"+
		"\u0123\5\66\34\t\u010c\u010d\f\7\2\2\u010d\u010e\7\31\2\2\u010e\u0123"+
		"\5\66\34\b\u010f\u0110\f\6\2\2\u0110\u0111\7\32\2\2\u0111\u0123\5\66\34"+
		"\7\u0112\u0113\f\5\2\2\u0113\u0114\7\33\2\2\u0114\u0123\5\66\34\6\u0115"+
		"\u0116\f\4\2\2\u0116\u0117\7\23\2\2\u0117\u0118\5\66\34\2\u0118\u0119"+
		"\7\34\2\2\u0119\u011a\5\66\34\5\u011a\u0123\3\2\2\2\u011b\u011c\f\3\2"+
		"\2\u011c\u011d\58\35\2\u011d\u011e\5\66\34\4\u011e\u0123\3\2\2\2\u011f"+
		"\u0120\f\f\2\2\u0120\u0121\7\27\2\2\u0121\u0123\5\30\r\2\u0122\u00f2\3"+
		"\2\2\2\u0122\u00f6\3\2\2\2\u0122\u00fa\3\2\2\2\u0122\u00fe\3\2\2\2\u0122"+
		"\u0102\3\2\2\2\u0122\u0106\3\2\2\2\u0122\u0109\3\2\2\2\u0122\u010c\3\2"+
		"\2\2\u0122\u010f\3\2\2\2\u0122\u0112\3\2\2\2\u0122\u0115\3\2\2\2\u0122"+
		"\u011b\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128"+
		"\t\4\2\2\u01289\3\2\2\2\u0129\u012a\t\5\2\2\u012a;\3\2\2\2\u012b\u012c"+
		"\t\6\2\2\u012c=\3\2\2\2\u012d\u012e\t\7\2\2\u012e?\3\2\2\2\u012f\u0130"+
		"\t\b\2\2\u0130A\3\2\2\2\u0131\u0132\t\t\2\2\u0132C\3\2\2\2\34LT[clquy"+
		"\u0082\u0086\u008a\u008f\u0093\u00a3\u00ab\u00b0\u00b9\u00bc\u00ca\u00cf"+
		"\u00d3\u00d9\u00e6\u00f0\u0122\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}