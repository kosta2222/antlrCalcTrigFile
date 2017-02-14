// Generated from Calc.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#Tan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(@NotNull CalcParser.TanContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(@NotNull CalcParser.SetContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull CalcParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull CalcParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(@NotNull CalcParser.CosContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Calculate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(@NotNull CalcParser.CalculateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull CalcParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CalcParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(@NotNull CalcParser.BracesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#ToMulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMulDiv(@NotNull CalcParser.ToMulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(@NotNull CalcParser.SinContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalcParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#Minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalcParser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#ToAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(@NotNull CalcParser.ToAtomContext ctx);
}