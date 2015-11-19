// Generated from BSharp.g4 by ANTLR 4.5.1

package org.sourcepit.bsharp;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link BSharpVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public class BSharpBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements BSharpVisitor<T> {
   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPackageName(BSharpParser.PackageNameContext ctx) {
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
   public T visitTypeName(BSharpParser.TypeNameContext ctx) {
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
   public T visitPackageOrTypeName(BSharpParser.PackageOrTypeNameContext ctx) {
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
   public T visitExpressionName(BSharpParser.ExpressionNameContext ctx) {
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
   public T visitMethodName(BSharpParser.MethodNameContext ctx) {
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
   public T visitAmbiguousName(BSharpParser.AmbiguousNameContext ctx) {
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
   public T visitType(BSharpParser.TypeContext ctx) {
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
   public T visitPrimitiveType(BSharpParser.PrimitiveTypeContext ctx) {
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
   public T visitNumericType(BSharpParser.NumericTypeContext ctx) {
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
   public T visitIntegralType(BSharpParser.IntegralTypeContext ctx) {
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
   public T visitFloatingPointType(BSharpParser.FloatingPointTypeContext ctx) {
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
   public T visitReferenceType(BSharpParser.ReferenceTypeContext ctx) {
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
   public T visitClassOrInterfaceType(BSharpParser.ClassOrInterfaceTypeContext ctx) {
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
   public T visitClassType(BSharpParser.ClassTypeContext ctx) {
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
   public T visitInterfaceType(BSharpParser.InterfaceTypeContext ctx) {
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
   public T visitTypeVariable(BSharpParser.TypeVariableContext ctx) {
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
   public T visitArrayType(BSharpParser.ArrayTypeContext ctx) {
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
   public T visitDims(BSharpParser.DimsContext ctx) {
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
   public T visitTypeParameter(BSharpParser.TypeParameterContext ctx) {
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
   public T visitTypeParameterModifier(BSharpParser.TypeParameterModifierContext ctx) {
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
   public T visitTypeBound(BSharpParser.TypeBoundContext ctx) {
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
   public T visitAdditionalBound(BSharpParser.AdditionalBoundContext ctx) {
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
   public T visitTypeArguments(BSharpParser.TypeArgumentsContext ctx) {
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
   public T visitTypeArgumentList(BSharpParser.TypeArgumentListContext ctx) {
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
   public T visitTypeArgument(BSharpParser.TypeArgumentContext ctx) {
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
   public T visitWildcard(BSharpParser.WildcardContext ctx) {
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
   public T visitWildcardBounds(BSharpParser.WildcardBoundsContext ctx) {
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
   public T visitCompilationUnit(BSharpParser.CompilationUnitContext ctx) {
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
   public T visitPackageDeclaration(BSharpParser.PackageDeclarationContext ctx) {
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
   public T visitPackageModifier(BSharpParser.PackageModifierContext ctx) {
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
   public T visitImportDeclaration(BSharpParser.ImportDeclarationContext ctx) {
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
   public T visitSingleTypeImportDeclaration(BSharpParser.SingleTypeImportDeclarationContext ctx) {
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
   public T visitTypeImportOnDemandDeclaration(BSharpParser.TypeImportOnDemandDeclarationContext ctx) {
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
   public T visitSingleStaticImportDeclaration(BSharpParser.SingleStaticImportDeclarationContext ctx) {
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
   public T visitStaticImportOnDemandDeclaration(BSharpParser.StaticImportOnDemandDeclarationContext ctx) {
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
   public T visitTypeDeclaration(BSharpParser.TypeDeclarationContext ctx) {
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
   public T visitClassDeclaration(BSharpParser.ClassDeclarationContext ctx) {
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
   public T visitNormalClassDeclaration(BSharpParser.NormalClassDeclarationContext ctx) {
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
   public T visitClassModifier(BSharpParser.ClassModifierContext ctx) {
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
   public T visitTypeParameters(BSharpParser.TypeParametersContext ctx) {
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
   public T visitTypeParameterList(BSharpParser.TypeParameterListContext ctx) {
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
   public T visitSuperclass(BSharpParser.SuperclassContext ctx) {
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
   public T visitSuperinterfaces(BSharpParser.SuperinterfacesContext ctx) {
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
   public T visitInterfaceTypeList(BSharpParser.InterfaceTypeListContext ctx) {
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
   public T visitClassBody(BSharpParser.ClassBodyContext ctx) {
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
   public T visitClassBodyDeclaration(BSharpParser.ClassBodyDeclarationContext ctx) {
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
   public T visitClassMemberDeclaration(BSharpParser.ClassMemberDeclarationContext ctx) {
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
   public T visitFieldDeclaration(BSharpParser.FieldDeclarationContext ctx) {
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
   public T visitFieldModifier(BSharpParser.FieldModifierContext ctx) {
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
   public T visitVariableDeclaratorList(BSharpParser.VariableDeclaratorListContext ctx) {
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
   public T visitVariableDeclarator(BSharpParser.VariableDeclaratorContext ctx) {
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
   public T visitVariableDeclaratorId(BSharpParser.VariableDeclaratorIdContext ctx) {
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
   public T visitVariableInitializer(BSharpParser.VariableInitializerContext ctx) {
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
   public T visitUnannType(BSharpParser.UnannTypeContext ctx) {
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
   public T visitUnannPrimitiveType(BSharpParser.UnannPrimitiveTypeContext ctx) {
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
   public T visitUnannReferenceType(BSharpParser.UnannReferenceTypeContext ctx) {
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
   public T visitUnannClassOrInterfaceType(BSharpParser.UnannClassOrInterfaceTypeContext ctx) {
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
   public T visitUnannClassType(BSharpParser.UnannClassTypeContext ctx) {
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
   public T visitUnannInterfaceType(BSharpParser.UnannInterfaceTypeContext ctx) {
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
   public T visitUnannTypeVariable(BSharpParser.UnannTypeVariableContext ctx) {
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
   public T visitUnannArrayType(BSharpParser.UnannArrayTypeContext ctx) {
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
   public T visitMethodDeclaration(BSharpParser.MethodDeclarationContext ctx) {
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
   public T visitMethodModifier(BSharpParser.MethodModifierContext ctx) {
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
   public T visitMethodHeader(BSharpParser.MethodHeaderContext ctx) {
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
   public T visitResult(BSharpParser.ResultContext ctx) {
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
   public T visitMethodDeclarator(BSharpParser.MethodDeclaratorContext ctx) {
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
   public T visitFormalParameterList(BSharpParser.FormalParameterListContext ctx) {
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
   public T visitFormalParameters(BSharpParser.FormalParametersContext ctx) {
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
   public T visitFormalParameter(BSharpParser.FormalParameterContext ctx) {
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
   public T visitVariableModifier(BSharpParser.VariableModifierContext ctx) {
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
   public T visitLastFormalParameter(BSharpParser.LastFormalParameterContext ctx) {
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
   public T visitReceiverParameter(BSharpParser.ReceiverParameterContext ctx) {
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
   public T visitThrows_(BSharpParser.Throws_Context ctx) {
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
   public T visitExceptionTypeList(BSharpParser.ExceptionTypeListContext ctx) {
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
   public T visitExceptionType(BSharpParser.ExceptionTypeContext ctx) {
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
   public T visitMethodBody(BSharpParser.MethodBodyContext ctx) {
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
   public T visitInstanceInitializer(BSharpParser.InstanceInitializerContext ctx) {
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
   public T visitStaticInitializer(BSharpParser.StaticInitializerContext ctx) {
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
   public T visitConstructorDeclaration(BSharpParser.ConstructorDeclarationContext ctx) {
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
   public T visitConstructorModifier(BSharpParser.ConstructorModifierContext ctx) {
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
   public T visitConstructorDeclarator(BSharpParser.ConstructorDeclaratorContext ctx) {
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
   public T visitSimpleTypeName(BSharpParser.SimpleTypeNameContext ctx) {
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
   public T visitConstructorBody(BSharpParser.ConstructorBodyContext ctx) {
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
   public T visitExplicitConstructorInvocation(BSharpParser.ExplicitConstructorInvocationContext ctx) {
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
   public T visitEnumDeclaration(BSharpParser.EnumDeclarationContext ctx) {
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
   public T visitEnumBody(BSharpParser.EnumBodyContext ctx) {
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
   public T visitEnumConstantList(BSharpParser.EnumConstantListContext ctx) {
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
   public T visitEnumConstant(BSharpParser.EnumConstantContext ctx) {
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
   public T visitEnumConstantModifier(BSharpParser.EnumConstantModifierContext ctx) {
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
   public T visitEnumBodyDeclarations(BSharpParser.EnumBodyDeclarationsContext ctx) {
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
   public T visitInterfaceDeclaration(BSharpParser.InterfaceDeclarationContext ctx) {
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
   public T visitNormalInterfaceDeclaration(BSharpParser.NormalInterfaceDeclarationContext ctx) {
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
   public T visitInterfaceModifier(BSharpParser.InterfaceModifierContext ctx) {
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
   public T visitExtendsInterfaces(BSharpParser.ExtendsInterfacesContext ctx) {
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
   public T visitInterfaceBody(BSharpParser.InterfaceBodyContext ctx) {
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
   public T visitInterfaceMemberDeclaration(BSharpParser.InterfaceMemberDeclarationContext ctx) {
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
   public T visitConstantDeclaration(BSharpParser.ConstantDeclarationContext ctx) {
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
   public T visitConstantModifier(BSharpParser.ConstantModifierContext ctx) {
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
   public T visitInterfaceMethodDeclaration(BSharpParser.InterfaceMethodDeclarationContext ctx) {
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
   public T visitInterfaceMethodModifier(BSharpParser.InterfaceMethodModifierContext ctx) {
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
   public T visitAnnotationTypeDeclaration(BSharpParser.AnnotationTypeDeclarationContext ctx) {
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
   public T visitAnnotationTypeBody(BSharpParser.AnnotationTypeBodyContext ctx) {
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
   public T visitAnnotationTypeMemberDeclaration(BSharpParser.AnnotationTypeMemberDeclarationContext ctx) {
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
   public T visitAnnotationTypeElementDeclaration(BSharpParser.AnnotationTypeElementDeclarationContext ctx) {
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
   public T visitAnnotationTypeElementModifier(BSharpParser.AnnotationTypeElementModifierContext ctx) {
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
   public T visitDefaultValue(BSharpParser.DefaultValueContext ctx) {
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
   public T visitAnnotation(BSharpParser.AnnotationContext ctx) {
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
   public T visitNormalAnnotation(BSharpParser.NormalAnnotationContext ctx) {
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
   public T visitElementValuePairList(BSharpParser.ElementValuePairListContext ctx) {
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
   public T visitElementValuePair(BSharpParser.ElementValuePairContext ctx) {
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
   public T visitElementValue(BSharpParser.ElementValueContext ctx) {
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
   public T visitElementValueArrayInitializer(BSharpParser.ElementValueArrayInitializerContext ctx) {
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
   public T visitElementValueList(BSharpParser.ElementValueListContext ctx) {
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
   public T visitMarkerAnnotation(BSharpParser.MarkerAnnotationContext ctx) {
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
   public T visitSingleElementAnnotation(BSharpParser.SingleElementAnnotationContext ctx) {
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
   public T visitArrayInitializer(BSharpParser.ArrayInitializerContext ctx) {
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
   public T visitVariableInitializerList(BSharpParser.VariableInitializerListContext ctx) {
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
   public T visitBlock(BSharpParser.BlockContext ctx) {
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
   public T visitBlockStatements(BSharpParser.BlockStatementsContext ctx) {
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
   public T visitBlockStatement(BSharpParser.BlockStatementContext ctx) {
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
   public T visitLocalVariableDeclarationStatement(BSharpParser.LocalVariableDeclarationStatementContext ctx) {
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
   public T visitLocalVariableDeclaration(BSharpParser.LocalVariableDeclarationContext ctx) {
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
   public T visitStatement(BSharpParser.StatementContext ctx) {
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
   public T visitStatementNoShortIf(BSharpParser.StatementNoShortIfContext ctx) {
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
   public T visitStatementWithoutTrailingSubstatement(BSharpParser.StatementWithoutTrailingSubstatementContext ctx) {
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
   public T visitEmptyStatement(BSharpParser.EmptyStatementContext ctx) {
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
   public T visitLabeledStatement(BSharpParser.LabeledStatementContext ctx) {
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
   public T visitLabeledStatementNoShortIf(BSharpParser.LabeledStatementNoShortIfContext ctx) {
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
   public T visitExpressionStatement(BSharpParser.ExpressionStatementContext ctx) {
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
   public T visitStatementExpression(BSharpParser.StatementExpressionContext ctx) {
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
   public T visitPreIncrementExpression(BSharpParser.PreIncrementExpressionContext ctx) {
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
   public T visitPreDecrementExpression(BSharpParser.PreDecrementExpressionContext ctx) {
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
   public T visitPostIncrementExpression(BSharpParser.PostIncrementExpressionContext ctx) {
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
   public T visitPostDecrementExpression(BSharpParser.PostDecrementExpressionContext ctx) {
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
   public T visitIfThenStatement(BSharpParser.IfThenStatementContext ctx) {
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
   public T visitIfThenElseStatement(BSharpParser.IfThenElseStatementContext ctx) {
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
   public T visitIfThenElseStatementNoShortIf(BSharpParser.IfThenElseStatementNoShortIfContext ctx) {
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
   public T visitAssertStatement(BSharpParser.AssertStatementContext ctx) {
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
   public T visitSwitchStatement(BSharpParser.SwitchStatementContext ctx) {
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
   public T visitSwitchBlock(BSharpParser.SwitchBlockContext ctx) {
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
   public T visitSwitchBlockStatementGroup(BSharpParser.SwitchBlockStatementGroupContext ctx) {
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
   public T visitSwitchLabels(BSharpParser.SwitchLabelsContext ctx) {
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
   public T visitSwitchLabel(BSharpParser.SwitchLabelContext ctx) {
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
   public T visitEnumConstantName(BSharpParser.EnumConstantNameContext ctx) {
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
   public T visitWhileStatement(BSharpParser.WhileStatementContext ctx) {
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
   public T visitWhileStatementNoShortIf(BSharpParser.WhileStatementNoShortIfContext ctx) {
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
   public T visitDoStatement(BSharpParser.DoStatementContext ctx) {
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
   public T visitForStatement(BSharpParser.ForStatementContext ctx) {
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
   public T visitForStatementNoShortIf(BSharpParser.ForStatementNoShortIfContext ctx) {
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
   public T visitBasicForStatement(BSharpParser.BasicForStatementContext ctx) {
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
   public T visitBasicForStatementNoShortIf(BSharpParser.BasicForStatementNoShortIfContext ctx) {
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
   public T visitForInit(BSharpParser.ForInitContext ctx) {
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
   public T visitForUpdate(BSharpParser.ForUpdateContext ctx) {
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
   public T visitStatementExpressionList(BSharpParser.StatementExpressionListContext ctx) {
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
   public T visitEnhancedForStatement(BSharpParser.EnhancedForStatementContext ctx) {
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
   public T visitEnhancedForStatementNoShortIf(BSharpParser.EnhancedForStatementNoShortIfContext ctx) {
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
   public T visitBreakStatement(BSharpParser.BreakStatementContext ctx) {
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
   public T visitContinueStatement(BSharpParser.ContinueStatementContext ctx) {
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
   public T visitReturnStatement(BSharpParser.ReturnStatementContext ctx) {
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
   public T visitThrowStatement(BSharpParser.ThrowStatementContext ctx) {
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
   public T visitSynchronizedStatement(BSharpParser.SynchronizedStatementContext ctx) {
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
   public T visitTryStatement(BSharpParser.TryStatementContext ctx) {
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
   public T visitCatches(BSharpParser.CatchesContext ctx) {
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
   public T visitCatchClause(BSharpParser.CatchClauseContext ctx) {
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
   public T visitCatchFormalParameter(BSharpParser.CatchFormalParameterContext ctx) {
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
   public T visitCatchType(BSharpParser.CatchTypeContext ctx) {
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
   public T visitFinally_(BSharpParser.Finally_Context ctx) {
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
   public T visitTryWithResourcesStatement(BSharpParser.TryWithResourcesStatementContext ctx) {
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
   public T visitResourceSpecification(BSharpParser.ResourceSpecificationContext ctx) {
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
   public T visitResourceList(BSharpParser.ResourceListContext ctx) {
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
   public T visitResource(BSharpParser.ResourceContext ctx) {
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
   public T visitPrimary(BSharpParser.PrimaryContext ctx) {
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
   public T visitPrimaryNoNewArray(BSharpParser.PrimaryNoNewArrayContext ctx) {
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
   public T visitPrimarySuffixExpression(BSharpParser.PrimarySuffixExpressionContext ctx) {
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
   public T visitPrimarySuffixExpressionNoNewArray(BSharpParser.PrimarySuffixExpressionNoNewArrayContext ctx) {
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
   public T visitPrimaryPrefixExpression(BSharpParser.PrimaryPrefixExpressionContext ctx) {
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
   public T visitPrimaryPrefixExpressionNoNewArray(BSharpParser.PrimaryPrefixExpressionNoNewArrayContext ctx) {
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
   public T visitObjectCreationExpression(BSharpParser.ObjectCreationExpressionContext ctx) {
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
   public T visitFieldAccessExpression(BSharpParser.FieldAccessExpressionContext ctx) {
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
   public T visitMethodCallExpressionWithTypeArgs(BSharpParser.MethodCallExpressionWithTypeArgsContext ctx) {
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
   public T visitMethodCallExpression(BSharpParser.MethodCallExpressionContext ctx) {
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
   public T visitMethodReferenceExpression(BSharpParser.MethodReferenceExpressionContext ctx) {
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
   public T visitConstructorReferenceExpressionWithTypeArgs(
      BSharpParser.ConstructorReferenceExpressionWithTypeArgsContext ctx) {
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
   public T visitConstructorReferenceExpressionNoTypeArgs(
      BSharpParser.ConstructorReferenceExpressionNoTypeArgsContext ctx) {
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
   public T visitTypeArgumentsOrDiamond(BSharpParser.TypeArgumentsOrDiamondContext ctx) {
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
   public T visitArgumentList(BSharpParser.ArgumentListContext ctx) {
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
   public T visitClassInstanceCreationExpression(BSharpParser.ClassInstanceCreationExpressionContext ctx) {
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
   public T visitArrayCreationExpression(BSharpParser.ArrayCreationExpressionContext ctx) {
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
   public T visitDimExprs(BSharpParser.DimExprsContext ctx) {
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
   public T visitDimExpr(BSharpParser.DimExprContext ctx) {
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
   public T visitConstantExpression(BSharpParser.ConstantExpressionContext ctx) {
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
   public T visitExpression(BSharpParser.ExpressionContext ctx) {
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
   public T visitLambdaExpression(BSharpParser.LambdaExpressionContext ctx) {
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
   public T visitLambdaParameters(BSharpParser.LambdaParametersContext ctx) {
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
   public T visitInferredFormalParameterList(BSharpParser.InferredFormalParameterListContext ctx) {
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
   public T visitLambdaBody(BSharpParser.LambdaBodyContext ctx) {
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
   public T visitAssignmentExpression(BSharpParser.AssignmentExpressionContext ctx) {
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
   public T visitAssignment(BSharpParser.AssignmentContext ctx) {
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
   public T visitLeftHandSide(BSharpParser.LeftHandSideContext ctx) {
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
   public T visitAssignmentOperator(BSharpParser.AssignmentOperatorContext ctx) {
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
   public T visitConditionalExpression(BSharpParser.ConditionalExpressionContext ctx) {
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
   public T visitConditionalOrExpression(BSharpParser.ConditionalOrExpressionContext ctx) {
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
   public T visitConditionalAndExpression(BSharpParser.ConditionalAndExpressionContext ctx) {
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
   public T visitInclusiveOrExpression(BSharpParser.InclusiveOrExpressionContext ctx) {
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
   public T visitExclusiveOrExpression(BSharpParser.ExclusiveOrExpressionContext ctx) {
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
   public T visitAndExpression(BSharpParser.AndExpressionContext ctx) {
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
   public T visitEqualityExpression(BSharpParser.EqualityExpressionContext ctx) {
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
   public T visitRelationalExpression(BSharpParser.RelationalExpressionContext ctx) {
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
   public T visitShiftExpression(BSharpParser.ShiftExpressionContext ctx) {
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
   public T visitAdditiveExpression(BSharpParser.AdditiveExpressionContext ctx) {
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
   public T visitMultiplicativeExpression(BSharpParser.MultiplicativeExpressionContext ctx) {
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
   public T visitUnaryExpression(BSharpParser.UnaryExpressionContext ctx) {
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
   public T visitUnaryExpressionNotPlusMinus(BSharpParser.UnaryExpressionNotPlusMinusContext ctx) {
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
   public T visitPostfixExpression(BSharpParser.PostfixExpressionContext ctx) {
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
   public T visitCastExpression(BSharpParser.CastExpressionContext ctx) {
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
   public T visitFieldAccess(BSharpParser.FieldAccessContext ctx) {
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
   public T visitArrayAccess(BSharpParser.ArrayAccessContext ctx) {
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
   public T visitMethodInvocation(BSharpParser.MethodInvocationContext ctx) {
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
   public T visitLiteral(BSharpParser.LiteralContext ctx) {
      return visitChildren(ctx);
   }
}