// Generated from Primary.g4 by ANTLR 4.5.1

package org.sourcepit.primary;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrimaryParser}.
 */
public interface PrimaryListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by the {@code parenthesizedExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterParenthesizedExpression(PrimaryParser.ParenthesizedExpressionContext ctx);

   /**
    * Exit a parse tree produced by the {@code parenthesizedExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitParenthesizedExpression(PrimaryParser.ParenthesizedExpressionContext ctx);

   /**
    * Enter a parse tree produced by the {@code classInstanceCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterClassInstanceCreationExpression(PrimaryParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Exit a parse tree produced by the {@code classInstanceCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitClassInstanceCreationExpression(PrimaryParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Enter a parse tree produced by the {@code classLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterClassLiteral(PrimaryParser.ClassLiteralContext ctx);

   /**
    * Exit a parse tree produced by the {@code classLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitClassLiteral(PrimaryParser.ClassLiteralContext ctx);

   /**
    * Enter a parse tree produced by the {@code arrayCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayCreationExpression(PrimaryParser.ArrayCreationExpressionContext ctx);

   /**
    * Exit a parse tree produced by the {@code arrayCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayCreationExpression(PrimaryParser.ArrayCreationExpressionContext ctx);

   /**
    * Enter a parse tree produced by the {@code thisLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterThisLiteral(PrimaryParser.ThisLiteralContext ctx);

   /**
    * Exit a parse tree produced by the {@code thisLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitThisLiteral(PrimaryParser.ThisLiteralContext ctx);

   /**
    * Enter a parse tree produced by the {@code lexicalLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterLexicalLiteral(PrimaryParser.LexicalLiteralContext ctx);

   /**
    * Exit a parse tree produced by the {@code lexicalLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitLexicalLiteral(PrimaryParser.LexicalLiteralContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgumentsOrDiamond(PrimaryParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgumentsOrDiamond(PrimaryParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldAccess(PrimaryParser.FieldAccessContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldAccess(PrimaryParser.FieldAccessContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayAccess(PrimaryParser.ArrayAccessContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayAccess(PrimaryParser.ArrayAccessContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodInvocation(PrimaryParser.MethodInvocationContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodInvocation(PrimaryParser.MethodInvocationContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#argumentList}.
    * 
    * @param ctx the parse tree
    */
   void enterArgumentList(PrimaryParser.ArgumentListContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#argumentList}.
    * 
    * @param ctx the parse tree
    */
   void exitArgumentList(PrimaryParser.ArgumentListContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#methodReference}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodReference(PrimaryParser.MethodReferenceContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#methodReference}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodReference(PrimaryParser.MethodReferenceContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#dimExprs}.
    * 
    * @param ctx the parse tree
    */
   void enterDimExprs(PrimaryParser.DimExprsContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#dimExprs}.
    * 
    * @param ctx the parse tree
    */
   void exitDimExprs(PrimaryParser.DimExprsContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#dimExpr}.
    * 
    * @param ctx the parse tree
    */
   void enterDimExpr(PrimaryParser.DimExprContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#dimExpr}.
    * 
    * @param ctx the parse tree
    */
   void exitDimExpr(PrimaryParser.DimExprContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#constantExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterConstantExpression(PrimaryParser.ConstantExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#constantExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitConstantExpression(PrimaryParser.ConstantExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void enterExpression(PrimaryParser.ExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void exitExpression(PrimaryParser.ExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#type}.
    * 
    * @param ctx the parse tree
    */
   void enterType(PrimaryParser.TypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#type}.
    * 
    * @param ctx the parse tree
    */
   void exitType(PrimaryParser.TypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#primitiveType}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimitiveType(PrimaryParser.PrimitiveTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#primitiveType}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimitiveType(PrimaryParser.PrimitiveTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#numericType}.
    * 
    * @param ctx the parse tree
    */
   void enterNumericType(PrimaryParser.NumericTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#numericType}.
    * 
    * @param ctx the parse tree
    */
   void exitNumericType(PrimaryParser.NumericTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#integralType}.
    * 
    * @param ctx the parse tree
    */
   void enterIntegralType(PrimaryParser.IntegralTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#integralType}.
    * 
    * @param ctx the parse tree
    */
   void exitIntegralType(PrimaryParser.IntegralTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    */
   void enterFloatingPointType(PrimaryParser.FloatingPointTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    */
   void exitFloatingPointType(PrimaryParser.FloatingPointTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#referenceType}.
    * 
    * @param ctx the parse tree
    */
   void enterReferenceType(PrimaryParser.ReferenceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#referenceType}.
    * 
    * @param ctx the parse tree
    */
   void exitReferenceType(PrimaryParser.ReferenceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterClassOrInterfaceType(PrimaryParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitClassOrInterfaceType(PrimaryParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#classType}.
    * 
    * @param ctx the parse tree
    */
   void enterClassType(PrimaryParser.ClassTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#classType}.
    * 
    * @param ctx the parse tree
    */
   void exitClassType(PrimaryParser.ClassTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#interfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceType(PrimaryParser.InterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#interfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceType(PrimaryParser.InterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeVariable}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeVariable(PrimaryParser.TypeVariableContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeVariable}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeVariable(PrimaryParser.TypeVariableContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#arrayType}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayType(PrimaryParser.ArrayTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#arrayType}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayType(PrimaryParser.ArrayTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#dims}.
    * 
    * @param ctx the parse tree
    */
   void enterDims(PrimaryParser.DimsContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#dims}.
    * 
    * @param ctx the parse tree
    */
   void exitDims(PrimaryParser.DimsContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeParameter(PrimaryParser.TypeParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeParameter(PrimaryParser.TypeParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeBound}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeBound(PrimaryParser.TypeBoundContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeBound}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeBound(PrimaryParser.TypeBoundContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#additionalBound}.
    * 
    * @param ctx the parse tree
    */
   void enterAdditionalBound(PrimaryParser.AdditionalBoundContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#additionalBound}.
    * 
    * @param ctx the parse tree
    */
   void exitAdditionalBound(PrimaryParser.AdditionalBoundContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeArguments}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArguments(PrimaryParser.TypeArgumentsContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeArguments}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArguments(PrimaryParser.TypeArgumentsContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgumentList(PrimaryParser.TypeArgumentListContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgumentList(PrimaryParser.TypeArgumentListContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeArgument}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgument(PrimaryParser.TypeArgumentContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeArgument}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgument(PrimaryParser.TypeArgumentContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#wildcard}.
    * 
    * @param ctx the parse tree
    */
   void enterWildcard(PrimaryParser.WildcardContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#wildcard}.
    * 
    * @param ctx the parse tree
    */
   void exitWildcard(PrimaryParser.WildcardContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    */
   void enterWildcardBounds(PrimaryParser.WildcardBoundsContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    */
   void exitWildcardBounds(PrimaryParser.WildcardBoundsContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#packageName}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageName(PrimaryParser.PackageNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#packageName}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageName(PrimaryParser.PackageNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeName(PrimaryParser.TypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeName(PrimaryParser.TypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageOrTypeName(PrimaryParser.PackageOrTypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageOrTypeName(PrimaryParser.PackageOrTypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#expressionName}.
    * 
    * @param ctx the parse tree
    */
   void enterExpressionName(PrimaryParser.ExpressionNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#expressionName}.
    * 
    * @param ctx the parse tree
    */
   void exitExpressionName(PrimaryParser.ExpressionNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodName(PrimaryParser.MethodNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodName(PrimaryParser.MethodNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    */
   void enterAmbiguousName(PrimaryParser.AmbiguousNameContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    */
   void exitAmbiguousName(PrimaryParser.AmbiguousNameContext ctx);

   /**
    * Enter a parse tree produced by {@link PrimaryParser#literal}.
    * 
    * @param ctx the parse tree
    */
   void enterLiteral(PrimaryParser.LiteralContext ctx);

   /**
    * Exit a parse tree produced by {@link PrimaryParser#literal}.
    * 
    * @param ctx the parse tree
    */
   void exitLiteral(PrimaryParser.LiteralContext ctx);
}