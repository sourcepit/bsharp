// Generated from Primary.g4 by ANTLR 4.5.1

package org.sourcepit.primary;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrimaryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface PrimaryVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by the {@code parenthesizedExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitParenthesizedExpression(PrimaryParser.ParenthesizedExpressionContext ctx);

   /**
    * Visit a parse tree produced by the {@code classInstanceCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassInstanceCreationExpression(PrimaryParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Visit a parse tree produced by the {@code classLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassLiteral(PrimaryParser.ClassLiteralContext ctx);

   /**
    * Visit a parse tree produced by the {@code arrayCreationExpression}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayCreationExpression(PrimaryParser.ArrayCreationExpressionContext ctx);

   /**
    * Visit a parse tree produced by the {@code thisLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitThisLiteral(PrimaryParser.ThisLiteralContext ctx);

   /**
    * Visit a parse tree produced by the {@code lexicalLiteral}
    * labeled alternative in {@link PrimaryParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLexicalLiteral(PrimaryParser.LexicalLiteralContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgumentsOrDiamond(PrimaryParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldAccess(PrimaryParser.FieldAccessContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayAccess(PrimaryParser.ArrayAccessContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodInvocation(PrimaryParser.MethodInvocationContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#argumentList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArgumentList(PrimaryParser.ArgumentListContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#methodReference}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodReference(PrimaryParser.MethodReferenceContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#dimExprs}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDimExprs(PrimaryParser.DimExprsContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#dimExpr}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDimExpr(PrimaryParser.DimExprContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#constantExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstantExpression(PrimaryParser.ConstantExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#expression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpression(PrimaryParser.ExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#type}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitType(PrimaryParser.TypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#primitiveType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimitiveType(PrimaryParser.PrimitiveTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#numericType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNumericType(PrimaryParser.NumericTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#integralType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIntegralType(PrimaryParser.IntegralTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFloatingPointType(PrimaryParser.FloatingPointTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#referenceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitReferenceType(PrimaryParser.ReferenceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassOrInterfaceType(PrimaryParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#classType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassType(PrimaryParser.ClassTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#interfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceType(PrimaryParser.InterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeVariable}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeVariable(PrimaryParser.TypeVariableContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#arrayType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayType(PrimaryParser.ArrayTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#dims}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDims(PrimaryParser.DimsContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeParameter(PrimaryParser.TypeParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeBound}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeBound(PrimaryParser.TypeBoundContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#additionalBound}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAdditionalBound(PrimaryParser.AdditionalBoundContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeArguments}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArguments(PrimaryParser.TypeArgumentsContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgumentList(PrimaryParser.TypeArgumentListContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeArgument}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgument(PrimaryParser.TypeArgumentContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#wildcard}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWildcard(PrimaryParser.WildcardContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWildcardBounds(PrimaryParser.WildcardBoundsContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#packageName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageName(PrimaryParser.PackageNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#typeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeName(PrimaryParser.TypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageOrTypeName(PrimaryParser.PackageOrTypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#expressionName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpressionName(PrimaryParser.ExpressionNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#methodName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodName(PrimaryParser.MethodNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAmbiguousName(PrimaryParser.AmbiguousNameContext ctx);

   /**
    * Visit a parse tree produced by {@link PrimaryParser#literal}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLiteral(PrimaryParser.LiteralContext ctx);
}