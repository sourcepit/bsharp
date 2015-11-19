// Generated from BSharp.g4 by ANTLR 4.5.1

package org.sourcepit.bsharp;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BSharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface BSharpVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link BSharpParser#packageName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageName(BSharpParser.PackageNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeName(BSharpParser.TypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageOrTypeName(BSharpParser.PackageOrTypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#expressionName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpressionName(BSharpParser.ExpressionNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodName(BSharpParser.MethodNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAmbiguousName(BSharpParser.AmbiguousNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#type}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitType(BSharpParser.TypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primitiveType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimitiveType(BSharpParser.PrimitiveTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#numericType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNumericType(BSharpParser.NumericTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#integralType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIntegralType(BSharpParser.IntegralTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFloatingPointType(BSharpParser.FloatingPointTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#referenceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitReferenceType(BSharpParser.ReferenceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassOrInterfaceType(BSharpParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassType(BSharpParser.ClassTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceType(BSharpParser.InterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeVariable}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeVariable(BSharpParser.TypeVariableContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#arrayType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayType(BSharpParser.ArrayTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#dims}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDims(BSharpParser.DimsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeParameter(BSharpParser.TypeParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeParameterModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeParameterModifier(BSharpParser.TypeParameterModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeBound}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeBound(BSharpParser.TypeBoundContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#additionalBound}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAdditionalBound(BSharpParser.AdditionalBoundContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeArguments}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArguments(BSharpParser.TypeArgumentsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgumentList(BSharpParser.TypeArgumentListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeArgument}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgument(BSharpParser.TypeArgumentContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#wildcard}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWildcard(BSharpParser.WildcardContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWildcardBounds(BSharpParser.WildcardBoundsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCompilationUnit(BSharpParser.CompilationUnitContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#packageDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageDeclaration(BSharpParser.PackageDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#packageModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPackageModifier(BSharpParser.PackageModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#importDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitImportDeclaration(BSharpParser.ImportDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#singleTypeImportDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSingleTypeImportDeclaration(BSharpParser.SingleTypeImportDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeImportOnDemandDeclaration(BSharpParser.TypeImportOnDemandDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#singleStaticImportDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSingleStaticImportDeclaration(BSharpParser.SingleStaticImportDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#staticImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStaticImportOnDemandDeclaration(BSharpParser.StaticImportOnDemandDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeDeclaration(BSharpParser.TypeDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassDeclaration(BSharpParser.ClassDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#normalClassDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNormalClassDeclaration(BSharpParser.NormalClassDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassModifier(BSharpParser.ClassModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeParameters}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeParameters(BSharpParser.TypeParametersContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeParameterList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeParameterList(BSharpParser.TypeParameterListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#superclass}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSuperclass(BSharpParser.SuperclassContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#superinterfaces}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSuperinterfaces(BSharpParser.SuperinterfacesContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceTypeList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceTypeList(BSharpParser.InterfaceTypeListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassBody(BSharpParser.ClassBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassBodyDeclaration(BSharpParser.ClassBodyDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classMemberDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassMemberDeclaration(BSharpParser.ClassMemberDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#fieldDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldDeclaration(BSharpParser.FieldDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#fieldModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldModifier(BSharpParser.FieldModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableDeclaratorList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableDeclaratorList(BSharpParser.VariableDeclaratorListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableDeclarator}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableDeclarator(BSharpParser.VariableDeclaratorContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableDeclaratorId}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableDeclaratorId(BSharpParser.VariableDeclaratorIdContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableInitializer}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableInitializer(BSharpParser.VariableInitializerContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannType(BSharpParser.UnannTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannPrimitiveType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannPrimitiveType(BSharpParser.UnannPrimitiveTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannReferenceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannReferenceType(BSharpParser.UnannReferenceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannClassOrInterfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannClassOrInterfaceType(BSharpParser.UnannClassOrInterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannClassType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannClassType(BSharpParser.UnannClassTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannInterfaceType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannInterfaceType(BSharpParser.UnannInterfaceTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannTypeVariable}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannTypeVariable(BSharpParser.UnannTypeVariableContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unannArrayType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnannArrayType(BSharpParser.UnannArrayTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodDeclaration(BSharpParser.MethodDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodModifier(BSharpParser.MethodModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodHeader}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodHeader(BSharpParser.MethodHeaderContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#result}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitResult(BSharpParser.ResultContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodDeclarator}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodDeclarator(BSharpParser.MethodDeclaratorContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#formalParameterList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFormalParameterList(BSharpParser.FormalParameterListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#formalParameters}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFormalParameters(BSharpParser.FormalParametersContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#formalParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFormalParameter(BSharpParser.FormalParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableModifier(BSharpParser.VariableModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#lastFormalParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLastFormalParameter(BSharpParser.LastFormalParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#receiverParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitReceiverParameter(BSharpParser.ReceiverParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#throws_}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitThrows_(BSharpParser.Throws_Context ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#exceptionTypeList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExceptionTypeList(BSharpParser.ExceptionTypeListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#exceptionType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExceptionType(BSharpParser.ExceptionTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodBody(BSharpParser.MethodBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#instanceInitializer}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInstanceInitializer(BSharpParser.InstanceInitializerContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#staticInitializer}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStaticInitializer(BSharpParser.StaticInitializerContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorDeclaration(BSharpParser.ConstructorDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorModifier(BSharpParser.ConstructorModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorDeclarator}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorDeclarator(BSharpParser.ConstructorDeclaratorContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#simpleTypeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSimpleTypeName(BSharpParser.SimpleTypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorBody(BSharpParser.ConstructorBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#explicitConstructorInvocation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExplicitConstructorInvocation(BSharpParser.ExplicitConstructorInvocationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumDeclaration(BSharpParser.EnumDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumBody(BSharpParser.EnumBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumConstantList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumConstantList(BSharpParser.EnumConstantListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumConstant}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumConstant(BSharpParser.EnumConstantContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumConstantModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumConstantModifier(BSharpParser.EnumConstantModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumBodyDeclarations}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumBodyDeclarations(BSharpParser.EnumBodyDeclarationsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceDeclaration(BSharpParser.InterfaceDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#normalInterfaceDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNormalInterfaceDeclaration(BSharpParser.NormalInterfaceDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceModifier(BSharpParser.InterfaceModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#extendsInterfaces}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExtendsInterfaces(BSharpParser.ExtendsInterfacesContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceBody(BSharpParser.InterfaceBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceMemberDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceMemberDeclaration(BSharpParser.InterfaceMemberDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constantDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstantDeclaration(BSharpParser.ConstantDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constantModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstantModifier(BSharpParser.ConstantModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceMethodDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceMethodDeclaration(BSharpParser.InterfaceMethodDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#interfaceMethodModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInterfaceMethodModifier(BSharpParser.InterfaceMethodModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotationTypeDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotationTypeDeclaration(BSharpParser.AnnotationTypeDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotationTypeBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotationTypeBody(BSharpParser.AnnotationTypeBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotationTypeMemberDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotationTypeMemberDeclaration(BSharpParser.AnnotationTypeMemberDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotationTypeElementDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotationTypeElementDeclaration(BSharpParser.AnnotationTypeElementDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotationTypeElementModifier}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotationTypeElementModifier(BSharpParser.AnnotationTypeElementModifierContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#defaultValue}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDefaultValue(BSharpParser.DefaultValueContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#annotation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAnnotation(BSharpParser.AnnotationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#normalAnnotation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNormalAnnotation(BSharpParser.NormalAnnotationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#elementValuePairList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitElementValuePairList(BSharpParser.ElementValuePairListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#elementValuePair}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitElementValuePair(BSharpParser.ElementValuePairContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#elementValue}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitElementValue(BSharpParser.ElementValueContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#elementValueArrayInitializer}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitElementValueArrayInitializer(BSharpParser.ElementValueArrayInitializerContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#elementValueList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitElementValueList(BSharpParser.ElementValueListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#markerAnnotation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMarkerAnnotation(BSharpParser.MarkerAnnotationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#singleElementAnnotation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSingleElementAnnotation(BSharpParser.SingleElementAnnotationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#arrayInitializer}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayInitializer(BSharpParser.ArrayInitializerContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#variableInitializerList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitVariableInitializerList(BSharpParser.VariableInitializerListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#block}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBlock(BSharpParser.BlockContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#blockStatements}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBlockStatements(BSharpParser.BlockStatementsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#blockStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBlockStatement(BSharpParser.BlockStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#localVariableDeclarationStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLocalVariableDeclarationStatement(BSharpParser.LocalVariableDeclarationStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#localVariableDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLocalVariableDeclaration(BSharpParser.LocalVariableDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#statement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatement(BSharpParser.StatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#statementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatementNoShortIf(BSharpParser.StatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#statementWithoutTrailingSubstatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatementWithoutTrailingSubstatement(BSharpParser.StatementWithoutTrailingSubstatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#emptyStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEmptyStatement(BSharpParser.EmptyStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#labeledStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLabeledStatement(BSharpParser.LabeledStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#labeledStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLabeledStatementNoShortIf(BSharpParser.LabeledStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#expressionStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpressionStatement(BSharpParser.ExpressionStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#statementExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatementExpression(BSharpParser.StatementExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#preIncrementExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPreIncrementExpression(BSharpParser.PreIncrementExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#preDecrementExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPreDecrementExpression(BSharpParser.PreDecrementExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#postIncrementExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPostIncrementExpression(BSharpParser.PostIncrementExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#postDecrementExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPostDecrementExpression(BSharpParser.PostDecrementExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#ifThenStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIfThenStatement(BSharpParser.IfThenStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#ifThenElseStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIfThenElseStatement(BSharpParser.IfThenElseStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#ifThenElseStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIfThenElseStatementNoShortIf(BSharpParser.IfThenElseStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#assertStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAssertStatement(BSharpParser.AssertStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#switchStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSwitchStatement(BSharpParser.SwitchStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#switchBlock}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSwitchBlock(BSharpParser.SwitchBlockContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#switchBlockStatementGroup}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSwitchBlockStatementGroup(BSharpParser.SwitchBlockStatementGroupContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#switchLabels}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSwitchLabels(BSharpParser.SwitchLabelsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#switchLabel}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSwitchLabel(BSharpParser.SwitchLabelContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enumConstantName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnumConstantName(BSharpParser.EnumConstantNameContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#whileStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWhileStatement(BSharpParser.WhileStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#whileStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitWhileStatementNoShortIf(BSharpParser.WhileStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#doStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDoStatement(BSharpParser.DoStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#forStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitForStatement(BSharpParser.ForStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#forStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitForStatementNoShortIf(BSharpParser.ForStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#basicForStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBasicForStatement(BSharpParser.BasicForStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#basicForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBasicForStatementNoShortIf(BSharpParser.BasicForStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#forInit}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitForInit(BSharpParser.ForInitContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#forUpdate}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitForUpdate(BSharpParser.ForUpdateContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#statementExpressionList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatementExpressionList(BSharpParser.StatementExpressionListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enhancedForStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnhancedForStatement(BSharpParser.EnhancedForStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#enhancedForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEnhancedForStatementNoShortIf(BSharpParser.EnhancedForStatementNoShortIfContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#breakStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBreakStatement(BSharpParser.BreakStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#continueStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitContinueStatement(BSharpParser.ContinueStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#returnStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitReturnStatement(BSharpParser.ReturnStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#throwStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitThrowStatement(BSharpParser.ThrowStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#synchronizedStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSynchronizedStatement(BSharpParser.SynchronizedStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#tryStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTryStatement(BSharpParser.TryStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#catches}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCatches(BSharpParser.CatchesContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#catchClause}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCatchClause(BSharpParser.CatchClauseContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#catchFormalParameter}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCatchFormalParameter(BSharpParser.CatchFormalParameterContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#catchType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCatchType(BSharpParser.CatchTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#finally_}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFinally_(BSharpParser.Finally_Context ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#tryWithResourcesStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTryWithResourcesStatement(BSharpParser.TryWithResourcesStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#resourceSpecification}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitResourceSpecification(BSharpParser.ResourceSpecificationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#resourceList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitResourceList(BSharpParser.ResourceListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#resource}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitResource(BSharpParser.ResourceContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primary}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimary(BSharpParser.PrimaryContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primaryNoNewArray}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimaryNoNewArray(BSharpParser.PrimaryNoNewArrayContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primarySuffixExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimarySuffixExpression(BSharpParser.PrimarySuffixExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primarySuffixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimarySuffixExpressionNoNewArray(BSharpParser.PrimarySuffixExpressionNoNewArrayContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primaryPrefixExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimaryPrefixExpression(BSharpParser.PrimaryPrefixExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#primaryPrefixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrimaryPrefixExpressionNoNewArray(BSharpParser.PrimaryPrefixExpressionNoNewArrayContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#objectCreationExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitObjectCreationExpression(BSharpParser.ObjectCreationExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#fieldAccessExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldAccessExpression(BSharpParser.FieldAccessExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodCallExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodCallExpressionWithTypeArgs(BSharpParser.MethodCallExpressionWithTypeArgsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodCallExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodCallExpression(BSharpParser.MethodCallExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodReferenceExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodReferenceExpression(BSharpParser.MethodReferenceExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorReferenceExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorReferenceExpressionWithTypeArgs(
      BSharpParser.ConstructorReferenceExpressionWithTypeArgsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constructorReferenceExpressionNoTypeArgs}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstructorReferenceExpressionNoTypeArgs(BSharpParser.ConstructorReferenceExpressionNoTypeArgsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeArgumentsOrDiamond(BSharpParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#argumentList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArgumentList(BSharpParser.ArgumentListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#classInstanceCreationExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassInstanceCreationExpression(BSharpParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#arrayCreationExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayCreationExpression(BSharpParser.ArrayCreationExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#dimExprs}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDimExprs(BSharpParser.DimExprsContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#dimExpr}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDimExpr(BSharpParser.DimExprContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#constantExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConstantExpression(BSharpParser.ConstantExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#expression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpression(BSharpParser.ExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#lambdaExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLambdaExpression(BSharpParser.LambdaExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#lambdaParameters}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLambdaParameters(BSharpParser.LambdaParametersContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#inferredFormalParameterList}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInferredFormalParameterList(BSharpParser.InferredFormalParameterListContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#lambdaBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLambdaBody(BSharpParser.LambdaBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#assignmentExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAssignmentExpression(BSharpParser.AssignmentExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#assignment}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAssignment(BSharpParser.AssignmentContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#leftHandSide}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLeftHandSide(BSharpParser.LeftHandSideContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#assignmentOperator}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAssignmentOperator(BSharpParser.AssignmentOperatorContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#conditionalExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConditionalExpression(BSharpParser.ConditionalExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#conditionalOrExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConditionalOrExpression(BSharpParser.ConditionalOrExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#conditionalAndExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitConditionalAndExpression(BSharpParser.ConditionalAndExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#inclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitInclusiveOrExpression(BSharpParser.InclusiveOrExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#exclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExclusiveOrExpression(BSharpParser.ExclusiveOrExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#andExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAndExpression(BSharpParser.AndExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#equalityExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitEqualityExpression(BSharpParser.EqualityExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#relationalExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitRelationalExpression(BSharpParser.RelationalExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#shiftExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitShiftExpression(BSharpParser.ShiftExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#additiveExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAdditiveExpression(BSharpParser.AdditiveExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#multiplicativeExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMultiplicativeExpression(BSharpParser.MultiplicativeExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unaryExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnaryExpression(BSharpParser.UnaryExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#unaryExpressionNotPlusMinus}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitUnaryExpressionNotPlusMinus(BSharpParser.UnaryExpressionNotPlusMinusContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#postfixExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPostfixExpression(BSharpParser.PostfixExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#castExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCastExpression(BSharpParser.CastExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldAccess(BSharpParser.FieldAccessContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitArrayAccess(BSharpParser.ArrayAccessContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodInvocation(BSharpParser.MethodInvocationContext ctx);

   /**
    * Visit a parse tree produced by {@link BSharpParser#literal}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLiteral(BSharpParser.LiteralContext ctx);
}