// Generated from BSharp.g4 by ANTLR 4.5.1

package org.sourcepit.bsharp;

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
public class BSharpParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18,
      T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26, T__26 = 27,
      T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31, T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36,
      T__36 = 37, T__37 = 38, T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
      T__45 = 46, T__46 = 47, T__47 = 48, T__48 = 49, T__49 = 50, T__50 = 51, T__51 = 52, T__52 = 53, T__53 = 54,
      T__54 = 55, T__55 = 56, T__56 = 57, T__57 = 58, T__58 = 59, T__59 = 60, T__60 = 61, T__61 = 62, T__62 = 63,
      T__63 = 64, T__64 = 65, T__65 = 66, T__66 = 67, T__67 = 68, T__68 = 69, T__69 = 70, T__70 = 71, T__71 = 72,
      T__72 = 73, T__73 = 74, T__74 = 75, T__75 = 76, T__76 = 77, T__77 = 78, T__78 = 79, T__79 = 80, T__80 = 81,
      T__81 = 82, T__82 = 83, T__83 = 84, T__84 = 85, T__85 = 86, T__86 = 87, T__87 = 88, T__88 = 89, T__89 = 90,
      T__90 = 91, T__91 = 92, T__92 = 93, T__93 = 94, T__94 = 95, T__95 = 96, T__96 = 97, T__97 = 98, T__98 = 99,
      IntegerLiteral = 100, FloatingPointLiteral = 101, BooleanLiteral = 102, CharacterLiteral = 103,
      StringLiteral = 104, NullLiteral = 105, Identifier = 106, WS = 107, COMMENT = 108, LINE_COMMENT = 109;
   public static final int RULE_packageName = 0, RULE_typeName = 1, RULE_packageOrTypeName = 2, RULE_expressionName = 3,
      RULE_methodName = 4, RULE_ambiguousName = 5, RULE_type = 6, RULE_primitiveType = 7, RULE_numericType = 8,
      RULE_integralType = 9, RULE_floatingPointType = 10, RULE_referenceType = 11, RULE_classOrInterfaceType = 12,
      RULE_classType = 13, RULE_interfaceType = 14, RULE_typeVariable = 15, RULE_arrayType = 16, RULE_dims = 17,
      RULE_typeParameter = 18, RULE_typeParameterModifier = 19, RULE_typeBound = 20, RULE_additionalBound = 21,
      RULE_typeArguments = 22, RULE_typeArgumentList = 23, RULE_typeArgument = 24, RULE_wildcard = 25,
      RULE_wildcardBounds = 26, RULE_compilationUnit = 27, RULE_packageDeclaration = 28, RULE_packageModifier = 29,
      RULE_importDeclaration = 30, RULE_singleTypeImportDeclaration = 31, RULE_typeImportOnDemandDeclaration = 32,
      RULE_singleStaticImportDeclaration = 33, RULE_staticImportOnDemandDeclaration = 34, RULE_typeDeclaration = 35,
      RULE_classDeclaration = 36, RULE_normalClassDeclaration = 37, RULE_classModifier = 38, RULE_typeParameters = 39,
      RULE_typeParameterList = 40, RULE_superclass = 41, RULE_superinterfaces = 42, RULE_interfaceTypeList = 43,
      RULE_classBody = 44, RULE_classBodyDeclaration = 45, RULE_classMemberDeclaration = 46, RULE_fieldDeclaration = 47,
      RULE_fieldModifier = 48, RULE_variableDeclaratorList = 49, RULE_variableDeclarator = 50,
      RULE_variableDeclaratorId = 51, RULE_variableInitializer = 52, RULE_unannType = 53, RULE_unannPrimitiveType = 54,
      RULE_unannReferenceType = 55, RULE_unannClassOrInterfaceType = 56, RULE_unannClassType = 57,
      RULE_unannInterfaceType = 58, RULE_unannTypeVariable = 59, RULE_unannArrayType = 60, RULE_methodDeclaration = 61,
      RULE_methodModifier = 62, RULE_methodHeader = 63, RULE_result = 64, RULE_methodDeclarator = 65,
      RULE_formalParameterList = 66, RULE_formalParameters = 67, RULE_formalParameter = 68, RULE_variableModifier = 69,
      RULE_lastFormalParameter = 70, RULE_receiverParameter = 71, RULE_throws_ = 72, RULE_exceptionTypeList = 73,
      RULE_exceptionType = 74, RULE_methodBody = 75, RULE_instanceInitializer = 76, RULE_staticInitializer = 77,
      RULE_constructorDeclaration = 78, RULE_constructorModifier = 79, RULE_constructorDeclarator = 80,
      RULE_simpleTypeName = 81, RULE_constructorBody = 82, RULE_explicitConstructorInvocation = 83,
      RULE_enumDeclaration = 84, RULE_enumBody = 85, RULE_enumConstantList = 86, RULE_enumConstant = 87,
      RULE_enumConstantModifier = 88, RULE_enumBodyDeclarations = 89, RULE_interfaceDeclaration = 90,
      RULE_normalInterfaceDeclaration = 91, RULE_interfaceModifier = 92, RULE_extendsInterfaces = 93,
      RULE_interfaceBody = 94, RULE_interfaceMemberDeclaration = 95, RULE_constantDeclaration = 96,
      RULE_constantModifier = 97, RULE_interfaceMethodDeclaration = 98, RULE_interfaceMethodModifier = 99,
      RULE_annotationTypeDeclaration = 100, RULE_annotationTypeBody = 101, RULE_annotationTypeMemberDeclaration = 102,
      RULE_annotationTypeElementDeclaration = 103, RULE_annotationTypeElementModifier = 104, RULE_defaultValue = 105,
      RULE_annotation = 106, RULE_normalAnnotation = 107, RULE_elementValuePairList = 108, RULE_elementValuePair = 109,
      RULE_elementValue = 110, RULE_elementValueArrayInitializer = 111, RULE_elementValueList = 112,
      RULE_markerAnnotation = 113, RULE_singleElementAnnotation = 114, RULE_arrayInitializer = 115,
      RULE_variableInitializerList = 116, RULE_block = 117, RULE_blockStatements = 118, RULE_blockStatement = 119,
      RULE_localVariableDeclarationStatement = 120, RULE_localVariableDeclaration = 121, RULE_statement = 122,
      RULE_statementNoShortIf = 123, RULE_statementWithoutTrailingSubstatement = 124, RULE_emptyStatement = 125,
      RULE_labeledStatement = 126, RULE_labeledStatementNoShortIf = 127, RULE_expressionStatement = 128,
      RULE_statementExpression = 129, RULE_preIncrementExpression = 130, RULE_preDecrementExpression = 131,
      RULE_postIncrementExpression = 132, RULE_postDecrementExpression = 133, RULE_ifThenStatement = 134,
      RULE_ifThenElseStatement = 135, RULE_ifThenElseStatementNoShortIf = 136, RULE_assertStatement = 137,
      RULE_switchStatement = 138, RULE_switchBlock = 139, RULE_switchBlockStatementGroup = 140, RULE_switchLabels = 141,
      RULE_switchLabel = 142, RULE_enumConstantName = 143, RULE_whileStatement = 144,
      RULE_whileStatementNoShortIf = 145, RULE_doStatement = 146, RULE_forStatement = 147,
      RULE_forStatementNoShortIf = 148, RULE_basicForStatement = 149, RULE_basicForStatementNoShortIf = 150,
      RULE_forInit = 151, RULE_forUpdate = 152, RULE_statementExpressionList = 153, RULE_enhancedForStatement = 154,
      RULE_enhancedForStatementNoShortIf = 155, RULE_breakStatement = 156, RULE_continueStatement = 157,
      RULE_returnStatement = 158, RULE_throwStatement = 159, RULE_synchronizedStatement = 160, RULE_tryStatement = 161,
      RULE_catches = 162, RULE_catchClause = 163, RULE_catchFormalParameter = 164, RULE_catchType = 165,
      RULE_finally_ = 166, RULE_tryWithResourcesStatement = 167, RULE_resourceSpecification = 168,
      RULE_resourceList = 169, RULE_resource = 170, RULE_primary = 171, RULE_primaryNoNewArray = 172,
      RULE_primarySuffixExpression = 173, RULE_primarySuffixExpressionNoNewArray = 174,
      RULE_primaryPrefixExpression = 175, RULE_primaryPrefixExpressionNoNewArray = 176,
      RULE_objectCreationExpression = 177, RULE_fieldAccessExpression = 178,
      RULE_methodCallExpressionWithTypeArgs = 179, RULE_methodCallExpression = 180,
      RULE_methodReferenceExpression = 181, RULE_constructorReferenceExpressionWithTypeArgs = 182,
      RULE_constructorReferenceExpressionNoTypeArgs = 183, RULE_typeArgumentsOrDiamond = 184, RULE_argumentList = 185,
      RULE_classInstanceCreationExpression = 186, RULE_arrayCreationExpression = 187, RULE_dimExprs = 188,
      RULE_dimExpr = 189, RULE_constantExpression = 190, RULE_expression = 191, RULE_lambdaExpression = 192,
      RULE_lambdaParameters = 193, RULE_inferredFormalParameterList = 194, RULE_lambdaBody = 195,
      RULE_assignmentExpression = 196, RULE_assignment = 197, RULE_leftHandSide = 198, RULE_assignmentOperator = 199,
      RULE_conditionalExpression = 200, RULE_conditionalOrExpression = 201, RULE_conditionalAndExpression = 202,
      RULE_inclusiveOrExpression = 203, RULE_exclusiveOrExpression = 204, RULE_andExpression = 205,
      RULE_equalityExpression = 206, RULE_relationalExpression = 207, RULE_shiftExpression = 208,
      RULE_additiveExpression = 209, RULE_multiplicativeExpression = 210, RULE_unaryExpression = 211,
      RULE_unaryExpressionNotPlusMinus = 212, RULE_postfixExpression = 213, RULE_castExpression = 214,
      RULE_fieldAccess = 215, RULE_arrayAccess = 216, RULE_methodInvocation = 217, RULE_literal = 218;
   public static final String[] ruleNames = { "packageName", "typeName", "packageOrTypeName", "expressionName",
      "methodName", "ambiguousName", "type", "primitiveType", "numericType", "integralType", "floatingPointType",
      "referenceType", "classOrInterfaceType", "classType", "interfaceType", "typeVariable", "arrayType", "dims",
      "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", "typeArguments", "typeArgumentList",
      "typeArgument", "wildcard", "wildcardBounds", "compilationUnit", "packageDeclaration", "packageModifier",
      "importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration",
      "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", "classDeclaration",
      "normalClassDeclaration", "classModifier", "typeParameters", "typeParameterList", "superclass", "superinterfaces",
      "interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration",
      "fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", "variableInitializer",
      "unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", "unannClassType",
      "unannInterfaceType", "unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier",
      "methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", "formalParameter",
      "variableModifier", "lastFormalParameter", "receiverParameter", "throws_", "exceptionTypeList", "exceptionType",
      "methodBody", "instanceInitializer", "staticInitializer", "constructorDeclaration", "constructorModifier",
      "constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", "enumDeclaration",
      "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", "enumBodyDeclarations",
      "interfaceDeclaration", "normalInterfaceDeclaration", "interfaceModifier", "extendsInterfaces", "interfaceBody",
      "interfaceMemberDeclaration", "constantDeclaration", "constantModifier", "interfaceMethodDeclaration",
      "interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeMemberDeclaration",
      "annotationTypeElementDeclaration", "annotationTypeElementModifier", "defaultValue", "annotation",
      "normalAnnotation", "elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer",
      "elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", "variableInitializerList",
      "block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration",
      "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", "labeledStatement",
      "labeledStatementNoShortIf", "expressionStatement", "statementExpression", "preIncrementExpression",
      "preDecrementExpression", "postIncrementExpression", "postDecrementExpression", "ifThenStatement",
      "ifThenElseStatement", "ifThenElseStatementNoShortIf", "assertStatement", "switchStatement", "switchBlock",
      "switchBlockStatementGroup", "switchLabels", "switchLabel", "enumConstantName", "whileStatement",
      "whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement",
      "basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", "enhancedForStatement",
      "enhancedForStatementNoShortIf", "breakStatement", "continueStatement", "returnStatement", "throwStatement",
      "synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType",
      "finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", "resource", "primary",
      "primaryNoNewArray", "primarySuffixExpression", "primarySuffixExpressionNoNewArray", "primaryPrefixExpression",
      "primaryPrefixExpressionNoNewArray", "objectCreationExpression", "fieldAccessExpression",
      "methodCallExpressionWithTypeArgs", "methodCallExpression", "methodReferenceExpression",
      "constructorReferenceExpressionWithTypeArgs", "constructorReferenceExpressionNoTypeArgs",
      "typeArgumentsOrDiamond", "argumentList", "classInstanceCreationExpression", "arrayCreationExpression",
      "dimExprs", "dimExpr", "constantExpression", "expression", "lambdaExpression", "lambdaParameters",
      "inferredFormalParameterList", "lambdaBody", "assignmentExpression", "assignment", "leftHandSide",
      "assignmentOperator", "conditionalExpression", "conditionalOrExpression", "conditionalAndExpression",
      "inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression",
      "shiftExpression", "additiveExpression", "multiplicativeExpression", "unaryExpression",
      "unaryExpressionNotPlusMinus", "postfixExpression", "castExpression", "fieldAccess", "arrayAccess",
      "methodInvocation", "literal" };

   private static final String[] _LITERAL_NAMES = { null, "'.'", "'boolean'", "'byte'", "'short'", "'int'", "'long'",
      "'char'", "'float'", "'double'", "'['", "']'", "'extends'", "'&'", "'<'", "'>'", "','", "'?'", "'super'",
      "'package'", "';'", "'import'", "'*'", "'static'", "'class'", "'public'", "'protected'", "'private'",
      "'abstract'", "'final'", "'strictfp'", "'implements'", "'{'", "'}'", "'transient'", "'volatile'", "'='",
      "'synchronized'", "'native'", "'void'", "'('", "')'", "'...'", "'this'", "'throws'", "'enum'", "'interface'",
      "'default'", "'@'", "':'", "'++'", "'--'", "'if'", "'else'", "'assert'", "'switch'", "'case'", "'while'", "'do'",
      "'for'", "'break'", "'continue'", "'return'", "'throw'", "'try'", "'catch'", "'|'", "'finally'", "'new'", "'::'",
      "'->'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'||'",
      "'&&'", "'^'", "'=='", "'!='", "'<='", "'>='", "'instanceof'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'",
      "'%'", "'~'", "'!'", "'TypeName'", null, null, null, null, null, "'null'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, null, null, null, null, null, null, null, null, "IntegerLiteral",
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
      return "BSharp.g4";
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

   public BSharpParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class PackageNameContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPackageName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPackageName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPackageName(this);
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
      int _startState = 0;
      enterRecursionRule(_localctx, 0, RULE_packageName, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(439);
               match(Identifier);
            }
            _ctx.stop = _input.LT(-1);
            setState(446);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new PackageNameContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_packageName);
                        setState(441);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(442);
                        match(T__0);
                        setState(443);
                        match(Identifier);
                     }
                  }
               }
               setState(448);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
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
         return getToken(BSharpParser.Identifier, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeNameContext typeName() throws RecognitionException {
      TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_typeName);
      try {
         setState(454);
         switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(449);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(450);
               packageOrTypeName();
               setState(451);
               match(T__0);
               setState(452);
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
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPackageOrTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPackageOrTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPackageOrTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
      PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_packageOrTypeName);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(456);
            match(Identifier);
            setState(461);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(457);
                        match(T__0);
                        setState(458);
                        match(Identifier);
                     }
                  }
               }
               setState(463);
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
         exitRule();
      }
      return _localctx;
   }

   public static class ExpressionNameContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExpressionName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExpressionName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExpressionName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionNameContext expressionName() throws RecognitionException {
      ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_expressionName);
      try {
         setState(469);
         switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(464);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(465);
               ambiguousName();
               setState(466);
               match(T__0);
               setState(467);
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
         return getToken(BSharpParser.Identifier, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodNameContext methodName() throws RecognitionException {
      MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_methodName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(471);
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
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAmbiguousName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAmbiguousName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAmbiguousName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AmbiguousNameContext ambiguousName() throws RecognitionException {
      AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_ambiguousName);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(473);
            match(Identifier);
            setState(478);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(474);
                        match(T__0);
                        setState(475);
                        match(Identifier);
                     }
                  }
               }
               setState(480);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeContext type() throws RecognitionException {
      TypeContext _localctx = new TypeContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_type);
      try {
         setState(483);
         switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(481);
               primitiveType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(482);
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

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimitiveType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimitiveType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimitiveType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimitiveTypeContext primitiveType() throws RecognitionException {
      PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_primitiveType);
      int _la;
      try {
         setState(499);
         switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(488);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__47) {
                  {
                     {
                        setState(485);
                        annotation();
                     }
                  }
                  setState(490);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(491);
               numericType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(495);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__47) {
                  {
                     {
                        setState(492);
                        annotation();
                     }
                  }
                  setState(497);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(498);
               match(T__1);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterNumericType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitNumericType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitNumericType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NumericTypeContext numericType() throws RecognitionException {
      NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_numericType);
      try {
         setState(503);
         switch (_input.LA(1)) {
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
               enterOuterAlt(_localctx, 1); {
               setState(501);
               integralType();
            }
               break;
            case T__7 :
            case T__8 :
               enterOuterAlt(_localctx, 2); {
               setState(502);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterIntegralType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitIntegralType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitIntegralType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IntegralTypeContext integralType() throws RecognitionException {
      IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_integralType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(505);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0))) {
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFloatingPointType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFloatingPointType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFloatingPointType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
      FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_floatingPointType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(507);
            _la = _input.LA(1);
            if (!(_la == T__7 || _la == T__8)) {
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterReferenceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitReferenceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitReferenceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ReferenceTypeContext referenceType() throws RecognitionException {
      ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_referenceType);
      try {
         setState(512);
         switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(509);
               classOrInterfaceType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(510);
               typeVariable();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(511);
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
         return getRuleContext(ClassTypeContext.class, 0);
      }

      public InterfaceTypeContext interfaceType() {
         return getRuleContext(InterfaceTypeContext.class, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassOrInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassOrInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassOrInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
      ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_classOrInterfaceType);
      try {
         setState(516);
         switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(514);
               classType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(515);
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
      public List<TerminalNode> Identifier() {
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public List<TypeArgumentsContext> typeArguments() {
         return getRuleContexts(TypeArgumentsContext.class);
      }

      public TypeArgumentsContext typeArguments(int i) {
         return getRuleContext(TypeArgumentsContext.class, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassTypeContext classType() throws RecognitionException {
      ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_classType);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(521);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(518);
                     annotation();
                  }
               }
               setState(523);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(524);
            match(Identifier);
            setState(526);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
               case 1 : {
                  setState(525);
                  typeArguments();
               }
                  break;
            }
            setState(541);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(528);
                        match(T__0);
                        setState(532);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__47) {
                           {
                              {
                                 setState(529);
                                 annotation();
                              }
                           }
                           setState(534);
                           _errHandler.sync(this);
                           _la = _input.LA(1);
                        }
                        setState(535);
                        match(Identifier);
                        setState(537);
                        switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                           case 1 : {
                              setState(536);
                              typeArguments();
                           }
                              break;
                        }
                     }
                  }
               }
               setState(543);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
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
         return getRuleContext(ClassTypeContext.class, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceTypeContext interfaceType() throws RecognitionException {
      InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_interfaceType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(544);
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
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeVariable(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeVariable(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeVariable(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeVariableContext typeVariable() throws RecognitionException {
      TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
      enterRule(_localctx, 30, RULE_typeVariable);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(549);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(546);
                     annotation();
                  }
               }
               setState(551);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(552);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterArrayType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitArrayType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitArrayType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayTypeContext arrayType() throws RecognitionException {
      ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
      enterRule(_localctx, 32, RULE_arrayType);
      try {
         setState(563);
         switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(554);
               primitiveType();
               setState(555);
               dims();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(557);
               classOrInterfaceType();
               setState(558);
               dims();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(560);
               typeVariable();
               setState(561);
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
      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public DimsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_dims;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterDims(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitDims(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitDims(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimsContext dims() throws RecognitionException {
      DimsContext _localctx = new DimsContext(_ctx, getState());
      enterRule(_localctx, 34, RULE_dims);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(568);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(565);
                     annotation();
                  }
               }
               setState(570);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(571);
            match(T__9);
            setState(572);
            match(T__10);
            setState(583);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(576);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__47) {
                           {
                              {
                                 setState(573);
                                 annotation();
                              }
                           }
                           setState(578);
                           _errHandler.sync(this);
                           _la = _input.LA(1);
                        }
                        setState(579);
                        match(T__9);
                        setState(580);
                        match(T__10);
                     }
                  }
               }
               setState(585);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
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
         return getToken(BSharpParser.Identifier, 0);
      }

      public List<TypeParameterModifierContext> typeParameterModifier() {
         return getRuleContexts(TypeParameterModifierContext.class);
      }

      public TypeParameterModifierContext typeParameterModifier(int i) {
         return getRuleContext(TypeParameterModifierContext.class, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeParameterContext typeParameter() throws RecognitionException {
      TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
      enterRule(_localctx, 36, RULE_typeParameter);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(589);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(586);
                     typeParameterModifier();
                  }
               }
               setState(591);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(592);
            match(Identifier);
            setState(594);
            _la = _input.LA(1);
            if (_la == T__11) {
               {
                  setState(593);
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

   public static class TypeParameterModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeParameterModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeParameterModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeParameterModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeParameterModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
      TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
      enterRule(_localctx, 38, RULE_typeParameterModifier);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(596);
            annotation();
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeBound(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeBound(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeBound(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeBoundContext typeBound() throws RecognitionException {
      TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
      enterRule(_localctx, 40, RULE_typeBound);
      int _la;
      try {
         setState(608);
         switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(598);
               match(T__11);
               setState(599);
               typeVariable();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(600);
               match(T__11);
               setState(601);
               classOrInterfaceType();
               setState(605);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__12) {
                  {
                     {
                        setState(602);
                        additionalBound();
                     }
                  }
                  setState(607);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAdditionalBound(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAdditionalBound(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAdditionalBound(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AdditionalBoundContext additionalBound() throws RecognitionException {
      AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
      enterRule(_localctx, 42, RULE_additionalBound);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(610);
            match(T__12);
            setState(611);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeArguments(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeArguments(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeArguments(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentsContext typeArguments() throws RecognitionException {
      TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
      enterRule(_localctx, 44, RULE_typeArguments);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(613);
            match(T__13);
            setState(614);
            typeArgumentList();
            setState(615);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeArgumentList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeArgumentList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeArgumentList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
      TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
      enterRule(_localctx, 46, RULE_typeArgumentList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(617);
            typeArgument();
            setState(622);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(618);
                     match(T__15);
                     setState(619);
                     typeArgument();
                  }
               }
               setState(624);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeArgument(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeArgument(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeArgument(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentContext typeArgument() throws RecognitionException {
      TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
      enterRule(_localctx, 48, RULE_typeArgument);
      try {
         setState(627);
         switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(625);
               referenceType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(626);
               wildcard();
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

   public static class WildcardContext extends ParserRuleContext {
      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterWildcard(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitWildcard(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitWildcard(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WildcardContext wildcard() throws RecognitionException {
      WildcardContext _localctx = new WildcardContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_wildcard);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(632);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(629);
                     annotation();
                  }
               }
               setState(634);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(635);
            match(T__16);
            setState(637);
            _la = _input.LA(1);
            if (_la == T__11 || _la == T__17) {
               {
                  setState(636);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterWildcardBounds(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitWildcardBounds(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitWildcardBounds(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
      WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
      enterRule(_localctx, 52, RULE_wildcardBounds);
      try {
         setState(643);
         switch (_input.LA(1)) {
            case T__11 :
               enterOuterAlt(_localctx, 1); {
               setState(639);
               match(T__11);
               setState(640);
               referenceType();
            }
               break;
            case T__17 :
               enterOuterAlt(_localctx, 2); {
               setState(641);
               match(T__17);
               setState(642);
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

   public static class CompilationUnitContext extends ParserRuleContext {
      public PackageDeclarationContext packageDeclaration() {
         return getRuleContext(PackageDeclarationContext.class, 0);
      }

      public List<ImportDeclarationContext> importDeclaration() {
         return getRuleContexts(ImportDeclarationContext.class);
      }

      public ImportDeclarationContext importDeclaration(int i) {
         return getRuleContext(ImportDeclarationContext.class, i);
      }

      public List<TypeDeclarationContext> typeDeclaration() {
         return getRuleContexts(TypeDeclarationContext.class);
      }

      public TypeDeclarationContext typeDeclaration(int i) {
         return getRuleContext(TypeDeclarationContext.class, i);
      }

      public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_compilationUnit;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCompilationUnit(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCompilationUnit(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCompilationUnit(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CompilationUnitContext compilationUnit() throws RecognitionException {
      CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
      enterRule(_localctx, 54, RULE_compilationUnit);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(646);
            switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
               case 1 : {
                  setState(645);
                  packageDeclaration();
               }
                  break;
            }
            setState(651);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__20) {
               {
                  {
                     setState(648);
                     importDeclaration();
                  }
               }
               setState(653);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(657);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__22) | (1L << T__23)
               | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29)
               | (1L << T__44) | (1L << T__45) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(654);
                     typeDeclaration();
                  }
               }
               setState(659);
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

   public static class PackageDeclarationContext extends ParserRuleContext {
      public List<TerminalNode> Identifier() {
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
      }

      public List<PackageModifierContext> packageModifier() {
         return getRuleContexts(PackageModifierContext.class);
      }

      public PackageModifierContext packageModifier(int i) {
         return getRuleContext(PackageModifierContext.class, i);
      }

      public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_packageDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPackageDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPackageDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPackageDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
      PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
      enterRule(_localctx, 56, RULE_packageDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(663);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(660);
                     packageModifier();
                  }
               }
               setState(665);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(666);
            match(T__18);
            setState(667);
            match(Identifier);
            setState(672);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
               {
                  {
                     setState(668);
                     match(T__0);
                     setState(669);
                     match(Identifier);
                  }
               }
               setState(674);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(675);
            match(T__19);
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

   public static class PackageModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public PackageModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_packageModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPackageModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPackageModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPackageModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PackageModifierContext packageModifier() throws RecognitionException {
      PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
      enterRule(_localctx, 58, RULE_packageModifier);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(677);
            annotation();
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

   public static class ImportDeclarationContext extends ParserRuleContext {
      public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
         return getRuleContext(SingleTypeImportDeclarationContext.class, 0);
      }

      public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
         return getRuleContext(TypeImportOnDemandDeclarationContext.class, 0);
      }

      public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
         return getRuleContext(SingleStaticImportDeclarationContext.class, 0);
      }

      public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
         return getRuleContext(StaticImportOnDemandDeclarationContext.class, 0);
      }

      public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_importDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterImportDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitImportDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitImportDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ImportDeclarationContext importDeclaration() throws RecognitionException {
      ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
      enterRule(_localctx, 60, RULE_importDeclaration);
      try {
         setState(683);
         switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(679);
               singleTypeImportDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(680);
               typeImportOnDemandDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(681);
               singleStaticImportDeclaration();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(682);
               staticImportOnDemandDeclaration();
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

   public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_singleTypeImportDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSingleTypeImportDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSingleTypeImportDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSingleTypeImportDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
      SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
      enterRule(_localctx, 62, RULE_singleTypeImportDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(685);
            match(T__20);
            setState(686);
            typeName();
            setState(687);
            match(T__19);
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

   public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
      public PackageOrTypeNameContext packageOrTypeName() {
         return getRuleContext(PackageOrTypeNameContext.class, 0);
      }

      public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeImportOnDemandDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeImportOnDemandDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeImportOnDemandDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeImportOnDemandDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
      TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
      enterRule(_localctx, 64, RULE_typeImportOnDemandDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(689);
            match(T__20);
            setState(690);
            packageOrTypeName();
            setState(691);
            match(T__0);
            setState(692);
            match(T__21);
            setState(693);
            match(T__19);
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

   public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_singleStaticImportDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSingleStaticImportDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSingleStaticImportDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSingleStaticImportDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
      SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
      enterRule(_localctx, 66, RULE_singleStaticImportDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(695);
            match(T__20);
            setState(696);
            match(T__22);
            setState(697);
            typeName();
            setState(698);
            match(T__0);
            setState(699);
            match(Identifier);
            setState(700);
            match(T__19);
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

   public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_staticImportOnDemandDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStaticImportOnDemandDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStaticImportOnDemandDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStaticImportOnDemandDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
      StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_staticImportOnDemandDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(702);
            match(T__20);
            setState(703);
            match(T__22);
            setState(704);
            typeName();
            setState(705);
            match(T__0);
            setState(706);
            match(T__21);
            setState(707);
            match(T__19);
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

   public static class TypeDeclarationContext extends ParserRuleContext {
      public ClassDeclarationContext classDeclaration() {
         return getRuleContext(ClassDeclarationContext.class, 0);
      }

      public InterfaceDeclarationContext interfaceDeclaration() {
         return getRuleContext(InterfaceDeclarationContext.class, 0);
      }

      public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
      TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
      enterRule(_localctx, 70, RULE_typeDeclaration);
      try {
         setState(712);
         switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(709);
               classDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(710);
               interfaceDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(711);
               match(T__19);
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

   public static class ClassDeclarationContext extends ParserRuleContext {
      public NormalClassDeclarationContext normalClassDeclaration() {
         return getRuleContext(NormalClassDeclarationContext.class, 0);
      }

      public EnumDeclarationContext enumDeclaration() {
         return getRuleContext(EnumDeclarationContext.class, 0);
      }

      public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassDeclarationContext classDeclaration() throws RecognitionException {
      ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
      enterRule(_localctx, 72, RULE_classDeclaration);
      try {
         setState(716);
         switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(714);
               normalClassDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(715);
               enumDeclaration();
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

   public static class NormalClassDeclarationContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public ClassBodyContext classBody() {
         return getRuleContext(ClassBodyContext.class, 0);
      }

      public List<ClassModifierContext> classModifier() {
         return getRuleContexts(ClassModifierContext.class);
      }

      public ClassModifierContext classModifier(int i) {
         return getRuleContext(ClassModifierContext.class, i);
      }

      public TypeParametersContext typeParameters() {
         return getRuleContext(TypeParametersContext.class, 0);
      }

      public SuperclassContext superclass() {
         return getRuleContext(SuperclassContext.class, 0);
      }

      public SuperinterfacesContext superinterfaces() {
         return getRuleContext(SuperinterfacesContext.class, 0);
      }

      public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_normalClassDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterNormalClassDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitNormalClassDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitNormalClassDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
      NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
      enterRule(_localctx, 74, RULE_normalClassDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(721);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25)
               | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(718);
                     classModifier();
                  }
               }
               setState(723);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(724);
            match(T__23);
            setState(725);
            match(Identifier);
            setState(727);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(726);
                  typeParameters();
               }
            }

            setState(730);
            _la = _input.LA(1);
            if (_la == T__11) {
               {
                  setState(729);
                  superclass();
               }
            }

            setState(733);
            _la = _input.LA(1);
            if (_la == T__30) {
               {
                  setState(732);
                  superinterfaces();
               }
            }

            setState(735);
            classBody();
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

   public static class ClassModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public ClassModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassModifierContext classModifier() throws RecognitionException {
      ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
      enterRule(_localctx, 76, RULE_classModifier);
      int _la;
      try {
         setState(744);
         switch (_input.LA(1)) {
            case T__24 :
            case T__25 :
            case T__26 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(741);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(737);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(738);
                     match(T__24);
                  }
                     break;
                  case T__25 : {
                     setState(739);
                     match(T__25);
                  }
                     break;
                  case T__26 : {
                     setState(740);
                     match(T__26);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__27 :
            case T__28 :
            case T__29 :
               enterOuterAlt(_localctx, 2); {
               setState(743);
               _la = _input.LA(1);
               if (!((((_la) & ~0x3f) == 0
                  && ((1L << _la) & ((1L << T__22) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0))) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class TypeParametersContext extends ParserRuleContext {
      public TypeParameterListContext typeParameterList() {
         return getRuleContext(TypeParameterListContext.class, 0);
      }

      public TypeParametersContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeParameters;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeParameters(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeParameters(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeParameters(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeParametersContext typeParameters() throws RecognitionException {
      TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
      enterRule(_localctx, 78, RULE_typeParameters);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(746);
            match(T__13);
            setState(747);
            typeParameterList();
            setState(748);
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

   public static class TypeParameterListContext extends ParserRuleContext {
      public List<TypeParameterContext> typeParameter() {
         return getRuleContexts(TypeParameterContext.class);
      }

      public TypeParameterContext typeParameter(int i) {
         return getRuleContext(TypeParameterContext.class, i);
      }

      public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeParameterList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeParameterList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeParameterList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeParameterList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeParameterListContext typeParameterList() throws RecognitionException {
      TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
      enterRule(_localctx, 80, RULE_typeParameterList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(750);
            typeParameter();
            setState(755);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(751);
                     match(T__15);
                     setState(752);
                     typeParameter();
                  }
               }
               setState(757);
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

   public static class SuperclassContext extends ParserRuleContext {
      public ClassTypeContext classType() {
         return getRuleContext(ClassTypeContext.class, 0);
      }

      public SuperclassContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_superclass;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSuperclass(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSuperclass(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSuperclass(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SuperclassContext superclass() throws RecognitionException {
      SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
      enterRule(_localctx, 82, RULE_superclass);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(758);
            match(T__11);
            setState(759);
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

   public static class SuperinterfacesContext extends ParserRuleContext {
      public InterfaceTypeListContext interfaceTypeList() {
         return getRuleContext(InterfaceTypeListContext.class, 0);
      }

      public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_superinterfaces;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSuperinterfaces(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSuperinterfaces(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSuperinterfaces(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SuperinterfacesContext superinterfaces() throws RecognitionException {
      SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
      enterRule(_localctx, 84, RULE_superinterfaces);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(761);
            match(T__30);
            setState(762);
            interfaceTypeList();
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

   public static class InterfaceTypeListContext extends ParserRuleContext {
      public List<InterfaceTypeContext> interfaceType() {
         return getRuleContexts(InterfaceTypeContext.class);
      }

      public InterfaceTypeContext interfaceType(int i) {
         return getRuleContext(InterfaceTypeContext.class, i);
      }

      public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceTypeList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceTypeList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceTypeList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceTypeList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
      InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
      enterRule(_localctx, 86, RULE_interfaceTypeList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(764);
            interfaceType();
            setState(769);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(765);
                     match(T__15);
                     setState(766);
                     interfaceType();
                  }
               }
               setState(771);
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

   public static class ClassBodyContext extends ParserRuleContext {
      public List<ClassBodyDeclarationContext> classBodyDeclaration() {
         return getRuleContexts(ClassBodyDeclarationContext.class);
      }

      public ClassBodyDeclarationContext classBodyDeclaration(int i) {
         return getRuleContext(ClassBodyDeclarationContext.class, i);
      }

      public ClassBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassBodyContext classBody() throws RecognitionException {
      ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
      enterRule(_localctx, 88, RULE_classBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(772);
            match(T__31);
            setState(776);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__19)
               | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
               | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__36)
               | (1L << T__37) | (1L << T__38) | (1L << T__44) | (1L << T__45) | (1L << T__47))) != 0)
               || _la == Identifier) {
               {
                  {
                     setState(773);
                     classBodyDeclaration();
                  }
               }
               setState(778);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(779);
            match(T__32);
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

   public static class ClassBodyDeclarationContext extends ParserRuleContext {
      public ClassMemberDeclarationContext classMemberDeclaration() {
         return getRuleContext(ClassMemberDeclarationContext.class, 0);
      }

      public InstanceInitializerContext instanceInitializer() {
         return getRuleContext(InstanceInitializerContext.class, 0);
      }

      public StaticInitializerContext staticInitializer() {
         return getRuleContext(StaticInitializerContext.class, 0);
      }

      public ConstructorDeclarationContext constructorDeclaration() {
         return getRuleContext(ConstructorDeclarationContext.class, 0);
      }

      public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classBodyDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassBodyDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassBodyDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassBodyDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
      ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
      enterRule(_localctx, 90, RULE_classBodyDeclaration);
      try {
         setState(785);
         switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(781);
               classMemberDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(782);
               instanceInitializer();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(783);
               staticInitializer();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(784);
               constructorDeclaration();
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

   public static class ClassMemberDeclarationContext extends ParserRuleContext {
      public FieldDeclarationContext fieldDeclaration() {
         return getRuleContext(FieldDeclarationContext.class, 0);
      }

      public MethodDeclarationContext methodDeclaration() {
         return getRuleContext(MethodDeclarationContext.class, 0);
      }

      public ClassDeclarationContext classDeclaration() {
         return getRuleContext(ClassDeclarationContext.class, 0);
      }

      public InterfaceDeclarationContext interfaceDeclaration() {
         return getRuleContext(InterfaceDeclarationContext.class, 0);
      }

      public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classMemberDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassMemberDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassMemberDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassMemberDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
      ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
      enterRule(_localctx, 92, RULE_classMemberDeclaration);
      try {
         setState(792);
         switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(787);
               fieldDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(788);
               methodDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(789);
               classDeclaration();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(790);
               interfaceDeclaration();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(791);
               match(T__19);
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

   public static class FieldDeclarationContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorListContext variableDeclaratorList() {
         return getRuleContext(VariableDeclaratorListContext.class, 0);
      }

      public List<FieldModifierContext> fieldModifier() {
         return getRuleContexts(FieldModifierContext.class);
      }

      public FieldModifierContext fieldModifier(int i) {
         return getRuleContext(FieldModifierContext.class, i);
      }

      public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFieldDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFieldDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFieldDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
      FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
      enterRule(_localctx, 94, RULE_fieldDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(797);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25)
               | (1L << T__26) | (1L << T__28) | (1L << T__33) | (1L << T__34) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(794);
                     fieldModifier();
                  }
               }
               setState(799);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(800);
            unannType();
            setState(801);
            variableDeclaratorList();
            setState(802);
            match(T__19);
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

   public static class FieldModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public FieldModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFieldModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFieldModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFieldModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldModifierContext fieldModifier() throws RecognitionException {
      FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
      enterRule(_localctx, 96, RULE_fieldModifier);
      int _la;
      try {
         setState(811);
         switch (_input.LA(1)) {
            case T__24 :
            case T__25 :
            case T__26 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(808);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(804);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(805);
                     match(T__24);
                  }
                     break;
                  case T__25 : {
                     setState(806);
                     match(T__25);
                  }
                     break;
                  case T__26 : {
                     setState(807);
                     match(T__26);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__28 :
            case T__33 :
            case T__34 :
               enterOuterAlt(_localctx, 2); {
               setState(810);
               _la = _input.LA(1);
               if (!((((_la) & ~0x3f) == 0
                  && ((1L << _la) & ((1L << T__22) | (1L << T__28) | (1L << T__33) | (1L << T__34))) != 0))) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class VariableDeclaratorListContext extends ParserRuleContext {
      public List<VariableDeclaratorContext> variableDeclarator() {
         return getRuleContexts(VariableDeclaratorContext.class);
      }

      public VariableDeclaratorContext variableDeclarator(int i) {
         return getRuleContext(VariableDeclaratorContext.class, i);
      }

      public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableDeclaratorList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableDeclaratorList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableDeclaratorList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableDeclaratorList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
      VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
      enterRule(_localctx, 98, RULE_variableDeclaratorList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(813);
            variableDeclarator();
            setState(818);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(814);
                     match(T__15);
                     setState(815);
                     variableDeclarator();
                  }
               }
               setState(820);
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

   public static class VariableDeclaratorContext extends ParserRuleContext {
      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public VariableInitializerContext variableInitializer() {
         return getRuleContext(VariableInitializerContext.class, 0);
      }

      public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableDeclarator;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableDeclarator(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableDeclarator(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableDeclarator(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
      VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
      enterRule(_localctx, 100, RULE_variableDeclarator);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(821);
            variableDeclaratorId();
            setState(824);
            _la = _input.LA(1);
            if (_la == T__35) {
               {
                  setState(822);
                  match(T__35);
                  setState(823);
                  variableInitializer();
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

   public static class VariableDeclaratorIdContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableDeclaratorId;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableDeclaratorId(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableDeclaratorId(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableDeclaratorId(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
      VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
      enterRule(_localctx, 102, RULE_variableDeclaratorId);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(826);
            match(Identifier);
            setState(828);
            _la = _input.LA(1);
            if (_la == T__9 || _la == T__47) {
               {
                  setState(827);
                  dims();
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

   public static class VariableInitializerContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ArrayInitializerContext arrayInitializer() {
         return getRuleContext(ArrayInitializerContext.class, 0);
      }

      public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableInitializer;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableInitializer(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableInitializer(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableInitializer(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableInitializerContext variableInitializer() throws RecognitionException {
      VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
      enterRule(_localctx, 104, RULE_variableInitializer);
      try {
         setState(832);
         switch (_input.LA(1)) {
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case T__17 :
            case T__38 :
            case T__39 :
            case T__42 :
            case T__47 :
            case T__49 :
            case T__50 :
            case T__67 :
            case T__92 :
            case T__93 :
            case T__96 :
            case T__97 :
            case T__98 :
            case IntegerLiteral :
            case FloatingPointLiteral :
            case BooleanLiteral :
            case CharacterLiteral :
            case StringLiteral :
            case NullLiteral :
            case Identifier :
               enterOuterAlt(_localctx, 1); {
               setState(830);
               expression();
            }
               break;
            case T__31 :
               enterOuterAlt(_localctx, 2); {
               setState(831);
               arrayInitializer();
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

   public static class UnannTypeContext extends ParserRuleContext {
      public UnannPrimitiveTypeContext unannPrimitiveType() {
         return getRuleContext(UnannPrimitiveTypeContext.class, 0);
      }

      public UnannReferenceTypeContext unannReferenceType() {
         return getRuleContext(UnannReferenceTypeContext.class, 0);
      }

      public UnannTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannTypeContext unannType() throws RecognitionException {
      UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
      enterRule(_localctx, 106, RULE_unannType);
      try {
         setState(836);
         switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(834);
               unannPrimitiveType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(835);
               unannReferenceType();
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

   public static class UnannPrimitiveTypeContext extends ParserRuleContext {
      public NumericTypeContext numericType() {
         return getRuleContext(NumericTypeContext.class, 0);
      }

      public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannPrimitiveType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannPrimitiveType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannPrimitiveType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannPrimitiveType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
      UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
      enterRule(_localctx, 108, RULE_unannPrimitiveType);
      try {
         setState(840);
         switch (_input.LA(1)) {
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
               enterOuterAlt(_localctx, 1); {
               setState(838);
               numericType();
            }
               break;
            case T__1 :
               enterOuterAlt(_localctx, 2); {
               setState(839);
               match(T__1);
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

   public static class UnannReferenceTypeContext extends ParserRuleContext {
      public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
         return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
      }

      public UnannTypeVariableContext unannTypeVariable() {
         return getRuleContext(UnannTypeVariableContext.class, 0);
      }

      public UnannArrayTypeContext unannArrayType() {
         return getRuleContext(UnannArrayTypeContext.class, 0);
      }

      public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannReferenceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannReferenceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannReferenceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannReferenceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
      UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
      enterRule(_localctx, 110, RULE_unannReferenceType);
      try {
         setState(845);
         switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(842);
               unannClassOrInterfaceType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(843);
               unannTypeVariable();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(844);
               unannArrayType();
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

   public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
      public UnannClassTypeContext unannClassType() {
         return getRuleContext(UnannClassTypeContext.class, 0);
      }

      public UnannInterfaceTypeContext unannInterfaceType() {
         return getRuleContext(UnannInterfaceTypeContext.class, 0);
      }

      public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannClassOrInterfaceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannClassOrInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannClassOrInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannClassOrInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
      UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
      enterRule(_localctx, 112, RULE_unannClassOrInterfaceType);
      try {
         setState(849);
         switch (getInterpreter().adaptivePredict(_input, 60, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(847);
               unannClassType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(848);
               unannInterfaceType();
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

   public static class UnannClassTypeContext extends ParserRuleContext {
      public List<TerminalNode> Identifier() {
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
      }

      public List<TypeArgumentsContext> typeArguments() {
         return getRuleContexts(TypeArgumentsContext.class);
      }

      public TypeArgumentsContext typeArguments(int i) {
         return getRuleContext(TypeArgumentsContext.class, i);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannClassType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannClassType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannClassType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannClassType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannClassTypeContext unannClassType() throws RecognitionException {
      UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
      enterRule(_localctx, 114, RULE_unannClassType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(851);
            match(Identifier);
            setState(853);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(852);
                  typeArguments();
               }
            }

            setState(868);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
               {
                  {
                     setState(855);
                     match(T__0);
                     setState(859);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                     while (_la == T__47) {
                        {
                           {
                              setState(856);
                              annotation();
                           }
                        }
                        setState(861);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                     }
                     setState(862);
                     match(Identifier);
                     setState(864);
                     _la = _input.LA(1);
                     if (_la == T__13) {
                        {
                           setState(863);
                           typeArguments();
                        }
                     }

                  }
               }
               setState(870);
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

   public static class UnannInterfaceTypeContext extends ParserRuleContext {
      public UnannClassTypeContext unannClassType() {
         return getRuleContext(UnannClassTypeContext.class, 0);
      }

      public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannInterfaceType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannInterfaceType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannInterfaceType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannInterfaceType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
      UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
      enterRule(_localctx, 116, RULE_unannInterfaceType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(871);
            unannClassType();
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

   public static class UnannTypeVariableContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannTypeVariable;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannTypeVariable(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannTypeVariable(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannTypeVariable(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
      UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
      enterRule(_localctx, 118, RULE_unannTypeVariable);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(873);
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

   public static class UnannArrayTypeContext extends ParserRuleContext {
      public UnannPrimitiveTypeContext unannPrimitiveType() {
         return getRuleContext(UnannPrimitiveTypeContext.class, 0);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
         return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
      }

      public UnannTypeVariableContext unannTypeVariable() {
         return getRuleContext(UnannTypeVariableContext.class, 0);
      }

      public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unannArrayType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnannArrayType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnannArrayType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnannArrayType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
      UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
      enterRule(_localctx, 120, RULE_unannArrayType);
      try {
         setState(884);
         switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(875);
               unannPrimitiveType();
               setState(876);
               dims();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(878);
               unannClassOrInterfaceType();
               setState(879);
               dims();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(881);
               unannTypeVariable();
               setState(882);
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

   public static class MethodDeclarationContext extends ParserRuleContext {
      public MethodHeaderContext methodHeader() {
         return getRuleContext(MethodHeaderContext.class, 0);
      }

      public MethodBodyContext methodBody() {
         return getRuleContext(MethodBodyContext.class, 0);
      }

      public List<MethodModifierContext> methodModifier() {
         return getRuleContexts(MethodModifierContext.class);
      }

      public MethodModifierContext methodModifier(int i) {
         return getRuleContext(MethodModifierContext.class, i);
      }

      public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
      MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
      enterRule(_localctx, 122, RULE_methodDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(889);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
                  | (1L << T__28) | (1L << T__29) | (1L << T__36) | (1L << T__37) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(886);
                     methodModifier();
                  }
               }
               setState(891);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(892);
            methodHeader();
            setState(893);
            methodBody();
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

   public static class MethodModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public MethodModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodModifierContext methodModifier() throws RecognitionException {
      MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
      enterRule(_localctx, 124, RULE_methodModifier);
      int _la;
      try {
         setState(902);
         switch (_input.LA(1)) {
            case T__24 :
            case T__25 :
            case T__26 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(899);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(895);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(896);
                     match(T__24);
                  }
                     break;
                  case T__25 : {
                     setState(897);
                     match(T__25);
                  }
                     break;
                  case T__26 : {
                     setState(898);
                     match(T__26);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__27 :
            case T__28 :
            case T__29 :
            case T__36 :
            case T__37 :
               enterOuterAlt(_localctx, 2); {
               setState(901);
               _la = _input.LA(1);
               if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__27) | (1L << T__28)
                  | (1L << T__29) | (1L << T__36) | (1L << T__37))) != 0))) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class MethodHeaderContext extends ParserRuleContext {
      public ResultContext result() {
         return getRuleContext(ResultContext.class, 0);
      }

      public MethodDeclaratorContext methodDeclarator() {
         return getRuleContext(MethodDeclaratorContext.class, 0);
      }

      public Throws_Context throws_() {
         return getRuleContext(Throws_Context.class, 0);
      }

      public TypeParametersContext typeParameters() {
         return getRuleContext(TypeParametersContext.class, 0);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodHeader;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodHeader(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodHeader(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodHeader(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodHeaderContext methodHeader() throws RecognitionException {
      MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
      enterRule(_localctx, 126, RULE_methodHeader);
      int _la;
      try {
         setState(921);
         switch (_input.LA(1)) {
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case T__38 :
            case Identifier :
               enterOuterAlt(_localctx, 1); {
               setState(904);
               result();
               setState(905);
               methodDeclarator();
               setState(907);
               _la = _input.LA(1);
               if (_la == T__43) {
                  {
                     setState(906);
                     throws_();
                  }
               }

            }
               break;
            case T__13 :
               enterOuterAlt(_localctx, 2); {
               setState(909);
               typeParameters();
               setState(913);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__47) {
                  {
                     {
                        setState(910);
                        annotation();
                     }
                  }
                  setState(915);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(916);
               result();
               setState(917);
               methodDeclarator();
               setState(919);
               _la = _input.LA(1);
               if (_la == T__43) {
                  {
                     setState(918);
                     throws_();
                  }
               }

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

   public static class ResultContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public ResultContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_result;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterResult(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitResult(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitResult(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ResultContext result() throws RecognitionException {
      ResultContext _localctx = new ResultContext(_ctx, getState());
      enterRule(_localctx, 128, RULE_result);
      try {
         setState(925);
         switch (_input.LA(1)) {
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case Identifier :
               enterOuterAlt(_localctx, 1); {
               setState(923);
               unannType();
            }
               break;
            case T__38 :
               enterOuterAlt(_localctx, 2); {
               setState(924);
               match(T__38);
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

   public static class MethodDeclaratorContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public FormalParameterListContext formalParameterList() {
         return getRuleContext(FormalParameterListContext.class, 0);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodDeclarator;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodDeclarator(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodDeclarator(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodDeclarator(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
      MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
      enterRule(_localctx, 130, RULE_methodDeclarator);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(927);
            match(Identifier);
            setState(928);
            match(T__39);
            setState(930);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__28) | (1L << T__47))) != 0)
               || _la == Identifier) {
               {
                  setState(929);
                  formalParameterList();
               }
            }

            setState(932);
            match(T__40);
            setState(934);
            _la = _input.LA(1);
            if (_la == T__9 || _la == T__47) {
               {
                  setState(933);
                  dims();
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

   public static class FormalParameterListContext extends ParserRuleContext {
      public FormalParametersContext formalParameters() {
         return getRuleContext(FormalParametersContext.class, 0);
      }

      public LastFormalParameterContext lastFormalParameter() {
         return getRuleContext(LastFormalParameterContext.class, 0);
      }

      public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_formalParameterList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFormalParameterList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFormalParameterList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFormalParameterList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FormalParameterListContext formalParameterList() throws RecognitionException {
      FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
      enterRule(_localctx, 132, RULE_formalParameterList);
      try {
         setState(941);
         switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(936);
               formalParameters();
               setState(937);
               match(T__15);
               setState(938);
               lastFormalParameter();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(940);
               lastFormalParameter();
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

   public static class FormalParametersContext extends ParserRuleContext {
      public List<FormalParameterContext> formalParameter() {
         return getRuleContexts(FormalParameterContext.class);
      }

      public FormalParameterContext formalParameter(int i) {
         return getRuleContext(FormalParameterContext.class, i);
      }

      public ReceiverParameterContext receiverParameter() {
         return getRuleContext(ReceiverParameterContext.class, 0);
      }

      public FormalParametersContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_formalParameters;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFormalParameters(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFormalParameters(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFormalParameters(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FormalParametersContext formalParameters() throws RecognitionException {
      FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
      enterRule(_localctx, 134, RULE_formalParameters);
      try {
         int _alt;
         setState(959);
         switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(943);
               formalParameter();
               setState(948);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 77, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(944);
                           match(T__15);
                           setState(945);
                           formalParameter();
                        }
                     }
                  }
                  setState(950);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 77, _ctx);
               }
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(951);
               receiverParameter();
               setState(956);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 78, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(952);
                           match(T__15);
                           setState(953);
                           formalParameter();
                        }
                     }
                  }
                  setState(958);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 78, _ctx);
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

   public static class FormalParameterContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public FormalParameterContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_formalParameter;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFormalParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFormalParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFormalParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FormalParameterContext formalParameter() throws RecognitionException {
      FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
      enterRule(_localctx, 136, RULE_formalParameter);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(964);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(961);
                     variableModifier();
                  }
               }
               setState(966);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(967);
            unannType();
            setState(968);
            variableDeclaratorId();
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

   public static class VariableModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public VariableModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableModifierContext variableModifier() throws RecognitionException {
      VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
      enterRule(_localctx, 138, RULE_variableModifier);
      try {
         setState(972);
         switch (_input.LA(1)) {
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(970);
               annotation();
            }
               break;
            case T__28 :
               enterOuterAlt(_localctx, 2); {
               setState(971);
               match(T__28);
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

   public static class LastFormalParameterContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public FormalParameterContext formalParameter() {
         return getRuleContext(FormalParameterContext.class, 0);
      }

      public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lastFormalParameter;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLastFormalParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLastFormalParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLastFormalParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
      LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
      enterRule(_localctx, 140, RULE_lastFormalParameter);
      int _la;
      try {
         setState(991);
         switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(977);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__28 || _la == T__47) {
                  {
                     {
                        setState(974);
                        variableModifier();
                     }
                  }
                  setState(979);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(980);
               unannType();
               setState(984);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__47) {
                  {
                     {
                        setState(981);
                        annotation();
                     }
                  }
                  setState(986);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(987);
               match(T__41);
               setState(988);
               variableDeclaratorId();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(990);
               formalParameter();
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

   public static class ReceiverParameterContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_receiverParameter;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterReceiverParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitReceiverParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitReceiverParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ReceiverParameterContext receiverParameter() throws RecognitionException {
      ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
      enterRule(_localctx, 142, RULE_receiverParameter);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(996);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(993);
                     annotation();
                  }
               }
               setState(998);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(999);
            unannType();
            setState(1002);
            _la = _input.LA(1);
            if (_la == Identifier) {
               {
                  setState(1000);
                  match(Identifier);
                  setState(1001);
                  match(T__0);
               }
            }

            setState(1004);
            match(T__42);
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

   public static class Throws_Context extends ParserRuleContext {
      public ExceptionTypeListContext exceptionTypeList() {
         return getRuleContext(ExceptionTypeListContext.class, 0);
      }

      public Throws_Context(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_throws_;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterThrows_(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitThrows_(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitThrows_(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final Throws_Context throws_() throws RecognitionException {
      Throws_Context _localctx = new Throws_Context(_ctx, getState());
      enterRule(_localctx, 144, RULE_throws_);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1006);
            match(T__43);
            setState(1007);
            exceptionTypeList();
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

   public static class ExceptionTypeListContext extends ParserRuleContext {
      public List<ExceptionTypeContext> exceptionType() {
         return getRuleContexts(ExceptionTypeContext.class);
      }

      public ExceptionTypeContext exceptionType(int i) {
         return getRuleContext(ExceptionTypeContext.class, i);
      }

      public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exceptionTypeList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExceptionTypeList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExceptionTypeList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExceptionTypeList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
      ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
      enterRule(_localctx, 146, RULE_exceptionTypeList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1009);
            exceptionType();
            setState(1014);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(1010);
                     match(T__15);
                     setState(1011);
                     exceptionType();
                  }
               }
               setState(1016);
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

   public static class ExceptionTypeContext extends ParserRuleContext {
      public ClassTypeContext classType() {
         return getRuleContext(ClassTypeContext.class, 0);
      }

      public TypeVariableContext typeVariable() {
         return getRuleContext(TypeVariableContext.class, 0);
      }

      public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exceptionType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExceptionType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExceptionType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExceptionType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExceptionTypeContext exceptionType() throws RecognitionException {
      ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
      enterRule(_localctx, 148, RULE_exceptionType);
      try {
         setState(1019);
         switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1017);
               classType();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1018);
               typeVariable();
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

   public static class MethodBodyContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public MethodBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodBodyContext methodBody() throws RecognitionException {
      MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
      enterRule(_localctx, 150, RULE_methodBody);
      try {
         setState(1023);
         switch (_input.LA(1)) {
            case T__31 :
               enterOuterAlt(_localctx, 1); {
               setState(1021);
               block();
            }
               break;
            case T__19 :
               enterOuterAlt(_localctx, 2); {
               setState(1022);
               match(T__19);
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

   public static class InstanceInitializerContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_instanceInitializer;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInstanceInitializer(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInstanceInitializer(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInstanceInitializer(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
      InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
      enterRule(_localctx, 152, RULE_instanceInitializer);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1025);
            block();
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

   public static class StaticInitializerContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_staticInitializer;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStaticInitializer(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStaticInitializer(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStaticInitializer(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StaticInitializerContext staticInitializer() throws RecognitionException {
      StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
      enterRule(_localctx, 154, RULE_staticInitializer);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1027);
            match(T__22);
            setState(1028);
            block();
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

   public static class ConstructorDeclarationContext extends ParserRuleContext {
      public ConstructorDeclaratorContext constructorDeclarator() {
         return getRuleContext(ConstructorDeclaratorContext.class, 0);
      }

      public ConstructorBodyContext constructorBody() {
         return getRuleContext(ConstructorBodyContext.class, 0);
      }

      public List<ConstructorModifierContext> constructorModifier() {
         return getRuleContexts(ConstructorModifierContext.class);
      }

      public ConstructorModifierContext constructorModifier(int i) {
         return getRuleContext(ConstructorModifierContext.class, i);
      }

      public Throws_Context throws_() {
         return getRuleContext(Throws_Context.class, 0);
      }

      public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
      ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
      enterRule(_localctx, 156, RULE_constructorDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1033);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(1030);
                     constructorModifier();
                  }
               }
               setState(1035);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1036);
            constructorDeclarator();
            setState(1038);
            _la = _input.LA(1);
            if (_la == T__43) {
               {
                  setState(1037);
                  throws_();
               }
            }

            setState(1040);
            constructorBody();
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

   public static class ConstructorModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorModifierContext constructorModifier() throws RecognitionException {
      ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
      enterRule(_localctx, 158, RULE_constructorModifier);
      try {
         setState(1046);
         switch (_input.LA(1)) {
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(1042);
               annotation();
            }
               break;
            case T__24 :
               enterOuterAlt(_localctx, 2); {
               setState(1043);
               match(T__24);
            }
               break;
            case T__25 :
               enterOuterAlt(_localctx, 3); {
               setState(1044);
               match(T__25);
            }
               break;
            case T__26 :
               enterOuterAlt(_localctx, 4); {
               setState(1045);
               match(T__26);
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

   public static class ConstructorDeclaratorContext extends ParserRuleContext {
      public SimpleTypeNameContext simpleTypeName() {
         return getRuleContext(SimpleTypeNameContext.class, 0);
      }

      public TypeParametersContext typeParameters() {
         return getRuleContext(TypeParametersContext.class, 0);
      }

      public FormalParameterListContext formalParameterList() {
         return getRuleContext(FormalParameterListContext.class, 0);
      }

      public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorDeclarator;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorDeclarator(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorDeclarator(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorDeclarator(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
      ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
      enterRule(_localctx, 160, RULE_constructorDeclarator);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1049);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1048);
                  typeParameters();
               }
            }

            setState(1051);
            simpleTypeName();
            setState(1052);
            match(T__39);
            setState(1054);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__28) | (1L << T__47))) != 0)
               || _la == Identifier) {
               {
                  setState(1053);
                  formalParameterList();
               }
            }

            setState(1056);
            match(T__40);
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

   public static class SimpleTypeNameContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_simpleTypeName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSimpleTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSimpleTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSimpleTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
      SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
      enterRule(_localctx, 162, RULE_simpleTypeName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1058);
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

   public static class ConstructorBodyContext extends ParserRuleContext {
      public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
         return getRuleContext(ExplicitConstructorInvocationContext.class, 0);
      }

      public BlockStatementsContext blockStatements() {
         return getRuleContext(BlockStatementsContext.class, 0);
      }

      public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorBodyContext constructorBody() throws RecognitionException {
      ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
      enterRule(_localctx, 164, RULE_constructorBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1060);
            match(T__31);
            setState(1062);
            switch (getInterpreter().adaptivePredict(_input, 95, _ctx)) {
               case 1 : {
                  setState(1061);
                  explicitConstructorInvocation();
               }
                  break;
            }
            setState(1065);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__19)
               | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
               | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__36) | (1L << T__38) | (1L << T__39)
               | (1L << T__42) | (1L << T__44) | (1L << T__47) | (1L << T__49) | (1L << T__50) | (1L << T__51)
               | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59)
               | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)
               || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__67 - 64))
                  | (1L << (T__98 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64))
                  | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64))
                  | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
               {
                  setState(1064);
                  blockStatements();
               }
            }

            setState(1067);
            match(T__32);
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

   public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
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

      public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_explicitConstructorInvocation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExplicitConstructorInvocation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExplicitConstructorInvocation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExplicitConstructorInvocation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
      ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
      enterRule(_localctx, 166, RULE_explicitConstructorInvocation);
      int _la;
      try {
         setState(1115);
         switch (getInterpreter().adaptivePredict(_input, 105, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1070);
               _la = _input.LA(1);
               if (_la == T__13) {
                  {
                     setState(1069);
                     typeArguments();
                  }
               }

               setState(1072);
               match(T__42);
               setState(1073);
               match(T__39);
               setState(1075);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                  | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
                  | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
                  || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                     | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                     | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                     | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                     | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
                  {
                     setState(1074);
                     argumentList();
                  }
               }

               setState(1077);
               match(T__40);
               setState(1078);
               match(T__19);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1080);
               _la = _input.LA(1);
               if (_la == T__13) {
                  {
                     setState(1079);
                     typeArguments();
                  }
               }

               setState(1082);
               match(T__17);
               setState(1083);
               match(T__39);
               setState(1085);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                  | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
                  | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
                  || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                     | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                     | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                     | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                     | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
                  {
                     setState(1084);
                     argumentList();
                  }
               }

               setState(1087);
               match(T__40);
               setState(1088);
               match(T__19);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1089);
               expressionName();
               setState(1090);
               match(T__0);
               setState(1092);
               _la = _input.LA(1);
               if (_la == T__13) {
                  {
                     setState(1091);
                     typeArguments();
                  }
               }

               setState(1094);
               match(T__17);
               setState(1095);
               match(T__39);
               setState(1097);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                  | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
                  | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
                  || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                     | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                     | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                     | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                     | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
                  {
                     setState(1096);
                     argumentList();
                  }
               }

               setState(1099);
               match(T__40);
               setState(1100);
               match(T__19);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1102);
               primary();
               setState(1103);
               match(T__0);
               setState(1105);
               _la = _input.LA(1);
               if (_la == T__13) {
                  {
                     setState(1104);
                     typeArguments();
                  }
               }

               setState(1107);
               match(T__17);
               setState(1108);
               match(T__39);
               setState(1110);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                  | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
                  | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
                  || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                     | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                     | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                     | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                     | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
                  {
                     setState(1109);
                     argumentList();
                  }
               }

               setState(1112);
               match(T__40);
               setState(1113);
               match(T__19);
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

   public static class EnumDeclarationContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public EnumBodyContext enumBody() {
         return getRuleContext(EnumBodyContext.class, 0);
      }

      public List<ClassModifierContext> classModifier() {
         return getRuleContexts(ClassModifierContext.class);
      }

      public ClassModifierContext classModifier(int i) {
         return getRuleContext(ClassModifierContext.class, i);
      }

      public SuperinterfacesContext superinterfaces() {
         return getRuleContext(SuperinterfacesContext.class, 0);
      }

      public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
      EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
      enterRule(_localctx, 168, RULE_enumDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1120);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25)
               | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(1117);
                     classModifier();
                  }
               }
               setState(1122);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1123);
            match(T__44);
            setState(1124);
            match(Identifier);
            setState(1126);
            _la = _input.LA(1);
            if (_la == T__30) {
               {
                  setState(1125);
                  superinterfaces();
               }
            }

            setState(1128);
            enumBody();
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

   public static class EnumBodyContext extends ParserRuleContext {
      public EnumConstantListContext enumConstantList() {
         return getRuleContext(EnumConstantListContext.class, 0);
      }

      public EnumBodyDeclarationsContext enumBodyDeclarations() {
         return getRuleContext(EnumBodyDeclarationsContext.class, 0);
      }

      public EnumBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumBodyContext enumBody() throws RecognitionException {
      EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
      enterRule(_localctx, 170, RULE_enumBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1130);
            match(T__31);
            setState(1132);
            _la = _input.LA(1);
            if (_la == T__47 || _la == Identifier) {
               {
                  setState(1131);
                  enumConstantList();
               }
            }

            setState(1135);
            _la = _input.LA(1);
            if (_la == T__15) {
               {
                  setState(1134);
                  match(T__15);
               }
            }

            setState(1138);
            _la = _input.LA(1);
            if (_la == T__19) {
               {
                  setState(1137);
                  enumBodyDeclarations();
               }
            }

            setState(1140);
            match(T__32);
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

   public static class EnumConstantListContext extends ParserRuleContext {
      public List<EnumConstantContext> enumConstant() {
         return getRuleContexts(EnumConstantContext.class);
      }

      public EnumConstantContext enumConstant(int i) {
         return getRuleContext(EnumConstantContext.class, i);
      }

      public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumConstantList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumConstantList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumConstantList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumConstantList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumConstantListContext enumConstantList() throws RecognitionException {
      EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
      enterRule(_localctx, 172, RULE_enumConstantList);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1142);
            enumConstant();
            setState(1145);
            switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
               case 1 : {
                  setState(1143);
                  match(T__15);
                  setState(1144);
                  enumConstant();
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

   public static class EnumConstantContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public List<EnumConstantModifierContext> enumConstantModifier() {
         return getRuleContexts(EnumConstantModifierContext.class);
      }

      public EnumConstantModifierContext enumConstantModifier(int i) {
         return getRuleContext(EnumConstantModifierContext.class, i);
      }

      public ClassBodyContext classBody() {
         return getRuleContext(ClassBodyContext.class, 0);
      }

      public ArgumentListContext argumentList() {
         return getRuleContext(ArgumentListContext.class, 0);
      }

      public EnumConstantContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumConstant;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumConstant(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumConstant(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumConstant(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumConstantContext enumConstant() throws RecognitionException {
      EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
      enterRule(_localctx, 174, RULE_enumConstant);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1150);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(1147);
                     enumConstantModifier();
                  }
               }
               setState(1152);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1153);
            match(Identifier);
            setState(1159);
            _la = _input.LA(1);
            if (_la == T__39) {
               {
                  setState(1154);
                  match(T__39);
                  setState(1156);
                  _la = _input.LA(1);
                  if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                     | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
                     | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
                     || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68))
                        | (1L << (T__92 - 68)) | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68))
                        | (1L << (T__98 - 68)) | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                        | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                        | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
                     {
                        setState(1155);
                        argumentList();
                     }
                  }

                  setState(1158);
                  match(T__40);
               }
            }

            setState(1162);
            _la = _input.LA(1);
            if (_la == T__31) {
               {
                  setState(1161);
                  classBody();
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

   public static class EnumConstantModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumConstantModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumConstantModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumConstantModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumConstantModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
      EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
      enterRule(_localctx, 176, RULE_enumConstantModifier);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1164);
            annotation();
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

   public static class EnumBodyDeclarationsContext extends ParserRuleContext {
      public List<ClassBodyDeclarationContext> classBodyDeclaration() {
         return getRuleContexts(ClassBodyDeclarationContext.class);
      }

      public ClassBodyDeclarationContext classBodyDeclaration(int i) {
         return getRuleContext(ClassBodyDeclarationContext.class, i);
      }

      public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumBodyDeclarations;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumBodyDeclarations(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumBodyDeclarations(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumBodyDeclarations(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
      EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
      enterRule(_localctx, 178, RULE_enumBodyDeclarations);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1166);
            match(T__19);
            setState(1170);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__19)
               | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
               | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__36)
               | (1L << T__37) | (1L << T__38) | (1L << T__44) | (1L << T__45) | (1L << T__47))) != 0)
               || _la == Identifier) {
               {
                  {
                     setState(1167);
                     classBodyDeclaration();
                  }
               }
               setState(1172);
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

   public static class InterfaceDeclarationContext extends ParserRuleContext {
      public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
         return getRuleContext(NormalInterfaceDeclarationContext.class, 0);
      }

      public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
         return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
      }

      public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
      InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
      enterRule(_localctx, 180, RULE_interfaceDeclaration);
      try {
         setState(1175);
         switch (getInterpreter().adaptivePredict(_input, 117, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1173);
               normalInterfaceDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1174);
               annotationTypeDeclaration();
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

   public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public InterfaceBodyContext interfaceBody() {
         return getRuleContext(InterfaceBodyContext.class, 0);
      }

      public List<InterfaceModifierContext> interfaceModifier() {
         return getRuleContexts(InterfaceModifierContext.class);
      }

      public InterfaceModifierContext interfaceModifier(int i) {
         return getRuleContext(InterfaceModifierContext.class, i);
      }

      public TypeParametersContext typeParameters() {
         return getRuleContext(TypeParametersContext.class, 0);
      }

      public ExtendsInterfacesContext extendsInterfaces() {
         return getRuleContext(ExtendsInterfacesContext.class, 0);
      }

      public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_normalInterfaceDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterNormalInterfaceDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitNormalInterfaceDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitNormalInterfaceDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
      NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
      enterRule(_localctx, 182, RULE_normalInterfaceDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1180);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__25)
               | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(1177);
                     interfaceModifier();
                  }
               }
               setState(1182);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1183);
            match(T__45);
            setState(1184);
            match(Identifier);
            setState(1186);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1185);
                  typeParameters();
               }
            }

            setState(1189);
            _la = _input.LA(1);
            if (_la == T__11) {
               {
                  setState(1188);
                  extendsInterfaces();
               }
            }

            setState(1191);
            interfaceBody();
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

   public static class InterfaceModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
      InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
      enterRule(_localctx, 184, RULE_interfaceModifier);
      int _la;
      try {
         setState(1200);
         switch (_input.LA(1)) {
            case T__24 :
            case T__25 :
            case T__26 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(1197);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(1193);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(1194);
                     match(T__24);
                  }
                     break;
                  case T__25 : {
                     setState(1195);
                     match(T__25);
                  }
                     break;
                  case T__26 : {
                     setState(1196);
                     match(T__26);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__27 :
            case T__29 :
               enterOuterAlt(_localctx, 2); {
               setState(1199);
               _la = _input.LA(1);
               if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__27) | (1L << T__29))) != 0))) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class ExtendsInterfacesContext extends ParserRuleContext {
      public InterfaceTypeListContext interfaceTypeList() {
         return getRuleContext(InterfaceTypeListContext.class, 0);
      }

      public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_extendsInterfaces;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExtendsInterfaces(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExtendsInterfaces(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExtendsInterfaces(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
      ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
      enterRule(_localctx, 186, RULE_extendsInterfaces);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1202);
            match(T__11);
            setState(1203);
            interfaceTypeList();
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

   public static class InterfaceBodyContext extends ParserRuleContext {
      public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
         return getRuleContexts(InterfaceMemberDeclarationContext.class);
      }

      public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
         return getRuleContext(InterfaceMemberDeclarationContext.class, i);
      }

      public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceBodyContext interfaceBody() throws RecognitionException {
      InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
      enterRule(_localctx, 188, RULE_interfaceBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1205);
            match(T__31);
            setState(1209);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7)
                  | (1L << T__8) | (1L << T__13) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24)
                  | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__38)
                  | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)
               || _la == Identifier) {
               {
                  {
                     setState(1206);
                     interfaceMemberDeclaration();
                  }
               }
               setState(1211);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1212);
            match(T__32);
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

   public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
      public ConstantDeclarationContext constantDeclaration() {
         return getRuleContext(ConstantDeclarationContext.class, 0);
      }

      public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
         return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
      }

      public ClassDeclarationContext classDeclaration() {
         return getRuleContext(ClassDeclarationContext.class, 0);
      }

      public InterfaceDeclarationContext interfaceDeclaration() {
         return getRuleContext(InterfaceDeclarationContext.class, 0);
      }

      public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceMemberDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceMemberDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceMemberDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceMemberDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
      InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
      enterRule(_localctx, 190, RULE_interfaceMemberDeclaration);
      try {
         setState(1219);
         switch (getInterpreter().adaptivePredict(_input, 124, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1214);
               constantDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1215);
               interfaceMethodDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1216);
               classDeclaration();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1217);
               interfaceDeclaration();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1218);
               match(T__19);
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

   public static class ConstantDeclarationContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorListContext variableDeclaratorList() {
         return getRuleContext(VariableDeclaratorListContext.class, 0);
      }

      public ConstantModifierContext constantModifier() {
         return getRuleContext(ConstantModifierContext.class, 0);
      }

      public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constantDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstantDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstantDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstantDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
      ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
      enterRule(_localctx, 192, RULE_constantDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1222);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__47))) != 0)) {
               {
                  setState(1221);
                  constantModifier();
               }
            }

            setState(1224);
            unannType();
            setState(1225);
            variableDeclaratorList();
            setState(1226);
            match(T__19);
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

   public static class ConstantModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constantModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstantModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstantModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstantModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstantModifierContext constantModifier() throws RecognitionException {
      ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
      enterRule(_localctx, 194, RULE_constantModifier);
      int _la;
      try {
         setState(1233);
         switch (_input.LA(1)) {
            case T__24 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(1230);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(1228);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(1229);
                     match(T__24);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__28 :
               enterOuterAlt(_localctx, 2); {
               setState(1232);
               _la = _input.LA(1);
               if (!(_la == T__22 || _la == T__28)) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
      public MethodHeaderContext methodHeader() {
         return getRuleContext(MethodHeaderContext.class, 0);
      }

      public MethodBodyContext methodBody() {
         return getRuleContext(MethodBodyContext.class, 0);
      }

      public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
         return getRuleContexts(InterfaceMethodModifierContext.class);
      }

      public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
         return getRuleContext(InterfaceMethodModifierContext.class, i);
      }

      public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceMethodDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceMethodDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceMethodDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceMethodDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
      InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
      enterRule(_localctx, 196, RULE_interfaceMethodDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1238);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__24) | (1L << T__27)
               | (1L << T__29) | (1L << T__46) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(1235);
                     interfaceMethodModifier();
                  }
               }
               setState(1240);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1241);
            methodHeader();
            setState(1242);
            methodBody();
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

   public static class InterfaceMethodModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_interfaceMethodModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInterfaceMethodModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInterfaceMethodModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInterfaceMethodModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
      InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
      enterRule(_localctx, 198, RULE_interfaceMethodModifier);
      int _la;
      try {
         setState(1249);
         switch (_input.LA(1)) {
            case T__24 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(1246);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(1244);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(1245);
                     match(T__24);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__22 :
            case T__27 :
            case T__29 :
            case T__46 :
               enterOuterAlt(_localctx, 2); {
               setState(1248);
               _la = _input.LA(1);
               if (!((((_la) & ~0x3f) == 0
                  && ((1L << _la) & ((1L << T__22) | (1L << T__27) | (1L << T__29) | (1L << T__46))) != 0))) {
                  _errHandler.recoverInline(this);
               }
               else {
                  consume();
               }
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

   public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public AnnotationTypeBodyContext annotationTypeBody() {
         return getRuleContext(AnnotationTypeBodyContext.class, 0);
      }

      public List<InterfaceModifierContext> interfaceModifier() {
         return getRuleContexts(InterfaceModifierContext.class);
      }

      public InterfaceModifierContext interfaceModifier(int i) {
         return getRuleContext(InterfaceModifierContext.class, i);
      }

      public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotationTypeDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotationTypeDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotationTypeDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotationTypeDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
      AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
      enterRule(_localctx, 200, RULE_annotationTypeDeclaration);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1254);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 131, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1251);
                        interfaceModifier();
                     }
                  }
               }
               setState(1256);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 131, _ctx);
            }
            setState(1257);
            match(T__47);
            setState(1258);
            match(T__45);
            setState(1259);
            match(Identifier);
            setState(1260);
            annotationTypeBody();
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

   public static class AnnotationTypeBodyContext extends ParserRuleContext {
      public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
         return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
      }

      public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
         return getRuleContext(AnnotationTypeMemberDeclarationContext.class, i);
      }

      public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotationTypeBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotationTypeBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotationTypeBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotationTypeBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
      AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
      enterRule(_localctx, 202, RULE_annotationTypeBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1262);
            match(T__31);
            setState(1266);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__19) | (1L << T__22)
               | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28)
               | (1L << T__29) | (1L << T__44) | (1L << T__45) | (1L << T__47))) != 0) || _la == Identifier) {
               {
                  {
                     setState(1263);
                     annotationTypeMemberDeclaration();
                  }
               }
               setState(1268);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1269);
            match(T__32);
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

   public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
      public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
         return getRuleContext(AnnotationTypeElementDeclarationContext.class, 0);
      }

      public ConstantDeclarationContext constantDeclaration() {
         return getRuleContext(ConstantDeclarationContext.class, 0);
      }

      public ClassDeclarationContext classDeclaration() {
         return getRuleContext(ClassDeclarationContext.class, 0);
      }

      public InterfaceDeclarationContext interfaceDeclaration() {
         return getRuleContext(InterfaceDeclarationContext.class, 0);
      }

      public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotationTypeMemberDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotationTypeMemberDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotationTypeMemberDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotationTypeMemberDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
      AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
      enterRule(_localctx, 204, RULE_annotationTypeMemberDeclaration);
      try {
         setState(1276);
         switch (getInterpreter().adaptivePredict(_input, 133, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1271);
               annotationTypeElementDeclaration();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1272);
               constantDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1273);
               classDeclaration();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1274);
               interfaceDeclaration();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1275);
               match(T__19);
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

   public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
         return getRuleContexts(AnnotationTypeElementModifierContext.class);
      }

      public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
         return getRuleContext(AnnotationTypeElementModifierContext.class, i);
      }

      public DimsContext dims() {
         return getRuleContext(DimsContext.class, 0);
      }

      public DefaultValueContext defaultValue() {
         return getRuleContext(DefaultValueContext.class, 0);
      }

      public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotationTypeElementDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotationTypeElementDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotationTypeElementDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotationTypeElementDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
      AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
      enterRule(_localctx, 206, RULE_annotationTypeElementDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1281);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__27) | (1L << T__47))) != 0)) {
               {
                  {
                     setState(1278);
                     annotationTypeElementModifier();
                  }
               }
               setState(1283);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1284);
            unannType();
            setState(1285);
            match(Identifier);
            setState(1286);
            match(T__39);
            setState(1287);
            match(T__40);
            setState(1289);
            _la = _input.LA(1);
            if (_la == T__9 || _la == T__47) {
               {
                  setState(1288);
                  dims();
               }
            }

            setState(1292);
            _la = _input.LA(1);
            if (_la == T__46) {
               {
                  setState(1291);
                  defaultValue();
               }
            }

            setState(1294);
            match(T__19);
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

   public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotationTypeElementModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotationTypeElementModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotationTypeElementModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotationTypeElementModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
      AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
      enterRule(_localctx, 208, RULE_annotationTypeElementModifier);
      try {
         setState(1301);
         switch (_input.LA(1)) {
            case T__24 :
            case T__47 :
               enterOuterAlt(_localctx, 1); {
               setState(1298);
               switch (_input.LA(1)) {
                  case T__47 : {
                     setState(1296);
                     annotation();
                  }
                     break;
                  case T__24 : {
                     setState(1297);
                     match(T__24);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case T__27 :
               enterOuterAlt(_localctx, 2); {
               setState(1300);
               match(T__27);
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

   public static class DefaultValueContext extends ParserRuleContext {
      public ElementValueContext elementValue() {
         return getRuleContext(ElementValueContext.class, 0);
      }

      public DefaultValueContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_defaultValue;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterDefaultValue(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitDefaultValue(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitDefaultValue(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DefaultValueContext defaultValue() throws RecognitionException {
      DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
      enterRule(_localctx, 210, RULE_defaultValue);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1303);
            match(T__46);
            setState(1304);
            elementValue();
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

   public static class AnnotationContext extends ParserRuleContext {
      public NormalAnnotationContext normalAnnotation() {
         return getRuleContext(NormalAnnotationContext.class, 0);
      }

      public MarkerAnnotationContext markerAnnotation() {
         return getRuleContext(MarkerAnnotationContext.class, 0);
      }

      public SingleElementAnnotationContext singleElementAnnotation() {
         return getRuleContext(SingleElementAnnotationContext.class, 0);
      }

      public AnnotationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_annotation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAnnotation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAnnotation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAnnotation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AnnotationContext annotation() throws RecognitionException {
      AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
      enterRule(_localctx, 212, RULE_annotation);
      try {
         setState(1309);
         switch (getInterpreter().adaptivePredict(_input, 139, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1306);
               normalAnnotation();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1307);
               markerAnnotation();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1308);
               singleElementAnnotation();
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

   public static class NormalAnnotationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ElementValuePairListContext elementValuePairList() {
         return getRuleContext(ElementValuePairListContext.class, 0);
      }

      public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_normalAnnotation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterNormalAnnotation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitNormalAnnotation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitNormalAnnotation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
      NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
      enterRule(_localctx, 214, RULE_normalAnnotation);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1311);
            match(T__47);
            setState(1312);
            typeName();
            setState(1313);
            match(T__39);
            setState(1315);
            _la = _input.LA(1);
            if (_la == Identifier) {
               {
                  setState(1314);
                  elementValuePairList();
               }
            }

            setState(1317);
            match(T__40);
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

   public static class ElementValuePairListContext extends ParserRuleContext {
      public List<ElementValuePairContext> elementValuePair() {
         return getRuleContexts(ElementValuePairContext.class);
      }

      public ElementValuePairContext elementValuePair(int i) {
         return getRuleContext(ElementValuePairContext.class, i);
      }

      public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementValuePairList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterElementValuePairList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitElementValuePairList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitElementValuePairList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
      ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
      enterRule(_localctx, 216, RULE_elementValuePairList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1319);
            elementValuePair();
            setState(1324);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(1320);
                     match(T__15);
                     setState(1321);
                     elementValuePair();
                  }
               }
               setState(1326);
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

   public static class ElementValuePairContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public ElementValueContext elementValue() {
         return getRuleContext(ElementValueContext.class, 0);
      }

      public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementValuePair;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterElementValuePair(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitElementValuePair(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitElementValuePair(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementValuePairContext elementValuePair() throws RecognitionException {
      ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
      enterRule(_localctx, 218, RULE_elementValuePair);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1327);
            match(Identifier);
            setState(1328);
            match(T__35);
            setState(1329);
            elementValue();
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

   public static class ElementValueContext extends ParserRuleContext {
      public ConditionalExpressionContext conditionalExpression() {
         return getRuleContext(ConditionalExpressionContext.class, 0);
      }

      public ElementValueArrayInitializerContext elementValueArrayInitializer() {
         return getRuleContext(ElementValueArrayInitializerContext.class, 0);
      }

      public AnnotationContext annotation() {
         return getRuleContext(AnnotationContext.class, 0);
      }

      public ElementValueContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementValue;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterElementValue(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitElementValue(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitElementValue(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementValueContext elementValue() throws RecognitionException {
      ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
      enterRule(_localctx, 220, RULE_elementValue);
      try {
         setState(1334);
         switch (getInterpreter().adaptivePredict(_input, 142, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1331);
               conditionalExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1332);
               elementValueArrayInitializer();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1333);
               annotation();
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

   public static class ElementValueArrayInitializerContext extends ParserRuleContext {
      public ElementValueListContext elementValueList() {
         return getRuleContext(ElementValueListContext.class, 0);
      }

      public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementValueArrayInitializer;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterElementValueArrayInitializer(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitElementValueArrayInitializer(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitElementValueArrayInitializer(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
      ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
      enterRule(_localctx, 222, RULE_elementValueArrayInitializer);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1336);
            match(T__31);
            setState(1338);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__31)
               | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68))
                  & ((1L << (T__67 - 68)) | (1L << (T__92 - 68)) | (1L << (T__93 - 68)) | (1L << (T__96 - 68))
                     | (1L << (T__97 - 68)) | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68))
                     | (1L << (BooleanLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68))
                     | (1L << (NullLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1337);
                  elementValueList();
               }
            }

            setState(1341);
            _la = _input.LA(1);
            if (_la == T__15) {
               {
                  setState(1340);
                  match(T__15);
               }
            }

            setState(1343);
            match(T__32);
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

   public static class ElementValueListContext extends ParserRuleContext {
      public List<ElementValueContext> elementValue() {
         return getRuleContexts(ElementValueContext.class);
      }

      public ElementValueContext elementValue(int i) {
         return getRuleContext(ElementValueContext.class, i);
      }

      public ElementValueListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementValueList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterElementValueList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitElementValueList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitElementValueList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementValueListContext elementValueList() throws RecognitionException {
      ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
      enterRule(_localctx, 224, RULE_elementValueList);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1345);
            elementValue();
            setState(1350);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 145, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1346);
                        match(T__15);
                        setState(1347);
                        elementValue();
                     }
                  }
               }
               setState(1352);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 145, _ctx);
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

   public static class MarkerAnnotationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_markerAnnotation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMarkerAnnotation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMarkerAnnotation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMarkerAnnotation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
      MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
      enterRule(_localctx, 226, RULE_markerAnnotation);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1353);
            match(T__47);
            setState(1354);
            typeName();
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

   public static class SingleElementAnnotationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ElementValueContext elementValue() {
         return getRuleContext(ElementValueContext.class, 0);
      }

      public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_singleElementAnnotation;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSingleElementAnnotation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSingleElementAnnotation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSingleElementAnnotation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
      SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
      enterRule(_localctx, 228, RULE_singleElementAnnotation);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1356);
            match(T__47);
            setState(1357);
            typeName();
            setState(1358);
            match(T__39);
            setState(1359);
            elementValue();
            setState(1360);
            match(T__40);
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

   public static class ArrayInitializerContext extends ParserRuleContext {
      public VariableInitializerListContext variableInitializerList() {
         return getRuleContext(VariableInitializerListContext.class, 0);
      }

      public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayInitializer;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterArrayInitializer(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitArrayInitializer(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitArrayInitializer(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
      ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
      enterRule(_localctx, 230, RULE_arrayInitializer);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1362);
            match(T__31);
            setState(1364);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__31)
               | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1363);
                  variableInitializerList();
               }
            }

            setState(1367);
            _la = _input.LA(1);
            if (_la == T__15) {
               {
                  setState(1366);
                  match(T__15);
               }
            }

            setState(1369);
            match(T__32);
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

   public static class VariableInitializerListContext extends ParserRuleContext {
      public List<VariableInitializerContext> variableInitializer() {
         return getRuleContexts(VariableInitializerContext.class);
      }

      public VariableInitializerContext variableInitializer(int i) {
         return getRuleContext(VariableInitializerContext.class, i);
      }

      public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableInitializerList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterVariableInitializerList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitVariableInitializerList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitVariableInitializerList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
      VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
      enterRule(_localctx, 232, RULE_variableInitializerList);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1371);
            variableInitializer();
            setState(1376);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 148, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1372);
                        match(T__15);
                        setState(1373);
                        variableInitializer();
                     }
                  }
               }
               setState(1378);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 148, _ctx);
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

   public static class BlockContext extends ParserRuleContext {
      public BlockStatementsContext blockStatements() {
         return getRuleContext(BlockStatementsContext.class, 0);
      }

      public BlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_block;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockContext block() throws RecognitionException {
      BlockContext _localctx = new BlockContext(_ctx, getState());
      enterRule(_localctx, 234, RULE_block);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1379);
            match(T__31);
            setState(1381);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__19)
               | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
               | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__36) | (1L << T__38) | (1L << T__39)
               | (1L << T__42) | (1L << T__44) | (1L << T__47) | (1L << T__49) | (1L << T__50) | (1L << T__51)
               | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59)
               | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)
               || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__67 - 64))
                  | (1L << (T__98 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64))
                  | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64))
                  | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
               {
                  setState(1380);
                  blockStatements();
               }
            }

            setState(1383);
            match(T__32);
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

   public static class BlockStatementsContext extends ParserRuleContext {
      public List<BlockStatementContext> blockStatement() {
         return getRuleContexts(BlockStatementContext.class);
      }

      public BlockStatementContext blockStatement(int i) {
         return getRuleContext(BlockStatementContext.class, i);
      }

      public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_blockStatements;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBlockStatements(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBlockStatements(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBlockStatements(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockStatementsContext blockStatements() throws RecognitionException {
      BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
      enterRule(_localctx, 236, RULE_blockStatements);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1385);
            blockStatement();
            setState(1389);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__19)
               | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27)
               | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__36) | (1L << T__38) | (1L << T__39)
               | (1L << T__42) | (1L << T__44) | (1L << T__47) | (1L << T__49) | (1L << T__50) | (1L << T__51)
               | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59)
               | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)
               || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__67 - 64))
                  | (1L << (T__98 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64))
                  | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64))
                  | (1L << (NullLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
               {
                  {
                     setState(1386);
                     blockStatement();
                  }
               }
               setState(1391);
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

   public static class BlockStatementContext extends ParserRuleContext {
      public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
         return getRuleContext(LocalVariableDeclarationStatementContext.class, 0);
      }

      public ClassDeclarationContext classDeclaration() {
         return getRuleContext(ClassDeclarationContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public BlockStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_blockStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBlockStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBlockStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBlockStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockStatementContext blockStatement() throws RecognitionException {
      BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
      enterRule(_localctx, 238, RULE_blockStatement);
      try {
         setState(1395);
         switch (getInterpreter().adaptivePredict(_input, 151, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1392);
               localVariableDeclarationStatement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1393);
               classDeclaration();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1394);
               statement();
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

   public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
      public LocalVariableDeclarationContext localVariableDeclaration() {
         return getRuleContext(LocalVariableDeclarationContext.class, 0);
      }

      public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_localVariableDeclarationStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLocalVariableDeclarationStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLocalVariableDeclarationStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLocalVariableDeclarationStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement()
      throws RecognitionException {
      LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx,
         getState());
      enterRule(_localctx, 240, RULE_localVariableDeclarationStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1397);
            localVariableDeclaration();
            setState(1398);
            match(T__19);
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

   public static class LocalVariableDeclarationContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorListContext variableDeclaratorList() {
         return getRuleContext(VariableDeclaratorListContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_localVariableDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLocalVariableDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLocalVariableDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLocalVariableDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
      LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
      enterRule(_localctx, 242, RULE_localVariableDeclaration);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1403);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(1400);
                     variableModifier();
                  }
               }
               setState(1405);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1406);
            unannType();
            setState(1407);
            variableDeclaratorList();
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
      public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
         return getRuleContext(StatementWithoutTrailingSubstatementContext.class, 0);
      }

      public LabeledStatementContext labeledStatement() {
         return getRuleContext(LabeledStatementContext.class, 0);
      }

      public IfThenStatementContext ifThenStatement() {
         return getRuleContext(IfThenStatementContext.class, 0);
      }

      public IfThenElseStatementContext ifThenElseStatement() {
         return getRuleContext(IfThenElseStatementContext.class, 0);
      }

      public WhileStatementContext whileStatement() {
         return getRuleContext(WhileStatementContext.class, 0);
      }

      public ForStatementContext forStatement() {
         return getRuleContext(ForStatementContext.class, 0);
      }

      public StatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementContext statement() throws RecognitionException {
      StatementContext _localctx = new StatementContext(_ctx, getState());
      enterRule(_localctx, 244, RULE_statement);
      try {
         setState(1415);
         switch (getInterpreter().adaptivePredict(_input, 153, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1409);
               statementWithoutTrailingSubstatement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1410);
               labeledStatement();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1411);
               ifThenStatement();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1412);
               ifThenElseStatement();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1413);
               whileStatement();
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(1414);
               forStatement();
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

   public static class StatementNoShortIfContext extends ParserRuleContext {
      public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
         return getRuleContext(StatementWithoutTrailingSubstatementContext.class, 0);
      }

      public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
         return getRuleContext(LabeledStatementNoShortIfContext.class, 0);
      }

      public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
         return getRuleContext(IfThenElseStatementNoShortIfContext.class, 0);
      }

      public WhileStatementNoShortIfContext whileStatementNoShortIf() {
         return getRuleContext(WhileStatementNoShortIfContext.class, 0);
      }

      public ForStatementNoShortIfContext forStatementNoShortIf() {
         return getRuleContext(ForStatementNoShortIfContext.class, 0);
      }

      public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
      StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 246, RULE_statementNoShortIf);
      try {
         setState(1422);
         switch (getInterpreter().adaptivePredict(_input, 154, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1417);
               statementWithoutTrailingSubstatement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1418);
               labeledStatementNoShortIf();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1419);
               ifThenElseStatementNoShortIf();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1420);
               whileStatementNoShortIf();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1421);
               forStatementNoShortIf();
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

   public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public EmptyStatementContext emptyStatement() {
         return getRuleContext(EmptyStatementContext.class, 0);
      }

      public ExpressionStatementContext expressionStatement() {
         return getRuleContext(ExpressionStatementContext.class, 0);
      }

      public AssertStatementContext assertStatement() {
         return getRuleContext(AssertStatementContext.class, 0);
      }

      public SwitchStatementContext switchStatement() {
         return getRuleContext(SwitchStatementContext.class, 0);
      }

      public DoStatementContext doStatement() {
         return getRuleContext(DoStatementContext.class, 0);
      }

      public BreakStatementContext breakStatement() {
         return getRuleContext(BreakStatementContext.class, 0);
      }

      public ContinueStatementContext continueStatement() {
         return getRuleContext(ContinueStatementContext.class, 0);
      }

      public ReturnStatementContext returnStatement() {
         return getRuleContext(ReturnStatementContext.class, 0);
      }

      public SynchronizedStatementContext synchronizedStatement() {
         return getRuleContext(SynchronizedStatementContext.class, 0);
      }

      public ThrowStatementContext throwStatement() {
         return getRuleContext(ThrowStatementContext.class, 0);
      }

      public TryStatementContext tryStatement() {
         return getRuleContext(TryStatementContext.class, 0);
      }

      public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statementWithoutTrailingSubstatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStatementWithoutTrailingSubstatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStatementWithoutTrailingSubstatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStatementWithoutTrailingSubstatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement()
      throws RecognitionException {
      StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx,
         getState());
      enterRule(_localctx, 248, RULE_statementWithoutTrailingSubstatement);
      try {
         setState(1436);
         switch (_input.LA(1)) {
            case T__31 :
               enterOuterAlt(_localctx, 1); {
               setState(1424);
               block();
            }
               break;
            case T__19 :
               enterOuterAlt(_localctx, 2); {
               setState(1425);
               emptyStatement();
            }
               break;
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case T__17 :
            case T__38 :
            case T__39 :
            case T__42 :
            case T__47 :
            case T__49 :
            case T__50 :
            case T__67 :
            case T__98 :
            case IntegerLiteral :
            case FloatingPointLiteral :
            case BooleanLiteral :
            case CharacterLiteral :
            case StringLiteral :
            case NullLiteral :
            case Identifier :
               enterOuterAlt(_localctx, 3); {
               setState(1426);
               expressionStatement();
            }
               break;
            case T__53 :
               enterOuterAlt(_localctx, 4); {
               setState(1427);
               assertStatement();
            }
               break;
            case T__54 :
               enterOuterAlt(_localctx, 5); {
               setState(1428);
               switchStatement();
            }
               break;
            case T__57 :
               enterOuterAlt(_localctx, 6); {
               setState(1429);
               doStatement();
            }
               break;
            case T__59 :
               enterOuterAlt(_localctx, 7); {
               setState(1430);
               breakStatement();
            }
               break;
            case T__60 :
               enterOuterAlt(_localctx, 8); {
               setState(1431);
               continueStatement();
            }
               break;
            case T__61 :
               enterOuterAlt(_localctx, 9); {
               setState(1432);
               returnStatement();
            }
               break;
            case T__36 :
               enterOuterAlt(_localctx, 10); {
               setState(1433);
               synchronizedStatement();
            }
               break;
            case T__62 :
               enterOuterAlt(_localctx, 11); {
               setState(1434);
               throwStatement();
            }
               break;
            case T__63 :
               enterOuterAlt(_localctx, 12); {
               setState(1435);
               tryStatement();
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

   public static class EmptyStatementContext extends ParserRuleContext {
      public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_emptyStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEmptyStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEmptyStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEmptyStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EmptyStatementContext emptyStatement() throws RecognitionException {
      EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
      enterRule(_localctx, 250, RULE_emptyStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1438);
            match(T__19);
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

   public static class LabeledStatementContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_labeledStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLabeledStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLabeledStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLabeledStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LabeledStatementContext labeledStatement() throws RecognitionException {
      LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
      enterRule(_localctx, 252, RULE_labeledStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1440);
            match(Identifier);
            setState(1441);
            match(T__48);
            setState(1442);
            statement();
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

   public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public StatementNoShortIfContext statementNoShortIf() {
         return getRuleContext(StatementNoShortIfContext.class, 0);
      }

      public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_labeledStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLabeledStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLabeledStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLabeledStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
      LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 254, RULE_labeledStatementNoShortIf);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1444);
            match(Identifier);
            setState(1445);
            match(T__48);
            setState(1446);
            statementNoShortIf();
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

   public static class ExpressionStatementContext extends ParserRuleContext {
      public StatementExpressionContext statementExpression() {
         return getRuleContext(StatementExpressionContext.class, 0);
      }

      public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expressionStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExpressionStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExpressionStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExpressionStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionStatementContext expressionStatement() throws RecognitionException {
      ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
      enterRule(_localctx, 256, RULE_expressionStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1448);
            statementExpression();
            setState(1449);
            match(T__19);
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

   public static class StatementExpressionContext extends ParserRuleContext {
      public AssignmentContext assignment() {
         return getRuleContext(AssignmentContext.class, 0);
      }

      public PreIncrementExpressionContext preIncrementExpression() {
         return getRuleContext(PreIncrementExpressionContext.class, 0);
      }

      public PreDecrementExpressionContext preDecrementExpression() {
         return getRuleContext(PreDecrementExpressionContext.class, 0);
      }

      public PostIncrementExpressionContext postIncrementExpression() {
         return getRuleContext(PostIncrementExpressionContext.class, 0);
      }

      public PostDecrementExpressionContext postDecrementExpression() {
         return getRuleContext(PostDecrementExpressionContext.class, 0);
      }

      public MethodInvocationContext methodInvocation() {
         return getRuleContext(MethodInvocationContext.class, 0);
      }

      public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
         return getRuleContext(ClassInstanceCreationExpressionContext.class, 0);
      }

      public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statementExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStatementExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStatementExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStatementExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementExpressionContext statementExpression() throws RecognitionException {
      StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
      enterRule(_localctx, 258, RULE_statementExpression);
      try {
         setState(1458);
         switch (getInterpreter().adaptivePredict(_input, 156, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1451);
               assignment();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1452);
               preIncrementExpression();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1453);
               preDecrementExpression();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1454);
               postIncrementExpression();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1455);
               postDecrementExpression();
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(1456);
               methodInvocation();
            }
               break;
            case 7 :
               enterOuterAlt(_localctx, 7); {
               setState(1457);
               classInstanceCreationExpression();
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

   public static class PreIncrementExpressionContext extends ParserRuleContext {
      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_preIncrementExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPreIncrementExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPreIncrementExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPreIncrementExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
      PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
      enterRule(_localctx, 260, RULE_preIncrementExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1460);
            match(T__49);
            setState(1461);
            unaryExpression();
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

   public static class PreDecrementExpressionContext extends ParserRuleContext {
      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_preDecrementExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPreDecrementExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPreDecrementExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPreDecrementExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
      PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
      enterRule(_localctx, 262, RULE_preDecrementExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1463);
            match(T__50);
            setState(1464);
            unaryExpression();
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

   public static class PostIncrementExpressionContext extends ParserRuleContext {
      public PostfixExpressionContext postfixExpression() {
         return getRuleContext(PostfixExpressionContext.class, 0);
      }

      public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_postIncrementExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPostIncrementExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPostIncrementExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPostIncrementExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
      PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
      enterRule(_localctx, 264, RULE_postIncrementExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1466);
            postfixExpression(0);
            setState(1467);
            match(T__49);
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

   public static class PostDecrementExpressionContext extends ParserRuleContext {
      public PostfixExpressionContext postfixExpression() {
         return getRuleContext(PostfixExpressionContext.class, 0);
      }

      public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_postDecrementExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPostDecrementExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPostDecrementExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPostDecrementExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
      PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
      enterRule(_localctx, 266, RULE_postDecrementExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1469);
            postfixExpression(0);
            setState(1470);
            match(T__50);
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

   public static class IfThenStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifThenStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterIfThenStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitIfThenStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitIfThenStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IfThenStatementContext ifThenStatement() throws RecognitionException {
      IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
      enterRule(_localctx, 268, RULE_ifThenStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1472);
            match(T__51);
            setState(1473);
            match(T__39);
            setState(1474);
            expression();
            setState(1475);
            match(T__40);
            setState(1476);
            statement();
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

   public static class IfThenElseStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementNoShortIfContext statementNoShortIf() {
         return getRuleContext(StatementNoShortIfContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifThenElseStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterIfThenElseStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitIfThenElseStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitIfThenElseStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
      IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
      enterRule(_localctx, 270, RULE_ifThenElseStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1478);
            match(T__51);
            setState(1479);
            match(T__39);
            setState(1480);
            expression();
            setState(1481);
            match(T__40);
            setState(1482);
            statementNoShortIf();
            setState(1483);
            match(T__52);
            setState(1484);
            statement();
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

   public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public List<StatementNoShortIfContext> statementNoShortIf() {
         return getRuleContexts(StatementNoShortIfContext.class);
      }

      public StatementNoShortIfContext statementNoShortIf(int i) {
         return getRuleContext(StatementNoShortIfContext.class, i);
      }

      public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifThenElseStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterIfThenElseStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitIfThenElseStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitIfThenElseStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
      IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 272, RULE_ifThenElseStatementNoShortIf);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1486);
            match(T__51);
            setState(1487);
            match(T__39);
            setState(1488);
            expression();
            setState(1489);
            match(T__40);
            setState(1490);
            statementNoShortIf();
            setState(1491);
            match(T__52);
            setState(1492);
            statementNoShortIf();
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

   public static class AssertStatementContext extends ParserRuleContext {
      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      public AssertStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_assertStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAssertStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAssertStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAssertStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AssertStatementContext assertStatement() throws RecognitionException {
      AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
      enterRule(_localctx, 274, RULE_assertStatement);
      try {
         setState(1504);
         switch (getInterpreter().adaptivePredict(_input, 157, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1494);
               match(T__53);
               setState(1495);
               expression();
               setState(1496);
               match(T__19);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1498);
               match(T__53);
               setState(1499);
               expression();
               setState(1500);
               match(T__48);
               setState(1501);
               expression();
               setState(1502);
               match(T__19);
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

   public static class SwitchStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public SwitchBlockContext switchBlock() {
         return getRuleContext(SwitchBlockContext.class, 0);
      }

      public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSwitchStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSwitchStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSwitchStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SwitchStatementContext switchStatement() throws RecognitionException {
      SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
      enterRule(_localctx, 276, RULE_switchStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1506);
            match(T__54);
            setState(1507);
            match(T__39);
            setState(1508);
            expression();
            setState(1509);
            match(T__40);
            setState(1510);
            switchBlock();
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

   public static class SwitchBlockContext extends ParserRuleContext {
      public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
         return getRuleContexts(SwitchBlockStatementGroupContext.class);
      }

      public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
         return getRuleContext(SwitchBlockStatementGroupContext.class, i);
      }

      public List<SwitchLabelContext> switchLabel() {
         return getRuleContexts(SwitchLabelContext.class);
      }

      public SwitchLabelContext switchLabel(int i) {
         return getRuleContext(SwitchLabelContext.class, i);
      }

      public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchBlock;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSwitchBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSwitchBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSwitchBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SwitchBlockContext switchBlock() throws RecognitionException {
      SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
      enterRule(_localctx, 278, RULE_switchBlock);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1512);
            match(T__31);
            setState(1516);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1513);
                        switchBlockStatementGroup();
                     }
                  }
               }
               setState(1518);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 158, _ctx);
            }
            setState(1522);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__46 || _la == T__55) {
               {
                  {
                     setState(1519);
                     switchLabel();
                  }
               }
               setState(1524);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1525);
            match(T__32);
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

   public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
      public SwitchLabelsContext switchLabels() {
         return getRuleContext(SwitchLabelsContext.class, 0);
      }

      public BlockStatementsContext blockStatements() {
         return getRuleContext(BlockStatementsContext.class, 0);
      }

      public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchBlockStatementGroup;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSwitchBlockStatementGroup(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSwitchBlockStatementGroup(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSwitchBlockStatementGroup(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
      SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
      enterRule(_localctx, 280, RULE_switchBlockStatementGroup);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1527);
            switchLabels();
            setState(1528);
            blockStatements();
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

   public static class SwitchLabelsContext extends ParserRuleContext {
      public List<SwitchLabelContext> switchLabel() {
         return getRuleContexts(SwitchLabelContext.class);
      }

      public SwitchLabelContext switchLabel(int i) {
         return getRuleContext(SwitchLabelContext.class, i);
      }

      public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchLabels;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSwitchLabels(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSwitchLabels(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSwitchLabels(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SwitchLabelsContext switchLabels() throws RecognitionException {
      SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
      enterRule(_localctx, 282, RULE_switchLabels);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1530);
            switchLabel();
            setState(1534);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__46 || _la == T__55) {
               {
                  {
                     setState(1531);
                     switchLabel();
                  }
               }
               setState(1536);
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

   public static class SwitchLabelContext extends ParserRuleContext {
      public ConstantExpressionContext constantExpression() {
         return getRuleContext(ConstantExpressionContext.class, 0);
      }

      public EnumConstantNameContext enumConstantName() {
         return getRuleContext(EnumConstantNameContext.class, 0);
      }

      public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_switchLabel;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSwitchLabel(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSwitchLabel(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSwitchLabel(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SwitchLabelContext switchLabel() throws RecognitionException {
      SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
      enterRule(_localctx, 284, RULE_switchLabel);
      try {
         setState(1547);
         switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1537);
               match(T__55);
               setState(1538);
               constantExpression();
               setState(1539);
               match(T__48);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1541);
               match(T__55);
               setState(1542);
               enumConstantName();
               setState(1543);
               match(T__48);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1545);
               match(T__46);
               setState(1546);
               match(T__48);
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

   public static class EnumConstantNameContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enumConstantName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnumConstantName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnumConstantName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnumConstantName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnumConstantNameContext enumConstantName() throws RecognitionException {
      EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
      enterRule(_localctx, 286, RULE_enumConstantName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1549);
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

   public static class WhileStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public WhileStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_whileStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterWhileStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitWhileStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitWhileStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WhileStatementContext whileStatement() throws RecognitionException {
      WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
      enterRule(_localctx, 288, RULE_whileStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1551);
            match(T__56);
            setState(1552);
            match(T__39);
            setState(1553);
            expression();
            setState(1554);
            match(T__40);
            setState(1555);
            statement();
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

   public static class WhileStatementNoShortIfContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementNoShortIfContext statementNoShortIf() {
         return getRuleContext(StatementNoShortIfContext.class, 0);
      }

      public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_whileStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterWhileStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitWhileStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitWhileStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
      WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 290, RULE_whileStatementNoShortIf);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1557);
            match(T__56);
            setState(1558);
            match(T__39);
            setState(1559);
            expression();
            setState(1560);
            match(T__40);
            setState(1561);
            statementNoShortIf();
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

   public static class DoStatementContext extends ParserRuleContext {
      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public DoStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_doStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterDoStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitDoStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitDoStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DoStatementContext doStatement() throws RecognitionException {
      DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
      enterRule(_localctx, 292, RULE_doStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1563);
            match(T__57);
            setState(1564);
            statement();
            setState(1565);
            match(T__56);
            setState(1566);
            match(T__39);
            setState(1567);
            expression();
            setState(1568);
            match(T__40);
            setState(1569);
            match(T__19);
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

   public static class ForStatementContext extends ParserRuleContext {
      public BasicForStatementContext basicForStatement() {
         return getRuleContext(BasicForStatementContext.class, 0);
      }

      public EnhancedForStatementContext enhancedForStatement() {
         return getRuleContext(EnhancedForStatementContext.class, 0);
      }

      public ForStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterForStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitForStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitForStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ForStatementContext forStatement() throws RecognitionException {
      ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
      enterRule(_localctx, 294, RULE_forStatement);
      try {
         setState(1573);
         switch (getInterpreter().adaptivePredict(_input, 162, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1571);
               basicForStatement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1572);
               enhancedForStatement();
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

   public static class ForStatementNoShortIfContext extends ParserRuleContext {
      public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
         return getRuleContext(BasicForStatementNoShortIfContext.class, 0);
      }

      public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
         return getRuleContext(EnhancedForStatementNoShortIfContext.class, 0);
      }

      public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterForStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitForStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitForStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
      ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 296, RULE_forStatementNoShortIf);
      try {
         setState(1577);
         switch (getInterpreter().adaptivePredict(_input, 163, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1575);
               basicForStatementNoShortIf();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1576);
               enhancedForStatementNoShortIf();
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

   public static class BasicForStatementContext extends ParserRuleContext {
      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public ForInitContext forInit() {
         return getRuleContext(ForInitContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ForUpdateContext forUpdate() {
         return getRuleContext(ForUpdateContext.class, 0);
      }

      public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_basicForStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBasicForStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBasicForStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBasicForStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BasicForStatementContext basicForStatement() throws RecognitionException {
      BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
      enterRule(_localctx, 298, RULE_basicForStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1579);
            match(T__58);
            setState(1580);
            match(T__39);
            setState(1582);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__28)
               | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1581);
                  forInit();
               }
            }

            setState(1584);
            match(T__19);
            setState(1586);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1585);
                  expression();
               }
            }

            setState(1588);
            match(T__19);
            setState(1590);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1589);
                  forUpdate();
               }
            }

            setState(1592);
            match(T__40);
            setState(1593);
            statement();
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

   public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
      public StatementNoShortIfContext statementNoShortIf() {
         return getRuleContext(StatementNoShortIfContext.class, 0);
      }

      public ForInitContext forInit() {
         return getRuleContext(ForInitContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ForUpdateContext forUpdate() {
         return getRuleContext(ForUpdateContext.class, 0);
      }

      public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_basicForStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBasicForStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBasicForStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBasicForStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
      BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 300, RULE_basicForStatementNoShortIf);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1595);
            match(T__58);
            setState(1596);
            match(T__39);
            setState(1598);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__28)
               | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1597);
                  forInit();
               }
            }

            setState(1600);
            match(T__19);
            setState(1602);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1601);
                  expression();
               }
            }

            setState(1604);
            match(T__19);
            setState(1606);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1605);
                  forUpdate();
               }
            }

            setState(1608);
            match(T__40);
            setState(1609);
            statementNoShortIf();
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

   public static class ForInitContext extends ParserRuleContext {
      public StatementExpressionListContext statementExpressionList() {
         return getRuleContext(StatementExpressionListContext.class, 0);
      }

      public LocalVariableDeclarationContext localVariableDeclaration() {
         return getRuleContext(LocalVariableDeclarationContext.class, 0);
      }

      public ForInitContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forInit;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterForInit(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitForInit(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitForInit(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ForInitContext forInit() throws RecognitionException {
      ForInitContext _localctx = new ForInitContext(_ctx, getState());
      enterRule(_localctx, 302, RULE_forInit);
      try {
         setState(1613);
         switch (getInterpreter().adaptivePredict(_input, 170, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1611);
               statementExpressionList();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1612);
               localVariableDeclaration();
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

   public static class ForUpdateContext extends ParserRuleContext {
      public StatementExpressionListContext statementExpressionList() {
         return getRuleContext(StatementExpressionListContext.class, 0);
      }

      public ForUpdateContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forUpdate;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterForUpdate(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitForUpdate(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitForUpdate(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ForUpdateContext forUpdate() throws RecognitionException {
      ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
      enterRule(_localctx, 304, RULE_forUpdate);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1615);
            statementExpressionList();
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

   public static class StatementExpressionListContext extends ParserRuleContext {
      public List<StatementExpressionContext> statementExpression() {
         return getRuleContexts(StatementExpressionContext.class);
      }

      public StatementExpressionContext statementExpression(int i) {
         return getRuleContext(StatementExpressionContext.class, i);
      }

      public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statementExpressionList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterStatementExpressionList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitStatementExpressionList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitStatementExpressionList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
      StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
      enterRule(_localctx, 306, RULE_statementExpressionList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1617);
            statementExpression();
            setState(1622);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(1618);
                     match(T__15);
                     setState(1619);
                     statementExpression();
                  }
               }
               setState(1624);
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

   public static class EnhancedForStatementContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enhancedForStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnhancedForStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnhancedForStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnhancedForStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
      EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
      enterRule(_localctx, 308, RULE_enhancedForStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1625);
            match(T__58);
            setState(1626);
            match(T__39);
            setState(1630);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(1627);
                     variableModifier();
                  }
               }
               setState(1632);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1633);
            unannType();
            setState(1634);
            variableDeclaratorId();
            setState(1635);
            match(T__48);
            setState(1636);
            expression();
            setState(1637);
            match(T__40);
            setState(1638);
            statement();
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

   public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public StatementNoShortIfContext statementNoShortIf() {
         return getRuleContext(StatementNoShortIfContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_enhancedForStatementNoShortIf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEnhancedForStatementNoShortIf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEnhancedForStatementNoShortIf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEnhancedForStatementNoShortIf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
      EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
      enterRule(_localctx, 310, RULE_enhancedForStatementNoShortIf);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1640);
            match(T__58);
            setState(1641);
            match(T__39);
            setState(1645);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(1642);
                     variableModifier();
                  }
               }
               setState(1647);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1648);
            unannType();
            setState(1649);
            variableDeclaratorId();
            setState(1650);
            match(T__48);
            setState(1651);
            expression();
            setState(1652);
            match(T__40);
            setState(1653);
            statementNoShortIf();
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

   public static class BreakStatementContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public BreakStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_breakStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterBreakStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitBreakStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitBreakStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BreakStatementContext breakStatement() throws RecognitionException {
      BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
      enterRule(_localctx, 312, RULE_breakStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1655);
            match(T__59);
            setState(1657);
            _la = _input.LA(1);
            if (_la == Identifier) {
               {
                  setState(1656);
                  match(Identifier);
               }
            }

            setState(1659);
            match(T__19);
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

   public static class ContinueStatementContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_continueStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterContinueStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitContinueStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitContinueStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ContinueStatementContext continueStatement() throws RecognitionException {
      ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
      enterRule(_localctx, 314, RULE_continueStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1661);
            match(T__60);
            setState(1663);
            _la = _input.LA(1);
            if (_la == Identifier) {
               {
                  setState(1662);
                  match(Identifier);
               }
            }

            setState(1665);
            match(T__19);
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

   public static class ReturnStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_returnStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterReturnStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitReturnStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitReturnStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ReturnStatementContext returnStatement() throws RecognitionException {
      ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
      enterRule(_localctx, 316, RULE_returnStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1667);
            match(T__61);
            setState(1669);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1668);
                  expression();
               }
            }

            setState(1671);
            match(T__19);
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

   public static class ThrowStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_throwStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterThrowStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitThrowStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitThrowStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ThrowStatementContext throwStatement() throws RecognitionException {
      ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
      enterRule(_localctx, 318, RULE_throwStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1673);
            match(T__62);
            setState(1674);
            expression();
            setState(1675);
            match(T__19);
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

   public static class SynchronizedStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_synchronizedStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterSynchronizedStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitSynchronizedStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitSynchronizedStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
      SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
      enterRule(_localctx, 320, RULE_synchronizedStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1677);
            match(T__36);
            setState(1678);
            match(T__39);
            setState(1679);
            expression();
            setState(1680);
            match(T__40);
            setState(1681);
            block();
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

   public static class TryStatementContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public CatchesContext catches() {
         return getRuleContext(CatchesContext.class, 0);
      }

      public Finally_Context finally_() {
         return getRuleContext(Finally_Context.class, 0);
      }

      public TryWithResourcesStatementContext tryWithResourcesStatement() {
         return getRuleContext(TryWithResourcesStatementContext.class, 0);
      }

      public TryStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tryStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTryStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTryStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTryStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TryStatementContext tryStatement() throws RecognitionException {
      TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
      enterRule(_localctx, 322, RULE_tryStatement);
      int _la;
      try {
         setState(1695);
         switch (getInterpreter().adaptivePredict(_input, 178, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1683);
               match(T__63);
               setState(1684);
               block();
               setState(1685);
               catches();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1687);
               match(T__63);
               setState(1688);
               block();
               setState(1690);
               _la = _input.LA(1);
               if (_la == T__64) {
                  {
                     setState(1689);
                     catches();
                  }
               }

               setState(1692);
               finally_();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1694);
               tryWithResourcesStatement();
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

   public static class CatchesContext extends ParserRuleContext {
      public List<CatchClauseContext> catchClause() {
         return getRuleContexts(CatchClauseContext.class);
      }

      public CatchClauseContext catchClause(int i) {
         return getRuleContext(CatchClauseContext.class, i);
      }

      public CatchesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_catches;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCatches(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCatches(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCatches(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CatchesContext catches() throws RecognitionException {
      CatchesContext _localctx = new CatchesContext(_ctx, getState());
      enterRule(_localctx, 324, RULE_catches);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1697);
            catchClause();
            setState(1701);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__64) {
               {
                  {
                     setState(1698);
                     catchClause();
                  }
               }
               setState(1703);
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

   public static class CatchClauseContext extends ParserRuleContext {
      public CatchFormalParameterContext catchFormalParameter() {
         return getRuleContext(CatchFormalParameterContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public CatchClauseContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_catchClause;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCatchClause(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCatchClause(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCatchClause(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CatchClauseContext catchClause() throws RecognitionException {
      CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
      enterRule(_localctx, 326, RULE_catchClause);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1704);
            match(T__64);
            setState(1705);
            match(T__39);
            setState(1706);
            catchFormalParameter();
            setState(1707);
            match(T__40);
            setState(1708);
            block();
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

   public static class CatchFormalParameterContext extends ParserRuleContext {
      public CatchTypeContext catchType() {
         return getRuleContext(CatchTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_catchFormalParameter;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCatchFormalParameter(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCatchFormalParameter(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCatchFormalParameter(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
      CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
      enterRule(_localctx, 328, RULE_catchFormalParameter);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1713);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(1710);
                     variableModifier();
                  }
               }
               setState(1715);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1716);
            catchType();
            setState(1717);
            variableDeclaratorId();
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

   public static class CatchTypeContext extends ParserRuleContext {
      public UnannClassTypeContext unannClassType() {
         return getRuleContext(UnannClassTypeContext.class, 0);
      }

      public List<ClassTypeContext> classType() {
         return getRuleContexts(ClassTypeContext.class);
      }

      public ClassTypeContext classType(int i) {
         return getRuleContext(ClassTypeContext.class, i);
      }

      public CatchTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_catchType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCatchType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCatchType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCatchType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CatchTypeContext catchType() throws RecognitionException {
      CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
      enterRule(_localctx, 330, RULE_catchType);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1719);
            unannClassType();
            setState(1724);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__65) {
               {
                  {
                     setState(1720);
                     match(T__65);
                     setState(1721);
                     classType();
                  }
               }
               setState(1726);
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

   public static class Finally_Context extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public Finally_Context(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_finally_;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFinally_(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFinally_(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFinally_(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final Finally_Context finally_() throws RecognitionException {
      Finally_Context _localctx = new Finally_Context(_ctx, getState());
      enterRule(_localctx, 332, RULE_finally_);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1727);
            match(T__66);
            setState(1728);
            block();
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

   public static class TryWithResourcesStatementContext extends ParserRuleContext {
      public ResourceSpecificationContext resourceSpecification() {
         return getRuleContext(ResourceSpecificationContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public CatchesContext catches() {
         return getRuleContext(CatchesContext.class, 0);
      }

      public Finally_Context finally_() {
         return getRuleContext(Finally_Context.class, 0);
      }

      public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tryWithResourcesStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTryWithResourcesStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTryWithResourcesStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTryWithResourcesStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
      TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
      enterRule(_localctx, 334, RULE_tryWithResourcesStatement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1730);
            match(T__63);
            setState(1731);
            resourceSpecification();
            setState(1732);
            block();
            setState(1734);
            _la = _input.LA(1);
            if (_la == T__64) {
               {
                  setState(1733);
                  catches();
               }
            }

            setState(1737);
            _la = _input.LA(1);
            if (_la == T__66) {
               {
                  setState(1736);
                  finally_();
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

   public static class ResourceSpecificationContext extends ParserRuleContext {
      public ResourceListContext resourceList() {
         return getRuleContext(ResourceListContext.class, 0);
      }

      public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_resourceSpecification;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterResourceSpecification(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitResourceSpecification(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitResourceSpecification(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
      ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
      enterRule(_localctx, 336, RULE_resourceSpecification);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1739);
            match(T__39);
            setState(1740);
            resourceList();
            setState(1742);
            _la = _input.LA(1);
            if (_la == T__19) {
               {
                  setState(1741);
                  match(T__19);
               }
            }

            setState(1744);
            match(T__40);
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

   public static class ResourceListContext extends ParserRuleContext {
      public List<ResourceContext> resource() {
         return getRuleContexts(ResourceContext.class);
      }

      public ResourceContext resource(int i) {
         return getRuleContext(ResourceContext.class, i);
      }

      public ResourceListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_resourceList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterResourceList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitResourceList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitResourceList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ResourceListContext resourceList() throws RecognitionException {
      ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
      enterRule(_localctx, 338, RULE_resourceList);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1746);
            resource();
            setState(1751);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 185, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1747);
                        match(T__19);
                        setState(1748);
                        resource();
                     }
                  }
               }
               setState(1753);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 185, _ctx);
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

   public static class ResourceContext extends ParserRuleContext {
      public UnannTypeContext unannType() {
         return getRuleContext(UnannTypeContext.class, 0);
      }

      public VariableDeclaratorIdContext variableDeclaratorId() {
         return getRuleContext(VariableDeclaratorIdContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public List<VariableModifierContext> variableModifier() {
         return getRuleContexts(VariableModifierContext.class);
      }

      public VariableModifierContext variableModifier(int i) {
         return getRuleContext(VariableModifierContext.class, i);
      }

      public ResourceContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_resource;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterResource(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitResource(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitResource(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ResourceContext resource() throws RecognitionException {
      ResourceContext _localctx = new ResourceContext(_ctx, getState());
      enterRule(_localctx, 340, RULE_resource);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1757);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28 || _la == T__47) {
               {
                  {
                     setState(1754);
                     variableModifier();
                  }
               }
               setState(1759);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1760);
            unannType();
            setState(1761);
            variableDeclaratorId();
            setState(1762);
            match(T__35);
            setState(1763);
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

   public static class PrimaryContext extends ParserRuleContext {
      public PrimaryPrefixExpressionContext primaryPrefixExpression() {
         return getRuleContext(PrimaryPrefixExpressionContext.class, 0);
      }

      public List<PrimarySuffixExpressionContext> primarySuffixExpression() {
         return getRuleContexts(PrimarySuffixExpressionContext.class);
      }

      public PrimarySuffixExpressionContext primarySuffixExpression(int i) {
         return getRuleContext(PrimarySuffixExpressionContext.class, i);
      }

      public PrimaryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primary;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimary(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimary(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimary(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimaryContext primary() throws RecognitionException {
      PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
      enterRule(_localctx, 342, RULE_primary);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1765);
            primaryPrefixExpression();
            setState(1769);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 187, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1766);
                        primarySuffixExpression();
                     }
                  }
               }
               setState(1771);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 187, _ctx);
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

   public static class PrimaryNoNewArrayContext extends ParserRuleContext {
      public PrimaryPrefixExpressionNoNewArrayContext primaryPrefixExpressionNoNewArray() {
         return getRuleContext(PrimaryPrefixExpressionNoNewArrayContext.class, 0);
      }

      public List<PrimarySuffixExpressionNoNewArrayContext> primarySuffixExpressionNoNewArray() {
         return getRuleContexts(PrimarySuffixExpressionNoNewArrayContext.class);
      }

      public PrimarySuffixExpressionNoNewArrayContext primarySuffixExpressionNoNewArray(int i) {
         return getRuleContext(PrimarySuffixExpressionNoNewArrayContext.class, i);
      }

      public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primaryNoNewArray;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimaryNoNewArray(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimaryNoNewArray(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimaryNoNewArray(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
      PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
      enterRule(_localctx, 344, RULE_primaryNoNewArray);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1772);
            primaryPrefixExpressionNoNewArray();
            setState(1776);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 188, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1773);
                        primarySuffixExpressionNoNewArray();
                     }
                  }
               }
               setState(1778);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 188, _ctx);
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

   public static class PrimarySuffixExpressionContext extends ParserRuleContext {
      public ObjectCreationExpressionContext objectCreationExpression() {
         return getRuleContext(ObjectCreationExpressionContext.class, 0);
      }

      public MethodCallExpressionWithTypeArgsContext methodCallExpressionWithTypeArgs() {
         return getRuleContext(MethodCallExpressionWithTypeArgsContext.class, 0);
      }

      public FieldAccessExpressionContext fieldAccessExpression() {
         return getRuleContext(FieldAccessExpressionContext.class, 0);
      }

      public MethodReferenceExpressionContext methodReferenceExpression() {
         return getRuleContext(MethodReferenceExpressionContext.class, 0);
      }

      public PrimarySuffixExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primarySuffixExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimarySuffixExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimarySuffixExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimarySuffixExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimarySuffixExpressionContext primarySuffixExpression() throws RecognitionException {
      PrimarySuffixExpressionContext _localctx = new PrimarySuffixExpressionContext(_ctx, getState());
      enterRule(_localctx, 346, RULE_primarySuffixExpression);
      try {
         setState(1784);
         switch (getInterpreter().adaptivePredict(_input, 189, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1779);
               match(T__0);
               setState(1780);
               objectCreationExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1781);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1782);
               fieldAccessExpression();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1783);
               methodReferenceExpression();
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

   public static class PrimarySuffixExpressionNoNewArrayContext extends ParserRuleContext {
      public PrimarySuffixExpressionContext primarySuffixExpression() {
         return getRuleContext(PrimarySuffixExpressionContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public PrimarySuffixExpressionNoNewArrayContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primarySuffixExpressionNoNewArray;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimarySuffixExpressionNoNewArray(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimarySuffixExpressionNoNewArray(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimarySuffixExpressionNoNewArray(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimarySuffixExpressionNoNewArrayContext primarySuffixExpressionNoNewArray()
      throws RecognitionException {
      PrimarySuffixExpressionNoNewArrayContext _localctx = new PrimarySuffixExpressionNoNewArrayContext(_ctx,
         getState());
      enterRule(_localctx, 348, RULE_primarySuffixExpressionNoNewArray);
      try {
         setState(1791);
         switch (_input.LA(1)) {
            case T__0 :
            case T__68 :
               enterOuterAlt(_localctx, 1); {
               setState(1786);
               primarySuffixExpression();
            }
               break;
            case T__9 :
               enterOuterAlt(_localctx, 2); {
               setState(1787);
               match(T__9);
               setState(1788);
               expression();
               setState(1789);
               match(T__10);
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

   public static class PrimaryPrefixExpressionContext extends ParserRuleContext {
      public PrimaryPrefixExpressionNoNewArrayContext primaryPrefixExpressionNoNewArray() {
         return getRuleContext(PrimaryPrefixExpressionNoNewArrayContext.class, 0);
      }

      public ArrayCreationExpressionContext arrayCreationExpression() {
         return getRuleContext(ArrayCreationExpressionContext.class, 0);
      }

      public PrimaryPrefixExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primaryPrefixExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimaryPrefixExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimaryPrefixExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimaryPrefixExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimaryPrefixExpressionContext primaryPrefixExpression() throws RecognitionException {
      PrimaryPrefixExpressionContext _localctx = new PrimaryPrefixExpressionContext(_ctx, getState());
      enterRule(_localctx, 350, RULE_primaryPrefixExpression);
      try {
         setState(1795);
         switch (getInterpreter().adaptivePredict(_input, 191, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1793);
               primaryPrefixExpressionNoNewArray();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1794);
               arrayCreationExpression();
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

   public static class PrimaryPrefixExpressionNoNewArrayContext extends ParserRuleContext {
      public LiteralContext literal() {
         return getRuleContext(LiteralContext.class, 0);
      }

      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ObjectCreationExpressionContext objectCreationExpression() {
         return getRuleContext(ObjectCreationExpressionContext.class, 0);
      }

      public MethodCallExpressionWithTypeArgsContext methodCallExpressionWithTypeArgs() {
         return getRuleContext(MethodCallExpressionWithTypeArgsContext.class, 0);
      }

      public FieldAccessExpressionContext fieldAccessExpression() {
         return getRuleContext(FieldAccessExpressionContext.class, 0);
      }

      public MethodReferenceExpressionContext methodReferenceExpression() {
         return getRuleContext(MethodReferenceExpressionContext.class, 0);
      }

      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public MethodCallExpressionContext methodCallExpression() {
         return getRuleContext(MethodCallExpressionContext.class, 0);
      }

      public ReferenceTypeContext referenceType() {
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public ClassTypeContext classType() {
         return getRuleContext(ClassTypeContext.class, 0);
      }

      public ConstructorReferenceExpressionWithTypeArgsContext constructorReferenceExpressionWithTypeArgs() {
         return getRuleContext(ConstructorReferenceExpressionWithTypeArgsContext.class, 0);
      }

      public ArrayTypeContext arrayType() {
         return getRuleContext(ArrayTypeContext.class, 0);
      }

      public ConstructorReferenceExpressionNoTypeArgsContext constructorReferenceExpressionNoTypeArgs() {
         return getRuleContext(ConstructorReferenceExpressionNoTypeArgsContext.class, 0);
      }

      public PrimaryPrefixExpressionNoNewArrayContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_primaryPrefixExpressionNoNewArray;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPrimaryPrefixExpressionNoNewArray(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPrimaryPrefixExpressionNoNewArray(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPrimaryPrefixExpressionNoNewArray(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrimaryPrefixExpressionNoNewArrayContext primaryPrefixExpressionNoNewArray()
      throws RecognitionException {
      PrimaryPrefixExpressionNoNewArrayContext _localctx = new PrimaryPrefixExpressionNoNewArrayContext(_ctx,
         getState());
      enterRule(_localctx, 352, RULE_primaryPrefixExpressionNoNewArray);
      int _la;
      try {
         setState(1858);
         switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1797);
               literal();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1798);
               typeName();
               setState(1801);
               _la = _input.LA(1);
               if (_la == T__9) {
                  {
                     setState(1799);
                     match(T__9);
                     setState(1800);
                     match(T__10);
                  }
               }

               setState(1803);
               match(T__0);
               setState(1804);
               match(T__23);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1806);
               match(T__38);
               setState(1807);
               match(T__0);
               setState(1808);
               match(T__23);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1809);
               match(T__42);
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(1810);
               typeName();
               setState(1811);
               match(T__0);
               setState(1812);
               match(T__42);
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(1814);
               match(T__39);
               setState(1815);
               expression();
               setState(1816);
               match(T__40);
            }
               break;
            case 7 :
               enterOuterAlt(_localctx, 7); {
               setState(1818);
               objectCreationExpression();
            }
               break;
            case 8 :
               enterOuterAlt(_localctx, 8); {
               setState(1819);
               typeName();
               setState(1820);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 9 :
               enterOuterAlt(_localctx, 9); {
               setState(1822);
               match(T__17);
               setState(1826);
               switch (getInterpreter().adaptivePredict(_input, 193, _ctx)) {
                  case 1 : {
                     setState(1823);
                     fieldAccessExpression();
                  }
                     break;
                  case 2 : {
                     setState(1824);
                     methodCallExpressionWithTypeArgs();
                  }
                     break;
                  case 3 : {
                     setState(1825);
                     methodReferenceExpression();
                  }
                     break;
               }
            }
               break;
            case 10 :
               enterOuterAlt(_localctx, 10); {
               setState(1828);
               typeName();
               setState(1829);
               match(T__0);
               setState(1830);
               match(T__17);
               setState(1834);
               switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
                  case 1 : {
                     setState(1831);
                     fieldAccessExpression();
                  }
                     break;
                  case 2 : {
                     setState(1832);
                     methodCallExpressionWithTypeArgs();
                  }
                     break;
                  case 3 : {
                     setState(1833);
                     methodReferenceExpression();
                  }
                     break;
               }
            }
               break;
            case 11 :
               enterOuterAlt(_localctx, 11); {
               setState(1836);
               expressionName();
               setState(1846);
               switch (getInterpreter().adaptivePredict(_input, 195, _ctx)) {
                  case 1 : {
                     setState(1837);
                     match(T__0);
                     setState(1838);
                     objectCreationExpression();
                  }
                     break;
                  case 2 : {
                     setState(1839);
                     match(T__9);
                     setState(1840);
                     expression();
                     setState(1841);
                     match(T__10);
                  }
                     break;
                  case 3 : {
                     setState(1843);
                     methodCallExpressionWithTypeArgs();
                  }
                     break;
                  case 4 : {
                     setState(1844);
                     fieldAccessExpression();
                  }
                     break;
                  case 5 : {
                     setState(1845);
                     methodReferenceExpression();
                  }
                     break;
               }
            }
               break;
            case 12 :
               enterOuterAlt(_localctx, 12); {
               setState(1848);
               methodCallExpression();
            }
               break;
            case 13 :
               enterOuterAlt(_localctx, 13); {
               setState(1849);
               referenceType();
               setState(1850);
               methodReferenceExpression();
            }
               break;
            case 14 :
               enterOuterAlt(_localctx, 14); {
               setState(1852);
               classType();
               setState(1853);
               constructorReferenceExpressionWithTypeArgs();
            }
               break;
            case 15 :
               enterOuterAlt(_localctx, 15); {
               setState(1855);
               arrayType();
               setState(1856);
               constructorReferenceExpressionNoTypeArgs();
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

   public static class ObjectCreationExpressionContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
      }

      public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
         return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
      }

      public ArgumentListContext argumentList() {
         return getRuleContext(ArgumentListContext.class, 0);
      }

      public ClassBodyContext classBody() {
         return getRuleContext(ClassBodyContext.class, 0);
      }

      public ObjectCreationExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_objectCreationExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterObjectCreationExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitObjectCreationExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitObjectCreationExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ObjectCreationExpressionContext objectCreationExpression() throws RecognitionException {
      ObjectCreationExpressionContext _localctx = new ObjectCreationExpressionContext(_ctx, getState());
      enterRule(_localctx, 354, RULE_objectCreationExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1860);
            match(T__67);
            setState(1862);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1861);
                  typeArguments();
               }
            }

            setState(1867);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(1864);
                     annotation();
                  }
               }
               setState(1869);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1870);
            match(Identifier);
            setState(1872);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1871);
                  typeArgumentsOrDiamond();
               }
            }

            setState(1874);
            match(T__39);
            setState(1876);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1875);
                  argumentList();
               }
            }

            setState(1878);
            match(T__40);
            setState(1880);
            switch (getInterpreter().adaptivePredict(_input, 201, _ctx)) {
               case 1 : {
                  setState(1879);
                  classBody();
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

   public static class FieldAccessExpressionContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public FieldAccessExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldAccessExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFieldAccessExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFieldAccessExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFieldAccessExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldAccessExpressionContext fieldAccessExpression() throws RecognitionException {
      FieldAccessExpressionContext _localctx = new FieldAccessExpressionContext(_ctx, getState());
      enterRule(_localctx, 356, RULE_fieldAccessExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1882);
            match(T__0);
            setState(1883);
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

   public static class MethodCallExpressionWithTypeArgsContext extends ParserRuleContext {
      public MethodCallExpressionContext methodCallExpression() {
         return getRuleContext(MethodCallExpressionContext.class, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public MethodCallExpressionWithTypeArgsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodCallExpressionWithTypeArgs;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodCallExpressionWithTypeArgs(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodCallExpressionWithTypeArgs(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodCallExpressionWithTypeArgs(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodCallExpressionWithTypeArgsContext methodCallExpressionWithTypeArgs() throws RecognitionException {
      MethodCallExpressionWithTypeArgsContext _localctx = new MethodCallExpressionWithTypeArgsContext(_ctx, getState());
      enterRule(_localctx, 358, RULE_methodCallExpressionWithTypeArgs);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1885);
            match(T__0);
            setState(1887);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1886);
                  typeArguments();
               }
            }

            setState(1889);
            methodCallExpression();
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

   public static class MethodCallExpressionContext extends ParserRuleContext {
      public MethodNameContext methodName() {
         return getRuleContext(MethodNameContext.class, 0);
      }

      public ArgumentListContext argumentList() {
         return getRuleContext(ArgumentListContext.class, 0);
      }

      public MethodCallExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodCallExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodCallExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodCallExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodCallExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodCallExpressionContext methodCallExpression() throws RecognitionException {
      MethodCallExpressionContext _localctx = new MethodCallExpressionContext(_ctx, getState());
      enterRule(_localctx, 360, RULE_methodCallExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1891);
            methodName();
            setState(1892);
            match(T__39);
            setState(1894);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
               | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__38)
               | (1L << T__39) | (1L << T__42) | (1L << T__47) | (1L << T__49) | (1L << T__50))) != 0)
               || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__92 - 68))
                  | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__98 - 68))
                  | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68))
                  | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (NullLiteral - 68))
                  | (1L << (Identifier - 68)))) != 0)) {
               {
                  setState(1893);
                  argumentList();
               }
            }

            setState(1896);
            match(T__40);
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

   public static class MethodReferenceExpressionContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public MethodReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodReferenceExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodReferenceExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodReferenceExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodReferenceExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodReferenceExpressionContext methodReferenceExpression() throws RecognitionException {
      MethodReferenceExpressionContext _localctx = new MethodReferenceExpressionContext(_ctx, getState());
      enterRule(_localctx, 362, RULE_methodReferenceExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1898);
            match(T__68);
            setState(1900);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1899);
                  typeArguments();
               }
            }

            setState(1902);
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

   public static class ConstructorReferenceExpressionWithTypeArgsContext extends ParserRuleContext {
      public TypeArgumentsContext typeArguments() {
         return getRuleContext(TypeArgumentsContext.class, 0);
      }

      public ConstructorReferenceExpressionWithTypeArgsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorReferenceExpressionWithTypeArgs;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorReferenceExpressionWithTypeArgs(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorReferenceExpressionWithTypeArgs(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorReferenceExpressionWithTypeArgs(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorReferenceExpressionWithTypeArgsContext constructorReferenceExpressionWithTypeArgs()
      throws RecognitionException {
      ConstructorReferenceExpressionWithTypeArgsContext _localctx = new ConstructorReferenceExpressionWithTypeArgsContext(
         _ctx, getState());
      enterRule(_localctx, 364, RULE_constructorReferenceExpressionWithTypeArgs);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1904);
            match(T__68);
            setState(1906);
            _la = _input.LA(1);
            if (_la == T__13) {
               {
                  setState(1905);
                  typeArguments();
               }
            }

            setState(1908);
            match(T__67);
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

   public static class ConstructorReferenceExpressionNoTypeArgsContext extends ParserRuleContext {
      public ConstructorReferenceExpressionNoTypeArgsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_constructorReferenceExpressionNoTypeArgs;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstructorReferenceExpressionNoTypeArgs(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstructorReferenceExpressionNoTypeArgs(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstructorReferenceExpressionNoTypeArgs(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstructorReferenceExpressionNoTypeArgsContext constructorReferenceExpressionNoTypeArgs()
      throws RecognitionException {
      ConstructorReferenceExpressionNoTypeArgsContext _localctx = new ConstructorReferenceExpressionNoTypeArgsContext(
         _ctx, getState());
      enterRule(_localctx, 366, RULE_constructorReferenceExpressionNoTypeArgs);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1910);
            match(T__68);
            setState(1911);
            match(T__67);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterTypeArgumentsOrDiamond(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitTypeArgumentsOrDiamond(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitTypeArgumentsOrDiamond(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
      TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
      enterRule(_localctx, 368, RULE_typeArgumentsOrDiamond);
      try {
         setState(1916);
         switch (getInterpreter().adaptivePredict(_input, 206, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1913);
               typeArguments();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1914);
               match(T__13);
               setState(1915);
               match(T__14);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterArgumentList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitArgumentList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitArgumentList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArgumentListContext argumentList() throws RecognitionException {
      ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
      enterRule(_localctx, 370, RULE_argumentList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1918);
            expression();
            setState(1923);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(1919);
                     match(T__15);
                     setState(1920);
                     expression();
                  }
               }
               setState(1925);
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

   public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
      public ObjectCreationExpressionContext objectCreationExpression() {
         return getRuleContext(ObjectCreationExpressionContext.class, 0);
      }

      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classInstanceCreationExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterClassInstanceCreationExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitClassInstanceCreationExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitClassInstanceCreationExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
      ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
      enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
      try {
         setState(1935);
         switch (getInterpreter().adaptivePredict(_input, 208, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1926);
               objectCreationExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1927);
               expressionName();
               setState(1928);
               match(T__0);
               setState(1929);
               objectCreationExpression();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1931);
               primary();
               setState(1932);
               match(T__0);
               setState(1933);
               objectCreationExpression();
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

   public static class ArrayCreationExpressionContext extends ParserRuleContext {
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

      public ArrayInitializerContext arrayInitializer() {
         return getRuleContext(ArrayInitializerContext.class, 0);
      }

      public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_arrayCreationExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterArrayCreationExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitArrayCreationExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitArrayCreationExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
      ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
      enterRule(_localctx, 374, RULE_arrayCreationExpression);
      try {
         setState(1959);
         switch (getInterpreter().adaptivePredict(_input, 211, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1937);
               match(T__67);
               setState(1938);
               primitiveType();
               setState(1939);
               dimExprs();
               setState(1941);
               switch (getInterpreter().adaptivePredict(_input, 209, _ctx)) {
                  case 1 : {
                     setState(1940);
                     dims();
                  }
                     break;
               }
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1943);
               match(T__67);
               setState(1944);
               classOrInterfaceType();
               setState(1945);
               dimExprs();
               setState(1947);
               switch (getInterpreter().adaptivePredict(_input, 210, _ctx)) {
                  case 1 : {
                     setState(1946);
                     dims();
                  }
                     break;
               }
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1949);
               match(T__67);
               setState(1950);
               primitiveType();
               setState(1951);
               dims();
               setState(1952);
               arrayInitializer();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(1954);
               match(T__67);
               setState(1955);
               classOrInterfaceType();
               setState(1956);
               dims();
               setState(1957);
               arrayInitializer();
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterDimExprs(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitDimExprs(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitDimExprs(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimExprsContext dimExprs() throws RecognitionException {
      DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
      enterRule(_localctx, 376, RULE_dimExprs);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(1961);
            dimExpr();
            setState(1965);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 212, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(1962);
                        dimExpr();
                     }
                  }
               }
               setState(1967);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 212, _ctx);
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

      public List<AnnotationContext> annotation() {
         return getRuleContexts(AnnotationContext.class);
      }

      public AnnotationContext annotation(int i) {
         return getRuleContext(AnnotationContext.class, i);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterDimExpr(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitDimExpr(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitDimExpr(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DimExprContext dimExpr() throws RecognitionException {
      DimExprContext _localctx = new DimExprContext(_ctx, getState());
      enterRule(_localctx, 378, RULE_dimExpr);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1971);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__47) {
               {
                  {
                     setState(1968);
                     annotation();
                  }
               }
               setState(1973);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(1974);
            match(T__9);
            setState(1975);
            expression();
            setState(1976);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConstantExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConstantExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConstantExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConstantExpressionContext constantExpression() throws RecognitionException {
      ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
      enterRule(_localctx, 380, RULE_constantExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1978);
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
      public LambdaExpressionContext lambdaExpression() {
         return getRuleContext(LambdaExpressionContext.class, 0);
      }

      public AssignmentExpressionContext assignmentExpression() {
         return getRuleContext(AssignmentExpressionContext.class, 0);
      }

      public ExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionContext expression() throws RecognitionException {
      ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
      enterRule(_localctx, 382, RULE_expression);
      try {
         setState(1982);
         switch (getInterpreter().adaptivePredict(_input, 214, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1980);
               lambdaExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1981);
               assignmentExpression();
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

   public static class LambdaExpressionContext extends ParserRuleContext {
      public LambdaParametersContext lambdaParameters() {
         return getRuleContext(LambdaParametersContext.class, 0);
      }

      public LambdaBodyContext lambdaBody() {
         return getRuleContext(LambdaBodyContext.class, 0);
      }

      public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lambdaExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLambdaExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLambdaExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLambdaExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
      LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
      enterRule(_localctx, 384, RULE_lambdaExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(1984);
            lambdaParameters();
            setState(1985);
            match(T__69);
            setState(1986);
            lambdaBody();
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

   public static class LambdaParametersContext extends ParserRuleContext {
      public TerminalNode Identifier() {
         return getToken(BSharpParser.Identifier, 0);
      }

      public FormalParameterListContext formalParameterList() {
         return getRuleContext(FormalParameterListContext.class, 0);
      }

      public InferredFormalParameterListContext inferredFormalParameterList() {
         return getRuleContext(InferredFormalParameterListContext.class, 0);
      }

      public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lambdaParameters;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLambdaParameters(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLambdaParameters(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLambdaParameters(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LambdaParametersContext lambdaParameters() throws RecognitionException {
      LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
      enterRule(_localctx, 386, RULE_lambdaParameters);
      int _la;
      try {
         setState(1998);
         switch (getInterpreter().adaptivePredict(_input, 216, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(1988);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(1989);
               match(T__39);
               setState(1991);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4)
                  | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__28) | (1L << T__47))) != 0)
                  || _la == Identifier) {
                  {
                     setState(1990);
                     formalParameterList();
                  }
               }

               setState(1993);
               match(T__40);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(1994);
               match(T__39);
               setState(1995);
               inferredFormalParameterList();
               setState(1996);
               match(T__40);
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

   public static class InferredFormalParameterListContext extends ParserRuleContext {
      public List<TerminalNode> Identifier() {
         return getTokens(BSharpParser.Identifier);
      }

      public TerminalNode Identifier(int i) {
         return getToken(BSharpParser.Identifier, i);
      }

      public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_inferredFormalParameterList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInferredFormalParameterList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInferredFormalParameterList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInferredFormalParameterList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
      InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
      enterRule(_localctx, 388, RULE_inferredFormalParameterList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(2000);
            match(Identifier);
            setState(2005);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__15) {
               {
                  {
                     setState(2001);
                     match(T__15);
                     setState(2002);
                     match(Identifier);
                  }
               }
               setState(2007);
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

   public static class LambdaBodyContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lambdaBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLambdaBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLambdaBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLambdaBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LambdaBodyContext lambdaBody() throws RecognitionException {
      LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
      enterRule(_localctx, 390, RULE_lambdaBody);
      try {
         setState(2010);
         switch (_input.LA(1)) {
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case T__17 :
            case T__38 :
            case T__39 :
            case T__42 :
            case T__47 :
            case T__49 :
            case T__50 :
            case T__67 :
            case T__92 :
            case T__93 :
            case T__96 :
            case T__97 :
            case T__98 :
            case IntegerLiteral :
            case FloatingPointLiteral :
            case BooleanLiteral :
            case CharacterLiteral :
            case StringLiteral :
            case NullLiteral :
            case Identifier :
               enterOuterAlt(_localctx, 1); {
               setState(2008);
               expression();
            }
               break;
            case T__31 :
               enterOuterAlt(_localctx, 2); {
               setState(2009);
               block();
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

   public static class AssignmentExpressionContext extends ParserRuleContext {
      public ConditionalExpressionContext conditionalExpression() {
         return getRuleContext(ConditionalExpressionContext.class, 0);
      }

      public AssignmentContext assignment() {
         return getRuleContext(AssignmentContext.class, 0);
      }

      public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_assignmentExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAssignmentExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAssignmentExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAssignmentExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
      AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
      enterRule(_localctx, 392, RULE_assignmentExpression);
      try {
         setState(2014);
         switch (getInterpreter().adaptivePredict(_input, 219, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2012);
               conditionalExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2013);
               assignment();
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

   public static class AssignmentContext extends ParserRuleContext {
      public LeftHandSideContext leftHandSide() {
         return getRuleContext(LeftHandSideContext.class, 0);
      }

      public AssignmentOperatorContext assignmentOperator() {
         return getRuleContext(AssignmentOperatorContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public AssignmentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_assignment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAssignment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAssignment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAssignment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AssignmentContext assignment() throws RecognitionException {
      AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
      enterRule(_localctx, 394, RULE_assignment);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(2016);
            leftHandSide();
            setState(2017);
            assignmentOperator();
            setState(2018);
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

   public static class LeftHandSideContext extends ParserRuleContext {
      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public FieldAccessContext fieldAccess() {
         return getRuleContext(FieldAccessContext.class, 0);
      }

      public ArrayAccessContext arrayAccess() {
         return getRuleContext(ArrayAccessContext.class, 0);
      }

      public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_leftHandSide;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLeftHandSide(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLeftHandSide(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLeftHandSide(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LeftHandSideContext leftHandSide() throws RecognitionException {
      LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
      enterRule(_localctx, 396, RULE_leftHandSide);
      try {
         setState(2023);
         switch (getInterpreter().adaptivePredict(_input, 220, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2020);
               expressionName();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2021);
               fieldAccess();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(2022);
               arrayAccess();
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

   public static class AssignmentOperatorContext extends ParserRuleContext {
      public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_assignmentOperator;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAssignmentOperator(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAssignmentOperator(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAssignmentOperator(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
      AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
      enterRule(_localctx, 398, RULE_assignmentOperator);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(2025);
            _la = _input.LA(1);
            if (!(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__35 - 36)) | (1L << (T__70 - 36))
               | (1L << (T__71 - 36)) | (1L << (T__72 - 36)) | (1L << (T__73 - 36)) | (1L << (T__74 - 36))
               | (1L << (T__75 - 36)) | (1L << (T__76 - 36)) | (1L << (T__77 - 36)) | (1L << (T__78 - 36))
               | (1L << (T__79 - 36)) | (1L << (T__80 - 36)))) != 0))) {
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

   public static class ConditionalExpressionContext extends ParserRuleContext {
      public ConditionalOrExpressionContext conditionalOrExpression() {
         return getRuleContext(ConditionalOrExpressionContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public ConditionalExpressionContext conditionalExpression() {
         return getRuleContext(ConditionalExpressionContext.class, 0);
      }

      public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_conditionalExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConditionalExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConditionalExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConditionalExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
      ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
      enterRule(_localctx, 400, RULE_conditionalExpression);
      try {
         setState(2034);
         switch (getInterpreter().adaptivePredict(_input, 221, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2027);
               conditionalOrExpression(0);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2028);
               conditionalOrExpression(0);
               setState(2029);
               match(T__16);
               setState(2030);
               expression();
               setState(2031);
               match(T__48);
               setState(2032);
               conditionalExpression();
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

   public static class ConditionalOrExpressionContext extends ParserRuleContext {
      public ConditionalAndExpressionContext conditionalAndExpression() {
         return getRuleContext(ConditionalAndExpressionContext.class, 0);
      }

      public ConditionalOrExpressionContext conditionalOrExpression() {
         return getRuleContext(ConditionalOrExpressionContext.class, 0);
      }

      public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_conditionalOrExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConditionalOrExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConditionalOrExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConditionalOrExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
      return conditionalOrExpression(0);
   }

   private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
      ConditionalOrExpressionContext _prevctx = _localctx;
      int _startState = 402;
      enterRecursionRule(_localctx, 402, RULE_conditionalOrExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2037);
               conditionalAndExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2044);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 222, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
                        setState(2039);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(2040);
                        match(T__81);
                        setState(2041);
                        conditionalAndExpression(0);
                     }
                  }
               }
               setState(2046);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 222, _ctx);
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

   public static class ConditionalAndExpressionContext extends ParserRuleContext {
      public InclusiveOrExpressionContext inclusiveOrExpression() {
         return getRuleContext(InclusiveOrExpressionContext.class, 0);
      }

      public ConditionalAndExpressionContext conditionalAndExpression() {
         return getRuleContext(ConditionalAndExpressionContext.class, 0);
      }

      public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_conditionalAndExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterConditionalAndExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitConditionalAndExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitConditionalAndExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
      return conditionalAndExpression(0);
   }

   private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
      ConditionalAndExpressionContext _prevctx = _localctx;
      int _startState = 404;
      enterRecursionRule(_localctx, 404, RULE_conditionalAndExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2048);
               inclusiveOrExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2055);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 223, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
                        setState(2050);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(2051);
                        match(T__82);
                        setState(2052);
                        inclusiveOrExpression(0);
                     }
                  }
               }
               setState(2057);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 223, _ctx);
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

   public static class InclusiveOrExpressionContext extends ParserRuleContext {
      public ExclusiveOrExpressionContext exclusiveOrExpression() {
         return getRuleContext(ExclusiveOrExpressionContext.class, 0);
      }

      public InclusiveOrExpressionContext inclusiveOrExpression() {
         return getRuleContext(InclusiveOrExpressionContext.class, 0);
      }

      public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_inclusiveOrExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterInclusiveOrExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitInclusiveOrExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitInclusiveOrExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
      return inclusiveOrExpression(0);
   }

   private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
      InclusiveOrExpressionContext _prevctx = _localctx;
      int _startState = 406;
      enterRecursionRule(_localctx, 406, RULE_inclusiveOrExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2059);
               exclusiveOrExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2066);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 224, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
                        setState(2061);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(2062);
                        match(T__65);
                        setState(2063);
                        exclusiveOrExpression(0);
                     }
                  }
               }
               setState(2068);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 224, _ctx);
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

   public static class ExclusiveOrExpressionContext extends ParserRuleContext {
      public AndExpressionContext andExpression() {
         return getRuleContext(AndExpressionContext.class, 0);
      }

      public ExclusiveOrExpressionContext exclusiveOrExpression() {
         return getRuleContext(ExclusiveOrExpressionContext.class, 0);
      }

      public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exclusiveOrExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterExclusiveOrExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitExclusiveOrExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitExclusiveOrExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
      return exclusiveOrExpression(0);
   }

   private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
      ExclusiveOrExpressionContext _prevctx = _localctx;
      int _startState = 408;
      enterRecursionRule(_localctx, 408, RULE_exclusiveOrExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2070);
               andExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2077);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 225, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
                        setState(2072);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(2073);
                        match(T__83);
                        setState(2074);
                        andExpression(0);
                     }
                  }
               }
               setState(2079);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 225, _ctx);
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

   public static class AndExpressionContext extends ParserRuleContext {
      public EqualityExpressionContext equalityExpression() {
         return getRuleContext(EqualityExpressionContext.class, 0);
      }

      public AndExpressionContext andExpression() {
         return getRuleContext(AndExpressionContext.class, 0);
      }

      public AndExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_andExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAndExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAndExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAndExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AndExpressionContext andExpression() throws RecognitionException {
      return andExpression(0);
   }

   private AndExpressionContext andExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
      AndExpressionContext _prevctx = _localctx;
      int _startState = 410;
      enterRecursionRule(_localctx, 410, RULE_andExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2081);
               equalityExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2088);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 226, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     {
                        _localctx = new AndExpressionContext(_parentctx, _parentState);
                        pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
                        setState(2083);
                        if (!(precpred(_ctx, 1)))
                           throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                        setState(2084);
                        match(T__12);
                        setState(2085);
                        equalityExpression(0);
                     }
                  }
               }
               setState(2090);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 226, _ctx);
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

   public static class EqualityExpressionContext extends ParserRuleContext {
      public RelationalExpressionContext relationalExpression() {
         return getRuleContext(RelationalExpressionContext.class, 0);
      }

      public EqualityExpressionContext equalityExpression() {
         return getRuleContext(EqualityExpressionContext.class, 0);
      }

      public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_equalityExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterEqualityExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitEqualityExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitEqualityExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EqualityExpressionContext equalityExpression() throws RecognitionException {
      return equalityExpression(0);
   }

   private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
      EqualityExpressionContext _prevctx = _localctx;
      int _startState = 412;
      enterRecursionRule(_localctx, 412, RULE_equalityExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2092);
               relationalExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2102);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 228, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2100);
                     switch (getInterpreter().adaptivePredict(_input, 227, _ctx)) {
                        case 1 : {
                           _localctx = new EqualityExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
                           setState(2094);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2095);
                           match(T__84);
                           setState(2096);
                           relationalExpression(0);
                        }
                           break;
                        case 2 : {
                           _localctx = new EqualityExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
                           setState(2097);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2098);
                           match(T__85);
                           setState(2099);
                           relationalExpression(0);
                        }
                           break;
                     }
                  }
               }
               setState(2104);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 228, _ctx);
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

   public static class RelationalExpressionContext extends ParserRuleContext {
      public ShiftExpressionContext shiftExpression() {
         return getRuleContext(ShiftExpressionContext.class, 0);
      }

      public RelationalExpressionContext relationalExpression() {
         return getRuleContext(RelationalExpressionContext.class, 0);
      }

      public ReferenceTypeContext referenceType() {
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_relationalExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterRelationalExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitRelationalExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitRelationalExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RelationalExpressionContext relationalExpression() throws RecognitionException {
      return relationalExpression(0);
   }

   private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
      RelationalExpressionContext _prevctx = _localctx;
      int _startState = 414;
      enterRecursionRule(_localctx, 414, RULE_relationalExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2106);
               shiftExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2125);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 230, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2123);
                     switch (getInterpreter().adaptivePredict(_input, 229, _ctx)) {
                        case 1 : {
                           _localctx = new RelationalExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
                           setState(2108);
                           if (!(precpred(_ctx, 5)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                           setState(2109);
                           match(T__13);
                           setState(2110);
                           shiftExpression(0);
                        }
                           break;
                        case 2 : {
                           _localctx = new RelationalExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
                           setState(2111);
                           if (!(precpred(_ctx, 4)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                           setState(2112);
                           match(T__14);
                           setState(2113);
                           shiftExpression(0);
                        }
                           break;
                        case 3 : {
                           _localctx = new RelationalExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
                           setState(2114);
                           if (!(precpred(_ctx, 3)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                           setState(2115);
                           match(T__86);
                           setState(2116);
                           shiftExpression(0);
                        }
                           break;
                        case 4 : {
                           _localctx = new RelationalExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
                           setState(2117);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2118);
                           match(T__87);
                           setState(2119);
                           shiftExpression(0);
                        }
                           break;
                        case 5 : {
                           _localctx = new RelationalExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
                           setState(2120);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2121);
                           match(T__88);
                           setState(2122);
                           referenceType();
                        }
                           break;
                     }
                  }
               }
               setState(2127);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 230, _ctx);
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

   public static class ShiftExpressionContext extends ParserRuleContext {
      public AdditiveExpressionContext additiveExpression() {
         return getRuleContext(AdditiveExpressionContext.class, 0);
      }

      public ShiftExpressionContext shiftExpression() {
         return getRuleContext(ShiftExpressionContext.class, 0);
      }

      public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_shiftExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterShiftExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitShiftExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitShiftExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ShiftExpressionContext shiftExpression() throws RecognitionException {
      return shiftExpression(0);
   }

   private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
      ShiftExpressionContext _prevctx = _localctx;
      int _startState = 416;
      enterRecursionRule(_localctx, 416, RULE_shiftExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2129);
               additiveExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2142);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 232, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2140);
                     switch (getInterpreter().adaptivePredict(_input, 231, _ctx)) {
                        case 1 : {
                           _localctx = new ShiftExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
                           setState(2131);
                           if (!(precpred(_ctx, 3)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                           setState(2132);
                           match(T__89);
                           setState(2133);
                           additiveExpression(0);
                        }
                           break;
                        case 2 : {
                           _localctx = new ShiftExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
                           setState(2134);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2135);
                           match(T__90);
                           setState(2136);
                           additiveExpression(0);
                        }
                           break;
                        case 3 : {
                           _localctx = new ShiftExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
                           setState(2137);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2138);
                           match(T__91);
                           setState(2139);
                           additiveExpression(0);
                        }
                           break;
                     }
                  }
               }
               setState(2144);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 232, _ctx);
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

   public static class AdditiveExpressionContext extends ParserRuleContext {
      public MultiplicativeExpressionContext multiplicativeExpression() {
         return getRuleContext(MultiplicativeExpressionContext.class, 0);
      }

      public AdditiveExpressionContext additiveExpression() {
         return getRuleContext(AdditiveExpressionContext.class, 0);
      }

      public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_additiveExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterAdditiveExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitAdditiveExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitAdditiveExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
      return additiveExpression(0);
   }

   private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
      AdditiveExpressionContext _prevctx = _localctx;
      int _startState = 418;
      enterRecursionRule(_localctx, 418, RULE_additiveExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2146);
               multiplicativeExpression(0);
            }
            _ctx.stop = _input.LT(-1);
            setState(2156);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 234, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2154);
                     switch (getInterpreter().adaptivePredict(_input, 233, _ctx)) {
                        case 1 : {
                           _localctx = new AdditiveExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
                           setState(2148);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2149);
                           match(T__92);
                           setState(2150);
                           multiplicativeExpression(0);
                        }
                           break;
                        case 2 : {
                           _localctx = new AdditiveExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
                           setState(2151);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2152);
                           match(T__93);
                           setState(2153);
                           multiplicativeExpression(0);
                        }
                           break;
                     }
                  }
               }
               setState(2158);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 234, _ctx);
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

   public static class MultiplicativeExpressionContext extends ParserRuleContext {
      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public MultiplicativeExpressionContext multiplicativeExpression() {
         return getRuleContext(MultiplicativeExpressionContext.class, 0);
      }

      public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_multiplicativeExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMultiplicativeExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMultiplicativeExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMultiplicativeExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
      return multiplicativeExpression(0);
   }

   private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
      MultiplicativeExpressionContext _prevctx = _localctx;
      int _startState = 420;
      enterRecursionRule(_localctx, 420, RULE_multiplicativeExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            {
               setState(2160);
               unaryExpression();
            }
            _ctx.stop = _input.LT(-1);
            setState(2173);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 236, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2171);
                     switch (getInterpreter().adaptivePredict(_input, 235, _ctx)) {
                        case 1 : {
                           _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                           setState(2162);
                           if (!(precpred(_ctx, 3)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                           setState(2163);
                           match(T__21);
                           setState(2164);
                           unaryExpression();
                        }
                           break;
                        case 2 : {
                           _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                           setState(2165);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2166);
                           match(T__94);
                           setState(2167);
                           unaryExpression();
                        }
                           break;
                        case 3 : {
                           _localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
                           setState(2168);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2169);
                           match(T__95);
                           setState(2170);
                           unaryExpression();
                        }
                           break;
                     }
                  }
               }
               setState(2175);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 236, _ctx);
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

   public static class UnaryExpressionContext extends ParserRuleContext {
      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
         return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
      }

      public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unaryExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnaryExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnaryExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnaryExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnaryExpressionContext unaryExpression() throws RecognitionException {
      UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
      enterRule(_localctx, 422, RULE_unaryExpression);
      try {
         setState(2185);
         switch (_input.LA(1)) {
            case T__49 :
               enterOuterAlt(_localctx, 1); {
               setState(2176);
               match(T__49);
               setState(2177);
               unaryExpression();
            }
               break;
            case T__50 :
               enterOuterAlt(_localctx, 2); {
               setState(2178);
               match(T__50);
               setState(2179);
               unaryExpression();
            }
               break;
            case T__92 :
               enterOuterAlt(_localctx, 3); {
               setState(2180);
               match(T__92);
               setState(2181);
               unaryExpression();
            }
               break;
            case T__93 :
               enterOuterAlt(_localctx, 4); {
               setState(2182);
               match(T__93);
               setState(2183);
               unaryExpression();
            }
               break;
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case T__5 :
            case T__6 :
            case T__7 :
            case T__8 :
            case T__17 :
            case T__38 :
            case T__39 :
            case T__42 :
            case T__47 :
            case T__67 :
            case T__96 :
            case T__97 :
            case IntegerLiteral :
            case FloatingPointLiteral :
            case BooleanLiteral :
            case CharacterLiteral :
            case StringLiteral :
            case NullLiteral :
            case Identifier :
               enterOuterAlt(_localctx, 5); {
               setState(2184);
               unaryExpressionNotPlusMinus();
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

   public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
      public PostfixExpressionContext postfixExpression() {
         return getRuleContext(PostfixExpressionContext.class, 0);
      }

      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public CastExpressionContext castExpression() {
         return getRuleContext(CastExpressionContext.class, 0);
      }

      public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_unaryExpressionNotPlusMinus;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterUnaryExpressionNotPlusMinus(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitUnaryExpressionNotPlusMinus(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitUnaryExpressionNotPlusMinus(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
      UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
      enterRule(_localctx, 424, RULE_unaryExpressionNotPlusMinus);
      try {
         setState(2193);
         switch (getInterpreter().adaptivePredict(_input, 238, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2187);
               postfixExpression(0);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2188);
               match(T__96);
               setState(2189);
               unaryExpression();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(2190);
               match(T__97);
               setState(2191);
               unaryExpression();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(2192);
               castExpression();
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

   public static class PostfixExpressionContext extends ParserRuleContext {
      public PrimaryContext primary() {
         return getRuleContext(PrimaryContext.class, 0);
      }

      public ExpressionNameContext expressionName() {
         return getRuleContext(ExpressionNameContext.class, 0);
      }

      public PostfixExpressionContext postfixExpression() {
         return getRuleContext(PostfixExpressionContext.class, 0);
      }

      public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_postfixExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterPostfixExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitPostfixExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitPostfixExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PostfixExpressionContext postfixExpression() throws RecognitionException {
      return postfixExpression(0);
   }

   private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
      ParserRuleContext _parentctx = _ctx;
      int _parentState = getState();
      PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
      PostfixExpressionContext _prevctx = _localctx;
      int _startState = 426;
      enterRecursionRule(_localctx, 426, RULE_postfixExpression, _p);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(2198);
            switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
               case 1 : {
                  setState(2196);
                  primary();
               }
                  break;
               case 2 : {
                  setState(2197);
                  expressionName();
               }
                  break;
            }
            _ctx.stop = _input.LT(-1);
            setState(2206);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 241, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  if (_parseListeners != null)
                     triggerExitRuleEvent();
                  _prevctx = _localctx;
                  {
                     setState(2204);
                     switch (getInterpreter().adaptivePredict(_input, 240, _ctx)) {
                        case 1 : {
                           _localctx = new PostfixExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
                           setState(2200);
                           if (!(precpred(_ctx, 2)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                           setState(2201);
                           match(T__49);
                        }
                           break;
                        case 2 : {
                           _localctx = new PostfixExpressionContext(_parentctx, _parentState);
                           pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
                           setState(2202);
                           if (!(precpred(_ctx, 1)))
                              throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                           setState(2203);
                           match(T__50);
                        }
                           break;
                     }
                  }
               }
               setState(2208);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 241, _ctx);
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

   public static class CastExpressionContext extends ParserRuleContext {
      public PrimitiveTypeContext primitiveType() {
         return getRuleContext(PrimitiveTypeContext.class, 0);
      }

      public UnaryExpressionContext unaryExpression() {
         return getRuleContext(UnaryExpressionContext.class, 0);
      }

      public ReferenceTypeContext referenceType() {
         return getRuleContext(ReferenceTypeContext.class, 0);
      }

      public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
         return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
      }

      public List<AdditionalBoundContext> additionalBound() {
         return getRuleContexts(AdditionalBoundContext.class);
      }

      public AdditionalBoundContext additionalBound(int i) {
         return getRuleContext(AdditionalBoundContext.class, i);
      }

      public LambdaExpressionContext lambdaExpression() {
         return getRuleContext(LambdaExpressionContext.class, 0);
      }

      public CastExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_castExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterCastExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitCastExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitCastExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CastExpressionContext castExpression() throws RecognitionException {
      CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
      enterRule(_localctx, 428, RULE_castExpression);
      int _la;
      try {
         setState(2236);
         switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2209);
               match(T__39);
               setState(2210);
               primitiveType();
               setState(2211);
               match(T__40);
               setState(2212);
               unaryExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2214);
               match(T__39);
               setState(2215);
               referenceType();
               setState(2219);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__12) {
                  {
                     {
                        setState(2216);
                        additionalBound();
                     }
                  }
                  setState(2221);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(2222);
               match(T__40);
               setState(2223);
               unaryExpressionNotPlusMinus();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(2225);
               match(T__39);
               setState(2226);
               referenceType();
               setState(2230);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == T__12) {
                  {
                     {
                        setState(2227);
                        additionalBound();
                     }
                  }
                  setState(2232);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(2233);
               match(T__40);
               setState(2234);
               lambdaExpression();
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
         return getToken(BSharpParser.Identifier, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterFieldAccess(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitFieldAccess(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitFieldAccess(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldAccessContext fieldAccess() throws RecognitionException {
      FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
      enterRule(_localctx, 430, RULE_fieldAccess);
      try {
         setState(2250);
         switch (getInterpreter().adaptivePredict(_input, 245, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2238);
               primary();
               setState(2239);
               matchWildcard();
               setState(2240);
               match(Identifier);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2242);
               match(T__17);
               setState(2243);
               matchWildcard();
               setState(2244);
               match(Identifier);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(2245);
               match(T__98);
               setState(2246);
               match(T__0);
               setState(2247);
               match(T__17);
               setState(2248);
               match(T__0);
               setState(2249);
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

      public PrimaryNoNewArrayContext primaryNoNewArray() {
         return getRuleContext(PrimaryNoNewArrayContext.class, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterArrayAccess(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitArrayAccess(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitArrayAccess(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ArrayAccessContext arrayAccess() throws RecognitionException {
      ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
      enterRule(_localctx, 432, RULE_arrayAccess);
      try {
         setState(2262);
         switch (getInterpreter().adaptivePredict(_input, 246, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2252);
               expressionName();
               setState(2253);
               match(T__9);
               setState(2254);
               expression();
               setState(2255);
               match(T__10);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2257);
               primaryNoNewArray();
               setState(2258);
               match(T__9);
               setState(2259);
               expression();
               setState(2260);
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

   public static class MethodInvocationContext extends ParserRuleContext {
      public MethodCallExpressionContext methodCallExpression() {
         return getRuleContext(MethodCallExpressionContext.class, 0);
      }

      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public MethodCallExpressionWithTypeArgsContext methodCallExpressionWithTypeArgs() {
         return getRuleContext(MethodCallExpressionWithTypeArgsContext.class, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterMethodInvocation(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitMethodInvocation(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitMethodInvocation(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodInvocationContext methodInvocation() throws RecognitionException {
      MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
      enterRule(_localctx, 434, RULE_methodInvocation);
      try {
         setState(2281);
         switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(2264);
               methodCallExpression();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(2265);
               typeName();
               setState(2266);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(2268);
               expressionName();
               setState(2269);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(2271);
               primary();
               setState(2272);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(2274);
               match(T__17);
               setState(2275);
               methodCallExpressionWithTypeArgs();
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(2276);
               typeName();
               setState(2277);
               match(T__0);
               setState(2278);
               match(T__17);
               setState(2279);
               methodCallExpressionWithTypeArgs();
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

   public static class LiteralContext extends ParserRuleContext {
      public TerminalNode IntegerLiteral() {
         return getToken(BSharpParser.IntegerLiteral, 0);
      }

      public TerminalNode FloatingPointLiteral() {
         return getToken(BSharpParser.FloatingPointLiteral, 0);
      }

      public TerminalNode BooleanLiteral() {
         return getToken(BSharpParser.BooleanLiteral, 0);
      }

      public TerminalNode CharacterLiteral() {
         return getToken(BSharpParser.CharacterLiteral, 0);
      }

      public TerminalNode StringLiteral() {
         return getToken(BSharpParser.StringLiteral, 0);
      }

      public TerminalNode NullLiteral() {
         return getToken(BSharpParser.NullLiteral, 0);
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
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).enterLiteral(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof BSharpListener)
            ((BSharpListener) listener).exitLiteral(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof BSharpVisitor)
            return ((BSharpVisitor<? extends T>) visitor).visitLiteral(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LiteralContext literal() throws RecognitionException {
      LiteralContext _localctx = new LiteralContext(_ctx, getState());
      enterRule(_localctx, 436, RULE_literal);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(2283);
            _la = _input.LA(1);
            if (!(((((_la - 100)) & ~0x3f) == 0
               && ((1L << (_la - 100)) & ((1L << (IntegerLiteral - 100)) | (1L << (FloatingPointLiteral - 100))
                  | (1L << (BooleanLiteral - 100)) | (1L << (CharacterLiteral - 100)) | (1L << (StringLiteral - 100))
                  | (1L << (NullLiteral - 100)))) != 0))) {
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
            return packageName_sempred((PackageNameContext) _localctx, predIndex);
         case 201 :
            return conditionalOrExpression_sempred((ConditionalOrExpressionContext) _localctx, predIndex);
         case 202 :
            return conditionalAndExpression_sempred((ConditionalAndExpressionContext) _localctx, predIndex);
         case 203 :
            return inclusiveOrExpression_sempred((InclusiveOrExpressionContext) _localctx, predIndex);
         case 204 :
            return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext) _localctx, predIndex);
         case 205 :
            return andExpression_sempred((AndExpressionContext) _localctx, predIndex);
         case 206 :
            return equalityExpression_sempred((EqualityExpressionContext) _localctx, predIndex);
         case 207 :
            return relationalExpression_sempred((RelationalExpressionContext) _localctx, predIndex);
         case 208 :
            return shiftExpression_sempred((ShiftExpressionContext) _localctx, predIndex);
         case 209 :
            return additiveExpression_sempred((AdditiveExpressionContext) _localctx, predIndex);
         case 210 :
            return multiplicativeExpression_sempred((MultiplicativeExpressionContext) _localctx, predIndex);
         case 213 :
            return postfixExpression_sempred((PostfixExpressionContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 1 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 2 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 3 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 4 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 5 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 6 :
            return precpred(_ctx, 2);
         case 7 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 8 :
            return precpred(_ctx, 5);
         case 9 :
            return precpred(_ctx, 4);
         case 10 :
            return precpred(_ctx, 3);
         case 11 :
            return precpred(_ctx, 2);
         case 12 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 13 :
            return precpred(_ctx, 3);
         case 14 :
            return precpred(_ctx, 2);
         case 15 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 16 :
            return precpred(_ctx, 2);
         case 17 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 18 :
            return precpred(_ctx, 3);
         case 19 :
            return precpred(_ctx, 2);
         case 20 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
      switch (predIndex) {
         case 21 :
            return precpred(_ctx, 2);
         case 22 :
            return precpred(_ctx, 1);
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3o\u08f0\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
      + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
      + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
      + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
      + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
      + "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"
      + "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"
      + "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"
      + "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"
      + "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"
      + "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"
      + "\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"
      + "\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"
      + "\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"
      + "\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"
      + "\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"
      + "\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"
      + "\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"
      + "\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"
      + "\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"
      + "\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"
      + "\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"
      + "\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"
      + "\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"
      + "\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"
      + "\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"
      + "\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"
      + "\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"
      + "\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"
      + "\4\u00db\t\u00db\4\u00dc\t\u00dc\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u01bf\n\2"
      + "\f\2\16\2\u01c2\13\2\3\3\3\3\3\3\3\3\3\3\5\3\u01c9\n\3\3\4\3\4\3\4\7\4"
      + "\u01ce\n\4\f\4\16\4\u01d1\13\4\3\5\3\5\3\5\3\5\3\5\5\5\u01d8\n\5\3\6\3"
      + "\6\3\7\3\7\3\7\7\7\u01df\n\7\f\7\16\7\u01e2\13\7\3\b\3\b\5\b\u01e6\n\b"
      + "\3\t\7\t\u01e9\n\t\f\t\16\t\u01ec\13\t\3\t\3\t\7\t\u01f0\n\t\f\t\16\t"
      + "\u01f3\13\t\3\t\5\t\u01f6\n\t\3\n\3\n\5\n\u01fa\n\n\3\13\3\13\3\f\3\f"
      + "\3\r\3\r\3\r\5\r\u0203\n\r\3\16\3\16\5\16\u0207\n\16\3\17\7\17\u020a\n"
      + "\17\f\17\16\17\u020d\13\17\3\17\3\17\5\17\u0211\n\17\3\17\3\17\7\17\u0215"
      + "\n\17\f\17\16\17\u0218\13\17\3\17\3\17\5\17\u021c\n\17\7\17\u021e\n\17"
      + "\f\17\16\17\u0221\13\17\3\20\3\20\3\21\7\21\u0226\n\21\f\21\16\21\u0229"
      + "\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0236"
      + "\n\22\3\23\7\23\u0239\n\23\f\23\16\23\u023c\13\23\3\23\3\23\3\23\7\23"
      + "\u0241\n\23\f\23\16\23\u0244\13\23\3\23\3\23\7\23\u0248\n\23\f\23\16\23"
      + "\u024b\13\23\3\24\7\24\u024e\n\24\f\24\16\24\u0251\13\24\3\24\3\24\5\24"
      + "\u0255\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u025e\n\26\f\26\16"
      + "\26\u0261\13\26\5\26\u0263\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"
      + "\3\31\3\31\7\31\u026f\n\31\f\31\16\31\u0272\13\31\3\32\3\32\5\32\u0276"
      + "\n\32\3\33\7\33\u0279\n\33\f\33\16\33\u027c\13\33\3\33\3\33\5\33\u0280"
      + "\n\33\3\34\3\34\3\34\3\34\5\34\u0286\n\34\3\35\5\35\u0289\n\35\3\35\7"
      + "\35\u028c\n\35\f\35\16\35\u028f\13\35\3\35\7\35\u0292\n\35\f\35\16\35"
      + "\u0295\13\35\3\36\7\36\u0298\n\36\f\36\16\36\u029b\13\36\3\36\3\36\3\36"
      + "\3\36\7\36\u02a1\n\36\f\36\16\36\u02a4\13\36\3\36\3\36\3\37\3\37\3 \3"
      + " \3 \3 \5 \u02ae\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"
      + "#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\5%\u02cb\n%\3&\3&\5&\u02cf\n&\3"
      + "\'\7\'\u02d2\n\'\f\'\16\'\u02d5\13\'\3\'\3\'\3\'\5\'\u02da\n\'\3\'\5\'"
      + "\u02dd\n\'\3\'\5\'\u02e0\n\'\3\'\3\'\3(\3(\3(\3(\5(\u02e8\n(\3(\5(\u02eb"
      + "\n(\3)\3)\3)\3)\3*\3*\3*\7*\u02f4\n*\f*\16*\u02f7\13*\3+\3+\3+\3,\3,\3"
      + ",\3-\3-\3-\7-\u0302\n-\f-\16-\u0305\13-\3.\3.\7.\u0309\n.\f.\16.\u030c"
      + "\13.\3.\3.\3/\3/\3/\3/\5/\u0314\n/\3\60\3\60\3\60\3\60\3\60\5\60\u031b"
      + "\n\60\3\61\7\61\u031e\n\61\f\61\16\61\u0321\13\61\3\61\3\61\3\61\3\61"
      + "\3\62\3\62\3\62\3\62\5\62\u032b\n\62\3\62\5\62\u032e\n\62\3\63\3\63\3"
      + "\63\7\63\u0333\n\63\f\63\16\63\u0336\13\63\3\64\3\64\3\64\5\64\u033b\n"
      + "\64\3\65\3\65\5\65\u033f\n\65\3\66\3\66\5\66\u0343\n\66\3\67\3\67\5\67"
      + "\u0347\n\67\38\38\58\u034b\n8\39\39\39\59\u0350\n9\3:\3:\5:\u0354\n:\3"
      + ";\3;\5;\u0358\n;\3;\3;\7;\u035c\n;\f;\16;\u035f\13;\3;\3;\5;\u0363\n;"
      + "\7;\u0365\n;\f;\16;\u0368\13;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5"
      + ">\u0377\n>\3?\7?\u037a\n?\f?\16?\u037d\13?\3?\3?\3?\3@\3@\3@\3@\5@\u0386"
      + "\n@\3@\5@\u0389\n@\3A\3A\3A\5A\u038e\nA\3A\3A\7A\u0392\nA\fA\16A\u0395"
      + "\13A\3A\3A\3A\5A\u039a\nA\5A\u039c\nA\3B\3B\5B\u03a0\nB\3C\3C\3C\5C\u03a5"
      + "\nC\3C\3C\5C\u03a9\nC\3D\3D\3D\3D\3D\5D\u03b0\nD\3E\3E\3E\7E\u03b5\nE"
      + "\fE\16E\u03b8\13E\3E\3E\3E\7E\u03bd\nE\fE\16E\u03c0\13E\5E\u03c2\nE\3"
      + "F\7F\u03c5\nF\fF\16F\u03c8\13F\3F\3F\3F\3G\3G\5G\u03cf\nG\3H\7H\u03d2"
      + "\nH\fH\16H\u03d5\13H\3H\3H\7H\u03d9\nH\fH\16H\u03dc\13H\3H\3H\3H\3H\5"
      + "H\u03e2\nH\3I\7I\u03e5\nI\fI\16I\u03e8\13I\3I\3I\3I\5I\u03ed\nI\3I\3I"
      + "\3J\3J\3J\3K\3K\3K\7K\u03f7\nK\fK\16K\u03fa\13K\3L\3L\5L\u03fe\nL\3M\3"
      + "M\5M\u0402\nM\3N\3N\3O\3O\3O\3P\7P\u040a\nP\fP\16P\u040d\13P\3P\3P\5P"
      + "\u0411\nP\3P\3P\3Q\3Q\3Q\3Q\5Q\u0419\nQ\3R\5R\u041c\nR\3R\3R\3R\5R\u0421"
      + "\nR\3R\3R\3S\3S\3T\3T\5T\u0429\nT\3T\5T\u042c\nT\3T\3T\3U\5U\u0431\nU"
      + "\3U\3U\3U\5U\u0436\nU\3U\3U\3U\5U\u043b\nU\3U\3U\3U\5U\u0440\nU\3U\3U"
      + "\3U\3U\3U\5U\u0447\nU\3U\3U\3U\5U\u044c\nU\3U\3U\3U\3U\3U\3U\5U\u0454"
      + "\nU\3U\3U\3U\5U\u0459\nU\3U\3U\3U\5U\u045e\nU\3V\7V\u0461\nV\fV\16V\u0464"
      + "\13V\3V\3V\3V\5V\u0469\nV\3V\3V\3W\3W\5W\u046f\nW\3W\5W\u0472\nW\3W\5"
      + "W\u0475\nW\3W\3W\3X\3X\3X\5X\u047c\nX\3Y\7Y\u047f\nY\fY\16Y\u0482\13Y"
      + "\3Y\3Y\3Y\5Y\u0487\nY\3Y\5Y\u048a\nY\3Y\5Y\u048d\nY\3Z\3Z\3[\3[\7[\u0493"
      + "\n[\f[\16[\u0496\13[\3\\\3\\\5\\\u049a\n\\\3]\7]\u049d\n]\f]\16]\u04a0"
      + "\13]\3]\3]\3]\5]\u04a5\n]\3]\5]\u04a8\n]\3]\3]\3^\3^\3^\3^\5^\u04b0\n"
      + "^\3^\5^\u04b3\n^\3_\3_\3_\3`\3`\7`\u04ba\n`\f`\16`\u04bd\13`\3`\3`\3a"
      + "\3a\3a\3a\3a\5a\u04c6\na\3b\5b\u04c9\nb\3b\3b\3b\3b\3c\3c\5c\u04d1\nc"
      + "\3c\5c\u04d4\nc\3d\7d\u04d7\nd\fd\16d\u04da\13d\3d\3d\3d\3e\3e\5e\u04e1"
      + "\ne\3e\5e\u04e4\ne\3f\7f\u04e7\nf\ff\16f\u04ea\13f\3f\3f\3f\3f\3f\3g\3"
      + "g\7g\u04f3\ng\fg\16g\u04f6\13g\3g\3g\3h\3h\3h\3h\3h\5h\u04ff\nh\3i\7i"
      + "\u0502\ni\fi\16i\u0505\13i\3i\3i\3i\3i\3i\5i\u050c\ni\3i\5i\u050f\ni\3"
      + "i\3i\3j\3j\5j\u0515\nj\3j\5j\u0518\nj\3k\3k\3k\3l\3l\3l\5l\u0520\nl\3"
      + "m\3m\3m\3m\5m\u0526\nm\3m\3m\3n\3n\3n\7n\u052d\nn\fn\16n\u0530\13n\3o"
      + "\3o\3o\3o\3p\3p\3p\5p\u0539\np\3q\3q\5q\u053d\nq\3q\5q\u0540\nq\3q\3q"
      + "\3r\3r\3r\7r\u0547\nr\fr\16r\u054a\13r\3s\3s\3s\3t\3t\3t\3t\3t\3t\3u\3"
      + "u\5u\u0557\nu\3u\5u\u055a\nu\3u\3u\3v\3v\3v\7v\u0561\nv\fv\16v\u0564\13"
      + "v\3w\3w\5w\u0568\nw\3w\3w\3x\3x\7x\u056e\nx\fx\16x\u0571\13x\3y\3y\3y"
      + "\5y\u0576\ny\3z\3z\3z\3{\7{\u057c\n{\f{\16{\u057f\13{\3{\3{\3{\3|\3|\3"
      + "|\3|\3|\3|\5|\u058a\n|\3}\3}\3}\3}\3}\5}\u0591\n}\3~\3~\3~\3~\3~\3~\3"
      + "~\3~\3~\3~\3~\3~\5~\u059f\n~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080"
      + "\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"
      + "\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05b5\n\u0083\3\u0084"
      + "\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087"
      + "\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"
      + "\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a"
      + "\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"
      + "\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u05e3"
      + "\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"
      + "\7\u008d\u05ed\n\u008d\f\u008d\16\u008d\u05f0\13\u008d\3\u008d\7\u008d"
      + "\u05f3\n\u008d\f\u008d\16\u008d\u05f6\13\u008d\3\u008d\3\u008d\3\u008e"
      + "\3\u008e\3\u008e\3\u008f\3\u008f\7\u008f\u05ff\n\u008f\f\u008f\16\u008f"
      + "\u0602\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"
      + "\3\u0090\3\u0090\3\u0090\5\u0090\u060e\n\u0090\3\u0091\3\u0091\3\u0092"
      + "\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093"
      + "\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"
      + "\3\u0094\3\u0095\3\u0095\5\u0095\u0628\n\u0095\3\u0096\3\u0096\5\u0096"
      + "\u062c\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u0631\n\u0097\3\u0097\3"
      + "\u0097\5\u0097\u0635\n\u0097\3\u0097\3\u0097\5\u0097\u0639\n\u0097\3\u0097"
      + "\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u0641\n\u0098\3\u0098"
      + "\3\u0098\5\u0098\u0645\n\u0098\3\u0098\3\u0098\5\u0098\u0649\n\u0098\3"
      + "\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u0650\n\u0099\3\u009a\3"
      + "\u009a\3\u009b\3\u009b\3\u009b\7\u009b\u0657\n\u009b\f\u009b\16\u009b"
      + "\u065a\13\u009b\3\u009c\3\u009c\3\u009c\7\u009c\u065f\n\u009c\f\u009c"
      + "\16\u009c\u0662\13\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"
      + "\3\u009c\3\u009d\3\u009d\3\u009d\7\u009d\u066e\n\u009d\f\u009d\16\u009d"
      + "\u0671\13\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"
      + "\3\u009e\3\u009e\5\u009e\u067c\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f"
      + "\5\u009f\u0682\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u0688\n"
      + "\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"
      + "\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"
      + "\3\u00a3\3\u00a3\5\u00a3\u069d\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3"
      + "\u06a2\n\u00a3\3\u00a4\3\u00a4\7\u00a4\u06a6\n\u00a4\f\u00a4\16\u00a4"
      + "\u06a9\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6"
      + "\7\u00a6\u06b2\n\u00a6\f\u00a6\16\u00a6\u06b5\13\u00a6\3\u00a6\3\u00a6"
      + "\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u06bd\n\u00a7\f\u00a7\16\u00a7"
      + "\u06c0\13\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"
      + "\5\u00a9\u06c9\n\u00a9\3\u00a9\5\u00a9\u06cc\n\u00a9\3\u00aa\3\u00aa\3"
      + "\u00aa\5\u00aa\u06d1\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7"
      + "\u00ab\u06d8\n\u00ab\f\u00ab\16\u00ab\u06db\13\u00ab\3\u00ac\7\u00ac\u06de"
      + "\n\u00ac\f\u00ac\16\u00ac\u06e1\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"
      + "\3\u00ac\3\u00ad\3\u00ad\7\u00ad\u06ea\n\u00ad\f\u00ad\16\u00ad\u06ed"
      + "\13\u00ad\3\u00ae\3\u00ae\7\u00ae\u06f1\n\u00ae\f\u00ae\16\u00ae\u06f4"
      + "\13\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u06fb\n\u00af"
      + "\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0702\n\u00b0\3\u00b1"
      + "\3\u00b1\5\u00b1\u0706\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"
      + "\u070c\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"
      + "\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"
      + "\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0725"
      + "\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u072d"
      + "\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"
      + "\3\u00b2\3\u00b2\5\u00b2\u0739\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"
      + "\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0745\n\u00b2"
      + "\3\u00b3\3\u00b3\5\u00b3\u0749\n\u00b3\3\u00b3\7\u00b3\u074c\n\u00b3\f"
      + "\u00b3\16\u00b3\u074f\13\u00b3\3\u00b3\3\u00b3\5\u00b3\u0753\n\u00b3\3"
      + "\u00b3\3\u00b3\5\u00b3\u0757\n\u00b3\3\u00b3\3\u00b3\5\u00b3\u075b\n\u00b3"
      + "\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\5\u00b5\u0762\n\u00b5\3\u00b5"
      + "\3\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0769\n\u00b6\3\u00b6\3\u00b6"
      + "\3\u00b7\3\u00b7\5\u00b7\u076f\n\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8"
      + "\5\u00b8\u0775\n\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00ba"
      + "\3\u00ba\3\u00ba\5\u00ba\u077f\n\u00ba\3\u00bb\3\u00bb\3\u00bb\7\u00bb"
      + "\u0784\n\u00bb\f\u00bb\16\u00bb\u0787\13\u00bb\3\u00bc\3\u00bc\3\u00bc"
      + "\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0792\n\u00bc"
      + "\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0798\n\u00bd\3\u00bd\3\u00bd"
      + "\3\u00bd\3\u00bd\5\u00bd\u079e\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"
      + "\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u07aa\n\u00bd"
      + "\3\u00be\3\u00be\7\u00be\u07ae\n\u00be\f\u00be\16\u00be\u07b1\13\u00be"
      + "\3\u00bf\7\u00bf\u07b4\n\u00bf\f\u00bf\16\u00bf\u07b7\13\u00bf\3\u00bf"
      + "\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\5\u00c1\u07c1"
      + "\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\5\u00c3"
      + "\u07ca\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07d1\n"
      + "\u00c3\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u07d6\n\u00c4\f\u00c4\16\u00c4"
      + "\u07d9\13\u00c4\3\u00c5\3\u00c5\5\u00c5\u07dd\n\u00c5\3\u00c6\3\u00c6"
      + "\5\u00c6\u07e1\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8"
      + "\3\u00c8\5\u00c8\u07ea\n\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca"
      + "\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u07f5\n\u00ca\3\u00cb\3\u00cb"
      + "\3\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u07fd\n\u00cb\f\u00cb\16\u00cb"
      + "\u0800\13\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc"
      + "\u0808\n\u00cc\f\u00cc\16\u00cc\u080b\13\u00cc\3\u00cd\3\u00cd\3\u00cd"
      + "\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u0813\n\u00cd\f\u00cd\16\u00cd\u0816"
      + "\13\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u081e"
      + "\n\u00ce\f\u00ce\16\u00ce\u0821\13\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"
      + "\3\u00cf\3\u00cf\7\u00cf\u0829\n\u00cf\f\u00cf\16\u00cf\u082c\13\u00cf"
      + "\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"
      + "\7\u00d0\u0837\n\u00d0\f\u00d0\16\u00d0\u083a\13\u00d0\3\u00d1\3\u00d1"
      + "\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"
      + "\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u084e"
      + "\n\u00d1\f\u00d1\16\u00d1\u0851\13\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2"
      + "\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2"
      + "\u085f\n\u00d2\f\u00d2\16\u00d2\u0862\13\u00d2\3\u00d3\3\u00d3\3\u00d3"
      + "\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u086d\n\u00d3"
      + "\f\u00d3\16\u00d3\u0870\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"
      + "\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u087e"
      + "\n\u00d4\f\u00d4\16\u00d4\u0881\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5"
      + "\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u088c\n\u00d5\3\u00d6"
      + "\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0894\n\u00d6\3\u00d7"
      + "\3\u00d7\3\u00d7\5\u00d7\u0899\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"
      + "\7\u00d7\u089f\n\u00d7\f\u00d7\16\u00d7\u08a2\13\u00d7\3\u00d8\3\u00d8"
      + "\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u08ac\n\u00d8"
      + "\f\u00d8\16\u00d8\u08af\13\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"
      + "\3\u00d8\7\u00d8\u08b7\n\u00d8\f\u00d8\16\u00d8\u08ba\13\u00d8\3\u00d8"
      + "\3\u00d8\3\u00d8\5\u00d8\u08bf\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"
      + "\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"
      + "\u08cd\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"
      + "\3\u00da\3\u00da\3\u00da\5\u00da\u08d9\n\u00da\3\u00db\3\u00db\3\u00db"
      + "\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"
      + "\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u08ec\n\u00db\3\u00dc"
      + "\3\u00dc\3\u00dc\2\16\2\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"
      + "\u01a4\u01a6\u01ac\u00dd\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("
      + "*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"
      + "\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"
      + "\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"
      + "\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"
      + "\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"
      + "\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"
      + "\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"
      + "\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"
      + "\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"
      + "\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"
      + "\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"
      + "\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"
      + "\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"
      + "\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\2\f\3\2\5\t\3\2"
      + "\n\13\4\2\31\31\36 \5\2\31\31\37\37$%\5\2\31\31\36 \'(\5\2\31\31\36\36"
      + "  \4\2\31\31\37\37\6\2\31\31\36\36  \61\61\4\2&&IS\3\2fk\u096e\2\u01b8"
      + "\3\2\2\2\4\u01c8\3\2\2\2\6\u01ca\3\2\2\2\b\u01d7\3\2\2\2\n\u01d9\3\2\2"
      + "\2\f\u01db\3\2\2\2\16\u01e5\3\2\2\2\20\u01f5\3\2\2\2\22\u01f9\3\2\2\2"
      + "\24\u01fb\3\2\2\2\26\u01fd\3\2\2\2\30\u0202\3\2\2\2\32\u0206\3\2\2\2\34"
      + "\u020b\3\2\2\2\36\u0222\3\2\2\2 \u0227\3\2\2\2\"\u0235\3\2\2\2$\u023a"
      + "\3\2\2\2&\u024f\3\2\2\2(\u0256\3\2\2\2*\u0262\3\2\2\2,\u0264\3\2\2\2."
      + "\u0267\3\2\2\2\60\u026b\3\2\2\2\62\u0275\3\2\2\2\64\u027a\3\2\2\2\66\u0285"
      + "\3\2\2\28\u0288\3\2\2\2:\u0299\3\2\2\2<\u02a7\3\2\2\2>\u02ad\3\2\2\2@"
      + "\u02af\3\2\2\2B\u02b3\3\2\2\2D\u02b9\3\2\2\2F\u02c0\3\2\2\2H\u02ca\3\2"
      + "\2\2J\u02ce\3\2\2\2L\u02d3\3\2\2\2N\u02ea\3\2\2\2P\u02ec\3\2\2\2R\u02f0"
      + "\3\2\2\2T\u02f8\3\2\2\2V\u02fb\3\2\2\2X\u02fe\3\2\2\2Z\u0306\3\2\2\2\\"
      + "\u0313\3\2\2\2^\u031a\3\2\2\2`\u031f\3\2\2\2b\u032d\3\2\2\2d\u032f\3\2"
      + "\2\2f\u0337\3\2\2\2h\u033c\3\2\2\2j\u0342\3\2\2\2l\u0346\3\2\2\2n\u034a"
      + "\3\2\2\2p\u034f\3\2\2\2r\u0353\3\2\2\2t\u0355\3\2\2\2v\u0369\3\2\2\2x"
      + "\u036b\3\2\2\2z\u0376\3\2\2\2|\u037b\3\2\2\2~\u0388\3\2\2\2\u0080\u039b"
      + "\3\2\2\2\u0082\u039f\3\2\2\2\u0084\u03a1\3\2\2\2\u0086\u03af\3\2\2\2\u0088"
      + "\u03c1\3\2\2\2\u008a\u03c6\3\2\2\2\u008c\u03ce\3\2\2\2\u008e\u03e1\3\2"
      + "\2\2\u0090\u03e6\3\2\2\2\u0092\u03f0\3\2\2\2\u0094\u03f3\3\2\2\2\u0096"
      + "\u03fd\3\2\2\2\u0098\u0401\3\2\2\2\u009a\u0403\3\2\2\2\u009c\u0405\3\2"
      + "\2\2\u009e\u040b\3\2\2\2\u00a0\u0418\3\2\2\2\u00a2\u041b\3\2\2\2\u00a4"
      + "\u0424\3\2\2\2\u00a6\u0426\3\2\2\2\u00a8\u045d\3\2\2\2\u00aa\u0462\3\2"
      + "\2\2\u00ac\u046c\3\2\2\2\u00ae\u0478\3\2\2\2\u00b0\u0480\3\2\2\2\u00b2"
      + "\u048e\3\2\2\2\u00b4\u0490\3\2\2\2\u00b6\u0499\3\2\2\2\u00b8\u049e\3\2"
      + "\2\2\u00ba\u04b2\3\2\2\2\u00bc\u04b4\3\2\2\2\u00be\u04b7\3\2\2\2\u00c0"
      + "\u04c5\3\2\2\2\u00c2\u04c8\3\2\2\2\u00c4\u04d3\3\2\2\2\u00c6\u04d8\3\2"
      + "\2\2\u00c8\u04e3\3\2\2\2\u00ca\u04e8\3\2\2\2\u00cc\u04f0\3\2\2\2\u00ce"
      + "\u04fe\3\2\2\2\u00d0\u0503\3\2\2\2\u00d2\u0517\3\2\2\2\u00d4\u0519\3\2"
      + "\2\2\u00d6\u051f\3\2\2\2\u00d8\u0521\3\2\2\2\u00da\u0529\3\2\2\2\u00dc"
      + "\u0531\3\2\2\2\u00de\u0538\3\2\2\2\u00e0\u053a\3\2\2\2\u00e2\u0543\3\2"
      + "\2\2\u00e4\u054b\3\2\2\2\u00e6\u054e\3\2\2\2\u00e8\u0554\3\2\2\2\u00ea"
      + "\u055d\3\2\2\2\u00ec\u0565\3\2\2\2\u00ee\u056b\3\2\2\2\u00f0\u0575\3\2"
      + "\2\2\u00f2\u0577\3\2\2\2\u00f4\u057d\3\2\2\2\u00f6\u0589\3\2\2\2\u00f8"
      + "\u0590\3\2\2\2\u00fa\u059e\3\2\2\2\u00fc\u05a0\3\2\2\2\u00fe\u05a2\3\2"
      + "\2\2\u0100\u05a6\3\2\2\2\u0102\u05aa\3\2\2\2\u0104\u05b4\3\2\2\2\u0106"
      + "\u05b6\3\2\2\2\u0108\u05b9\3\2\2\2\u010a\u05bc\3\2\2\2\u010c\u05bf\3\2"
      + "\2\2\u010e\u05c2\3\2\2\2\u0110\u05c8\3\2\2\2\u0112\u05d0\3\2\2\2\u0114"
      + "\u05e2\3\2\2\2\u0116\u05e4\3\2\2\2\u0118\u05ea\3\2\2\2\u011a\u05f9\3\2"
      + "\2\2\u011c\u05fc\3\2\2\2\u011e\u060d\3\2\2\2\u0120\u060f\3\2\2\2\u0122"
      + "\u0611\3\2\2\2\u0124\u0617\3\2\2\2\u0126\u061d\3\2\2\2\u0128\u0627\3\2"
      + "\2\2\u012a\u062b\3\2\2\2\u012c\u062d\3\2\2\2\u012e\u063d\3\2\2\2\u0130"
      + "\u064f\3\2\2\2\u0132\u0651\3\2\2\2\u0134\u0653\3\2\2\2\u0136\u065b\3\2"
      + "\2\2\u0138\u066a\3\2\2\2\u013a\u0679\3\2\2\2\u013c\u067f\3\2\2\2\u013e"
      + "\u0685\3\2\2\2\u0140\u068b\3\2\2\2\u0142\u068f\3\2\2\2\u0144\u06a1\3\2"
      + "\2\2\u0146\u06a3\3\2\2\2\u0148\u06aa\3\2\2\2\u014a\u06b3\3\2\2\2\u014c"
      + "\u06b9\3\2\2\2\u014e\u06c1\3\2\2\2\u0150\u06c4\3\2\2\2\u0152\u06cd\3\2"
      + "\2\2\u0154\u06d4\3\2\2\2\u0156\u06df\3\2\2\2\u0158\u06e7\3\2\2\2\u015a"
      + "\u06ee\3\2\2\2\u015c\u06fa\3\2\2\2\u015e\u0701\3\2\2\2\u0160\u0705\3\2"
      + "\2\2\u0162\u0744\3\2\2\2\u0164\u0746\3\2\2\2\u0166\u075c\3\2\2\2\u0168"
      + "\u075f\3\2\2\2\u016a\u0765\3\2\2\2\u016c\u076c\3\2\2\2\u016e\u0772\3\2"
      + "\2\2\u0170\u0778\3\2\2\2\u0172\u077e\3\2\2\2\u0174\u0780\3\2\2\2\u0176"
      + "\u0791\3\2\2\2\u0178\u07a9\3\2\2\2\u017a\u07ab\3\2\2\2\u017c\u07b5\3\2"
      + "\2\2\u017e\u07bc\3\2\2\2\u0180\u07c0\3\2\2\2\u0182\u07c2\3\2\2\2\u0184"
      + "\u07d0\3\2\2\2\u0186\u07d2\3\2\2\2\u0188\u07dc\3\2\2\2\u018a\u07e0\3\2"
      + "\2\2\u018c\u07e2\3\2\2\2\u018e\u07e9\3\2\2\2\u0190\u07eb\3\2\2\2\u0192"
      + "\u07f4\3\2\2\2\u0194\u07f6\3\2\2\2\u0196\u0801\3\2\2\2\u0198\u080c\3\2"
      + "\2\2\u019a\u0817\3\2\2\2\u019c\u0822\3\2\2\2\u019e\u082d\3\2\2\2\u01a0"
      + "\u083b\3\2\2\2\u01a2\u0852\3\2\2\2\u01a4\u0863\3\2\2\2\u01a6\u0871\3\2"
      + "\2\2\u01a8\u088b\3\2\2\2\u01aa\u0893\3\2\2\2\u01ac\u0898\3\2\2\2\u01ae"
      + "\u08be\3\2\2\2\u01b0\u08cc\3\2\2\2\u01b2\u08d8\3\2\2\2\u01b4\u08eb\3\2"
      + "\2\2\u01b6\u08ed\3\2\2\2\u01b8\u01b9\b\2\1\2\u01b9\u01ba\7l\2\2\u01ba"
      + "\u01c0\3\2\2\2\u01bb\u01bc\f\3\2\2\u01bc\u01bd\7\3\2\2\u01bd\u01bf\7l"
      + "\2\2\u01be\u01bb\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"
      + "\u01c1\3\2\2\2\u01c1\3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c9\7l\2\2"
      + "\u01c4\u01c5\5\6\4\2\u01c5\u01c6\7\3\2\2\u01c6\u01c7\7l\2\2\u01c7\u01c9"
      + "\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9\5\3\2\2\2\u01ca"
      + "\u01cf\7l\2\2\u01cb\u01cc\7\3\2\2\u01cc\u01ce\7l\2\2\u01cd\u01cb\3\2\2"
      + "\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\7"
      + "\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d8\7l\2\2\u01d3\u01d4\5\f\7\2\u01d4"
      + "\u01d5\7\3\2\2\u01d5\u01d6\7l\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d2\3\2"
      + "\2\2\u01d7\u01d3\3\2\2\2\u01d8\t\3\2\2\2\u01d9\u01da\7l\2\2\u01da\13\3"
      + "\2\2\2\u01db\u01e0\7l\2\2\u01dc\u01dd\7\3\2\2\u01dd\u01df\7l\2\2\u01de"
      + "\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"
      + "\2\2\u01e1\r\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\5\20\t\2\u01e4\u01e6"
      + "\5\30\r\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\17\3\2\2\2\u01e7"
      + "\u01e9\5\u00d6l\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8"
      + "\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed"
      + "\u01f6\5\22\n\2\u01ee\u01f0\5\u00d6l\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3"
      + "\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"
      + "\u01f1\3\2\2\2\u01f4\u01f6\7\4\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01f1\3\2"
      + "\2\2\u01f6\21\3\2\2\2\u01f7\u01fa\5\24\13\2\u01f8\u01fa\5\26\f\2\u01f9"
      + "\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\23\3\2\2\2\u01fb\u01fc\t\2\2"
      + "\2\u01fc\25\3\2\2\2\u01fd\u01fe\t\3\2\2\u01fe\27\3\2\2\2\u01ff\u0203\5"
      + "\32\16\2\u0200\u0203\5 \21\2\u0201\u0203\5\"\22\2\u0202\u01ff\3\2\2\2"
      + "\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\31\3\2\2\2\u0204\u0207"
      + "\5\34\17\2\u0205\u0207\5\36\20\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2"
      + "\2\u0207\33\3\2\2\2\u0208\u020a\5\u00d6l\2\u0209\u0208\3\2\2\2\u020a\u020d"
      + "\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"
      + "\u020b\3\2\2\2\u020e\u0210\7l\2\2\u020f\u0211\5.\30\2\u0210\u020f\3\2"
      + "\2\2\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0216\7\3\2\2\u0213"
      + "\u0215\5\u00d6l\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214"
      + "\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219"
      + "\u021b\7l\2\2\u021a\u021c\5.\30\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2"
      + "\2\2\u021c\u021e\3\2\2\2\u021d\u0212\3\2\2\2\u021e\u0221\3\2\2\2\u021f"
      + "\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\35\3\2\2\2\u0221\u021f\3\2\2"
      + "\2\u0222\u0223\5\34\17\2\u0223\37\3\2\2\2\u0224\u0226\5\u00d6l\2\u0225"
      + "\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"
      + "\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7l\2\2\u022b"
      + "!\3\2\2\2\u022c\u022d\5\20\t\2\u022d\u022e\5$\23\2\u022e\u0236\3\2\2\2"
      + "\u022f\u0230\5\32\16\2\u0230\u0231\5$\23\2\u0231\u0236\3\2\2\2\u0232\u0233"
      + "\5 \21\2\u0233\u0234\5$\23\2\u0234\u0236\3\2\2\2\u0235\u022c\3\2\2\2\u0235"
      + "\u022f\3\2\2\2\u0235\u0232\3\2\2\2\u0236#\3\2\2\2\u0237\u0239\5\u00d6"
      + "l\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"
      + "\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7\f"
      + "\2\2\u023e\u0249\7\r\2\2\u023f\u0241\5\u00d6l\2\u0240\u023f\3\2\2\2\u0241"
      + "\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2"
      + "\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7\f\2\2\u0246\u0248\7\r\2\2\u0247"
      + "\u0242\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"
      + "\2\2\u024a%\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\5(\25\2\u024d\u024c"
      + "\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"
      + "\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254\7l\2\2\u0253\u0255\5*\26"
      + "\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\'\3\2\2\2\u0256\u0257"
      + "\5\u00d6l\2\u0257)\3\2\2\2\u0258\u0259\7\16\2\2\u0259\u0263\5 \21\2\u025a"
      + "\u025b\7\16\2\2\u025b\u025f\5\32\16\2\u025c\u025e\5,\27\2\u025d\u025c"
      + "\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"
      + "\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0258\3\2\2\2\u0262\u025a\3\2"
      + "\2\2\u0263+\3\2\2\2\u0264\u0265\7\17\2\2\u0265\u0266\5\36\20\2\u0266-"
      + "\3\2\2\2\u0267\u0268\7\20\2\2\u0268\u0269\5\60\31\2\u0269\u026a\7\21\2"
      + "\2\u026a/\3\2\2\2\u026b\u0270\5\62\32\2\u026c\u026d\7\22\2\2\u026d\u026f"
      + "\5\62\32\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2"
      + "\u0270\u0271\3\2\2\2\u0271\61\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0276"
      + "\5\30\r\2\u0274\u0276\5\64\33\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2"
      + "\2\u0276\63\3\2\2\2\u0277\u0279\5\u00d6l\2\u0278\u0277\3\2\2\2\u0279\u027c"
      + "\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"
      + "\u027a\3\2\2\2\u027d\u027f\7\23\2\2\u027e\u0280\5\66\34\2\u027f\u027e"
      + "\3\2\2\2\u027f\u0280\3\2\2\2\u0280\65\3\2\2\2\u0281\u0282\7\16\2\2\u0282"
      + "\u0286\5\30\r\2\u0283\u0284\7\24\2\2\u0284\u0286\5\30\r\2\u0285\u0281"
      + "\3\2\2\2\u0285\u0283\3\2\2\2\u0286\67\3\2\2\2\u0287\u0289\5:\36\2\u0288"
      + "\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028d\3\2\2\2\u028a\u028c\5>"
      + " \2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"
      + "\u028e\3\2\2\2\u028e\u0293\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\5H"
      + "%\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"
      + "\u0294\3\2\2\2\u02949\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\5<\37\2"
      + "\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a"
      + "\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7\25\2\2"
      + "\u029d\u02a2\7l\2\2\u029e\u029f\7\3\2\2\u029f\u02a1\7l\2\2\u02a0\u029e"
      + "\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"
      + "\u02a5\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\7\26\2\2\u02a6;\3\2\2\2"
      + "\u02a7\u02a8\5\u00d6l\2\u02a8=\3\2\2\2\u02a9\u02ae\5@!\2\u02aa\u02ae\5"
      + "B\"\2\u02ab\u02ae\5D#\2\u02ac\u02ae\5F$\2\u02ad\u02a9\3\2\2\2\u02ad\u02aa"
      + "\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae?\3\2\2\2\u02af"
      + "\u02b0\7\27\2\2\u02b0\u02b1\5\4\3\2\u02b1\u02b2\7\26\2\2\u02b2A\3\2\2"
      + "\2\u02b3\u02b4\7\27\2\2\u02b4\u02b5\5\6\4\2\u02b5\u02b6\7\3\2\2\u02b6"
      + "\u02b7\7\30\2\2\u02b7\u02b8\7\26\2\2\u02b8C\3\2\2\2\u02b9\u02ba\7\27\2"
      + "\2\u02ba\u02bb\7\31\2\2\u02bb\u02bc\5\4\3\2\u02bc\u02bd\7\3\2\2\u02bd"
      + "\u02be\7l\2\2\u02be\u02bf\7\26\2\2\u02bfE\3\2\2\2\u02c0\u02c1\7\27\2\2"
      + "\u02c1\u02c2\7\31\2\2\u02c2\u02c3\5\4\3\2\u02c3\u02c4\7\3\2\2\u02c4\u02c5"
      + "\7\30\2\2\u02c5\u02c6\7\26\2\2\u02c6G\3\2\2\2\u02c7\u02cb\5J&\2\u02c8"
      + "\u02cb\5\u00b6\\\2\u02c9\u02cb\7\26\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8"
      + "\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cbI\3\2\2\2\u02cc\u02cf\5L\'\2\u02cd\u02cf"
      + "\5\u00aaV\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cfK\3\2\2\2\u02d0"
      + "\u02d2\5N(\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2"
      + "\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7"
      + "\7\32\2\2\u02d7\u02d9\7l\2\2\u02d8\u02da\5P)\2\u02d9\u02d8\3\2\2\2\u02d9"
      + "\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd\5T+\2\u02dc\u02db\3\2\2"
      + "\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02e0\5V,\2\u02df\u02de"
      + "\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\5Z.\2\u02e2"
      + "M\3\2\2\2\u02e3\u02e8\5\u00d6l\2\u02e4\u02e8\7\33\2\2\u02e5\u02e8\7\34"
      + "\2\2\u02e6\u02e8\7\35\2\2\u02e7\u02e3\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7"
      + "\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02eb\t\4"
      + "\2\2\u02ea\u02e7\3\2\2\2\u02ea\u02e9\3\2\2\2\u02ebO\3\2\2\2\u02ec\u02ed"
      + "\7\20\2\2\u02ed\u02ee\5R*\2\u02ee\u02ef\7\21\2\2\u02efQ\3\2\2\2\u02f0"
      + "\u02f5\5&\24\2\u02f1\u02f2\7\22\2\2\u02f2\u02f4\5&\24\2\u02f3\u02f1\3"
      + "\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"
      + "S\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7\16\2\2\u02f9\u02fa\5\34\17"
      + "\2\u02faU\3\2\2\2\u02fb\u02fc\7!\2\2\u02fc\u02fd\5X-\2\u02fdW\3\2\2\2"
      + "\u02fe\u0303\5\36\20\2\u02ff\u0300\7\22\2\2\u0300\u0302\5\36\20\2\u0301"
      + "\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2"
      + "\2\2\u0304Y\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u030a\7\"\2\2\u0307\u0309"
      + "\5\\/\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a"
      + "\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7#"
      + "\2\2\u030e[\3\2\2\2\u030f\u0314\5^\60\2\u0310\u0314\5\u009aN\2\u0311\u0314"
      + "\5\u009cO\2\u0312\u0314\5\u009eP\2\u0313\u030f\3\2\2\2\u0313\u0310\3\2"
      + "\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314]\3\2\2\2\u0315\u031b"
      + "\5`\61\2\u0316\u031b\5|?\2\u0317\u031b\5J&\2\u0318\u031b\5\u00b6\\\2\u0319"
      + "\u031b\7\26\2\2\u031a\u0315\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u0317\3"
      + "\2\2\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031b_\3\2\2\2\u031c\u031e"
      + "\5b\62\2\u031d\u031c\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f"
      + "\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0323\5l"
      + "\67\2\u0323\u0324\5d\63\2\u0324\u0325\7\26\2\2\u0325a\3\2\2\2\u0326\u032b"
      + "\5\u00d6l\2\u0327\u032b\7\33\2\2\u0328\u032b\7\34\2\2\u0329\u032b\7\35"
      + "\2\2\u032a\u0326\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a"
      + "\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032e\t\5\2\2\u032d\u032a\3\2"
      + "\2\2\u032d\u032c\3\2\2\2\u032ec\3\2\2\2\u032f\u0334\5f\64\2\u0330\u0331"
      + "\7\22\2\2\u0331\u0333\5f\64\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2"
      + "\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335e\3\2\2\2\u0336\u0334\3"
      + "\2\2\2\u0337\u033a\5h\65\2\u0338\u0339\7&\2\2\u0339\u033b\5j\66\2\u033a"
      + "\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033bg\3\2\2\2\u033c\u033e\7l\2\2\u033d"
      + "\u033f\5$\23\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033fi\3\2\2\2"
      + "\u0340\u0343\5\u0180\u00c1\2\u0341\u0343\5\u00e8u\2\u0342\u0340\3\2\2"
      + "\2\u0342\u0341\3\2\2\2\u0343k\3\2\2\2\u0344\u0347\5n8\2\u0345\u0347\5"
      + "p9\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347m\3\2\2\2\u0348\u034b"
      + "\5\22\n\2\u0349\u034b\7\4\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2"
      + "\u034bo\3\2\2\2\u034c\u0350\5r:\2\u034d\u0350\5x=\2\u034e\u0350\5z>\2"
      + "\u034f\u034c\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350q\3"
      + "\2\2\2\u0351\u0354\5t;\2\u0352\u0354\5v<\2\u0353\u0351\3\2\2\2\u0353\u0352"
      + "\3\2\2\2\u0354s\3\2\2\2\u0355\u0357\7l\2\2\u0356\u0358\5.\30\2\u0357\u0356"
      + "\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0366\3\2\2\2\u0359\u035d\7\3\2\2\u035a"
      + "\u035c\5\u00d6l\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b"
      + "\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360"
      + "\u0362\7l\2\2\u0361\u0363\5.\30\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2"
      + "\2\2\u0363\u0365\3\2\2\2\u0364\u0359\3\2\2\2\u0365\u0368\3\2\2\2\u0366"
      + "\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367u\3\2\2\2\u0368\u0366\3\2\2\2"
      + "\u0369\u036a\5t;\2\u036aw\3\2\2\2\u036b\u036c\7l\2\2\u036cy\3\2\2\2\u036d"
      + "\u036e\5n8\2\u036e\u036f\5$\23\2\u036f\u0377\3\2\2\2\u0370\u0371\5r:\2"
      + "\u0371\u0372\5$\23\2\u0372\u0377\3\2\2\2\u0373\u0374\5x=\2\u0374\u0375"
      + "\5$\23\2\u0375\u0377\3\2\2\2\u0376\u036d\3\2\2\2\u0376\u0370\3\2\2\2\u0376"
      + "\u0373\3\2\2\2\u0377{\3\2\2\2\u0378\u037a\5~@\2\u0379\u0378\3\2\2\2\u037a"
      + "\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2"
      + "\2\2\u037d\u037b\3\2\2\2\u037e\u037f\5\u0080A\2\u037f\u0380\5\u0098M\2"
      + "\u0380}\3\2\2\2\u0381\u0386\5\u00d6l\2\u0382\u0386\7\33\2\2\u0383\u0386"
      + "\7\34\2\2\u0384\u0386\7\35\2\2\u0385\u0381\3\2\2\2\u0385\u0382\3\2\2\2"
      + "\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0389"
      + "\t\6\2\2\u0388\u0385\3\2\2\2\u0388\u0387\3\2\2\2\u0389\177\3\2\2\2\u038a"
      + "\u038b\5\u0082B\2\u038b\u038d\5\u0084C\2\u038c\u038e\5\u0092J\2\u038d"
      + "\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u039c\3\2\2\2\u038f\u0393\5P"
      + ")\2\u0390\u0392\5\u00d6l\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2\2\2\u0393"
      + "\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2"
      + "\2\2\u0396\u0397\5\u0082B\2\u0397\u0399\5\u0084C\2\u0398\u039a\5\u0092"
      + "J\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b"
      + "\u038a\3\2\2\2\u039b\u038f\3\2\2\2\u039c\u0081\3\2\2\2\u039d\u03a0\5l"
      + "\67\2\u039e\u03a0\7)\2\2\u039f\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0"
      + "\u0083\3\2\2\2\u03a1\u03a2\7l\2\2\u03a2\u03a4\7*\2\2\u03a3\u03a5\5\u0086"
      + "D\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"
      + "\u03a8\7+\2\2\u03a7\u03a9\5$\23\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2"
      + "\2\2\u03a9\u0085\3\2\2\2\u03aa\u03ab\5\u0088E\2\u03ab\u03ac\7\22\2\2\u03ac"
      + "\u03ad\5\u008eH\2\u03ad\u03b0\3\2\2\2\u03ae\u03b0\5\u008eH\2\u03af\u03aa"
      + "\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u0087\3\2\2\2\u03b1\u03b6\5\u008aF"
      + "\2\u03b2\u03b3\7\22\2\2\u03b3\u03b5\5\u008aF\2\u03b4\u03b2\3\2\2\2\u03b5"
      + "\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03c2\3\2"
      + "\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03be\5\u0090I\2\u03ba\u03bb\7\22\2\2\u03bb"
      + "\u03bd\5\u008aF\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc"
      + "\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"
      + "\u03b1\3\2\2\2\u03c1\u03b9\3\2\2\2\u03c2\u0089\3\2\2\2\u03c3\u03c5\5\u008c"
      + "G\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6"
      + "\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\5l"
      + "\67\2\u03ca\u03cb\5h\65\2\u03cb\u008b\3\2\2\2\u03cc\u03cf\5\u00d6l\2\u03cd"
      + "\u03cf\7\37\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u008d\3"
      + "\2\2\2\u03d0\u03d2\5\u008cG\2\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2"
      + "\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3"
      + "\3\2\2\2\u03d6\u03da\5l\67\2\u03d7\u03d9\5\u00d6l\2\u03d8\u03d7\3\2\2"
      + "\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd"
      + "\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7,\2\2\u03de\u03df\5h\65\2\u03df"
      + "\u03e2\3\2\2\2\u03e0\u03e2\5\u008aF\2\u03e1\u03d3\3\2\2\2\u03e1\u03e0"
      + "\3\2\2\2\u03e2\u008f\3\2\2\2\u03e3\u03e5\5\u00d6l\2\u03e4\u03e3\3\2\2"
      + "\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9"
      + "\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\5l\67\2\u03ea\u03eb\7l\2\2\u03eb"
      + "\u03ed\7\3\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2"
      + "\2\2\u03ee\u03ef\7-\2\2\u03ef\u0091\3\2\2\2\u03f0\u03f1\7.\2\2\u03f1\u03f2"
      + "\5\u0094K\2\u03f2\u0093\3\2\2\2\u03f3\u03f8\5\u0096L\2\u03f4\u03f5\7\22"
      + "\2\2\u03f5\u03f7\5\u0096L\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8"
      + "\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u0095\3\2\2\2\u03fa\u03f8\3\2"
      + "\2\2\u03fb\u03fe\5\34\17\2\u03fc\u03fe\5 \21\2\u03fd\u03fb\3\2\2\2\u03fd"
      + "\u03fc\3\2\2\2\u03fe\u0097\3\2\2\2\u03ff\u0402\5\u00ecw\2\u0400\u0402"
      + "\7\26\2\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402\u0099\3\2\2\2"
      + "\u0403\u0404\5\u00ecw\2\u0404\u009b\3\2\2\2\u0405\u0406\7\31\2\2\u0406"
      + "\u0407\5\u00ecw\2\u0407\u009d\3\2\2\2\u0408\u040a\5\u00a0Q\2\u0409\u0408"
      + "\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"
      + "\u040e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0410\5\u00a2R\2\u040f\u0411"
      + "\5\u0092J\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2"
      + "\2\u0412\u0413\5\u00a6T\2\u0413\u009f\3\2\2\2\u0414\u0419\5\u00d6l\2\u0415"
      + "\u0419\7\33\2\2\u0416\u0419\7\34\2\2\u0417\u0419\7\35\2\2\u0418\u0414"
      + "\3\2\2\2\u0418\u0415\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419"
      + "\u00a1\3\2\2\2\u041a\u041c\5P)\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2"
      + "\2\u041c\u041d\3\2\2\2\u041d\u041e\5\u00a4S\2\u041e\u0420\7*\2\2\u041f"
      + "\u0421\5\u0086D\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422"
      + "\3\2\2\2\u0422\u0423\7+\2\2\u0423\u00a3\3\2\2\2\u0424\u0425\7l\2\2\u0425"
      + "\u00a5\3\2\2\2\u0426\u0428\7\"\2\2\u0427\u0429\5\u00a8U\2\u0428\u0427"
      + "\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u042c\5\u00eex"
      + "\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e"
      + "\7#\2\2\u042e\u00a7\3\2\2\2\u042f\u0431\5.\30\2\u0430\u042f\3\2\2\2\u0430"
      + "\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\7-\2\2\u0433\u0435\7*\2"
      + "\2\u0434\u0436\5\u0174\u00bb\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2"
      + "\u0436\u0437\3\2\2\2\u0437\u0438\7+\2\2\u0438\u045e\7\26\2\2\u0439\u043b"
      + "\5.\30\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c"
      + "\u043d\7\24\2\2\u043d\u043f\7*\2\2\u043e\u0440\5\u0174\u00bb\2\u043f\u043e"
      + "\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7+\2\2\u0442"
      + "\u045e\7\26\2\2\u0443\u0444\5\b\5\2\u0444\u0446\7\3\2\2\u0445\u0447\5"
      + ".\30\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448"
      + "\u0449\7\24\2\2\u0449\u044b\7*\2\2\u044a\u044c\5\u0174\u00bb\2\u044b\u044a"
      + "\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\7+\2\2\u044e"
      + "\u044f\7\26\2\2\u044f\u045e\3\2\2\2\u0450\u0451\5\u0158\u00ad\2\u0451"
      + "\u0453\7\3\2\2\u0452\u0454\5.\30\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2"
      + "\2\2\u0454\u0455\3\2\2\2\u0455\u0456\7\24\2\2\u0456\u0458\7*\2\2\u0457"
      + "\u0459\5\u0174\u00bb\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a"
      + "\3\2\2\2\u045a\u045b\7+\2\2\u045b\u045c\7\26\2\2\u045c\u045e\3\2\2\2\u045d"
      + "\u0430\3\2\2\2\u045d\u043a\3\2\2\2\u045d\u0443\3\2\2\2\u045d\u0450\3\2"
      + "\2\2\u045e\u00a9\3\2\2\2\u045f\u0461\5N(\2\u0460\u045f\3\2\2\2\u0461\u0464"
      + "\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\3\2\2\2\u0464"
      + "\u0462\3\2\2\2\u0465\u0466\7/\2\2\u0466\u0468\7l\2\2\u0467\u0469\5V,\2"
      + "\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b"
      + "\5\u00acW\2\u046b\u00ab\3\2\2\2\u046c\u046e\7\"\2\2\u046d\u046f\5\u00ae"
      + "X\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470"
      + "\u0472\7\22\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0474\3"
      + "\2\2\2\u0473\u0475\5\u00b4[\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2"
      + "\u0475\u0476\3\2\2\2\u0476\u0477\7#\2\2\u0477\u00ad\3\2\2\2\u0478\u047b"
      + "\5\u00b0Y\2\u0479\u047a\7\22\2\2\u047a\u047c\5\u00b0Y\2\u047b\u0479\3"
      + "\2\2\2\u047b\u047c\3\2\2\2\u047c\u00af\3\2\2\2\u047d\u047f\5\u00b2Z\2"
      + "\u047e\u047d\3\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481"
      + "\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0480\3\2\2\2\u0483\u0489\7l\2\2\u0484"
      + "\u0486\7*\2\2\u0485\u0487\5\u0174\u00bb\2\u0486\u0485\3\2\2\2\u0486\u0487"
      + "\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\7+\2\2\u0489\u0484\3\2\2\2\u0489"
      + "\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u048d\5Z.\2\u048c\u048b\3\2\2"
      + "\2\u048c\u048d\3\2\2\2\u048d\u00b1\3\2\2\2\u048e\u048f\5\u00d6l\2\u048f"
      + "\u00b3\3\2\2\2\u0490\u0494\7\26\2\2\u0491\u0493\5\\/\2\u0492\u0491\3\2"
      + "\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"
      + "\u00b5\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u049a\5\u00b8]\2\u0498\u049a"
      + "\5\u00caf\2\u0499\u0497\3\2\2\2\u0499\u0498\3\2\2\2\u049a\u00b7\3\2\2"
      + "\2\u049b\u049d\5\u00ba^\2\u049c\u049b\3\2\2\2\u049d\u04a0\3\2\2\2\u049e"
      + "\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u049e\3\2"
      + "\2\2\u04a1\u04a2\7\60\2\2\u04a2\u04a4\7l\2\2\u04a3\u04a5\5P)\2\u04a4\u04a3"
      + "\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a8\5\u00bc_"
      + "\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa"
      + "\5\u00be`\2\u04aa\u00b9\3\2\2\2\u04ab\u04b0\5\u00d6l\2\u04ac\u04b0\7\33"
      + "\2\2\u04ad\u04b0\7\34\2\2\u04ae\u04b0\7\35\2\2\u04af\u04ab\3\2\2\2\u04af"
      + "\u04ac\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u04b3\3\2"
      + "\2\2\u04b1\u04b3\t\7\2\2\u04b2\u04af\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3"
      + "\u00bb\3\2\2\2\u04b4\u04b5\7\16\2\2\u04b5\u04b6\5X-\2\u04b6\u00bd\3\2"
      + "\2\2\u04b7\u04bb\7\"\2\2\u04b8\u04ba\5\u00c0a\2\u04b9\u04b8\3\2\2\2\u04ba"
      + "\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2"
      + "\2\2\u04bd\u04bb\3\2\2\2\u04be\u04bf\7#\2\2\u04bf\u00bf\3\2\2\2\u04c0"
      + "\u04c6\5\u00c2b\2\u04c1\u04c6\5\u00c6d\2\u04c2\u04c6\5J&\2\u04c3\u04c6"
      + "\5\u00b6\\\2\u04c4\u04c6\7\26\2\2\u04c5\u04c0\3\2\2\2\u04c5\u04c1\3\2"
      + "\2\2\u04c5\u04c2\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2\u04c6"
      + "\u00c1\3\2\2\2\u04c7\u04c9\5\u00c4c\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9"
      + "\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\5l\67\2\u04cb\u04cc\5d\63\2\u04cc"
      + "\u04cd\7\26\2\2\u04cd\u00c3\3\2\2\2\u04ce\u04d1\5\u00d6l\2\u04cf\u04d1"
      + "\7\33\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\u04d4\3\2\2\2"
      + "\u04d2\u04d4\t\b\2\2\u04d3\u04d0\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u00c5"
      + "\3\2\2\2\u04d5\u04d7\5\u00c8e\2\u04d6\u04d5\3\2\2\2\u04d7\u04da\3\2\2"
      + "\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04d8"
      + "\3\2\2\2\u04db\u04dc\5\u0080A\2\u04dc\u04dd\5\u0098M\2\u04dd\u00c7\3\2"
      + "\2\2\u04de\u04e1\5\u00d6l\2\u04df\u04e1\7\33\2\2\u04e0\u04de\3\2\2\2\u04e0"
      + "\u04df\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e4\t\t\2\2\u04e3\u04e0\3\2"
      + "\2\2\u04e3\u04e2\3\2\2\2\u04e4\u00c9\3\2\2\2\u04e5\u04e7\5\u00ba^\2\u04e6"
      + "\u04e5\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2"
      + "\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04ec\7\62\2\2\u04ec"
      + "\u04ed\7\60\2\2\u04ed\u04ee\7l\2\2\u04ee\u04ef\5\u00ccg\2\u04ef\u00cb"
      + "\3\2\2\2\u04f0\u04f4\7\"\2\2\u04f1\u04f3\5\u00ceh\2\u04f2\u04f1\3\2\2"
      + "\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7"
      + "\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04f8\7#\2\2\u04f8\u00cd\3\2\2\2\u04f9"
      + "\u04ff\5\u00d0i\2\u04fa\u04ff\5\u00c2b\2\u04fb\u04ff\5J&\2\u04fc\u04ff"
      + "\5\u00b6\\\2\u04fd\u04ff\7\26\2\2\u04fe\u04f9\3\2\2\2\u04fe\u04fa\3\2"
      + "\2\2\u04fe\u04fb\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff"
      + "\u00cf\3\2\2\2\u0500\u0502\5\u00d2j\2\u0501\u0500\3\2\2\2\u0502\u0505"
      + "\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\3\2\2\2\u0505"
      + "\u0503\3\2\2\2\u0506\u0507\5l\67\2\u0507\u0508\7l\2\2\u0508\u0509\7*\2"
      + "\2\u0509\u050b\7+\2\2\u050a\u050c\5$\23\2\u050b\u050a\3\2\2\2\u050b\u050c"
      + "\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050f\5\u00d4k\2\u050e\u050d\3\2\2"
      + "\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\7\26\2\2\u0511"
      + "\u00d1\3\2\2\2\u0512\u0515\5\u00d6l\2\u0513\u0515\7\33\2\2\u0514\u0512"
      + "\3\2\2\2\u0514\u0513\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0518\7\36\2\2"
      + "\u0517\u0514\3\2\2\2\u0517\u0516\3\2\2\2\u0518\u00d3\3\2\2\2\u0519\u051a"
      + "\7\61\2\2\u051a\u051b\5\u00dep\2\u051b\u00d5\3\2\2\2\u051c\u0520\5\u00d8"
      + "m\2\u051d\u0520\5\u00e4s\2\u051e\u0520\5\u00e6t\2\u051f\u051c\3\2\2\2"
      + "\u051f\u051d\3\2\2\2\u051f\u051e\3\2\2\2\u0520\u00d7\3\2\2\2\u0521\u0522"
      + "\7\62\2\2\u0522\u0523\5\4\3\2\u0523\u0525\7*\2\2\u0524\u0526\5\u00dan"
      + "\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"
      + "\7+\2\2\u0528\u00d9\3\2\2\2\u0529\u052e\5\u00dco\2\u052a\u052b\7\22\2"
      + "\2\u052b\u052d\5\u00dco\2\u052c\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e"
      + "\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u00db\3\2\2\2\u0530\u052e\3\2"
      + "\2\2\u0531\u0532\7l\2\2\u0532\u0533\7&\2\2\u0533\u0534\5\u00dep\2\u0534"
      + "\u00dd\3\2\2\2\u0535\u0539\5\u0192\u00ca\2\u0536\u0539\5\u00e0q\2\u0537"
      + "\u0539\5\u00d6l\2\u0538\u0535\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0537"
      + "\3\2\2\2\u0539\u00df\3\2\2\2\u053a\u053c\7\"\2\2\u053b\u053d\5\u00e2r"
      + "\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0540"
      + "\7\22\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2"
      + "\u0541\u0542\7#\2\2\u0542\u00e1\3\2\2\2\u0543\u0548\5\u00dep\2\u0544\u0545"
      + "\7\22\2\2\u0545\u0547\5\u00dep\2\u0546\u0544\3\2\2\2\u0547\u054a\3\2\2"
      + "\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00e3\3\2\2\2\u054a\u0548"
      + "\3\2\2\2\u054b\u054c\7\62\2\2\u054c\u054d\5\4\3\2\u054d\u00e5\3\2\2\2"
      + "\u054e\u054f\7\62\2\2\u054f\u0550\5\4\3\2\u0550\u0551\7*\2\2\u0551\u0552"
      + "\5\u00dep\2\u0552\u0553\7+\2\2\u0553\u00e7\3\2\2\2\u0554\u0556\7\"\2\2"
      + "\u0555\u0557\5\u00eav\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557"
      + "\u0559\3\2\2\2\u0558\u055a\7\22\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3"
      + "\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\7#\2\2\u055c\u00e9\3\2\2\2\u055d"
      + "\u0562\5j\66\2\u055e\u055f\7\22\2\2\u055f\u0561\5j\66\2\u0560\u055e\3"
      + "\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563"
      + "\u00eb\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0567\7\"\2\2\u0566\u0568\5\u00ee"
      + "x\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569"
      + "\u056a\7#\2\2\u056a\u00ed\3\2\2\2\u056b\u056f\5\u00f0y\2\u056c\u056e\5"
      + "\u00f0y\2\u056d\u056c\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2"
      + "\u056f\u0570\3\2\2\2\u0570\u00ef\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0576"
      + "\5\u00f2z\2\u0573\u0576\5J&\2\u0574\u0576\5\u00f6|\2\u0575\u0572\3\2\2"
      + "\2\u0575\u0573\3\2\2\2\u0575\u0574\3\2\2\2\u0576\u00f1\3\2\2\2\u0577\u0578"
      + "\5\u00f4{\2\u0578\u0579\7\26\2\2\u0579\u00f3\3\2\2\2\u057a\u057c\5\u008c"
      + "G\2\u057b\u057a\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d"
      + "\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0581\5l"
      + "\67\2\u0581\u0582\5d\63\2\u0582\u00f5\3\2\2\2\u0583\u058a\5\u00fa~\2\u0584"
      + "\u058a\5\u00fe\u0080\2\u0585\u058a\5\u010e\u0088\2\u0586\u058a\5\u0110"
      + "\u0089\2\u0587\u058a\5\u0122\u0092\2\u0588\u058a\5\u0128\u0095\2\u0589"
      + "\u0583\3\2\2\2\u0589\u0584\3\2\2\2\u0589\u0585\3\2\2\2\u0589\u0586\3\2"
      + "\2\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u058a\u00f7\3\2\2\2\u058b"
      + "\u0591\5\u00fa~\2\u058c\u0591\5\u0100\u0081\2\u058d\u0591\5\u0112\u008a"
      + "\2\u058e\u0591\5\u0124\u0093\2\u058f\u0591\5\u012a\u0096\2\u0590\u058b"
      + "\3\2\2\2\u0590\u058c\3\2\2\2\u0590\u058d\3\2\2\2\u0590\u058e\3\2\2\2\u0590"
      + "\u058f\3\2\2\2\u0591\u00f9\3\2\2\2\u0592\u059f\5\u00ecw\2\u0593\u059f"
      + "\5\u00fc\177\2\u0594\u059f\5\u0102\u0082\2\u0595\u059f\5\u0114\u008b\2"
      + "\u0596\u059f\5\u0116\u008c\2\u0597\u059f\5\u0126\u0094\2\u0598\u059f\5"
      + "\u013a\u009e\2\u0599\u059f\5\u013c\u009f\2\u059a\u059f\5\u013e\u00a0\2"
      + "\u059b\u059f\5\u0142\u00a2\2\u059c\u059f\5\u0140\u00a1\2\u059d\u059f\5"
      + "\u0144\u00a3\2\u059e\u0592\3\2\2\2\u059e\u0593\3\2\2\2\u059e\u0594\3\2"
      + "\2\2\u059e\u0595\3\2\2\2\u059e\u0596\3\2\2\2\u059e\u0597\3\2\2\2\u059e"
      + "\u0598\3\2\2\2\u059e\u0599\3\2\2\2\u059e\u059a\3\2\2\2\u059e\u059b\3\2"
      + "\2\2\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u00fb\3\2\2\2\u05a0"
      + "\u05a1\7\26\2\2\u05a1\u00fd\3\2\2\2\u05a2\u05a3\7l\2\2\u05a3\u05a4\7\63"
      + "\2\2\u05a4\u05a5\5\u00f6|\2\u05a5\u00ff\3\2\2\2\u05a6\u05a7\7l\2\2\u05a7"
      + "\u05a8\7\63\2\2\u05a8\u05a9\5\u00f8}\2\u05a9\u0101\3\2\2\2\u05aa\u05ab"
      + "\5\u0104\u0083\2\u05ab\u05ac\7\26\2\2\u05ac\u0103\3\2\2\2\u05ad\u05b5"
      + "\5\u018c\u00c7\2\u05ae\u05b5\5\u0106\u0084\2\u05af\u05b5\5\u0108\u0085"
      + "\2\u05b0\u05b5\5\u010a\u0086\2\u05b1\u05b5\5\u010c\u0087\2\u05b2\u05b5"
      + "\5\u01b4\u00db\2\u05b3\u05b5\5\u0176\u00bc\2\u05b4\u05ad\3\2\2\2\u05b4"
      + "\u05ae\3\2\2\2\u05b4\u05af\3\2\2\2\u05b4\u05b0\3\2\2\2\u05b4\u05b1\3\2"
      + "\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u0105\3\2\2\2\u05b6"
      + "\u05b7\7\64\2\2\u05b7\u05b8\5\u01a8\u00d5\2\u05b8\u0107\3\2\2\2\u05b9"
      + "\u05ba\7\65\2\2\u05ba\u05bb\5\u01a8\u00d5\2\u05bb\u0109\3\2\2\2\u05bc"
      + "\u05bd\5\u01ac\u00d7\2\u05bd\u05be\7\64\2\2\u05be\u010b\3\2\2\2\u05bf"
      + "\u05c0\5\u01ac\u00d7\2\u05c0\u05c1\7\65\2\2\u05c1\u010d\3\2\2\2\u05c2"
      + "\u05c3\7\66\2\2\u05c3\u05c4\7*\2\2\u05c4\u05c5\5\u0180\u00c1\2\u05c5\u05c6"
      + "\7+\2\2\u05c6\u05c7\5\u00f6|\2\u05c7\u010f\3\2\2\2\u05c8\u05c9\7\66\2"
      + "\2\u05c9\u05ca\7*\2\2\u05ca\u05cb\5\u0180\u00c1\2\u05cb\u05cc\7+\2\2\u05cc"
      + "\u05cd\5\u00f8}\2\u05cd\u05ce\7\67\2\2\u05ce\u05cf\5\u00f6|\2\u05cf\u0111"
      + "\3\2\2\2\u05d0\u05d1\7\66\2\2\u05d1\u05d2\7*\2\2\u05d2\u05d3\5\u0180\u00c1"
      + "\2\u05d3\u05d4\7+\2\2\u05d4\u05d5\5\u00f8}\2\u05d5\u05d6\7\67\2\2\u05d6"
      + "\u05d7\5\u00f8}\2\u05d7\u0113\3\2\2\2\u05d8\u05d9\78\2\2\u05d9\u05da\5"
      + "\u0180\u00c1\2\u05da\u05db\7\26\2\2\u05db\u05e3\3\2\2\2\u05dc\u05dd\7"
      + "8\2\2\u05dd\u05de\5\u0180\u00c1\2\u05de\u05df\7\63\2\2\u05df\u05e0\5\u0180"
      + "\u00c1\2\u05e0\u05e1\7\26\2\2\u05e1\u05e3\3\2\2\2\u05e2\u05d8\3\2\2\2"
      + "\u05e2\u05dc\3\2\2\2\u05e3\u0115\3\2\2\2\u05e4\u05e5\79\2\2\u05e5\u05e6"
      + "\7*\2\2\u05e6\u05e7\5\u0180\u00c1\2\u05e7\u05e8\7+\2\2\u05e8\u05e9\5\u0118"
      + "\u008d\2\u05e9\u0117\3\2\2\2\u05ea\u05ee\7\"\2\2\u05eb\u05ed\5\u011a\u008e"
      + "\2\u05ec\u05eb\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef"
      + "\3\2\2\2\u05ef\u05f4\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f3\5\u011e\u0090"
      + "\2\u05f2\u05f1\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5"
      + "\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05f8\7#\2\2\u05f8"
      + "\u0119\3\2\2\2\u05f9\u05fa\5\u011c\u008f\2\u05fa\u05fb\5\u00eex\2\u05fb"
      + "\u011b\3\2\2\2\u05fc\u0600\5\u011e\u0090\2\u05fd\u05ff\5\u011e\u0090\2"
      + "\u05fe\u05fd\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601"
      + "\3\2\2\2\u0601\u011d\3\2\2\2\u0602\u0600\3\2\2\2\u0603\u0604\7:\2\2\u0604"
      + "\u0605\5\u017e\u00c0\2\u0605\u0606\7\63\2\2\u0606\u060e\3\2\2\2\u0607"
      + "\u0608\7:\2\2\u0608\u0609\5\u0120\u0091\2\u0609\u060a\7\63\2\2\u060a\u060e"
      + "\3\2\2\2\u060b\u060c\7\61\2\2\u060c\u060e\7\63\2\2\u060d\u0603\3\2\2\2"
      + "\u060d\u0607\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u011f\3\2\2\2\u060f\u0610"
      + "\7l\2\2\u0610\u0121\3\2\2\2\u0611\u0612\7;\2\2\u0612\u0613\7*\2\2\u0613"
      + "\u0614\5\u0180\u00c1\2\u0614\u0615\7+\2\2\u0615\u0616\5\u00f6|\2\u0616"
      + "\u0123\3\2\2\2\u0617\u0618\7;\2\2\u0618\u0619\7*\2\2\u0619\u061a\5\u0180"
      + "\u00c1\2\u061a\u061b\7+\2\2\u061b\u061c\5\u00f8}\2\u061c\u0125\3\2\2\2"
      + "\u061d\u061e\7<\2\2\u061e\u061f\5\u00f6|\2\u061f\u0620\7;\2\2\u0620\u0621"
      + "\7*\2\2\u0621\u0622\5\u0180\u00c1\2\u0622\u0623\7+\2\2\u0623\u0624\7\26"
      + "\2\2\u0624\u0127\3\2\2\2\u0625\u0628\5\u012c\u0097\2\u0626\u0628\5\u0136"
      + "\u009c\2\u0627\u0625\3\2\2\2\u0627\u0626\3\2\2\2\u0628\u0129\3\2\2\2\u0629"
      + "\u062c\5\u012e\u0098\2\u062a\u062c\5\u0138\u009d\2\u062b\u0629\3\2\2\2"
      + "\u062b\u062a\3\2\2\2\u062c\u012b\3\2\2\2\u062d\u062e\7=\2\2\u062e\u0630"
      + "\7*\2\2\u062f\u0631\5\u0130\u0099\2\u0630\u062f\3\2\2\2\u0630\u0631\3"
      + "\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\7\26\2\2\u0633\u0635\5\u0180\u00c1"
      + "\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638"
      + "\7\26\2\2\u0637\u0639\5\u0132\u009a\2\u0638\u0637\3\2\2\2\u0638\u0639"
      + "\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\7+\2\2\u063b\u063c\5\u00f6|\2"
      + "\u063c\u012d\3\2\2\2\u063d\u063e\7=\2\2\u063e\u0640\7*\2\2\u063f\u0641"
      + "\5\u0130\u0099\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3"
      + "\2\2\2\u0642\u0644\7\26\2\2\u0643\u0645\5\u0180\u00c1\2\u0644\u0643\3"
      + "\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\7\26\2\2\u0647"
      + "\u0649\5\u0132\u009a\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a"
      + "\3\2\2\2\u064a\u064b\7+\2\2\u064b\u064c\5\u00f8}\2\u064c\u012f\3\2\2\2"
      + "\u064d\u0650\5\u0134\u009b\2\u064e\u0650\5\u00f4{\2\u064f\u064d\3\2\2"
      + "\2\u064f\u064e\3\2\2\2\u0650\u0131\3\2\2\2\u0651\u0652\5\u0134\u009b\2"
      + "\u0652\u0133\3\2\2\2\u0653\u0658\5\u0104\u0083\2\u0654\u0655\7\22\2\2"
      + "\u0655\u0657\5\u0104\u0083\2\u0656\u0654\3\2\2\2\u0657\u065a\3\2\2\2\u0658"
      + "\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0135\3\2\2\2\u065a\u0658\3\2"
      + "\2\2\u065b\u065c\7=\2\2\u065c\u0660\7*\2\2\u065d\u065f\5\u008cG\2\u065e"
      + "\u065d\3\2\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2"
      + "\2\2\u0661\u0663\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0664\5l\67\2\u0664"
      + "\u0665\5h\65\2\u0665\u0666\7\63\2\2\u0666\u0667\5\u0180\u00c1\2\u0667"
      + "\u0668\7+\2\2\u0668\u0669\5\u00f6|\2\u0669\u0137\3\2\2\2\u066a\u066b\7"
      + "=\2\2\u066b\u066f\7*\2\2\u066c\u066e\5\u008cG\2\u066d\u066c\3\2\2\2\u066e"
      + "\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\3\2"
      + "\2\2\u0671\u066f\3\2\2\2\u0672\u0673\5l\67\2\u0673\u0674\5h\65\2\u0674"
      + "\u0675\7\63\2\2\u0675\u0676\5\u0180\u00c1\2\u0676\u0677\7+\2\2\u0677\u0678"
      + "\5\u00f8}\2\u0678\u0139\3\2\2\2\u0679\u067b\7>\2\2\u067a\u067c\7l\2\2"
      + "\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e"
      + "\7\26\2\2\u067e\u013b\3\2\2\2\u067f\u0681\7?\2\2\u0680\u0682\7l\2\2\u0681"
      + "\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\7\26"
      + "\2\2\u0684\u013d\3\2\2\2\u0685\u0687\7@\2\2\u0686\u0688\5\u0180\u00c1"
      + "\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a"
      + "\7\26\2\2\u068a\u013f\3\2\2\2\u068b\u068c\7A\2\2\u068c\u068d\5\u0180\u00c1"
      + "\2\u068d\u068e\7\26\2\2\u068e\u0141\3\2\2\2\u068f\u0690\7\'\2\2\u0690"
      + "\u0691\7*\2\2\u0691\u0692\5\u0180\u00c1\2\u0692\u0693\7+\2\2\u0693\u0694"
      + "\5\u00ecw\2\u0694\u0143\3\2\2\2\u0695\u0696\7B\2\2\u0696\u0697\5\u00ec"
      + "w\2\u0697\u0698\5\u0146\u00a4\2\u0698\u06a2\3\2\2\2\u0699\u069a\7B\2\2"
      + "\u069a\u069c\5\u00ecw\2\u069b\u069d\5\u0146\u00a4\2\u069c\u069b\3\2\2"
      + "\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\5\u014e\u00a8\2"
      + "\u069f\u06a2\3\2\2\2\u06a0\u06a2\5\u0150\u00a9\2\u06a1\u0695\3\2\2\2\u06a1"
      + "\u0699\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2\u0145\3\2\2\2\u06a3\u06a7\5\u0148"
      + "\u00a5\2\u06a4\u06a6\5\u0148\u00a5\2\u06a5\u06a4\3\2\2\2\u06a6\u06a9\3"
      + "\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u0147\3\2\2\2\u06a9"
      + "\u06a7\3\2\2\2\u06aa\u06ab\7C\2\2\u06ab\u06ac\7*\2\2\u06ac\u06ad\5\u014a"
      + "\u00a6\2\u06ad\u06ae\7+\2\2\u06ae\u06af\5\u00ecw\2\u06af\u0149\3\2\2\2"
      + "\u06b0\u06b2\5\u008cG\2\u06b1\u06b0\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3"
      + "\u06b1\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b6\3\2\2\2\u06b5\u06b3\3\2"
      + "\2\2\u06b6\u06b7\5\u014c\u00a7\2\u06b7\u06b8\5h\65\2\u06b8\u014b\3\2\2"
      + "\2\u06b9\u06be\5t;\2\u06ba\u06bb\7D\2\2\u06bb\u06bd\5\34\17\2\u06bc\u06ba"
      + "\3\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06bc\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf"
      + "\u014d\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1\u06c2\7E\2\2\u06c2\u06c3\5\u00ec"
      + "w\2\u06c3\u014f\3\2\2\2\u06c4\u06c5\7B\2\2\u06c5\u06c6\5\u0152\u00aa\2"
      + "\u06c6\u06c8\5\u00ecw\2\u06c7\u06c9\5\u0146\u00a4\2\u06c8\u06c7\3\2\2"
      + "\2\u06c8\u06c9\3\2\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06cc\5\u014e\u00a8\2"
      + "\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u0151\3\2\2\2\u06cd\u06ce"
      + "\7*\2\2\u06ce\u06d0\5\u0154\u00ab\2\u06cf\u06d1\7\26\2\2\u06d0\u06cf\3"
      + "\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\7+\2\2\u06d3"
      + "\u0153\3\2\2\2\u06d4\u06d9\5\u0156\u00ac\2\u06d5\u06d6\7\26\2\2\u06d6"
      + "\u06d8\5\u0156\u00ac\2\u06d7\u06d5\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7"
      + "\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u0155\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc"
      + "\u06de\5\u008cG\2\u06dd\u06dc\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd"
      + "\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2"
      + "\u06e3\5l\67\2\u06e3\u06e4\5h\65\2\u06e4\u06e5\7&\2\2\u06e5\u06e6\5\u0180"
      + "\u00c1\2\u06e6\u0157\3\2\2\2\u06e7\u06eb\5\u0160\u00b1\2\u06e8\u06ea\5"
      + "\u015c\u00af\2\u06e9\u06e8\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2"
      + "\2\2\u06eb\u06ec\3\2\2\2\u06ec\u0159\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee"
      + "\u06f2\5\u0162\u00b2\2\u06ef\u06f1\5\u015e\u00b0\2\u06f0\u06ef\3\2\2\2"
      + "\u06f1\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u015b"
      + "\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06f6\7\3\2\2\u06f6\u06fb\5\u0164\u00b3"
      + "\2\u06f7\u06fb\5\u0168\u00b5\2\u06f8\u06fb\5\u0166\u00b4\2\u06f9\u06fb"
      + "\5\u016c\u00b7\2\u06fa\u06f5\3\2\2\2\u06fa\u06f7\3\2\2\2\u06fa\u06f8\3"
      + "\2\2\2\u06fa\u06f9\3\2\2\2\u06fb\u015d\3\2\2\2\u06fc\u0702\5\u015c\u00af"
      + "\2\u06fd\u06fe\7\f\2\2\u06fe\u06ff\5\u0180\u00c1\2\u06ff\u0700\7\r\2\2"
      + "\u0700\u0702\3\2\2\2\u0701\u06fc\3\2\2\2\u0701\u06fd\3\2\2\2\u0702\u015f"
      + "\3\2\2\2\u0703\u0706\5\u0162\u00b2\2\u0704\u0706\5\u0178\u00bd\2\u0705"
      + "\u0703\3\2\2\2\u0705\u0704\3\2\2\2\u0706\u0161\3\2\2\2\u0707\u0745\5\u01b6"
      + "\u00dc\2\u0708\u070b\5\4\3\2\u0709\u070a\7\f\2\2\u070a\u070c\7\r\2\2\u070b"
      + "\u0709\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\7\3"
      + "\2\2\u070e\u070f\7\32\2\2\u070f\u0745\3\2\2\2\u0710\u0711\7)\2\2\u0711"
      + "\u0712\7\3\2\2\u0712\u0745\7\32\2\2\u0713\u0745\7-\2\2\u0714\u0715\5\4"
      + "\3\2\u0715\u0716\7\3\2\2\u0716\u0717\7-\2\2\u0717\u0745\3\2\2\2\u0718"
      + "\u0719\7*\2\2\u0719\u071a\5\u0180\u00c1\2\u071a\u071b\7+\2\2\u071b\u0745"
      + "\3\2\2\2\u071c\u0745\5\u0164\u00b3\2\u071d\u071e\5\4\3\2\u071e\u071f\5"
      + "\u0168\u00b5\2\u071f\u0745\3\2\2\2\u0720\u0724\7\24\2\2\u0721\u0725\5"
      + "\u0166\u00b4\2\u0722\u0725\5\u0168\u00b5\2\u0723\u0725\5\u016c\u00b7\2"
      + "\u0724\u0721\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0723\3\2\2\2\u0725\u0745"
      + "\3\2\2\2\u0726\u0727\5\4\3\2\u0727\u0728\7\3\2\2\u0728\u072c\7\24\2\2"
      + "\u0729\u072d\5\u0166\u00b4\2\u072a\u072d\5\u0168\u00b5\2\u072b\u072d\5"
      + "\u016c\u00b7\2\u072c\u0729\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072b\3\2"
      + "\2\2\u072d\u0745\3\2\2\2\u072e\u0738\5\b\5\2\u072f\u0730\7\3\2\2\u0730"
      + "\u0739\5\u0164\u00b3\2\u0731\u0732\7\f\2\2\u0732\u0733\5\u0180\u00c1\2"
      + "\u0733\u0734\7\r\2\2\u0734\u0739\3\2\2\2\u0735\u0739\5\u0168\u00b5\2\u0736"
      + "\u0739\5\u0166\u00b4\2\u0737\u0739\5\u016c\u00b7\2\u0738\u072f\3\2\2\2"
      + "\u0738\u0731\3\2\2\2\u0738\u0735\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0737"
      + "\3\2\2\2\u0739\u0745\3\2\2\2\u073a\u0745\5\u016a\u00b6\2\u073b\u073c\5"
      + "\30\r\2\u073c\u073d\5\u016c\u00b7\2\u073d\u0745\3\2\2\2\u073e\u073f\5"
      + "\34\17\2\u073f\u0740\5\u016e\u00b8\2\u0740\u0745\3\2\2\2\u0741\u0742\5"
      + "\"\22\2\u0742\u0743\5\u0170\u00b9\2\u0743\u0745\3\2\2\2\u0744\u0707\3"
      + "\2\2\2\u0744\u0708\3\2\2\2\u0744\u0710\3\2\2\2\u0744\u0713\3\2\2\2\u0744"
      + "\u0714\3\2\2\2\u0744\u0718\3\2\2\2\u0744\u071c\3\2\2\2\u0744\u071d\3\2"
      + "\2\2\u0744\u0720\3\2\2\2\u0744\u0726\3\2\2\2\u0744\u072e\3\2\2\2\u0744"
      + "\u073a\3\2\2\2\u0744\u073b\3\2\2\2\u0744\u073e\3\2\2\2\u0744\u0741\3\2"
      + "\2\2\u0745\u0163\3\2\2\2\u0746\u0748\7F\2\2\u0747\u0749\5.\30\2\u0748"
      + "\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074d\3\2\2\2\u074a\u074c\5\u00d6"
      + "l\2\u074b\u074a\3\2\2\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d"
      + "\u074e\3\2\2\2\u074e\u0750\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0752\7l"
      + "\2\2\u0751\u0753\5\u0172\u00ba\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2"
      + "\2\u0753\u0754\3\2\2\2\u0754\u0756\7*\2\2\u0755\u0757\5\u0174\u00bb\2"
      + "\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a"
      + "\7+\2\2\u0759\u075b\5Z.\2\u075a\u0759\3\2\2\2\u075a\u075b\3\2\2\2\u075b"
      + "\u0165\3\2\2\2\u075c\u075d\7\3\2\2\u075d\u075e\7l\2\2\u075e\u0167\3\2"
      + "\2\2\u075f\u0761\7\3\2\2\u0760\u0762\5.\30\2\u0761\u0760\3\2\2\2\u0761"
      + "\u0762\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\5\u016a\u00b6\2\u0764\u0169"
      + "\3\2\2\2\u0765\u0766\5\n\6\2\u0766\u0768\7*\2\2\u0767\u0769\5\u0174\u00bb"
      + "\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b"
      + "\7+\2\2\u076b\u016b\3\2\2\2\u076c\u076e\7G\2\2\u076d\u076f\5.\30\2\u076e"
      + "\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\7l"
      + "\2\2\u0771\u016d\3\2\2\2\u0772\u0774\7G\2\2\u0773\u0775\5.\30\2\u0774"
      + "\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\7F"
      + "\2\2\u0777\u016f\3\2\2\2\u0778\u0779\7G\2\2\u0779\u077a\7F\2\2\u077a\u0171"
      + "\3\2\2\2\u077b\u077f\5.\30\2\u077c\u077d\7\20\2\2\u077d\u077f\7\21\2\2"
      + "\u077e\u077b\3\2\2\2\u077e\u077c\3\2\2\2\u077f\u0173\3\2\2\2\u0780\u0785"
      + "\5\u0180\u00c1\2\u0781\u0782\7\22\2\2\u0782\u0784\5\u0180\u00c1\2\u0783"
      + "\u0781\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2"
      + "\2\2\u0786\u0175\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0792\5\u0164\u00b3"
      + "\2\u0789\u078a\5\b\5\2\u078a\u078b\7\3\2\2\u078b\u078c\5\u0164\u00b3\2"
      + "\u078c\u0792\3\2\2\2\u078d\u078e\5\u0158\u00ad\2\u078e\u078f\7\3\2\2\u078f"
      + "\u0790\5\u0164\u00b3\2\u0790\u0792\3\2\2\2\u0791\u0788\3\2\2\2\u0791\u0789"
      + "\3\2\2\2\u0791\u078d\3\2\2\2\u0792\u0177\3\2\2\2\u0793\u0794\7F\2\2\u0794"
      + "\u0795\5\20\t\2\u0795\u0797\5\u017a\u00be\2\u0796\u0798\5$\23\2\u0797"
      + "\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u07aa\3\2\2\2\u0799\u079a\7F"
      + "\2\2\u079a\u079b\5\32\16\2\u079b\u079d\5\u017a\u00be\2\u079c\u079e\5$"
      + "\23\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u07aa\3\2\2\2\u079f"
      + "\u07a0\7F\2\2\u07a0\u07a1\5\20\t\2\u07a1\u07a2\5$\23\2\u07a2\u07a3\5\u00e8"
      + "u\2\u07a3\u07aa\3\2\2\2\u07a4\u07a5\7F\2\2\u07a5\u07a6\5\32\16\2\u07a6"
      + "\u07a7\5$\23\2\u07a7\u07a8\5\u00e8u\2\u07a8\u07aa\3\2\2\2\u07a9\u0793"
      + "\3\2\2\2\u07a9\u0799\3\2\2\2\u07a9\u079f\3\2\2\2\u07a9\u07a4\3\2\2\2\u07aa"
      + "\u0179\3\2\2\2\u07ab\u07af\5\u017c\u00bf\2\u07ac\u07ae\5\u017c\u00bf\2"
      + "\u07ad\u07ac\3\2\2\2\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0"
      + "\3\2\2\2\u07b0\u017b\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b4\5\u00d6l"
      + "\2\u07b3\u07b2\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6"
      + "\3\2\2\2\u07b6\u07b8\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07b9\7\f\2\2\u07b9"
      + "\u07ba\5\u0180\u00c1\2\u07ba\u07bb\7\r\2\2\u07bb\u017d\3\2\2\2\u07bc\u07bd"
      + "\5\u0180\u00c1\2\u07bd\u017f\3\2\2\2\u07be\u07c1\5\u0182\u00c2\2\u07bf"
      + "\u07c1\5\u018a\u00c6\2\u07c0\u07be\3\2\2\2\u07c0\u07bf\3\2\2\2\u07c1\u0181"
      + "\3\2\2\2\u07c2\u07c3\5\u0184\u00c3\2\u07c3\u07c4\7H\2\2\u07c4\u07c5\5"
      + "\u0188\u00c5\2\u07c5\u0183\3\2\2\2\u07c6\u07d1\7l\2\2\u07c7\u07c9\7*\2"
      + "\2\u07c8\u07ca\5\u0086D\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"
      + "\u07cb\3\2\2\2\u07cb\u07d1\7+\2\2\u07cc\u07cd\7*\2\2\u07cd\u07ce\5\u0186"
      + "\u00c4\2\u07ce\u07cf\7+\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07c6\3\2\2\2\u07d0"
      + "\u07c7\3\2\2\2\u07d0\u07cc\3\2\2\2\u07d1\u0185\3\2\2\2\u07d2\u07d7\7l"
      + "\2\2\u07d3\u07d4\7\22\2\2\u07d4\u07d6\7l\2\2\u07d5\u07d3\3\2\2\2\u07d6"
      + "\u07d9\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u0187\3\2"
      + "\2\2\u07d9\u07d7\3\2\2\2\u07da\u07dd\5\u0180\u00c1\2\u07db\u07dd\5\u00ec"
      + "w\2\u07dc\u07da\3\2\2\2\u07dc\u07db\3\2\2\2\u07dd\u0189\3\2\2\2\u07de"
      + "\u07e1\5\u0192\u00ca\2\u07df\u07e1\5\u018c\u00c7\2\u07e0\u07de\3\2\2\2"
      + "\u07e0\u07df\3\2\2\2\u07e1\u018b\3\2\2\2\u07e2\u07e3\5\u018e\u00c8\2\u07e3"
      + "\u07e4\5\u0190\u00c9\2\u07e4\u07e5\5\u0180\u00c1\2\u07e5\u018d\3\2\2\2"
      + "\u07e6\u07ea\5\b\5\2\u07e7\u07ea\5\u01b0\u00d9\2\u07e8\u07ea\5\u01b2\u00da"
      + "\2\u07e9\u07e6\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07e8\3\2\2\2\u07ea\u018f"
      + "\3\2\2\2\u07eb\u07ec\t\n\2\2\u07ec\u0191\3\2\2\2\u07ed\u07f5\5\u0194\u00cb"
      + "\2\u07ee\u07ef\5\u0194\u00cb\2\u07ef\u07f0\7\23\2\2\u07f0\u07f1\5\u0180"
      + "\u00c1\2\u07f1\u07f2\7\63\2\2\u07f2\u07f3\5\u0192\u00ca\2\u07f3\u07f5"
      + "\3\2\2\2\u07f4\u07ed\3\2\2\2\u07f4\u07ee\3\2\2\2\u07f5\u0193\3\2\2\2\u07f6"
      + "\u07f7\b\u00cb\1\2\u07f7\u07f8\5\u0196\u00cc\2\u07f8\u07fe\3\2\2\2\u07f9"
      + "\u07fa\f\3\2\2\u07fa\u07fb\7T\2\2\u07fb\u07fd\5\u0196\u00cc\2\u07fc\u07f9"
      + "\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff"
      + "\u0195\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u0802\b\u00cc\1\2\u0802\u0803"
      + "\5\u0198\u00cd\2\u0803\u0809\3\2\2\2\u0804\u0805\f\3\2\2\u0805\u0806\7"
      + "U\2\2\u0806\u0808\5\u0198\u00cd\2\u0807\u0804\3\2\2\2\u0808\u080b\3\2"
      + "\2\2\u0809\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u0197\3\2\2\2\u080b"
      + "\u0809\3\2\2\2\u080c\u080d\b\u00cd\1\2\u080d\u080e\5\u019a\u00ce\2\u080e"
      + "\u0814\3\2\2\2\u080f\u0810\f\3\2\2\u0810\u0811\7D\2\2\u0811\u0813\5\u019a"
      + "\u00ce\2\u0812\u080f\3\2\2\2\u0813\u0816\3\2\2\2\u0814\u0812\3\2\2\2\u0814"
      + "\u0815\3\2\2\2\u0815\u0199\3\2\2\2\u0816\u0814\3\2\2\2\u0817\u0818\b\u00ce"
      + "\1\2\u0818\u0819\5\u019c\u00cf\2\u0819\u081f\3\2\2\2\u081a\u081b\f\3\2"
      + "\2\u081b\u081c\7V\2\2\u081c\u081e\5\u019c\u00cf\2\u081d\u081a\3\2\2\2"
      + "\u081e\u0821\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u019b"
      + "\3\2\2\2\u0821\u081f\3\2\2\2\u0822\u0823\b\u00cf\1\2\u0823\u0824\5\u019e"
      + "\u00d0\2\u0824\u082a\3\2\2\2\u0825\u0826\f\3\2\2\u0826\u0827\7\17\2\2"
      + "\u0827\u0829\5\u019e\u00d0\2\u0828\u0825\3\2\2\2\u0829\u082c\3\2\2\2\u082a"
      + "\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u019d\3\2\2\2\u082c\u082a\3\2"
      + "\2\2\u082d\u082e\b\u00d0\1\2\u082e\u082f\5\u01a0\u00d1\2\u082f\u0838\3"
      + "\2\2\2\u0830\u0831\f\4\2\2\u0831\u0832\7W\2\2\u0832\u0837\5\u01a0\u00d1"
      + "\2\u0833\u0834\f\3\2\2\u0834\u0835\7X\2\2\u0835\u0837\5\u01a0\u00d1\2"
      + "\u0836\u0830\3\2\2\2\u0836\u0833\3\2\2\2\u0837\u083a\3\2\2\2\u0838\u0836"
      + "\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u019f\3\2\2\2\u083a\u0838\3\2\2\2\u083b"
      + "\u083c\b\u00d1\1\2\u083c\u083d\5\u01a2\u00d2\2\u083d\u084f\3\2\2\2\u083e"
      + "\u083f\f\7\2\2\u083f\u0840\7\20\2\2\u0840\u084e\5\u01a2\u00d2\2\u0841"
      + "\u0842\f\6\2\2\u0842\u0843\7\21\2\2\u0843\u084e\5\u01a2\u00d2\2\u0844"
      + "\u0845\f\5\2\2\u0845\u0846\7Y\2\2\u0846\u084e\5\u01a2\u00d2\2\u0847\u0848"
      + "\f\4\2\2\u0848\u0849\7Z\2\2\u0849\u084e\5\u01a2\u00d2\2\u084a\u084b\f"
      + "\3\2\2\u084b\u084c\7[\2\2\u084c\u084e\5\30\r\2\u084d\u083e\3\2\2\2\u084d"
      + "\u0841\3\2\2\2\u084d\u0844\3\2\2\2\u084d\u0847\3\2\2\2\u084d\u084a\3\2"
      + "\2\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850"
      + "\u01a1\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0853\b\u00d2\1\2\u0853\u0854"
      + "\5\u01a4\u00d3\2\u0854\u0860\3\2\2\2\u0855\u0856\f\5\2\2\u0856\u0857\7"
      + "\\\2\2\u0857\u085f\5\u01a4\u00d3\2\u0858\u0859\f\4\2\2\u0859\u085a\7]"
      + "\2\2\u085a\u085f\5\u01a4\u00d3\2\u085b\u085c\f\3\2\2\u085c\u085d\7^\2"
      + "\2\u085d\u085f\5\u01a4\u00d3\2\u085e\u0855\3\2\2\2\u085e\u0858\3\2\2\2"
      + "\u085e\u085b\3\2\2\2\u085f\u0862\3\2\2\2\u0860\u085e\3\2\2\2\u0860\u0861"
      + "\3\2\2\2\u0861\u01a3\3\2\2\2\u0862\u0860\3\2\2\2\u0863\u0864\b\u00d3\1"
      + "\2\u0864\u0865\5\u01a6\u00d4\2\u0865\u086e\3\2\2\2\u0866\u0867\f\4\2\2"
      + "\u0867\u0868\7_\2\2\u0868\u086d\5\u01a6\u00d4\2\u0869\u086a\f\3\2\2\u086a"
      + "\u086b\7`\2\2\u086b\u086d\5\u01a6\u00d4\2\u086c\u0866\3\2\2\2\u086c\u0869"
      + "\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2\2\2\u086f"
      + "\u01a5\3\2\2\2\u0870\u086e\3\2\2\2\u0871\u0872\b\u00d4\1\2\u0872\u0873"
      + "\5\u01a8\u00d5\2\u0873\u087f\3\2\2\2\u0874\u0875\f\5\2\2\u0875\u0876\7"
      + "\30\2\2\u0876\u087e\5\u01a8\u00d5\2\u0877\u0878\f\4\2\2\u0878\u0879\7"
      + "a\2\2\u0879\u087e\5\u01a8\u00d5\2\u087a\u087b\f\3\2\2\u087b\u087c\7b\2"
      + "\2\u087c\u087e\5\u01a8\u00d5\2\u087d\u0874\3\2\2\2\u087d\u0877\3\2\2\2"
      + "\u087d\u087a\3\2\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2\2\u087f\u0880"
      + "\3\2\2\2\u0880\u01a7\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0883\7\64\2\2"
      + "\u0883\u088c\5\u01a8\u00d5\2\u0884\u0885\7\65\2\2\u0885\u088c\5\u01a8"
      + "\u00d5\2\u0886\u0887\7_\2\2\u0887\u088c\5\u01a8\u00d5\2\u0888\u0889\7"
      + "`\2\2\u0889\u088c\5\u01a8\u00d5\2\u088a\u088c\5\u01aa\u00d6\2\u088b\u0882"
      + "\3\2\2\2\u088b\u0884\3\2\2\2\u088b\u0886\3\2\2\2\u088b\u0888\3\2\2\2\u088b"
      + "\u088a\3\2\2\2\u088c\u01a9\3\2\2\2\u088d\u0894\5\u01ac\u00d7\2\u088e\u088f"
      + "\7c\2\2\u088f\u0894\5\u01a8\u00d5\2\u0890\u0891\7d\2\2\u0891\u0894\5\u01a8"
      + "\u00d5\2\u0892\u0894\5\u01ae\u00d8\2\u0893\u088d\3\2\2\2\u0893\u088e\3"
      + "\2\2\2\u0893\u0890\3\2\2\2\u0893\u0892\3\2\2\2\u0894\u01ab\3\2\2\2\u0895"
      + "\u0896\b\u00d7\1\2\u0896\u0899\5\u0158\u00ad\2\u0897\u0899\5\b\5\2\u0898"
      + "\u0895\3\2\2\2\u0898\u0897\3\2\2\2\u0899\u08a0\3\2\2\2\u089a\u089b\f\4"
      + "\2\2\u089b\u089f\7\64\2\2\u089c\u089d\f\3\2\2\u089d\u089f\7\65\2\2\u089e"
      + "\u089a\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e\3\2"
      + "\2\2\u08a0\u08a1\3\2\2\2\u08a1\u01ad\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3"
      + "\u08a4\7*\2\2\u08a4\u08a5\5\20\t\2\u08a5\u08a6\7+\2\2\u08a6\u08a7\5\u01a8"
      + "\u00d5\2\u08a7\u08bf\3\2\2\2\u08a8\u08a9\7*\2\2\u08a9\u08ad\5\30\r\2\u08aa"
      + "\u08ac\5,\27\2\u08ab\u08aa\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2"
      + "\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b0\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"
      + "\u08b1\7+\2\2\u08b1\u08b2\5\u01aa\u00d6\2\u08b2\u08bf\3\2\2\2\u08b3\u08b4"
      + "\7*\2\2\u08b4\u08b8\5\30\r\2\u08b5\u08b7\5,\27\2\u08b6\u08b5\3\2\2\2\u08b7"
      + "\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2"
      + "\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08bc\7+\2\2\u08bc\u08bd\5\u0182\u00c2"
      + "\2\u08bd\u08bf\3\2\2\2\u08be\u08a3\3\2\2\2\u08be\u08a8\3\2\2\2\u08be\u08b3"
      + "\3\2\2\2\u08bf\u01af\3\2\2\2\u08c0\u08c1\5\u0158\u00ad\2\u08c1\u08c2\13"
      + "\2\2\2\u08c2\u08c3\7l\2\2\u08c3\u08cd\3\2\2\2\u08c4\u08c5\7\24\2\2\u08c5"
      + "\u08c6\13\2\2\2\u08c6\u08cd\7l\2\2\u08c7\u08c8\7e\2\2\u08c8\u08c9\7\3"
      + "\2\2\u08c9\u08ca\7\24\2\2\u08ca\u08cb\7\3\2\2\u08cb\u08cd\7l\2\2\u08cc"
      + "\u08c0\3\2\2\2\u08cc\u08c4\3\2\2\2\u08cc\u08c7\3\2\2\2\u08cd\u01b1\3\2"
      + "\2\2\u08ce\u08cf\5\b\5\2\u08cf\u08d0\7\f\2\2\u08d0\u08d1\5\u0180\u00c1"
      + "\2\u08d1\u08d2\7\r\2\2\u08d2\u08d9\3\2\2\2\u08d3\u08d4\5\u015a\u00ae\2"
      + "\u08d4\u08d5\7\f\2\2\u08d5\u08d6\5\u0180\u00c1\2\u08d6\u08d7\7\r\2\2\u08d7"
      + "\u08d9\3\2\2\2\u08d8\u08ce\3\2\2\2\u08d8\u08d3\3\2\2\2\u08d9\u01b3\3\2"
      + "\2\2\u08da\u08ec\5\u016a\u00b6\2\u08db\u08dc\5\4\3\2\u08dc\u08dd\5\u0168"
      + "\u00b5\2\u08dd\u08ec\3\2\2\2\u08de\u08df\5\b\5\2\u08df\u08e0\5\u0168\u00b5"
      + "\2\u08e0\u08ec\3\2\2\2\u08e1\u08e2\5\u0158\u00ad\2\u08e2\u08e3\5\u0168"
      + "\u00b5\2\u08e3\u08ec\3\2\2\2\u08e4\u08e5\7\24\2\2\u08e5\u08ec\5\u0168"
      + "\u00b5\2\u08e6\u08e7\5\4\3\2\u08e7\u08e8\7\3\2\2\u08e8\u08e9\7\24\2\2"
      + "\u08e9\u08ea\5\u0168\u00b5\2\u08ea\u08ec\3\2\2\2\u08eb\u08da\3\2\2\2\u08eb"
      + "\u08db\3\2\2\2\u08eb\u08de\3\2\2\2\u08eb\u08e1\3\2\2\2\u08eb\u08e4\3\2"
      + "\2\2\u08eb\u08e6\3\2\2\2\u08ec\u01b5\3\2\2\2\u08ed\u08ee\t\13\2\2\u08ee"
      + "\u01b7\3\2\2\2\u00fa\u01c0\u01c8\u01cf\u01d7\u01e0\u01e5\u01ea\u01f1\u01f5"
      + "\u01f9\u0202\u0206\u020b\u0210\u0216\u021b\u021f\u0227\u0235\u023a\u0242"
      + "\u0249\u024f\u0254\u025f\u0262\u0270\u0275\u027a\u027f\u0285\u0288\u028d"
      + "\u0293\u0299\u02a2\u02ad\u02ca\u02ce\u02d3\u02d9\u02dc\u02df\u02e7\u02ea"
      + "\u02f5\u0303\u030a\u0313\u031a\u031f\u032a\u032d\u0334\u033a\u033e\u0342"
      + "\u0346\u034a\u034f\u0353\u0357\u035d\u0362\u0366\u0376\u037b\u0385\u0388"
      + "\u038d\u0393\u0399\u039b\u039f\u03a4\u03a8\u03af\u03b6\u03be\u03c1\u03c6"
      + "\u03ce\u03d3\u03da\u03e1\u03e6\u03ec\u03f8\u03fd\u0401\u040b\u0410\u0418"
      + "\u041b\u0420\u0428\u042b\u0430\u0435\u043a\u043f\u0446\u044b\u0453\u0458"
      + "\u045d\u0462\u0468\u046e\u0471\u0474\u047b\u0480\u0486\u0489\u048c\u0494"
      + "\u0499\u049e\u04a4\u04a7\u04af\u04b2\u04bb\u04c5\u04c8\u04d0\u04d3\u04d8"
      + "\u04e0\u04e3\u04e8\u04f4\u04fe\u0503\u050b\u050e\u0514\u0517\u051f\u0525"
      + "\u052e\u0538\u053c\u053f\u0548\u0556\u0559\u0562\u0567\u056f\u0575\u057d"
      + "\u0589\u0590\u059e\u05b4\u05e2\u05ee\u05f4\u0600\u060d\u0627\u062b\u0630"
      + "\u0634\u0638\u0640\u0644\u0648\u064f\u0658\u0660\u066f\u067b\u0681\u0687"
      + "\u069c\u06a1\u06a7\u06b3\u06be\u06c8\u06cb\u06d0\u06d9\u06df\u06eb\u06f2"
      + "\u06fa\u0701\u0705\u070b\u0724\u072c\u0738\u0744\u0748\u074d\u0752\u0756"
      + "\u075a\u0761\u0768\u076e\u0774\u077e\u0785\u0791\u0797\u079d\u07a9\u07af"
      + "\u07b5\u07c0\u07c9\u07d0\u07d7\u07dc\u07e0\u07e9\u07f4\u07fe\u0809\u0814"
      + "\u081f\u082a\u0836\u0838\u084d\u084f\u085e\u0860\u086c\u086e\u087d\u087f"
      + "\u088b\u0893\u0898\u089e\u08a0\u08ad\u08b8\u08be\u08cc\u08d8\u08eb";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}