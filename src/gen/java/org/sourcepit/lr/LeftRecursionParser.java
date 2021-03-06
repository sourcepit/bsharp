// Generated from LeftRecursion.g4 by ANTLR 4.5.1

package org.sourcepit.lr;

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
public class LeftRecursionParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, INT = 4, ID = 5;
   public static final int RULE_stat = 0, RULE_expr = 1;
   public static final String[] ruleNames = { "stat", "expr" };

   private static final String[] _LITERAL_NAMES = { null, "';'", "'*'", "'+'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, "INT", "ID" };
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
      return "LeftRecursion.g4";
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

   public LeftRecursionParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class StatContext extends ParserRuleContext {
      public ExprContext expr() {
         return getRuleContext(ExprContext.class, 0);
      }

      public StatContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_stat;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LeftRecursionListener)
            ((LeftRecursionListener) listener).enterStat(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LeftRecursionListener)
            ((LeftRecursionListener) listener).exitStat(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LeftRecursionVisitor)
            return ((LeftRecursionVisitor<? extends T>) visitor).visitStat(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatContext stat() throws RecognitionException {
      StatContext _localctx = new StatContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_stat);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(4);
            expr(0);
            setState(5);
            match(T__0);
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
      public TerminalNode INT() {
         return getToken(LeftRecursionParser.INT, 0);
      }

      public TerminalNode ID() {
         return getToken(LeftRecursionParser.ID, 0);
      }

      public List<ExprContext> expr() {
         return getRuleContexts(ExprContext.class);
      }

      public ExprContext expr(int i) {
         return getRuleContext(ExprContext.class, i);
      }

      public ExprContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expr;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LeftRecursionListener)
            ((LeftRecursionListener) listener).enterExpr(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LeftRecursionListener)
            ((LeftRecursionListener) listener).exitExpr(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LeftRecursionVisitor)
            return ((LeftRecursionVisitor<? extends T>) visitor).visitExpr(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExprContext expr() throws RecognitionException {
      return expr(0);
   }

   private ExprContext expr(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ExprContext _localctx = new ExprContext(_ctx, _parentState);
      ExprContext _prevctx = _localctx;
      int _startState = 2;
      enterRecursionRule(_localctx, 2, RULE_expr, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(10);
            switch (_input.LA(1)) {
               case INT : {
                  setState(8);
                  match(INT);
               }
                  break;
               case ID : {
                  setState(9);
                  match(ID);
               }
                  break;
               default :
                  throw new NoViableAltException(this);
            }
            _ctx.stop = _input.LT(-1);
            setState(20);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(18);
                     switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                        case 1 : {
                           _localctx = new ExprContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_expr);
                           setState(12);
                           if (!(precpred(_ctx, 4)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                           setState(13);
                           match(T__1);
                           setState(14);
                           expr(5);
                        }
                           break;
                        case 2 : {
                           _localctx = new ExprContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_expr);
                           setState(15);
                           if (!(precpred(_ctx, 3)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                           setState(16);
                           match(T__2);
                           setState(17);
                           expr(4);
                        }
                           break;
                     }
                  }
               }
               setState(22);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
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

   public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
      switch (ruleIndex) {
         case 1 :
            return expr_sempred((ExprContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean expr_sempred(ExprContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return precpred(_ctx, 4);
         case 1 :
            return precpred(_ctx, 3);
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\32\4\2\t\2\4\3"
      + "\t\3\3\2\3\2\3\2\3\3\3\3\3\3\5\3\r\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\25"
      + "\n\3\f\3\16\3\30\13\3\3\3\2\3\4\4\2\4\2\2\32\2\6\3\2\2\2\4\f\3\2\2\2\6"
      + "\7\5\4\3\2\7\b\7\3\2\2\b\3\3\2\2\2\t\n\b\3\1\2\n\r\7\6\2\2\13\r\7\7\2"
      + "\2\f\t\3\2\2\2\f\13\3\2\2\2\r\26\3\2\2\2\16\17\f\6\2\2\17\20\7\4\2\2\20"
      + "\25\5\4\3\7\21\22\f\5\2\2\22\23\7\5\2\2\23\25\5\4\3\6\24\16\3\2\2\2\24"
      + "\21\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\5\3\2\2\2\30" + "\26\3\2\2\2\5\f\24\26";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}