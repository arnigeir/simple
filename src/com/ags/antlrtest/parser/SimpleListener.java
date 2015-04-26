// Generated from Simple.g4 by ANTLR 4.2

package com.ags.antlrtest.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull SimpleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull SimpleParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull SimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull SimpleParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SimpleParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#blank}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull SimpleParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#blank}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull SimpleParser.BlankContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull SimpleParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull SimpleParser.PrintExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull SimpleParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull SimpleParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull SimpleParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull SimpleParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull SimpleParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull SimpleParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull SimpleParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull SimpleParser.FloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull SimpleParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull SimpleParser.MulDivContext ctx);
}