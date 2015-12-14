// Generated from de/lab4inf/wrb/WRBParser.g4 by ANTLR 4.5
package de.lab4inf.wrb;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WRBParser}.
 */
public interface WRBParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WRBParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(WRBParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(WRBParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WRBParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WRBParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterProgramPart(WRBParser.ProgramPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitProgramPart(WRBParser.ProgramPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#functionCreate}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCreate(WRBParser.FunctionCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#functionCreate}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCreate(WRBParser.FunctionCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(WRBParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(WRBParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarToVar}
	 * labeled alternative in {@link WRBParser#assigntion}.
	 * @param ctx the parse tree
	 */
	void enterVarToVar(WRBParser.VarToVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarToVar}
	 * labeled alternative in {@link WRBParser#assigntion}.
	 * @param ctx the parse tree
	 */
	void exitVarToVar(WRBParser.VarToVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarToExpr}
	 * labeled alternative in {@link WRBParser#assigntion}.
	 * @param ctx the parse tree
	 */
	void enterVarToExpr(WRBParser.VarToExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarToExpr}
	 * labeled alternative in {@link WRBParser#assigntion}.
	 * @param ctx the parse tree
	 */
	void exitVarToExpr(WRBParser.VarToExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WRBParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WRBParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#addTerm}.
	 * @param ctx the parse tree
	 */
	void enterAddTerm(WRBParser.AddTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#addTerm}.
	 * @param ctx the parse tree
	 */
	void exitAddTerm(WRBParser.AddTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#mulTerm}.
	 * @param ctx the parse tree
	 */
	void enterMulTerm(WRBParser.MulTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#mulTerm}.
	 * @param ctx the parse tree
	 */
	void exitMulTerm(WRBParser.MulTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#expTerm}.
	 * @param ctx the parse tree
	 */
	void enterExpTerm(WRBParser.ExpTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#expTerm}.
	 * @param ctx the parse tree
	 */
	void exitExpTerm(WRBParser.ExpTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParens(WRBParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParens(WRBParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterId(WRBParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitId(WRBParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterValue(WRBParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitValue(WRBParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetConstant}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSetConstant(WRBParser.SetConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetConstant}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSetConstant(WRBParser.SetConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAtom}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAtom(WRBParser.FunctionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAtom}
	 * labeled alternative in {@link WRBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAtom(WRBParser.FunctionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(WRBParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(WRBParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(WRBParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(WRBParser.NumberContext ctx);
}