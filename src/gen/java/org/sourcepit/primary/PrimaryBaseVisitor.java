// Generated from Primary.g4 by ANTLR 4.5.1

package org.sourcepit.primary;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link PrimaryVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public class PrimaryBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PrimaryVisitor<T> {
   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitParenthesizedExpression(PrimaryParser.ParenthesizedExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassInstanceCreationExpression(PrimaryParser.ClassInstanceCreationExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassLiteral(PrimaryParser.ClassLiteralContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitArrayCreationExpression(PrimaryParser.ArrayCreationExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitThisLiteral(PrimaryParser.ThisLiteralContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitLexicalLiteral(PrimaryParser.LexicalLiteralContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeArgumentsOrDiamond(PrimaryParser.TypeArgumentsOrDiamondContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitFieldAccess(PrimaryParser.FieldAccessContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitArrayAccess(PrimaryParser.ArrayAccessContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodInvocation(PrimaryParser.MethodInvocationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitArgumentList(PrimaryParser.ArgumentListContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodReference(PrimaryParser.MethodReferenceContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitDimExprs(PrimaryParser.DimExprsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitDimExpr(PrimaryParser.DimExprContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitConstantExpression(PrimaryParser.ConstantExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitExpression(PrimaryParser.ExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitType(PrimaryParser.TypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPrimitiveType(PrimaryParser.PrimitiveTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitNumericType(PrimaryParser.NumericTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitIntegralType(PrimaryParser.IntegralTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitFloatingPointType(PrimaryParser.FloatingPointTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitReferenceType(PrimaryParser.ReferenceTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassOrInterfaceType(PrimaryParser.ClassOrInterfaceTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassType(PrimaryParser.ClassTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitInterfaceType(PrimaryParser.InterfaceTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeVariable(PrimaryParser.TypeVariableContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitArrayType(PrimaryParser.ArrayTypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitDims(PrimaryParser.DimsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeParameter(PrimaryParser.TypeParameterContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeBound(PrimaryParser.TypeBoundContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitAdditionalBound(PrimaryParser.AdditionalBoundContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeArguments(PrimaryParser.TypeArgumentsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeArgumentList(PrimaryParser.TypeArgumentListContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeArgument(PrimaryParser.TypeArgumentContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitWildcard(PrimaryParser.WildcardContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitWildcardBounds(PrimaryParser.WildcardBoundsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPackageName(PrimaryParser.PackageNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeName(PrimaryParser.TypeNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPackageOrTypeName(PrimaryParser.PackageOrTypeNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitExpressionName(PrimaryParser.ExpressionNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodName(PrimaryParser.MethodNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitAmbiguousName(PrimaryParser.AmbiguousNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitLiteral(PrimaryParser.LiteralContext ctx) {
      return visitChildren(ctx);
   }
}