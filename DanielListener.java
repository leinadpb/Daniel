// Generated from Daniel.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DanielParser}.
 */
public interface DanielListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DanielParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DanielParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DanielParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(DanielParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(DanielParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(DanielParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(DanielParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(DanielParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(DanielParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(DanielParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(DanielParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(DanielParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(DanielParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(DanielParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(DanielParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DanielParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DanielParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DanielParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DanielParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DanielParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DanielParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(DanielParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(DanielParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(DanielParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(DanielParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(DanielParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(DanielParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(DanielParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(DanielParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(DanielParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(DanielParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(DanielParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(DanielParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(DanielParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(DanielParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DanielParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DanielParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(DanielParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(DanielParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(DanielParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(DanielParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(DanielParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(DanielParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DanielParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DanielParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(DanielParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(DanielParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(DanielParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(DanielParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(DanielParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(DanielParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(DanielParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(DanielParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(DanielParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(DanielParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(DanielParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(DanielParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(DanielParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(DanielParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(DanielParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(DanielParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(DanielParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(DanielParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(DanielParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(DanielParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(DanielParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(DanielParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(DanielParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(DanielParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(DanielParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(DanielParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(DanielParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(DanielParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(DanielParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(DanielParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(DanielParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(DanielParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(DanielParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(DanielParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(DanielParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(DanielParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(DanielParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(DanielParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(DanielParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(DanielParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(DanielParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(DanielParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(DanielParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(DanielParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(DanielParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(DanielParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(DanielParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(DanielParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(DanielParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(DanielParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(DanielParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(DanielParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(DanielParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(DanielParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(DanielParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(DanielParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DanielParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DanielParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DanielParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DanielParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(DanielParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(DanielParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(DanielParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(DanielParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(DanielParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(DanielParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(DanielParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(DanielParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(DanielParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(DanielParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(DanielParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(DanielParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(DanielParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(DanielParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(DanielParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(DanielParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(DanielParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(DanielParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(DanielParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(DanielParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(DanielParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(DanielParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(DanielParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(DanielParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(DanielParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(DanielParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(DanielParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(DanielParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DanielParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DanielParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(DanielParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(DanielParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(DanielParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(DanielParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(DanielParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(DanielParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DanielParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DanielParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(DanielParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(DanielParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(DanielParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(DanielParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(DanielParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(DanielParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(DanielParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(DanielParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(DanielParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(DanielParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DanielParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DanielParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(DanielParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(DanielParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(DanielParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(DanielParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(DanielParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(DanielParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(DanielParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(DanielParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(DanielParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(DanielParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(DanielParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(DanielParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(DanielParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(DanielParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DanielParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DanielParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(DanielParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(DanielParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(DanielParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(DanielParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DanielParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DanielParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DanielParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DanielParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(DanielParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(DanielParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(DanielParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(DanielParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(DanielParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(DanielParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(DanielParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(DanielParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(DanielParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(DanielParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(DanielParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(DanielParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(DanielParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(DanielParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(DanielParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(DanielParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(DanielParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(DanielParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(DanielParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(DanielParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(DanielParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(DanielParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DanielParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DanielParser.ArgumentsContext ctx);
}