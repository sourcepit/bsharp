// Generated from Primary.g4 by ANTLR 4.5.1

package org.sourcepit.primary;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class PrimaryParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18,
      T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26,
      IntegerLiteral = 27, FloatingPointLiteral = 28, BooleanLiteral = 29, CharacterLiteral = 30, StringLiteral = 31,
      NullLiteral = 32, Identifier = 33, WS = 34, COMMENT = 35, LINE_COMMENT = 36;
   public static final int RULE_primary = 0, RULE_typeArgumentsOrDiamond = 1, RULE_fieldAccess = 2,
      RULE_arrayAccess = 3, RULE_methodInvocation = 4, RULE_argumentList = 5, RULE_methodReference = 6,
      RULE_dimExprs = 7, RULE_dimExpr = 8, RULE_constantExpression = 9, RULE_expression = 10, RULE_type = 11,
      RULE_primitiveType = 12, RULE_numericType = 13, RULE_integralType = 14, RULE_floatingPointType = 15,
      RULE_referenceType = 16, RULE_classOrInterfaceType = 17, RULE_classType = 18, RULE_interfaceType = 19,
      RULE_typeVariable = 20, RULE_arrayType = 21, RULE_dims = 22, RULE_typeParameter = 23, RULE_typeBound = 24,
      RULE_additionalBound = 25, RULE_typeArguments = 26, RULE_typeArgumentList = 27, RULE_typeArgument = 28,
      RULE_wildcard = 29, RULE_wildcardBounds = 30, RULE_packageName = 31, RULE_typeName = 32,
      RULE_packageOrTypeName = 33, RULE_expressionName = 34, RULE_methodName = 35, RULE_ambiguousName = 36,
      RULE_literal = 37;
   public static final String[] ruleNames = { "primary", "typeArgumentsOrDiamond", "fieldAccess", "arrayAccess",
      "methodInvocation", "argumentList", "methodReference", "dimExprs", "dimExpr", "constantExpression", "expression",
      "type", "primitiveType", "numericType", "integralType", "floatingPointType", "referenceType",
      "classOrInterfaceType", "classType", "interfaceType", "typeVariable", "arrayType", "dims", "typeParameter",
      "typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds",
      "packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", "ambiguousName", "literal" };

   private static final String[] _LITERAL_NAMES = { null, "'['", "']'", "'.'", "'class'", "'void'", "'this'", "'('",
      "')'", "'new'", "'<'", "'>'", "'super'", "','", "'::'", "'foo'", "'boolean'", "'byte'", "'short'", "'int'",
      "'long'", "'char'", "'float'", "'double'", "'extends'", "'&'", "'?'", null, null, null, null, null, "'null'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "IntegerLiteral",
      "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "Identifier", "WS",
      "COMMENT", "LINE_COMMENT" };
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
   public String getGrammarFileName() {
      return "Primary.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   @Override
   public String getSerializedATN() {
      return _serializedATN;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public PrimaryParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class PrimaryContext extends ParserRuleContext {
      public PrimaryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primary;
      }

      public PrimaryContext() {
      }

      public void copyFrom(PrimaryContext ctx) {
         super.copyFrom(ctx);
      }
   }

   public static class ParenthesizedExpressionContext extends PrimaryContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ParenthesizedExpressionContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterParenthesizedExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitParenthesizedExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitParenthesizedExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public static class ClassInstanceCreationExpressionContext extends PrimaryContext {
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
         return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
      }

      public ArgumentListContext argumentList() {
         return getRuleContext(ArgumentListContext.class, 0);
      }

      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public ClassInstanceCreationExpressionContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterClassInstanceCreationExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitClassInstanceCreationExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitClassInstanceCreationExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public static class ClassLiteralContext extends PrimaryContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ClassLiteralContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterClassLiteral(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitClassLiteral(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitClassLiteral(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public static class ArrayCreationExpressionContext extends PrimaryContext {
      public PrimitiveTypeContext primitiveType() {
         return getRuleContext(PrimitiveTypeContext.class, 0);
      }

      public DimExprsContext dimExprs() {
         return getRuleContext(DimExprsContext.class, 0);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public ArrayCreationExpressionContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterArrayCreationExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitArrayCreationExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitArrayCreationExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public static class ThisLiteralContext extends PrimaryContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ThisLiteralContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterThisLiteral(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitThisLiteral(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitThisLiteral(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public static class LexicalLiteralContext extends PrimaryContext {
      public LiteralContext literal() {
         return getRuleContext(LiteralContext.class, 0);
      }

      public LexicalLiteralContext(PrimaryContext ctx) {
         copyFrom(ctx);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterLexicalLiteral(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitLexicalLiteral(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitLexicalLiteral(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimaryContext primary() throws RecognitionException {
      return primary(0);
   }

   private PrimaryContext primary(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
      PrimaryContext _prevctx = _localctx;
      int _startState = 0;
      enterRecursionRule(_localctx, 0, RULE_primary, _p);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(139);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
               case 1 : {
                  _localctx = new LexicalLiteralContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;

                  setState(77);
                  literal();
               }
                  break;
               case 2 : {
                  _localctx = new ClassLiteralContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(78);
                  typeName();
                  setState(81);
                  _la = _input.LA(1);
                  if (_la == T__0) {
                     {
                        setState(79);
                        match(T__0);
                        setState(80);
                        match(T__1);
                     }
                  }

                  setState(83);
                  match(T__2);
                  setState(84);
                  match(T__3);
               }
                  break;
               case 3 : {
                  _localctx = new ClassLiteralContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(86);
                  match(T__4);
                  setState(87);
                  match(T__2);
                  setState(88);
                  match(T__3);
               }
                  break;
               case 4 : {
                  _localctx = new ThisLiteralContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(89);
                  match(T__5);
               }
                  break;
               case 5 : {
                  _localctx = new ThisLiteralContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(90);
                  typeName();
                  setState(91);
                  match(T__2);
                  setState(92);
                  match(T__5);
               }
                  break;
               case 6 : {
                  _localctx = new ParenthesizedExpressionContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(94);
                  match(T__6);
                  setState(95);
                  expression();
                  setState(96);
                  match(T__7);
               }
                  break;
               case 7 : {
                  _localctx = new ClassInstanceCreationExpressionContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(98);
                  match(T__8);
                  setState(100);
                  _la = _input.LA(1);
                  if (_la == T__9) {
                     {
                        setState(99);
                        typeArguments();
                     }
                  }

                  setState(102);
                  match(Identifier);
                  setState(104);
                  _la = _input.LA(1);
                  if (_la == T__9) {
                     {
                        setState(103);
                        typeArgumentsOrDiamond();
                     }
                  }

                  setState(106);
                  match(T__6);
                  setState(108);
                  _la = _input.LA(1);
                  if (_la == T__14) {
                     {
                        setState(107);
                        argumentList();
                     }
                  }

                  setState(110);
                  match(T__7);
               }
                  break;
               case 8 : {
                  _localctx = new ClassInstanceCreationExpressionContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(111);
                  expressionName();
                  setState(112);
                  match(T__2);
                  setState(113);
                  match(T__8);
                  setState(115);
                  _la = _input.LA(1);
                  if (_la == T__9) {
                     {
                        setState(114);
                        typeArguments();
                     }
                  }

                  setState(117);
                  match(Identifier);
                  setState(119);
                  _la = _input.LA(1);
                  if (_la == T__9) {
                     {
                        setState(118);
                        typeArgumentsOrDiamond();
                     }
                  }

                  setState(121);
                  match(T__6);
                  setState(123);
                  _la = _input.LA(1);
                  if (_la == T__14) {
                     {
                        setState(122);
                        argumentList();
                     }
                  }

                  setState(125);
                  match(T__7);
               }
                  break;
               case 9 : {
                  _localctx = new ArrayCreationExpressionContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(127);
                  match(T__8);
                  setState(128);
                  primitiveType();
                  setState(129);
                  dimExprs();
                  setState(131);
                  switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                     case 1 : {
                        setState(130);
                        dims();
                     }
                        break;
                  }
               }
                  break;
               case 10 : {
                  _localctx = new ArrayCreationExpressionContext(_localctx);
                  _ctx = _localctx;
                  _prevctx = _localctx;
                  setState(133);
                  match(T__8);
                  setState(134);
                  classOrInterfaceType(0);
                  setState(135);
                  dimExprs();
                  setState(137);
                  switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                     case 1 : {
                        setState(136);
                        dims();
                     }
                        break;
                  }
               }
                  break;
            }
            _ctx.stop = _input.LT(-1);
            setState(158);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new ClassInstanceCreationExpressionContext(
                           new PrimaryContext(_parentctx, _parentState));
                        pushNewRecursionContext(_localctx, _startState, RULE_primary);
                        setState(141);
                        if (!(precpred(_ctx, 3)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                        setState(142);
                        match(T__2);
                        setState(143);
                        match(T__8);
                        setState(145);
                        _la = _input.LA(1);
                        if (_la == T__9) {
                           {
                              setState(144);
                              typeArguments();
                           }
                        }

                        setState(147);
                        match(Identifier);
                        setState(149);
                        _la = _input.LA(1);
                        if (_la == T__9) {
                           {
                              setState(148);
                              typeArgumentsOrDiamond();
                           }
                        }

                        setState(151);
                        match(T__6);
                        setState(153);
                        _la = _input.LA(1);
                        if (_la == T__14) {
                           {
                              setState(152);
                              argumentList();
                           }
                        }

                        setState(155);
                        match(T__7);
                     }
                  }
               }
               setState(160);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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

   public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeArgumentsOrDiamond;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeArgumentsOrDiamond(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeArgumentsOrDiamond(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeArgumentsOrDiamond(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
      TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_typeArgumentsOrDiamond);
      try {
         setState(164);
         switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(161);
               typeArguments();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(162);
               match(T__9);
               setState(163);
               match(T__10);
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

   public static class FieldAccessContext extends ParserRuleContext {
      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public FieldAccessContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldAccess;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterFieldAccess(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitFieldAccess(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitFieldAccess(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldAccessContext fieldAccess() throws RecognitionException {
      FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_fieldAccess);
      try {
         setState(179);
         switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(166);
               primary(0);
               setState(167);
               match(T__2);
               setState(168);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(170);
               match(T__11);
               setState(171);
               match(T__2);
               setState(172);
               match(Identifier);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(173);
               typeName();
               setState(174);
               match(T__2);
               setState(175);
               match(T__11);
               setState(176);
               match(T__2);
               setState(177);
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

   public static class ArrayAccessContext extends ParserRuleContext {
      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayAccess;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterArrayAccess(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitArrayAccess(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitArrayAccess(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayAccessContext arrayAccess() throws RecognitionException {
      ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_arrayAccess);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(181);
            expressionName();
            setState(182);
            match(T__0);
            setState(183);
            expression();
            setState(184);
            match(T__1);
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

   public static class MethodInvocationContext extends ParserRuleContext {
      public MethodNameContext methodName() {
         return getRuleContext(MethodNameContext.class, 0);
      }

      public ArgumentListContext argumentList() {
         return getRuleContext(ArgumentListContext.class, 0);
      }

      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodInvocation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterMethodInvocation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitMethodInvocation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitMethodInvocation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodInvocationContext methodInvocation() throws RecognitionException {
      MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_methodInvocation);
      int _la;
      try {
         setState(254);
         switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(186);
               methodName();
               setState(187);
               match(T__6);
               setState(189);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(188);
                     argumentList();
                  }
               }

               setState(191);
               match(T__7);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(193);
               typeName();
               setState(194);
               match(T__2);
               setState(196);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(195);
                     typeArguments();
                  }
               }

               setState(198);
               match(Identifier);
               setState(199);
               match(T__6);
               setState(201);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(200);
                     argumentList();
                  }
               }

               setState(203);
               match(T__7);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(205);
               expressionName();
               setState(206);
               match(T__2);
               setState(208);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(207);
                     typeArguments();
                  }
               }

               setState(210);
               match(Identifier);
               setState(211);
               match(T__6);
               setState(213);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(212);
                     argumentList();
                  }
               }

               setState(215);
               match(T__7);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(217);
               primary(0);
               setState(218);
               match(T__2);
               setState(220);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(219);
                     typeArguments();
                  }
               }

               setState(222);
               match(Identifier);
               setState(223);
               match(T__6);
               setState(225);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(224);
                     argumentList();
                  }
               }

               setState(227);
               match(T__7);
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(229);
               match(T__11);
               setState(230);
               match(T__2);
               setState(232);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(231);
                     typeArguments();
                  }
               }

               setState(234);
               match(Identifier);
               setState(235);
               match(T__6);
               setState(237);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(236);
                     argumentList();
                  }
               }

               setState(239);
               match(T__7);
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(240);
               typeName();
               setState(241);
               match(T__2);
               setState(242);
               match(T__11);
               setState(243);
               match(T__2);
               setState(245);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(244);
                     typeArguments();
                  }
               }

               setState(247);
               match(Identifier);
               setState(248);
               match(T__6);
               setState(250);
               _la = _input.LA(1);
               if (_la == T__14) {
                  {
                     setState(249);
                     argumentList();
                  }
               }

               setState(252);
               match(T__7);
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

   public static class ArgumentListContext extends ParserRuleContext {
      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      public ArgumentListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_argumentList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterArgumentList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitArgumentList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitArgumentList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArgumentListContext argumentList() throws RecognitionException {
      ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_argumentList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(256);
            expression();
            setState(261);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__12) {
               {
                  {
                     setState(257);
                     match(T__12);
                     setState(258);
                     expression();
                  }
               }
               setState(263);
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

   public static class MethodReferenceContext extends ParserRuleContext {
      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public ReferenceTypeContext referenceType() {
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ClassTypeContext classType() {
         return getRuleContext(ClassTypeContext.class, 0);
      }

      public ArrayTypeContext arrayType() {
         return getRuleContext(ArrayTypeContext.class, 0);
      }

      public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodReference;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterMethodReference(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitMethodReference(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitMethodReference(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodReferenceContext methodReference() throws RecognitionException {
      MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_methodReference);
      int _la;
      try {
         setState(311);
         switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(264);
               expressionName();
               setState(265);
               match(T__13);
               setState(267);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(266);
                     typeArguments();
                  }
               }

               setState(269);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(271);
               referenceType();
               setState(272);
               match(T__13);
               setState(274);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(273);
                     typeArguments();
                  }
               }

               setState(276);
               match(Identifier);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(278);
               primary(0);
               setState(279);
               match(T__13);
               setState(281);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(280);
                     typeArguments();
                  }
               }

               setState(283);
               match(Identifier);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(285);
               match(T__11);
               setState(286);
               match(T__13);
               setState(288);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(287);
                     typeArguments();
                  }
               }

               setState(290);
               match(Identifier);
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(291);
               typeName();
               setState(292);
               match(T__2);
               setState(293);
               match(T__11);
               setState(294);
               match(T__13);
               setState(296);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(295);
                     typeArguments();
                  }
               }

               setState(298);
               match(Identifier);
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(300);
               classType();
               setState(301);
               match(T__13);
               setState(303);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(302);
                     typeArguments();
                  }
               }

               setState(305);
               match(T__8);
            }
               break;
            case 7 :
               enterOuterAlt(_localctx, 7); {
               setState(307);
               arrayType();
               setState(308);
               match(T__13);
               setState(309);
               match(T__8);
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

   public static class DimExprsContext extends ParserRuleContext {
      public List<DimExprContext> dimExpr() {
         return getRuleContexts(DimExprContext.class);
      }

      public DimExprContext dimExpr(int i) {
         return getRuleContext(DimExprContext.class, i);
      }

      public DimExprsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_dimExprs;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterDimExprs(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitDimExprs(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitDimExprs(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimExprsContext dimExprs() throws RecognitionException {
      DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_dimExprs);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(313);
            dimExpr();
            setState(317);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(314);
                        dimExpr();
                     }
                  }
               }
               setState(319);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
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

   public static class DimExprContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public DimExprContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_dimExpr;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterDimExpr(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitDimExpr(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitDimExpr(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimExprContext dimExpr() throws RecognitionException {
      DimExprContext _localctx = new DimExprContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_dimExpr);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(320);
            match(T__0);
            setState(321);
            expression();
            setState(322);
            match(T__1);
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

   public static class ConstantExpressionContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constantExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterConstantExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitConstantExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitConstantExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstantExpressionContext constantExpression() throws RecognitionException {
      ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_constantExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(324);
            expression();
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

      @Override
      public int getRuleIndex() {
         return RULE_expression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionContext expression() throws RecognitionException {
      ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_expression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(326);
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

   public static class TypeContext extends ParserRuleContext {
      public PrimitiveTypeContext primitiveType() {
         return getRuleContext(PrimitiveTypeContext.class, 0);
      }

      public ReferenceTypeContext referenceType() {
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public TypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_type;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeContext type() throws RecognitionException {
      TypeContext _localctx = new TypeContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_type);
      try {
         setState(330);
         switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(328);
               primitiveType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(329);
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
         return getRuleContext(NumericTypeContext.class, 0);
      }

      public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primitiveType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterPrimitiveType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitPrimitiveType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitPrimitiveType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimitiveTypeContext primitiveType() throws RecognitionException {
      PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_primitiveType);
      try {
         setState(334);
         switch (_input.LA(1)) {
            case T__16 :
            case T__17 :
            case T__18 :
            case T__19 :
            case T__20 :
            case T__21 :
            case T__22 :
               enterOuterAlt(_localctx, 1); {
               setState(332);
               numericType();
            }
               break;
            case T__15 :
               enterOuterAlt(_localctx, 2); {
               setState(333);
               match(T__15);
            }
               break;
            default :
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
         return getRuleContext(IntegralTypeContext.class, 0);
      }

      public FloatingPointTypeContext floatingPointType() {
         return getRuleContext(FloatingPointTypeContext.class, 0);
      }

      public NumericTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_numericType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterNumericType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitNumericType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitNumericType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NumericTypeContext numericType() throws RecognitionException {
      NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_numericType);
      try {
         setState(338);
         switch (_input.LA(1)) {
            case T__16 :
            case T__17 :
            case T__18 :
            case T__19 :
            case T__20 :
               enterOuterAlt(_localctx, 1); {
               setState(336);
               integralType();
            }
               break;
            case T__21 :
            case T__22 :
               enterOuterAlt(_localctx, 2); {
               setState(337);
               floatingPointType();
            }
               break;
            default :
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

      @Override
      public int getRuleIndex() {
         return RULE_integralType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterIntegralType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitIntegralType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitIntegralType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IntegralTypeContext integralType() throws RecognitionException {
      IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_integralType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(340);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0))) {
               _errHandler.recoverInline(this);
            }
            else {
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

      @Override
      public int getRuleIndex() {
         return RULE_floatingPointType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterFloatingPointType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitFloatingPointType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitFloatingPointType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
      FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
      enterRule(_localctx, 30, RULE_floatingPointType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(342);
            _la = _input.LA(1);
            if (!(_la == T__21 || _la == T__22)) {
               _errHandler.recoverInline(this);
            }
            else {
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
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public TypeVariableContext typeVariable() {
         return getRuleContext(TypeVariableContext.class, 0);
      }

      public ArrayTypeContext arrayType() {
         return getRuleContext(ArrayTypeContext.class, 0);
      }

      public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_referenceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterReferenceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitReferenceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitReferenceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ReferenceTypeContext referenceType() throws RecognitionException {
      ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
      enterRule(_localctx, 32, RULE_referenceType);
      try {
         setState(347);
         switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(344);
               classOrInterfaceType(0);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(345);
               typeVariable();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(346);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classOrInterfaceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterClassOrInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitClassOrInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitClassOrInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
      return classOrInterfaceType(0);
   }

   private ClassOrInterfaceTypeContext classOrInterfaceType(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, _parentState);
      ClassOrInterfaceTypeContext _prevctx = _localctx;
      int _startState = 34;
      enterRecursionRule(_localctx, 34, RULE_classOrInterfaceType, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(350);
               match(Identifier);
               setState(352);
               switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                  case 1 : {
                     setState(351);
                     typeArguments();
                  }
                     break;
               }
            }
            _ctx.stop = _input.LT(-1);
            setState(362);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new ClassOrInterfaceTypeContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_classOrInterfaceType);
                        setState(354);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(355);
                        match(T__2);
                        setState(356);
                        match(Identifier);
                        setState(358);
                        switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                           case 1 : {
                              setState(357);
                              typeArguments();
                           }
                              break;
                        }
                     }
                  }
               }
               setState(364);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
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

   public static class ClassTypeContext extends ParserRuleContext {
      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public ClassTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterClassType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitClassType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitClassType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassTypeContext classType() throws RecognitionException {
      ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
      enterRule(_localctx, 36, RULE_classType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(365);
            classOrInterfaceType(0);
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
      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceTypeContext interfaceType() throws RecognitionException {
      InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
      enterRule(_localctx, 38, RULE_interfaceType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(367);
            classOrInterfaceType(0);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeVariableContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeVariable;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeVariable(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeVariable(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeVariable(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeVariableContext typeVariable() throws RecognitionException {
      TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
      enterRule(_localctx, 40, RULE_typeVariable);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(369);
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
         return getRuleContext(PrimitiveTypeContext.class, 0);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public TypeVariableContext typeVariable() {
         return getRuleContext(TypeVariableContext.class, 0);
      }

      public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterArrayType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitArrayType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitArrayType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayTypeContext arrayType() throws RecognitionException {
      ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
      enterRule(_localctx, 42, RULE_arrayType);
      try {
         setState(380);
         switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(371);
               primitiveType();
               setState(372);
               dims();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(374);
               classOrInterfaceType(0);
               setState(375);
               dims();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(377);
               typeVariable();
               setState(378);
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

      @Override
      public int getRuleIndex() {
         return RULE_dims;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterDims(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitDims(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitDims(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimsContext dims() throws RecognitionException {
      DimsContext _localctx = new DimsContext(_ctx, getState());
      enterRule(_localctx, 44, RULE_dims);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(382);
            match(T__0);
            setState(383);
            match(T__1);
            setState(388);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(384);
                        match(T__0);
                        setState(385);
                        match(T__1);
                     }
                  }
               }
               setState(390);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public TypeBoundContext typeBound() {
         return getRuleContext(TypeBoundContext.class, 0);
      }

      public TypeParameterContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeParameter;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeParameterContext typeParameter() throws RecognitionException {
      TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
      enterRule(_localctx, 46, RULE_typeParameter);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(391);
            match(Identifier);
            setState(393);
            _la = _input.LA(1);
            if (_la == T__23) {
               {
                  setState(392);
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
         return getRuleContext(TypeVariableContext.class, 0);
      }

      public ClassOrInterfaceTypeContext classOrInterfaceType() {
         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
      }

      public List<AdditionalBoundContext> additionalBound() {
         return getRuleContexts(AdditionalBoundContext.class);
      }

      public AdditionalBoundContext additionalBound(int i) {
         return getRuleContext(AdditionalBoundContext.class, i);
      }

      public TypeBoundContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeBound;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeBound(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeBound(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeBound(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeBoundContext typeBound() throws RecognitionException {
      TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
      enterRule(_localctx, 48, RULE_typeBound);
      int _la;
      try {
         setState(405);
         switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(395);
               match(T__23);
               setState(396);
               typeVariable();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(397);
               match(T__23);
               setState(398);
               classOrInterfaceType(0);
               setState(402);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__24) {
                  {
                     {
                        setState(399);
                        additionalBound();
                     }
                  }
                  setState(404);
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
         return getRuleContext(InterfaceTypeContext.class, 0);
      }

      public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_additionalBound;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterAdditionalBound(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitAdditionalBound(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitAdditionalBound(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AdditionalBoundContext additionalBound() throws RecognitionException {
      AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_additionalBound);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(407);
            match(T__24);
            setState(408);
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
         return getRuleContext(TypeArgumentListContext.class, 0);
      }

      public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeArguments;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeArguments(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeArguments(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeArguments(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentsContext typeArguments() throws RecognitionException {
      TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
      enterRule(_localctx, 52, RULE_typeArguments);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(410);
            match(T__9);
            setState(411);
            typeArgumentList();
            setState(412);
            match(T__10);
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
         return getRuleContext(TypeArgumentContext.class, i);
      }

      public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeArgumentList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeArgumentList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeArgumentList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeArgumentList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
      TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
      enterRule(_localctx, 54, RULE_typeArgumentList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(414);
            typeArgument();
            setState(419);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__12) {
               {
                  {
                     setState(415);
                     match(T__12);
                     setState(416);
                     typeArgument();
                  }
               }
               setState(421);
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
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public WildcardContext wildcard() {
         return getRuleContext(WildcardContext.class, 0);
      }

      public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeArgument;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeArgument(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeArgument(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeArgument(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentContext typeArgument() throws RecognitionException {
      TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
      enterRule(_localctx, 56, RULE_typeArgument);
      try {
         setState(424);
         switch (_input.LA(1)) {
            case T__15 :
            case T__16 :
            case T__17 :
            case T__18 :
            case T__19 :
            case T__20 :
            case T__21 :
            case T__22 :
            case Identifier :
               enterOuterAlt(_localctx, 1); {
               setState(422);
               referenceType();
            }
               break;
            case T__25 :
               enterOuterAlt(_localctx, 2); {
               setState(423);
               wildcard();
            }
               break;
            default :
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
         return getRuleContext(WildcardBoundsContext.class, 0);
      }

      public WildcardContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_wildcard;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterWildcard(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitWildcard(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitWildcard(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WildcardContext wildcard() throws RecognitionException {
      WildcardContext _localctx = new WildcardContext(_ctx, getState());
      enterRule(_localctx, 58, RULE_wildcard);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(426);
            match(T__25);
            setState(428);
            _la = _input.LA(1);
            if (_la == T__11 || _la == T__23) {
               {
                  setState(427);
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
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_wildcardBounds;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterWildcardBounds(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitWildcardBounds(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitWildcardBounds(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
      WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
      enterRule(_localctx, 60, RULE_wildcardBounds);
      try {
         setState(434);
         switch (_input.LA(1)) {
            case T__23 :
               enterOuterAlt(_localctx, 1); {
               setState(430);
               match(T__23);
               setState(431);
               referenceType();
            }
               break;
            case T__11 :
               enterOuterAlt(_localctx, 2); {
               setState(432);
               match(T__11);
               setState(433);
               referenceType();
            }
               break;
            default :
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

   public static class PackageNameContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public PackageNameContext packageName() {
         return getRuleContext(PackageNameContext.class, 0);
      }

      public PackageNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_packageName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterPackageName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitPackageName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitPackageName(this);
         else
            return visitor.visitChildren(this);
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
      int _startState = 62;
      enterRecursionRule(_localctx, 62, RULE_packageName, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(437);
               match(Identifier);
            }
            _ctx.stop = _input.LT(-1);
            setState(444);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new PackageNameContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_packageName);
                        setState(439);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(440);
                        match(T__2);
                        setState(441);
                        match(Identifier);
                     }
                  }
               }
               setState(446);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public PackageOrTypeNameContext packageOrTypeName() {
         return getRuleContext(PackageOrTypeNameContext.class, 0);
      }

      public TypeNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeNameContext typeName() throws RecognitionException {
      TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
      enterRule(_localctx, 64, RULE_typeName);
      try {
         setState(452);
         switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(447);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(448);
               packageOrTypeName();
               setState(449);
               match(T__2);
               setState(450);
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
      public List<TerminalNode> Identifier() {
         return getTokens(PrimaryParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(PrimaryParser.Identifier, i);
      }

      public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_packageOrTypeName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterPackageOrTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitPackageOrTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitPackageOrTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
      PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
      enterRule(_localctx, 66, RULE_packageOrTypeName);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(454);
            match(Identifier);
            setState(459);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 55, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(455);
                        match(T__2);
                        setState(456);
                        match(Identifier);
                     }
                  }
               }
               setState(461);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 55, _ctx);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public AmbiguousNameContext ambiguousName() {
         return getRuleContext(AmbiguousNameContext.class, 0);
      }

      public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expressionName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterExpressionName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitExpressionName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitExpressionName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionNameContext expressionName() throws RecognitionException {
      ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_expressionName);
      try {
         setState(467);
         switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(462);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(463);
               ambiguousName();
               setState(464);
               match(T__2);
               setState(465);
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
      public TerminalNode Identifier() {
         return getToken(PrimaryParser.Identifier, 0);
      }

      public MethodNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterMethodName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitMethodName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitMethodName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodNameContext methodName() throws RecognitionException {
      MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
      enterRule(_localctx, 70, RULE_methodName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(469);
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
      public List<TerminalNode> Identifier() {
         return getTokens(PrimaryParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(PrimaryParser.Identifier, i);
      }

      public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ambiguousName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterAmbiguousName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitAmbiguousName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitAmbiguousName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AmbiguousNameContext ambiguousName() throws RecognitionException {
      AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, getState());
      enterRule(_localctx, 72, RULE_ambiguousName);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(471);
            match(Identifier);
            setState(476);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(472);
                        match(T__2);
                        setState(473);
                        match(Identifier);
                     }
                  }
               }
               setState(478);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
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

   public static class LiteralContext extends ParserRuleContext {
      public TerminalNode IntegerLiteral() {
         return getToken(PrimaryParser.IntegerLiteral, 0);
      }

      public TerminalNode FloatingPointLiteral() {
         return getToken(PrimaryParser.FloatingPointLiteral, 0);
      }

      public TerminalNode BooleanLiteral() {
         return getToken(PrimaryParser.BooleanLiteral, 0);
      }

      public TerminalNode CharacterLiteral() {
         return getToken(PrimaryParser.CharacterLiteral, 0);
      }

      public TerminalNode StringLiteral() {
         return getToken(PrimaryParser.StringLiteral, 0);
      }

      public TerminalNode NullLiteral() {
         return getToken(PrimaryParser.NullLiteral, 0);
      }

      public LiteralContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_literal;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).enterLiteral(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof PrimaryListener)
            ((PrimaryListener) listener).exitLiteral(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof PrimaryVisitor)
            return ((PrimaryVisitor<? extends T>) visitor).visitLiteral(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LiteralContext literal() throws RecognitionException {
      LiteralContext _localctx = new LiteralContext(_ctx, getState());
      enterRule(_localctx, 74, RULE_literal);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(479);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
                  | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
               _errHandler.recoverInline(this);
            }
            else {
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
         case 0 :
            return primary_sempred((PrimaryContext) _localctx, predIndex);
         case 17 :
            return classOrInterfaceType_sempred((ClassOrInterfaceTypeContext) _localctx, predIndex);
         case 31 :
            return packageName_sempred((PackageNameContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return precpred(_ctx, 3);
      }
      return true;
   }

   private boolean classOrInterfaceType_sempred(ClassOrInterfaceTypeContext _localctx, int predIndex) {
      switch (predIndex) {
         case 1 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
      switch (predIndex) {
         case 2 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u01e4\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\5\2T\n"
      + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
      + "\5\2g\n\2\3\2\3\2\5\2k\n\2\3\2\3\2\5\2o\n\2\3\2\3\2\3\2\3\2\3\2\5\2v\n"
      + "\2\3\2\3\2\5\2z\n\2\3\2\3\2\5\2~\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0086"
      + "\n\2\3\2\3\2\3\2\3\2\5\2\u008c\n\2\5\2\u008e\n\2\3\2\3\2\3\2\3\2\5\2\u0094"
      + "\n\2\3\2\3\2\5\2\u0098\n\2\3\2\3\2\5\2\u009c\n\2\3\2\7\2\u009f\n\2\f\2"
      + "\16\2\u00a2\13\2\3\3\3\3\3\3\5\3\u00a7\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"
      + "\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b6\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"
      + "\5\6\u00c0\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c7\n\6\3\6\3\6\3\6\5\6\u00cc"
      + "\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3\n\6\3\6\3\6\3\6\5\6\u00d8\n\6\3\6\3"
      + "\6\3\6\3\6\3\6\5\6\u00df\n\6\3\6\3\6\3\6\5\6\u00e4\n\6\3\6\3\6\3\6\3\6"
      + "\3\6\5\6\u00eb\n\6\3\6\3\6\3\6\5\6\u00f0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5"
      + "\6\u00f8\n\6\3\6\3\6\3\6\5\6\u00fd\n\6\3\6\3\6\5\6\u0101\n\6\3\7\3\7\3"
      + "\7\7\7\u0106\n\7\f\7\16\7\u0109\13\7\3\b\3\b\3\b\5\b\u010e\n\b\3\b\3\b"
      + "\3\b\3\b\3\b\5\b\u0115\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u011c\n\b\3\b\3\b\3"
      + "\b\3\b\3\b\5\b\u0123\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u012b\n\b\3\b\3\b"
      + "\3\b\3\b\3\b\5\b\u0132\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u013a\n\b\3\t\3"
      + "\t\7\t\u013e\n\t\f\t\16\t\u0141\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"
      + "\3\r\3\r\5\r\u014d\n\r\3\16\3\16\5\16\u0151\n\16\3\17\3\17\5\17\u0155"
      + "\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u015e\n\22\3\23\3\23\3\23"
      + "\5\23\u0163\n\23\3\23\3\23\3\23\3\23\5\23\u0169\n\23\7\23\u016b\n\23\f"
      + "\23\16\23\u016e\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"
      + "\3\27\3\27\3\27\3\27\3\27\5\27\u017f\n\27\3\30\3\30\3\30\3\30\7\30\u0185"
      + "\n\30\f\30\16\30\u0188\13\30\3\31\3\31\5\31\u018c\n\31\3\32\3\32\3\32"
      + "\3\32\3\32\7\32\u0193\n\32\f\32\16\32\u0196\13\32\5\32\u0198\n\32\3\33"
      + "\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u01a4\n\35\f\35\16"
      + "\35\u01a7\13\35\3\36\3\36\5\36\u01ab\n\36\3\37\3\37\5\37\u01af\n\37\3"
      + " \3 \3 \3 \5 \u01b5\n \3!\3!\3!\3!\3!\3!\7!\u01bd\n!\f!\16!\u01c0\13!"
      + "\3\"\3\"\3\"\3\"\3\"\5\"\u01c7\n\"\3#\3#\3#\7#\u01cc\n#\f#\16#\u01cf\13"
      + "#\3$\3$\3$\3$\3$\5$\u01d6\n$\3%\3%\3&\3&\3&\7&\u01dd\n&\f&\16&\u01e0\13"
      + "&\3\'\3\'\3\'\2\5\2$@(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"
      + ".\60\62\64\668:<>@BDFHJL\2\5\3\2\23\27\3\2\30\31\3\2\35\"\u020b\2\u008d"
      + "\3\2\2\2\4\u00a6\3\2\2\2\6\u00b5\3\2\2\2\b\u00b7\3\2\2\2\n\u0100\3\2\2"
      + "\2\f\u0102\3\2\2\2\16\u0139\3\2\2\2\20\u013b\3\2\2\2\22\u0142\3\2\2\2"
      + "\24\u0146\3\2\2\2\26\u0148\3\2\2\2\30\u014c\3\2\2\2\32\u0150\3\2\2\2\34"
      + "\u0154\3\2\2\2\36\u0156\3\2\2\2 \u0158\3\2\2\2\"\u015d\3\2\2\2$\u015f"
      + "\3\2\2\2&\u016f\3\2\2\2(\u0171\3\2\2\2*\u0173\3\2\2\2,\u017e\3\2\2\2."
      + "\u0180\3\2\2\2\60\u0189\3\2\2\2\62\u0197\3\2\2\2\64\u0199\3\2\2\2\66\u019c"
      + "\3\2\2\28\u01a0\3\2\2\2:\u01aa\3\2\2\2<\u01ac\3\2\2\2>\u01b4\3\2\2\2@"
      + "\u01b6\3\2\2\2B\u01c6\3\2\2\2D\u01c8\3\2\2\2F\u01d5\3\2\2\2H\u01d7\3\2"
      + "\2\2J\u01d9\3\2\2\2L\u01e1\3\2\2\2NO\b\2\1\2O\u008e\5L\'\2PS\5B\"\2QR"
      + "\7\3\2\2RT\7\4\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\5\2\2VW\7\6\2\2W"
      + "\u008e\3\2\2\2XY\7\7\2\2YZ\7\5\2\2Z\u008e\7\6\2\2[\u008e\7\b\2\2\\]\5"
      + "B\"\2]^\7\5\2\2^_\7\b\2\2_\u008e\3\2\2\2`a\7\t\2\2ab\5\26\f\2bc\7\n\2"
      + "\2c\u008e\3\2\2\2df\7\13\2\2eg\5\66\34\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2"
      + "hj\7#\2\2ik\5\4\3\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\t\2\2mo\5\f\7\2"
      + "nm\3\2\2\2no\3\2\2\2op\3\2\2\2p\u008e\7\n\2\2qr\5F$\2rs\7\5\2\2su\7\13"
      + "\2\2tv\5\66\34\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7#\2\2xz\5\4\3\2yx\3"
      + "\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\t\2\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\177"
      + "\3\2\2\2\177\u0080\7\n\2\2\u0080\u008e\3\2\2\2\u0081\u0082\7\13\2\2\u0082"
      + "\u0083\5\32\16\2\u0083\u0085\5\20\t\2\u0084\u0086\5.\30\2\u0085\u0084"
      + "\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008e\3\2\2\2\u0087\u0088\7\13\2\2"
      + "\u0088\u0089\5$\23\2\u0089\u008b\5\20\t\2\u008a\u008c\5.\30\2\u008b\u008a"
      + "\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008dN\3\2\2\2\u008d"
      + "P\3\2\2\2\u008dX\3\2\2\2\u008d[\3\2\2\2\u008d\\\3\2\2\2\u008d`\3\2\2\2"
      + "\u008dd\3\2\2\2\u008dq\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0087\3\2\2\2"
      + "\u008e\u00a0\3\2\2\2\u008f\u0090\f\5\2\2\u0090\u0091\7\5\2\2\u0091\u0093"
      + "\7\13\2\2\u0092\u0094\5\66\34\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2"
      + "\2\u0094\u0095\3\2\2\2\u0095\u0097\7#\2\2\u0096\u0098\5\4\3\2\u0097\u0096"
      + "\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7\t\2\2\u009a"
      + "\u009c\5\f\7\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"
      + "\2\2\u009d\u009f\7\n\2\2\u009e\u008f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"
      + "\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\3\3\2\2\2\u00a2\u00a0\3\2\2\2"
      + "\u00a3\u00a7\5\66\34\2\u00a4\u00a5\7\f\2\2\u00a5\u00a7\7\r\2\2\u00a6\u00a3"
      + "\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\5\3\2\2\2\u00a8\u00a9\5\2\2\2\u00a9"
      + "\u00aa\7\5\2\2\u00aa\u00ab\7#\2\2\u00ab\u00b6\3\2\2\2\u00ac\u00ad\7\16"
      + "\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00b6\7#\2\2\u00af\u00b0\5B\"\2\u00b0\u00b1"
      + "\7\5\2\2\u00b1\u00b2\7\16\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\7#\2\2\u00b4"
      + "\u00b6\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2"
      + "\2\2\u00b6\7\3\2\2\2\u00b7\u00b8\5F$\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba"
      + "\5\26\f\2\u00ba\u00bb\7\4\2\2\u00bb\t\3\2\2\2\u00bc\u00bd\5H%\2\u00bd"
      + "\u00bf\7\t\2\2\u00be\u00c0\5\f\7\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2"
      + "\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\n\2\2\u00c2\u0101\3\2\2\2\u00c3"
      + "\u00c4\5B\"\2\u00c4\u00c6\7\5\2\2\u00c5\u00c7\5\66\34\2\u00c6\u00c5\3"
      + "\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9"
      + "\u00cb\7\t\2\2\u00ca\u00cc\5\f\7\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2"
      + "\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce\u0101\3\2\2\2\u00cf"
      + "\u00d0\5F$\2\u00d0\u00d2\7\5\2\2\u00d1\u00d3\5\66\34\2\u00d2\u00d1\3\2"
      + "\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5"
      + "\u00d7\7\t\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2"
      + "\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\n\2\2\u00da\u0101\3\2\2\2\u00db"
      + "\u00dc\5\2\2\2\u00dc\u00de\7\5\2\2\u00dd\u00df\5\66\34\2\u00de\u00dd\3"
      + "\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1"
      + "\u00e3\7\t\2\2\u00e2\u00e4\5\f\7\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"
      + "\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\u0101\3\2\2\2\u00e7"
      + "\u00e8\7\16\2\2\u00e8\u00ea\7\5\2\2\u00e9\u00eb\5\66\34\2\u00ea\u00e9"
      + "\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed"
      + "\u00ef\7\t\2\2\u00ee\u00f0\5\f\7\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"
      + "\2\2\u00f0\u00f1\3\2\2\2\u00f1\u0101\7\n\2\2\u00f2\u00f3\5B\"\2\u00f3"
      + "\u00f4\7\5\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f7\7\5\2\2\u00f6\u00f8\5"
      + "\66\34\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"
      + "\u00fa\7#\2\2\u00fa\u00fc\7\t\2\2\u00fb\u00fd\5\f\7\2\u00fc\u00fb\3\2"
      + "\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\n\2\2\u00ff"
      + "\u0101\3\2\2\2\u0100\u00bc\3\2\2\2\u0100\u00c3\3\2\2\2\u0100\u00cf\3\2"
      + "\2\2\u0100\u00db\3\2\2\2\u0100\u00e7\3\2\2\2\u0100\u00f2\3\2\2\2\u0101"
      + "\13\3\2\2\2\u0102\u0107\5\26\f\2\u0103\u0104\7\17\2\2\u0104\u0106\5\26"
      + "\f\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"
      + "\u0108\3\2\2\2\u0108\r\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5F$\2\u010b"
      + "\u010d\7\20\2\2\u010c\u010e\5\66\34\2\u010d\u010c\3\2\2\2\u010d\u010e"
      + "\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7#\2\2\u0110\u013a\3\2\2\2\u0111"
      + "\u0112\5\"\22\2\u0112\u0114\7\20\2\2\u0113\u0115\5\66\34\2\u0114\u0113"
      + "\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7#\2\2\u0117"
      + "\u013a\3\2\2\2\u0118\u0119\5\2\2\2\u0119\u011b\7\20\2\2\u011a\u011c\5"
      + "\66\34\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"
      + "\u011e\7#\2\2\u011e\u013a\3\2\2\2\u011f\u0120\7\16\2\2\u0120\u0122\7\20"
      + "\2\2\u0121\u0123\5\66\34\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"
      + "\u0124\3\2\2\2\u0124\u013a\7#\2\2\u0125\u0126\5B\"\2\u0126\u0127\7\5\2"
      + "\2\u0127\u0128\7\16\2\2\u0128\u012a\7\20\2\2\u0129\u012b\5\66\34\2\u012a"
      + "\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7#"
      + "\2\2\u012d\u013a\3\2\2\2\u012e\u012f\5&\24\2\u012f\u0131\7\20\2\2\u0130"
      + "\u0132\5\66\34\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3"
      + "\2\2\2\u0133\u0134\7\13\2\2\u0134\u013a\3\2\2\2\u0135\u0136\5,\27\2\u0136"
      + "\u0137\7\20\2\2\u0137\u0138\7\13\2\2\u0138\u013a\3\2\2\2\u0139\u010a\3"
      + "\2\2\2\u0139\u0111\3\2\2\2\u0139\u0118\3\2\2\2\u0139\u011f\3\2\2\2\u0139"
      + "\u0125\3\2\2\2\u0139\u012e\3\2\2\2\u0139\u0135\3\2\2\2\u013a\17\3\2\2"
      + "\2\u013b\u013f\5\22\n\2\u013c\u013e\5\22\n\2\u013d\u013c\3\2\2\2\u013e"
      + "\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\21\3\2\2"
      + "\2\u0141\u013f\3\2\2\2\u0142\u0143\7\3\2\2\u0143\u0144\5\26\f\2\u0144"
      + "\u0145\7\4\2\2\u0145\23\3\2\2\2\u0146\u0147\5\26\f\2\u0147\25\3\2\2\2"
      + "\u0148\u0149\7\21\2\2\u0149\27\3\2\2\2\u014a\u014d\5\32\16\2\u014b\u014d"
      + "\5\"\22\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\31\3\2\2\2\u014e"
      + "\u0151\5\34\17\2\u014f\u0151\7\22\2\2\u0150\u014e\3\2\2\2\u0150\u014f"
      + "\3\2\2\2\u0151\33\3\2\2\2\u0152\u0155\5\36\20\2\u0153\u0155\5 \21\2\u0154"
      + "\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\35\3\2\2\2\u0156\u0157\t\2\2"
      + "\2\u0157\37\3\2\2\2\u0158\u0159\t\3\2\2\u0159!\3\2\2\2\u015a\u015e\5$"
      + "\23\2\u015b\u015e\5*\26\2\u015c\u015e\5,\27\2\u015d\u015a\3\2\2\2\u015d"
      + "\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e#\3\2\2\2\u015f\u0160\b\23\1\2"
      + "\u0160\u0162\7#\2\2\u0161\u0163\5\66\34\2\u0162\u0161\3\2\2\2\u0162\u0163"
      + "\3\2\2\2\u0163\u016c\3\2\2\2\u0164\u0165\f\3\2\2\u0165\u0166\7\5\2\2\u0166"
      + "\u0168\7#\2\2\u0167\u0169\5\66\34\2\u0168\u0167\3\2\2\2\u0168\u0169\3"
      + "\2\2\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016b\u016e\3\2\2\2\u016c"
      + "\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d%\3\2\2\2\u016e\u016c\3\2\2\2"
      + "\u016f\u0170\5$\23\2\u0170\'\3\2\2\2\u0171\u0172\5$\23\2\u0172)\3\2\2"
      + "\2\u0173\u0174\7#\2\2\u0174+\3\2\2\2\u0175\u0176\5\32\16\2\u0176\u0177"
      + "\5.\30\2\u0177\u017f\3\2\2\2\u0178\u0179\5$\23\2\u0179\u017a\5.\30\2\u017a"
      + "\u017f\3\2\2\2\u017b\u017c\5*\26\2\u017c\u017d\5.\30\2\u017d\u017f\3\2"
      + "\2\2\u017e\u0175\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017b\3\2\2\2\u017f"
      + "-\3\2\2\2\u0180\u0181\7\3\2\2\u0181\u0186\7\4\2\2\u0182\u0183\7\3\2\2"
      + "\u0183\u0185\7\4\2\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"
      + "\3\2\2\2\u0186\u0187\3\2\2\2\u0187/\3\2\2\2\u0188\u0186\3\2\2\2\u0189"
      + "\u018b\7#\2\2\u018a\u018c\5\62\32\2\u018b\u018a\3\2\2\2\u018b\u018c\3"
      + "\2\2\2\u018c\61\3\2\2\2\u018d\u018e\7\32\2\2\u018e\u0198\5*\26\2\u018f"
      + "\u0190\7\32\2\2\u0190\u0194\5$\23\2\u0191\u0193\5\64\33\2\u0192\u0191"
      + "\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"
      + "\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u018d\3\2\2\2\u0197\u018f\3\2"
      + "\2\2\u0198\63\3\2\2\2\u0199\u019a\7\33\2\2\u019a\u019b\5(\25\2\u019b\65"
      + "\3\2\2\2\u019c\u019d\7\f\2\2\u019d\u019e\58\35\2\u019e\u019f\7\r\2\2\u019f"
      + "\67\3\2\2\2\u01a0\u01a5\5:\36\2\u01a1\u01a2\7\17\2\2\u01a2\u01a4\5:\36"
      + "\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6"
      + "\3\2\2\2\u01a69\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\5\"\22\2\u01a9"
      + "\u01ab\5<\37\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab;\3\2\2\2"
      + "\u01ac\u01ae\7\34\2\2\u01ad\u01af\5> \2\u01ae\u01ad\3\2\2\2\u01ae\u01af"
      + "\3\2\2\2\u01af=\3\2\2\2\u01b0\u01b1\7\32\2\2\u01b1\u01b5\5\"\22\2\u01b2"
      + "\u01b3\7\16\2\2\u01b3\u01b5\5\"\22\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3"
      + "\2\2\2\u01b5?\3\2\2\2\u01b6\u01b7\b!\1\2\u01b7\u01b8\7#\2\2\u01b8\u01be"
      + "\3\2\2\2\u01b9\u01ba\f\3\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01bd\7#\2\2\u01bc"
      + "\u01b9\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"
      + "\2\2\u01bfA\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c7\7#\2\2\u01c2\u01c3"
      + "\5D#\2\u01c3\u01c4\7\5\2\2\u01c4\u01c5\7#\2\2\u01c5\u01c7\3\2\2\2\u01c6"
      + "\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7C\3\2\2\2\u01c8\u01cd\7#\2\2\u01c9"
      + "\u01ca\7\5\2\2\u01ca\u01cc\7#\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2"
      + "\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceE\3\2\2\2\u01cf\u01cd"
      + "\3\2\2\2\u01d0\u01d6\7#\2\2\u01d1\u01d2\5J&\2\u01d2\u01d3\7\5\2\2\u01d3"
      + "\u01d4\7#\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d1\3\2"
      + "\2\2\u01d6G\3\2\2\2\u01d7\u01d8\7#\2\2\u01d8I\3\2\2\2\u01d9\u01de\7#\2"
      + "\2\u01da\u01db\7\5\2\2\u01db\u01dd\7#\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e0"
      + "\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfK\3\2\2\2\u01e0"
      + "\u01de\3\2\2\2\u01e1\u01e2\t\4\2\2\u01e2M\3\2\2\2<Sfjnuy}\u0085\u008b"
      + "\u008d\u0093\u0097\u009b\u00a0\u00a6\u00b5\u00bf\u00c6\u00cb\u00d2\u00d7"
      + "\u00de\u00e3\u00ea\u00ef\u00f7\u00fc\u0100\u0107\u010d\u0114\u011b\u0122"
      + "\u012a\u0131\u0139\u013f\u014c\u0150\u0154\u015d\u0162\u0168\u016c\u017e"
      + "\u0186\u018b\u0194\u0197\u01a5\u01aa\u01ae\u01b4\u01be\u01c6\u01cd\u01d5" + "\u01de";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}