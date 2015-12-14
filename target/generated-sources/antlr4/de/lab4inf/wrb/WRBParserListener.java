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
	 * Enter a parse tree produced by {@link WRBParser#declareVarExp}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVarExp(WRBParser.DeclareVarExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#declareVarExp}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVarExp(WRBParser.DeclareVarExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#assignVarToVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVarToVar(WRBParser.AssignVarToVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#assignVarToVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVarToVar(WRBParser.AssignVarToVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(WRBParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(WRBParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WRBParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunc(WRBParser.AssignFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link WRBParser#assignFunc}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunc(WRBParser.AssignFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(WRBParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link WRBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(WRBParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link WRBParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(WRBParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multdiv}
	 * labeled alternative in {@link WRBParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(WRBParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionAtom}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAtom(WRBParser.FunctionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionAtom}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAtom(WRBParser.FunctionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code val}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterVal(WRBParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code val}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitVal(WRBParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterId(WRBParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitId(WRBParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterPow(WRBParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitPow(WRBParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterParens(WRBParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitParens(WRBParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infinity}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterInfinity(WRBParser.InfinityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infinity}
	 * labeled alternative in {@link WRBParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitInfinity(WRBParser.InfinityContext ctx);
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