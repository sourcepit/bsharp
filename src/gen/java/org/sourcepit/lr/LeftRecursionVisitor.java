// Generated from LeftRecursion.g4 by ANTLR 4.5.1

package org.sourcepit.lr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LeftRecursionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LeftRecursionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LeftRecursionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LeftRecursionParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LeftRecursionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LeftRecursionParser.ExprContext ctx);
}