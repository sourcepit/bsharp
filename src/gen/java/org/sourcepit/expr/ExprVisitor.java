// Generated from Expr.g4 by ANTLR 4.5.1

package org.sourcepit.expr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(ExprParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(ExprParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(ExprParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(ExprParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(ExprParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ExprParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(ExprParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(ExprParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(ExprParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(ExprParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ExprParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ExprParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(ExprParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(ExprParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ExprParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(ExprParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ExprParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ExprParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(ExprParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ExprParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(ExprParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ExprParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(ExprParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(ExprParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalAndEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndEexpression(ExprParser.ConditionalAndEexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ExprParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalEexpression(ExprParser.ConditionalEexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ExprParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ExprParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(ExprParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(ExprParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ExprParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ExprParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ExprParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(ExprParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalOrEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrEexpression(ExprParser.ConditionalOrEexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentEexpression(ExprParser.AssignmentEexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ExprParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ExprParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(ExprParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(ExprParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(ExprParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(ExprParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(ExprParser.MultiplicativeOperatorContext ctx);
}