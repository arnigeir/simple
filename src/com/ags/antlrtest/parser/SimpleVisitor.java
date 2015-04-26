// Generated from Simple.g4 by ANTLR 4.2

package com.ags.antlrtest.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull SimpleParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull SimpleParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull SimpleParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#blank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(@NotNull SimpleParser.BlankContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull SimpleParser.PrintExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull SimpleParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull SimpleParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull SimpleParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull SimpleParser.FloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull SimpleParser.MulDivContext ctx);
}