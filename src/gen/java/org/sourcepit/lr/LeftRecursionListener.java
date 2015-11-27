// Generated from LeftRecursion.g4 by ANTLR 4.5.1

package org.sourcepit.lr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LeftRecursionParser}.
 */
public interface LeftRecursionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LeftRecursionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LeftRecursionParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LeftRecursionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LeftRecursionParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LeftRecursionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LeftRecursionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LeftRecursionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LeftRecursionParser.ExprContext ctx);
}