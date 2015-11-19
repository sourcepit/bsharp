// Generated from BSharp.g4 by ANTLR 4.5.1

package org.sourcepit.bsharp;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BSharpParser}.
 */
public interface BSharpListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link BSharpParser#packageName}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageName(BSharpParser.PackageNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#packageName}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageName(BSharpParser.PackageNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeName(BSharpParser.TypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeName(BSharpParser.TypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageOrTypeName(BSharpParser.PackageOrTypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageOrTypeName(BSharpParser.PackageOrTypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#expressionName}.
    * 
    * @param ctx the parse tree
    */
   void enterExpressionName(BSharpParser.ExpressionNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#expressionName}.
    * 
    * @param ctx the parse tree
    */
   void exitExpressionName(BSharpParser.ExpressionNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodName(BSharpParser.MethodNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodName(BSharpParser.MethodNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    */
   void enterAmbiguousName(BSharpParser.AmbiguousNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#ambiguousName}.
    * 
    * @param ctx the parse tree
    */
   void exitAmbiguousName(BSharpParser.AmbiguousNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#type}.
    * 
    * @param ctx the parse tree
    */
   void enterType(BSharpParser.TypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#type}.
    * 
    * @param ctx the parse tree
    */
   void exitType(BSharpParser.TypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primitiveType}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimitiveType(BSharpParser.PrimitiveTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primitiveType}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimitiveType(BSharpParser.PrimitiveTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#numericType}.
    * 
    * @param ctx the parse tree
    */
   void enterNumericType(BSharpParser.NumericTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#numericType}.
    * 
    * @param ctx the parse tree
    */
   void exitNumericType(BSharpParser.NumericTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#integralType}.
    * 
    * @param ctx the parse tree
    */
   void enterIntegralType(BSharpParser.IntegralTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#integralType}.
    * 
    * @param ctx the parse tree
    */
   void exitIntegralType(BSharpParser.IntegralTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    */
   void enterFloatingPointType(BSharpParser.FloatingPointTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#floatingPointType}.
    * 
    * @param ctx the parse tree
    */
   void exitFloatingPointType(BSharpParser.FloatingPointTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#referenceType}.
    * 
    * @param ctx the parse tree
    */
   void enterReferenceType(BSharpParser.ReferenceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#referenceType}.
    * 
    * @param ctx the parse tree
    */
   void exitReferenceType(BSharpParser.ReferenceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterClassOrInterfaceType(BSharpParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitClassOrInterfaceType(BSharpParser.ClassOrInterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classType}.
    * 
    * @param ctx the parse tree
    */
   void enterClassType(BSharpParser.ClassTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classType}.
    * 
    * @param ctx the parse tree
    */
   void exitClassType(BSharpParser.ClassTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceType(BSharpParser.InterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceType(BSharpParser.InterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeVariable}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeVariable(BSharpParser.TypeVariableContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeVariable}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeVariable(BSharpParser.TypeVariableContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#arrayType}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayType(BSharpParser.ArrayTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#arrayType}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayType(BSharpParser.ArrayTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#dims}.
    * 
    * @param ctx the parse tree
    */
   void enterDims(BSharpParser.DimsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#dims}.
    * 
    * @param ctx the parse tree
    */
   void exitDims(BSharpParser.DimsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeParameter(BSharpParser.TypeParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeParameter(BSharpParser.TypeParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeParameterModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeParameterModifier(BSharpParser.TypeParameterModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeParameterModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeParameterModifier(BSharpParser.TypeParameterModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeBound}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeBound(BSharpParser.TypeBoundContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeBound}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeBound(BSharpParser.TypeBoundContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#additionalBound}.
    * 
    * @param ctx the parse tree
    */
   void enterAdditionalBound(BSharpParser.AdditionalBoundContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#additionalBound}.
    * 
    * @param ctx the parse tree
    */
   void exitAdditionalBound(BSharpParser.AdditionalBoundContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeArguments}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArguments(BSharpParser.TypeArgumentsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeArguments}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArguments(BSharpParser.TypeArgumentsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgumentList(BSharpParser.TypeArgumentListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeArgumentList}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgumentList(BSharpParser.TypeArgumentListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeArgument}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgument(BSharpParser.TypeArgumentContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeArgument}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgument(BSharpParser.TypeArgumentContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#wildcard}.
    * 
    * @param ctx the parse tree
    */
   void enterWildcard(BSharpParser.WildcardContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#wildcard}.
    * 
    * @param ctx the parse tree
    */
   void exitWildcard(BSharpParser.WildcardContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    */
   void enterWildcardBounds(BSharpParser.WildcardBoundsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#wildcardBounds}.
    * 
    * @param ctx the parse tree
    */
   void exitWildcardBounds(BSharpParser.WildcardBoundsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    */
   void enterCompilationUnit(BSharpParser.CompilationUnitContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    */
   void exitCompilationUnit(BSharpParser.CompilationUnitContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#packageDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageDeclaration(BSharpParser.PackageDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#packageDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageDeclaration(BSharpParser.PackageDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#packageModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageModifier(BSharpParser.PackageModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#packageModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageModifier(BSharpParser.PackageModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#importDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterImportDeclaration(BSharpParser.ImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#importDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitImportDeclaration(BSharpParser.ImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#singleTypeImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterSingleTypeImportDeclaration(BSharpParser.SingleTypeImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#singleTypeImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitSingleTypeImportDeclaration(BSharpParser.SingleTypeImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeImportOnDemandDeclaration(BSharpParser.TypeImportOnDemandDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeImportOnDemandDeclaration(BSharpParser.TypeImportOnDemandDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#singleStaticImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterSingleStaticImportDeclaration(BSharpParser.SingleStaticImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#singleStaticImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitSingleStaticImportDeclaration(BSharpParser.SingleStaticImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#staticImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterStaticImportOnDemandDeclaration(BSharpParser.StaticImportOnDemandDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#staticImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitStaticImportOnDemandDeclaration(BSharpParser.StaticImportOnDemandDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeDeclaration(BSharpParser.TypeDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeDeclaration(BSharpParser.TypeDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterClassDeclaration(BSharpParser.ClassDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitClassDeclaration(BSharpParser.ClassDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#normalClassDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterNormalClassDeclaration(BSharpParser.NormalClassDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#normalClassDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitNormalClassDeclaration(BSharpParser.NormalClassDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterClassModifier(BSharpParser.ClassModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitClassModifier(BSharpParser.ClassModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeParameters}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeParameters(BSharpParser.TypeParametersContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeParameters}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeParameters(BSharpParser.TypeParametersContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeParameterList}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeParameterList(BSharpParser.TypeParameterListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeParameterList}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeParameterList(BSharpParser.TypeParameterListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#superclass}.
    * 
    * @param ctx the parse tree
    */
   void enterSuperclass(BSharpParser.SuperclassContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#superclass}.
    * 
    * @param ctx the parse tree
    */
   void exitSuperclass(BSharpParser.SuperclassContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#superinterfaces}.
    * 
    * @param ctx the parse tree
    */
   void enterSuperinterfaces(BSharpParser.SuperinterfacesContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#superinterfaces}.
    * 
    * @param ctx the parse tree
    */
   void exitSuperinterfaces(BSharpParser.SuperinterfacesContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceTypeList}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceTypeList(BSharpParser.InterfaceTypeListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceTypeList}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceTypeList(BSharpParser.InterfaceTypeListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classBody}.
    * 
    * @param ctx the parse tree
    */
   void enterClassBody(BSharpParser.ClassBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classBody}.
    * 
    * @param ctx the parse tree
    */
   void exitClassBody(BSharpParser.ClassBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterClassBodyDeclaration(BSharpParser.ClassBodyDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitClassBodyDeclaration(BSharpParser.ClassBodyDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterClassMemberDeclaration(BSharpParser.ClassMemberDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitClassMemberDeclaration(BSharpParser.ClassMemberDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#fieldDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldDeclaration(BSharpParser.FieldDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#fieldDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldDeclaration(BSharpParser.FieldDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#fieldModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldModifier(BSharpParser.FieldModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#fieldModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldModifier(BSharpParser.FieldModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableDeclaratorList}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableDeclaratorList(BSharpParser.VariableDeclaratorListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableDeclaratorList}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableDeclaratorList(BSharpParser.VariableDeclaratorListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableDeclarator(BSharpParser.VariableDeclaratorContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableDeclarator(BSharpParser.VariableDeclaratorContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableDeclaratorId}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableDeclaratorId(BSharpParser.VariableDeclaratorIdContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableDeclaratorId}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableDeclaratorId(BSharpParser.VariableDeclaratorIdContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableInitializer}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableInitializer(BSharpParser.VariableInitializerContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableInitializer}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableInitializer(BSharpParser.VariableInitializerContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannType(BSharpParser.UnannTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannType(BSharpParser.UnannTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannPrimitiveType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannPrimitiveType(BSharpParser.UnannPrimitiveTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannPrimitiveType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannPrimitiveType(BSharpParser.UnannPrimitiveTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannReferenceType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannReferenceType(BSharpParser.UnannReferenceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannReferenceType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannReferenceType(BSharpParser.UnannReferenceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannClassOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannClassOrInterfaceType(BSharpParser.UnannClassOrInterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannClassOrInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannClassOrInterfaceType(BSharpParser.UnannClassOrInterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannClassType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannClassType(BSharpParser.UnannClassTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannClassType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannClassType(BSharpParser.UnannClassTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannInterfaceType(BSharpParser.UnannInterfaceTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannInterfaceType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannInterfaceType(BSharpParser.UnannInterfaceTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannTypeVariable}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannTypeVariable(BSharpParser.UnannTypeVariableContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannTypeVariable}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannTypeVariable(BSharpParser.UnannTypeVariableContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unannArrayType}.
    * 
    * @param ctx the parse tree
    */
   void enterUnannArrayType(BSharpParser.UnannArrayTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unannArrayType}.
    * 
    * @param ctx the parse tree
    */
   void exitUnannArrayType(BSharpParser.UnannArrayTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodDeclaration(BSharpParser.MethodDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodDeclaration(BSharpParser.MethodDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodModifier(BSharpParser.MethodModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodModifier(BSharpParser.MethodModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodHeader}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodHeader(BSharpParser.MethodHeaderContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodHeader}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodHeader(BSharpParser.MethodHeaderContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#result}.
    * 
    * @param ctx the parse tree
    */
   void enterResult(BSharpParser.ResultContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#result}.
    * 
    * @param ctx the parse tree
    */
   void exitResult(BSharpParser.ResultContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodDeclarator(BSharpParser.MethodDeclaratorContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodDeclarator(BSharpParser.MethodDeclaratorContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#formalParameterList}.
    * 
    * @param ctx the parse tree
    */
   void enterFormalParameterList(BSharpParser.FormalParameterListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#formalParameterList}.
    * 
    * @param ctx the parse tree
    */
   void exitFormalParameterList(BSharpParser.FormalParameterListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#formalParameters}.
    * 
    * @param ctx the parse tree
    */
   void enterFormalParameters(BSharpParser.FormalParametersContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#formalParameters}.
    * 
    * @param ctx the parse tree
    */
   void exitFormalParameters(BSharpParser.FormalParametersContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#formalParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterFormalParameter(BSharpParser.FormalParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#formalParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitFormalParameter(BSharpParser.FormalParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableModifier(BSharpParser.VariableModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableModifier(BSharpParser.VariableModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#lastFormalParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterLastFormalParameter(BSharpParser.LastFormalParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#lastFormalParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitLastFormalParameter(BSharpParser.LastFormalParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#receiverParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterReceiverParameter(BSharpParser.ReceiverParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#receiverParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitReceiverParameter(BSharpParser.ReceiverParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#throws_}.
    * 
    * @param ctx the parse tree
    */
   void enterThrows_(BSharpParser.Throws_Context ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#throws_}.
    * 
    * @param ctx the parse tree
    */
   void exitThrows_(BSharpParser.Throws_Context ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#exceptionTypeList}.
    * 
    * @param ctx the parse tree
    */
   void enterExceptionTypeList(BSharpParser.ExceptionTypeListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#exceptionTypeList}.
    * 
    * @param ctx the parse tree
    */
   void exitExceptionTypeList(BSharpParser.ExceptionTypeListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#exceptionType}.
    * 
    * @param ctx the parse tree
    */
   void enterExceptionType(BSharpParser.ExceptionTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#exceptionType}.
    * 
    * @param ctx the parse tree
    */
   void exitExceptionType(BSharpParser.ExceptionTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodBody}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodBody(BSharpParser.MethodBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodBody}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodBody(BSharpParser.MethodBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#instanceInitializer}.
    * 
    * @param ctx the parse tree
    */
   void enterInstanceInitializer(BSharpParser.InstanceInitializerContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#instanceInitializer}.
    * 
    * @param ctx the parse tree
    */
   void exitInstanceInitializer(BSharpParser.InstanceInitializerContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#staticInitializer}.
    * 
    * @param ctx the parse tree
    */
   void enterStaticInitializer(BSharpParser.StaticInitializerContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#staticInitializer}.
    * 
    * @param ctx the parse tree
    */
   void exitStaticInitializer(BSharpParser.StaticInitializerContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorDeclaration(BSharpParser.ConstructorDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorDeclaration(BSharpParser.ConstructorDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorModifier(BSharpParser.ConstructorModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorModifier(BSharpParser.ConstructorModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorDeclarator(BSharpParser.ConstructorDeclaratorContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorDeclarator}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorDeclarator(BSharpParser.ConstructorDeclaratorContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#simpleTypeName}.
    * 
    * @param ctx the parse tree
    */
   void enterSimpleTypeName(BSharpParser.SimpleTypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#simpleTypeName}.
    * 
    * @param ctx the parse tree
    */
   void exitSimpleTypeName(BSharpParser.SimpleTypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorBody}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorBody(BSharpParser.ConstructorBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorBody}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorBody(BSharpParser.ConstructorBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#explicitConstructorInvocation}.
    * 
    * @param ctx the parse tree
    */
   void enterExplicitConstructorInvocation(BSharpParser.ExplicitConstructorInvocationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#explicitConstructorInvocation}.
    * 
    * @param ctx the parse tree
    */
   void exitExplicitConstructorInvocation(BSharpParser.ExplicitConstructorInvocationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumDeclaration(BSharpParser.EnumDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumDeclaration(BSharpParser.EnumDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumBody}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumBody(BSharpParser.EnumBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumBody}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumBody(BSharpParser.EnumBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumConstantList}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumConstantList(BSharpParser.EnumConstantListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumConstantList}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumConstantList(BSharpParser.EnumConstantListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumConstant}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumConstant(BSharpParser.EnumConstantContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumConstant}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumConstant(BSharpParser.EnumConstantContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumConstantModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumConstantModifier(BSharpParser.EnumConstantModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumConstantModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumConstantModifier(BSharpParser.EnumConstantModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumBodyDeclarations}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumBodyDeclarations(BSharpParser.EnumBodyDeclarationsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumBodyDeclarations}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumBodyDeclarations(BSharpParser.EnumBodyDeclarationsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceDeclaration(BSharpParser.InterfaceDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceDeclaration(BSharpParser.InterfaceDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#normalInterfaceDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterNormalInterfaceDeclaration(BSharpParser.NormalInterfaceDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#normalInterfaceDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitNormalInterfaceDeclaration(BSharpParser.NormalInterfaceDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceModifier(BSharpParser.InterfaceModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceModifier(BSharpParser.InterfaceModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#extendsInterfaces}.
    * 
    * @param ctx the parse tree
    */
   void enterExtendsInterfaces(BSharpParser.ExtendsInterfacesContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#extendsInterfaces}.
    * 
    * @param ctx the parse tree
    */
   void exitExtendsInterfaces(BSharpParser.ExtendsInterfacesContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceBody}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceBody(BSharpParser.InterfaceBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceBody}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceBody(BSharpParser.InterfaceBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceMemberDeclaration(BSharpParser.InterfaceMemberDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceMemberDeclaration(BSharpParser.InterfaceMemberDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constantDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterConstantDeclaration(BSharpParser.ConstantDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constantDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitConstantDeclaration(BSharpParser.ConstantDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constantModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterConstantModifier(BSharpParser.ConstantModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constantModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitConstantModifier(BSharpParser.ConstantModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceMethodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceMethodDeclaration(BSharpParser.InterfaceMethodDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceMethodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceMethodDeclaration(BSharpParser.InterfaceMethodDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#interfaceMethodModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterInterfaceMethodModifier(BSharpParser.InterfaceMethodModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#interfaceMethodModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitInterfaceMethodModifier(BSharpParser.InterfaceMethodModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotationTypeDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotationTypeDeclaration(BSharpParser.AnnotationTypeDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotationTypeDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotationTypeDeclaration(BSharpParser.AnnotationTypeDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotationTypeBody}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotationTypeBody(BSharpParser.AnnotationTypeBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotationTypeBody}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotationTypeBody(BSharpParser.AnnotationTypeBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotationTypeMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotationTypeMemberDeclaration(BSharpParser.AnnotationTypeMemberDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotationTypeMemberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotationTypeMemberDeclaration(BSharpParser.AnnotationTypeMemberDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotationTypeElementDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotationTypeElementDeclaration(BSharpParser.AnnotationTypeElementDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotationTypeElementDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotationTypeElementDeclaration(BSharpParser.AnnotationTypeElementDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotationTypeElementModifier}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotationTypeElementModifier(BSharpParser.AnnotationTypeElementModifierContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotationTypeElementModifier}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotationTypeElementModifier(BSharpParser.AnnotationTypeElementModifierContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#defaultValue}.
    * 
    * @param ctx the parse tree
    */
   void enterDefaultValue(BSharpParser.DefaultValueContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#defaultValue}.
    * 
    * @param ctx the parse tree
    */
   void exitDefaultValue(BSharpParser.DefaultValueContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#annotation}.
    * 
    * @param ctx the parse tree
    */
   void enterAnnotation(BSharpParser.AnnotationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#annotation}.
    * 
    * @param ctx the parse tree
    */
   void exitAnnotation(BSharpParser.AnnotationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#normalAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void enterNormalAnnotation(BSharpParser.NormalAnnotationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#normalAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void exitNormalAnnotation(BSharpParser.NormalAnnotationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#elementValuePairList}.
    * 
    * @param ctx the parse tree
    */
   void enterElementValuePairList(BSharpParser.ElementValuePairListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#elementValuePairList}.
    * 
    * @param ctx the parse tree
    */
   void exitElementValuePairList(BSharpParser.ElementValuePairListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#elementValuePair}.
    * 
    * @param ctx the parse tree
    */
   void enterElementValuePair(BSharpParser.ElementValuePairContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#elementValuePair}.
    * 
    * @param ctx the parse tree
    */
   void exitElementValuePair(BSharpParser.ElementValuePairContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#elementValue}.
    * 
    * @param ctx the parse tree
    */
   void enterElementValue(BSharpParser.ElementValueContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#elementValue}.
    * 
    * @param ctx the parse tree
    */
   void exitElementValue(BSharpParser.ElementValueContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#elementValueArrayInitializer}.
    * 
    * @param ctx the parse tree
    */
   void enterElementValueArrayInitializer(BSharpParser.ElementValueArrayInitializerContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#elementValueArrayInitializer}.
    * 
    * @param ctx the parse tree
    */
   void exitElementValueArrayInitializer(BSharpParser.ElementValueArrayInitializerContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#elementValueList}.
    * 
    * @param ctx the parse tree
    */
   void enterElementValueList(BSharpParser.ElementValueListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#elementValueList}.
    * 
    * @param ctx the parse tree
    */
   void exitElementValueList(BSharpParser.ElementValueListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#markerAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void enterMarkerAnnotation(BSharpParser.MarkerAnnotationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#markerAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void exitMarkerAnnotation(BSharpParser.MarkerAnnotationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#singleElementAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void enterSingleElementAnnotation(BSharpParser.SingleElementAnnotationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#singleElementAnnotation}.
    * 
    * @param ctx the parse tree
    */
   void exitSingleElementAnnotation(BSharpParser.SingleElementAnnotationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#arrayInitializer}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayInitializer(BSharpParser.ArrayInitializerContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#arrayInitializer}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayInitializer(BSharpParser.ArrayInitializerContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#variableInitializerList}.
    * 
    * @param ctx the parse tree
    */
   void enterVariableInitializerList(BSharpParser.VariableInitializerListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#variableInitializerList}.
    * 
    * @param ctx the parse tree
    */
   void exitVariableInitializerList(BSharpParser.VariableInitializerListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#block}.
    * 
    * @param ctx the parse tree
    */
   void enterBlock(BSharpParser.BlockContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#block}.
    * 
    * @param ctx the parse tree
    */
   void exitBlock(BSharpParser.BlockContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#blockStatements}.
    * 
    * @param ctx the parse tree
    */
   void enterBlockStatements(BSharpParser.BlockStatementsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#blockStatements}.
    * 
    * @param ctx the parse tree
    */
   void exitBlockStatements(BSharpParser.BlockStatementsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#blockStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterBlockStatement(BSharpParser.BlockStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#blockStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitBlockStatement(BSharpParser.BlockStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#localVariableDeclarationStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterLocalVariableDeclarationStatement(BSharpParser.LocalVariableDeclarationStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#localVariableDeclarationStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitLocalVariableDeclarationStatement(BSharpParser.LocalVariableDeclarationStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#localVariableDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterLocalVariableDeclaration(BSharpParser.LocalVariableDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#localVariableDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitLocalVariableDeclaration(BSharpParser.LocalVariableDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#statement}.
    * 
    * @param ctx the parse tree
    */
   void enterStatement(BSharpParser.StatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#statement}.
    * 
    * @param ctx the parse tree
    */
   void exitStatement(BSharpParser.StatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#statementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterStatementNoShortIf(BSharpParser.StatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#statementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitStatementNoShortIf(BSharpParser.StatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#statementWithoutTrailingSubstatement}.
    * 
    * @param ctx the parse tree
    */
   void enterStatementWithoutTrailingSubstatement(BSharpParser.StatementWithoutTrailingSubstatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#statementWithoutTrailingSubstatement}.
    * 
    * @param ctx the parse tree
    */
   void exitStatementWithoutTrailingSubstatement(BSharpParser.StatementWithoutTrailingSubstatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#emptyStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterEmptyStatement(BSharpParser.EmptyStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#emptyStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitEmptyStatement(BSharpParser.EmptyStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#labeledStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterLabeledStatement(BSharpParser.LabeledStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#labeledStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitLabeledStatement(BSharpParser.LabeledStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#labeledStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterLabeledStatementNoShortIf(BSharpParser.LabeledStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#labeledStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitLabeledStatementNoShortIf(BSharpParser.LabeledStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#expressionStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterExpressionStatement(BSharpParser.ExpressionStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#expressionStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitExpressionStatement(BSharpParser.ExpressionStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#statementExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterStatementExpression(BSharpParser.StatementExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#statementExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitStatementExpression(BSharpParser.StatementExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#preIncrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPreIncrementExpression(BSharpParser.PreIncrementExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#preIncrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPreIncrementExpression(BSharpParser.PreIncrementExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#preDecrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPreDecrementExpression(BSharpParser.PreDecrementExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#preDecrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPreDecrementExpression(BSharpParser.PreDecrementExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#postIncrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPostIncrementExpression(BSharpParser.PostIncrementExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#postIncrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPostIncrementExpression(BSharpParser.PostIncrementExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#postDecrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPostDecrementExpression(BSharpParser.PostDecrementExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#postDecrementExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPostDecrementExpression(BSharpParser.PostDecrementExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#ifThenStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterIfThenStatement(BSharpParser.IfThenStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#ifThenStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitIfThenStatement(BSharpParser.IfThenStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#ifThenElseStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterIfThenElseStatement(BSharpParser.IfThenElseStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#ifThenElseStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitIfThenElseStatement(BSharpParser.IfThenElseStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#ifThenElseStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterIfThenElseStatementNoShortIf(BSharpParser.IfThenElseStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#ifThenElseStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitIfThenElseStatementNoShortIf(BSharpParser.IfThenElseStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#assertStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterAssertStatement(BSharpParser.AssertStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#assertStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitAssertStatement(BSharpParser.AssertStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#switchStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterSwitchStatement(BSharpParser.SwitchStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#switchStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitSwitchStatement(BSharpParser.SwitchStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#switchBlock}.
    * 
    * @param ctx the parse tree
    */
   void enterSwitchBlock(BSharpParser.SwitchBlockContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#switchBlock}.
    * 
    * @param ctx the parse tree
    */
   void exitSwitchBlock(BSharpParser.SwitchBlockContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#switchBlockStatementGroup}.
    * 
    * @param ctx the parse tree
    */
   void enterSwitchBlockStatementGroup(BSharpParser.SwitchBlockStatementGroupContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#switchBlockStatementGroup}.
    * 
    * @param ctx the parse tree
    */
   void exitSwitchBlockStatementGroup(BSharpParser.SwitchBlockStatementGroupContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#switchLabels}.
    * 
    * @param ctx the parse tree
    */
   void enterSwitchLabels(BSharpParser.SwitchLabelsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#switchLabels}.
    * 
    * @param ctx the parse tree
    */
   void exitSwitchLabels(BSharpParser.SwitchLabelsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#switchLabel}.
    * 
    * @param ctx the parse tree
    */
   void enterSwitchLabel(BSharpParser.SwitchLabelContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#switchLabel}.
    * 
    * @param ctx the parse tree
    */
   void exitSwitchLabel(BSharpParser.SwitchLabelContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enumConstantName}.
    * 
    * @param ctx the parse tree
    */
   void enterEnumConstantName(BSharpParser.EnumConstantNameContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enumConstantName}.
    * 
    * @param ctx the parse tree
    */
   void exitEnumConstantName(BSharpParser.EnumConstantNameContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#whileStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterWhileStatement(BSharpParser.WhileStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#whileStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitWhileStatement(BSharpParser.WhileStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#whileStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterWhileStatementNoShortIf(BSharpParser.WhileStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#whileStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitWhileStatementNoShortIf(BSharpParser.WhileStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#doStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterDoStatement(BSharpParser.DoStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#doStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitDoStatement(BSharpParser.DoStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#forStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterForStatement(BSharpParser.ForStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#forStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitForStatement(BSharpParser.ForStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#forStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterForStatementNoShortIf(BSharpParser.ForStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#forStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitForStatementNoShortIf(BSharpParser.ForStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#basicForStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterBasicForStatement(BSharpParser.BasicForStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#basicForStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitBasicForStatement(BSharpParser.BasicForStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#basicForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterBasicForStatementNoShortIf(BSharpParser.BasicForStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#basicForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitBasicForStatementNoShortIf(BSharpParser.BasicForStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#forInit}.
    * 
    * @param ctx the parse tree
    */
   void enterForInit(BSharpParser.ForInitContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#forInit}.
    * 
    * @param ctx the parse tree
    */
   void exitForInit(BSharpParser.ForInitContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#forUpdate}.
    * 
    * @param ctx the parse tree
    */
   void enterForUpdate(BSharpParser.ForUpdateContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#forUpdate}.
    * 
    * @param ctx the parse tree
    */
   void exitForUpdate(BSharpParser.ForUpdateContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#statementExpressionList}.
    * 
    * @param ctx the parse tree
    */
   void enterStatementExpressionList(BSharpParser.StatementExpressionListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#statementExpressionList}.
    * 
    * @param ctx the parse tree
    */
   void exitStatementExpressionList(BSharpParser.StatementExpressionListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enhancedForStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterEnhancedForStatement(BSharpParser.EnhancedForStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enhancedForStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitEnhancedForStatement(BSharpParser.EnhancedForStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#enhancedForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void enterEnhancedForStatementNoShortIf(BSharpParser.EnhancedForStatementNoShortIfContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#enhancedForStatementNoShortIf}.
    * 
    * @param ctx the parse tree
    */
   void exitEnhancedForStatementNoShortIf(BSharpParser.EnhancedForStatementNoShortIfContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#breakStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterBreakStatement(BSharpParser.BreakStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#breakStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitBreakStatement(BSharpParser.BreakStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#continueStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterContinueStatement(BSharpParser.ContinueStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#continueStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitContinueStatement(BSharpParser.ContinueStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#returnStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterReturnStatement(BSharpParser.ReturnStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#returnStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitReturnStatement(BSharpParser.ReturnStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#throwStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterThrowStatement(BSharpParser.ThrowStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#throwStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitThrowStatement(BSharpParser.ThrowStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#synchronizedStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterSynchronizedStatement(BSharpParser.SynchronizedStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#synchronizedStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitSynchronizedStatement(BSharpParser.SynchronizedStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#tryStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterTryStatement(BSharpParser.TryStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#tryStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitTryStatement(BSharpParser.TryStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#catches}.
    * 
    * @param ctx the parse tree
    */
   void enterCatches(BSharpParser.CatchesContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#catches}.
    * 
    * @param ctx the parse tree
    */
   void exitCatches(BSharpParser.CatchesContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#catchClause}.
    * 
    * @param ctx the parse tree
    */
   void enterCatchClause(BSharpParser.CatchClauseContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#catchClause}.
    * 
    * @param ctx the parse tree
    */
   void exitCatchClause(BSharpParser.CatchClauseContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#catchFormalParameter}.
    * 
    * @param ctx the parse tree
    */
   void enterCatchFormalParameter(BSharpParser.CatchFormalParameterContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#catchFormalParameter}.
    * 
    * @param ctx the parse tree
    */
   void exitCatchFormalParameter(BSharpParser.CatchFormalParameterContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#catchType}.
    * 
    * @param ctx the parse tree
    */
   void enterCatchType(BSharpParser.CatchTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#catchType}.
    * 
    * @param ctx the parse tree
    */
   void exitCatchType(BSharpParser.CatchTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#finally_}.
    * 
    * @param ctx the parse tree
    */
   void enterFinally_(BSharpParser.Finally_Context ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#finally_}.
    * 
    * @param ctx the parse tree
    */
   void exitFinally_(BSharpParser.Finally_Context ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#tryWithResourcesStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterTryWithResourcesStatement(BSharpParser.TryWithResourcesStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#tryWithResourcesStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitTryWithResourcesStatement(BSharpParser.TryWithResourcesStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#resourceSpecification}.
    * 
    * @param ctx the parse tree
    */
   void enterResourceSpecification(BSharpParser.ResourceSpecificationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#resourceSpecification}.
    * 
    * @param ctx the parse tree
    */
   void exitResourceSpecification(BSharpParser.ResourceSpecificationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#resourceList}.
    * 
    * @param ctx the parse tree
    */
   void enterResourceList(BSharpParser.ResourceListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#resourceList}.
    * 
    * @param ctx the parse tree
    */
   void exitResourceList(BSharpParser.ResourceListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#resource}.
    * 
    * @param ctx the parse tree
    */
   void enterResource(BSharpParser.ResourceContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#resource}.
    * 
    * @param ctx the parse tree
    */
   void exitResource(BSharpParser.ResourceContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimary(BSharpParser.PrimaryContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primary}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimary(BSharpParser.PrimaryContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primaryNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimaryNoNewArray(BSharpParser.PrimaryNoNewArrayContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primaryNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimaryNoNewArray(BSharpParser.PrimaryNoNewArrayContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primarySuffixExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimarySuffixExpression(BSharpParser.PrimarySuffixExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primarySuffixExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimarySuffixExpression(BSharpParser.PrimarySuffixExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primarySuffixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimarySuffixExpressionNoNewArray(BSharpParser.PrimarySuffixExpressionNoNewArrayContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primarySuffixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimarySuffixExpressionNoNewArray(BSharpParser.PrimarySuffixExpressionNoNewArrayContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primaryPrefixExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimaryPrefixExpression(BSharpParser.PrimaryPrefixExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primaryPrefixExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimaryPrefixExpression(BSharpParser.PrimaryPrefixExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#primaryPrefixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void enterPrimaryPrefixExpressionNoNewArray(BSharpParser.PrimaryPrefixExpressionNoNewArrayContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#primaryPrefixExpressionNoNewArray}.
    * 
    * @param ctx the parse tree
    */
   void exitPrimaryPrefixExpressionNoNewArray(BSharpParser.PrimaryPrefixExpressionNoNewArrayContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#objectCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterObjectCreationExpression(BSharpParser.ObjectCreationExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#objectCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitObjectCreationExpression(BSharpParser.ObjectCreationExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#fieldAccessExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldAccessExpression(BSharpParser.FieldAccessExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#fieldAccessExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldAccessExpression(BSharpParser.FieldAccessExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodCallExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodCallExpressionWithTypeArgs(BSharpParser.MethodCallExpressionWithTypeArgsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodCallExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodCallExpressionWithTypeArgs(BSharpParser.MethodCallExpressionWithTypeArgsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodCallExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodCallExpression(BSharpParser.MethodCallExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodCallExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodCallExpression(BSharpParser.MethodCallExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodReferenceExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodReferenceExpression(BSharpParser.MethodReferenceExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodReferenceExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodReferenceExpression(BSharpParser.MethodReferenceExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorReferenceExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorReferenceExpressionWithTypeArgs(
      BSharpParser.ConstructorReferenceExpressionWithTypeArgsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorReferenceExpressionWithTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorReferenceExpressionWithTypeArgs(
      BSharpParser.ConstructorReferenceExpressionWithTypeArgsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constructorReferenceExpressionNoTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void enterConstructorReferenceExpressionNoTypeArgs(BSharpParser.ConstructorReferenceExpressionNoTypeArgsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constructorReferenceExpressionNoTypeArgs}.
    * 
    * @param ctx the parse tree
    */
   void exitConstructorReferenceExpressionNoTypeArgs(BSharpParser.ConstructorReferenceExpressionNoTypeArgsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeArgumentsOrDiamond(BSharpParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#typeArgumentsOrDiamond}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeArgumentsOrDiamond(BSharpParser.TypeArgumentsOrDiamondContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#argumentList}.
    * 
    * @param ctx the parse tree
    */
   void enterArgumentList(BSharpParser.ArgumentListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#argumentList}.
    * 
    * @param ctx the parse tree
    */
   void exitArgumentList(BSharpParser.ArgumentListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#classInstanceCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterClassInstanceCreationExpression(BSharpParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#classInstanceCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitClassInstanceCreationExpression(BSharpParser.ClassInstanceCreationExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#arrayCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayCreationExpression(BSharpParser.ArrayCreationExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#arrayCreationExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayCreationExpression(BSharpParser.ArrayCreationExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#dimExprs}.
    * 
    * @param ctx the parse tree
    */
   void enterDimExprs(BSharpParser.DimExprsContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#dimExprs}.
    * 
    * @param ctx the parse tree
    */
   void exitDimExprs(BSharpParser.DimExprsContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#dimExpr}.
    * 
    * @param ctx the parse tree
    */
   void enterDimExpr(BSharpParser.DimExprContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#dimExpr}.
    * 
    * @param ctx the parse tree
    */
   void exitDimExpr(BSharpParser.DimExprContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#constantExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterConstantExpression(BSharpParser.ConstantExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#constantExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitConstantExpression(BSharpParser.ConstantExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void enterExpression(BSharpParser.ExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void exitExpression(BSharpParser.ExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#lambdaExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterLambdaExpression(BSharpParser.LambdaExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#lambdaExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitLambdaExpression(BSharpParser.LambdaExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#lambdaParameters}.
    * 
    * @param ctx the parse tree
    */
   void enterLambdaParameters(BSharpParser.LambdaParametersContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#lambdaParameters}.
    * 
    * @param ctx the parse tree
    */
   void exitLambdaParameters(BSharpParser.LambdaParametersContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#inferredFormalParameterList}.
    * 
    * @param ctx the parse tree
    */
   void enterInferredFormalParameterList(BSharpParser.InferredFormalParameterListContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#inferredFormalParameterList}.
    * 
    * @param ctx the parse tree
    */
   void exitInferredFormalParameterList(BSharpParser.InferredFormalParameterListContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#lambdaBody}.
    * 
    * @param ctx the parse tree
    */
   void enterLambdaBody(BSharpParser.LambdaBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#lambdaBody}.
    * 
    * @param ctx the parse tree
    */
   void exitLambdaBody(BSharpParser.LambdaBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#assignmentExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterAssignmentExpression(BSharpParser.AssignmentExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#assignmentExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitAssignmentExpression(BSharpParser.AssignmentExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#assignment}.
    * 
    * @param ctx the parse tree
    */
   void enterAssignment(BSharpParser.AssignmentContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#assignment}.
    * 
    * @param ctx the parse tree
    */
   void exitAssignment(BSharpParser.AssignmentContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#leftHandSide}.
    * 
    * @param ctx the parse tree
    */
   void enterLeftHandSide(BSharpParser.LeftHandSideContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#leftHandSide}.
    * 
    * @param ctx the parse tree
    */
   void exitLeftHandSide(BSharpParser.LeftHandSideContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#assignmentOperator}.
    * 
    * @param ctx the parse tree
    */
   void enterAssignmentOperator(BSharpParser.AssignmentOperatorContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#assignmentOperator}.
    * 
    * @param ctx the parse tree
    */
   void exitAssignmentOperator(BSharpParser.AssignmentOperatorContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#conditionalExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterConditionalExpression(BSharpParser.ConditionalExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#conditionalExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitConditionalExpression(BSharpParser.ConditionalExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#conditionalOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterConditionalOrExpression(BSharpParser.ConditionalOrExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#conditionalOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitConditionalOrExpression(BSharpParser.ConditionalOrExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#conditionalAndExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterConditionalAndExpression(BSharpParser.ConditionalAndExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#conditionalAndExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitConditionalAndExpression(BSharpParser.ConditionalAndExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#inclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterInclusiveOrExpression(BSharpParser.InclusiveOrExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#inclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitInclusiveOrExpression(BSharpParser.InclusiveOrExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#exclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterExclusiveOrExpression(BSharpParser.ExclusiveOrExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#exclusiveOrExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitExclusiveOrExpression(BSharpParser.ExclusiveOrExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#andExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterAndExpression(BSharpParser.AndExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#andExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitAndExpression(BSharpParser.AndExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#equalityExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterEqualityExpression(BSharpParser.EqualityExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#equalityExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitEqualityExpression(BSharpParser.EqualityExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#relationalExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterRelationalExpression(BSharpParser.RelationalExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#relationalExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitRelationalExpression(BSharpParser.RelationalExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#shiftExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterShiftExpression(BSharpParser.ShiftExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#shiftExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitShiftExpression(BSharpParser.ShiftExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#additiveExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterAdditiveExpression(BSharpParser.AdditiveExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#additiveExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitAdditiveExpression(BSharpParser.AdditiveExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#multiplicativeExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterMultiplicativeExpression(BSharpParser.MultiplicativeExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#multiplicativeExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitMultiplicativeExpression(BSharpParser.MultiplicativeExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unaryExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterUnaryExpression(BSharpParser.UnaryExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unaryExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitUnaryExpression(BSharpParser.UnaryExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#unaryExpressionNotPlusMinus}.
    * 
    * @param ctx the parse tree
    */
   void enterUnaryExpressionNotPlusMinus(BSharpParser.UnaryExpressionNotPlusMinusContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#unaryExpressionNotPlusMinus}.
    * 
    * @param ctx the parse tree
    */
   void exitUnaryExpressionNotPlusMinus(BSharpParser.UnaryExpressionNotPlusMinusContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#postfixExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPostfixExpression(BSharpParser.PostfixExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#postfixExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPostfixExpression(BSharpParser.PostfixExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#castExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterCastExpression(BSharpParser.CastExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#castExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitCastExpression(BSharpParser.CastExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldAccess(BSharpParser.FieldAccessContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#fieldAccess}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldAccess(BSharpParser.FieldAccessContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    */
   void enterArrayAccess(BSharpParser.ArrayAccessContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#arrayAccess}.
    * 
    * @param ctx the parse tree
    */
   void exitArrayAccess(BSharpParser.ArrayAccessContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodInvocation(BSharpParser.MethodInvocationContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#methodInvocation}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodInvocation(BSharpParser.MethodInvocationContext ctx);

   /**
    * Enter a parse tree produced by {@link BSharpParser#literal}.
    * 
    * @param ctx the parse tree
    */
   void enterLiteral(BSharpParser.LiteralContext ctx);

   /**
    * Exit a parse tree produced by {@link BSharpParser#literal}.
    * 
    * @param ctx the parse tree
    */
   void exitLiteral(BSharpParser.LiteralContext ctx);
}