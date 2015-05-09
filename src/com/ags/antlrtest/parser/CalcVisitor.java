package com.ags.antlrtest.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

public class CalcVisitor extends SimpleBaseVisitor<Number> {

	//stores calculated values of all variables
	Map<String,Number> memory = new HashMap<String,Number>();
	@Override
	public Number visitUnaryFloat(@NotNull SimpleParser.UnaryFloatContext ctx){
		System.out.println("Found float : -"+ctx.FLOAT().getText());
		return -Float.parseFloat(ctx.FLOAT().getText());
	}
	@Override
	public Number visitFloat(@NotNull SimpleParser.FloatContext ctx){
		System.out.println("Found float : "+ctx.FLOAT().getText());
		return Float.parseFloat(ctx.FLOAT().getText());
	}
	@Override
	public Number visitInt(@NotNull SimpleParser.IntContext ctx){
		System.out.println("Found integer : "+ctx.INT().getText());
		return Integer.parseInt(ctx.INT().getText());
	}
	@Override
	public Number visitUnaryInt(@NotNull SimpleParser.UnaryIntContext ctx){
		System.out.println("Found negative integer : -"+ctx.INT().getText());
		return -Integer.parseInt(ctx.INT().getText());
	}	
	@Override
	public Number visitAddSub(@NotNull SimpleParser.AddSubContext ctx){
		Number left = visit(ctx.expr(0));
		Number right = visit(ctx.expr(1));
		float result = (ctx.ADD()!=null)? left.floatValue()+right.floatValue() : left.floatValue()-right.floatValue();
		System.out.println(ctx.getText()+"->"+result);
		return (Number)result;
	}
	
	@Override
	public Number visitParens(@NotNull SimpleParser.ParensContext ctx){
		return visit(ctx.expr());
	}
	
	@Override
	public Number visitMulDiv(@NotNull SimpleParser.MulDivContext ctx){
		Number left = visit(ctx.expr(0));
		Number right = visit(ctx.expr(1));
		float result = 0.0f;
		if(left == null || right == null ) return result;
		if(ctx.MUL() != null)
			result =  left.floatValue()*right.floatValue();
		else if (right.floatValue() != 0)
			result = left.floatValue() / right.floatValue();

		System.out.println(ctx.getText()+"->"+result);
		
		return (Number)result;
	}	
	
}
