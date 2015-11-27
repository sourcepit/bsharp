// Generated from Expr.g4 by ANTLR 4.5.1

package org.sourcepit.expr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(ExprParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(ExprParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(ExprParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(ExprParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ExprParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ExprParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(ExprParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(ExprParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(ExprParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(ExprParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ExprParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ExprParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ExprParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ExprParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ExprParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ExprParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ExprParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ExprParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ExprParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ExprParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ExprParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ExprParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ExprParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ExprParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(ExprParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(ExprParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ExprParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ExprParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ExprParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ExprParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ExprParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ExprParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ExprParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ExprParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ExprParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ExprParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ExprParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ExprParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ExprParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ExprParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ExprParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ExprParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ExprParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ExprParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ExprParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ExprParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ExprParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ExprParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalAndEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndEexpression(ExprParser.ConditionalAndEexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalAndEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndEexpression(ExprParser.ConditionalAndEexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ExprParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ExprParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalEexpression(ExprParser.ConditionalEexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalEexpression(ExprParser.ConditionalEexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ExprParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ExprParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ExprParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ExprParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ExprParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ExprParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ExprParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ExprParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ExprParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ExprParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ExprParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ExprParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ExprParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ExprParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ExprParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ExprParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalOrEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrEexpression(ExprParser.ConditionalOrEexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalOrEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrEexpression(ExprParser.ConditionalOrEexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentEexpression(ExprParser.AssignmentEexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentEexpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentEexpression(ExprParser.AssignmentEexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ExprParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ExprParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ExprParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ExprParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(ExprParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(ExprParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(ExprParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(ExprParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(ExprParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(ExprParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(ExprParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(ExprParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(ExprParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(ExprParser.MultiplicativeOperatorContext ctx);
}