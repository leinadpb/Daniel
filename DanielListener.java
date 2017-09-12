// Generated from Daniel.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DanielParser}.
 */
public interface DanielListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DanielParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DanielParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DanielParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link DanielParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(DanielParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(DanielParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(DanielParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(DanielParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#argumentIf}.
	 * @param ctx the parse tree
	 */
	void enterArgumentIf(DanielParser.ArgumentIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#argumentIf}.
	 * @param ctx the parse tree
	 */
	void exitArgumentIf(DanielParser.ArgumentIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DanielParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DanielParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#privacy}.
	 * @param ctx the parse tree
	 */
	void enterPrivacy(DanielParser.PrivacyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#privacy}.
	 * @param ctx the parse tree
	 */
	void exitPrivacy(DanielParser.PrivacyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(DanielParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(DanielParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#argumentFunc}.
	 * @param ctx the parse tree
	 */
	void enterArgumentFunc(DanielParser.ArgumentFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#argumentFunc}.
	 * @param ctx the parse tree
	 */
	void exitArgumentFunc(DanielParser.ArgumentFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(DanielParser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(DanielParser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DanielParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DanielParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DanielParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DanielParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(DanielParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(DanielParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(DanielParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(DanielParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DanielParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(DanielParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DanielParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(DanielParser.AtomExpContext ctx);
}