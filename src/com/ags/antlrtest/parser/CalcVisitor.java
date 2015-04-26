package com.ags.antlrtest.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

public class CalcVisitor extends SimpleBaseVisitor<Number> {

	//stores calculated values of all variables
	Map<String,Number> memory = new HashMap<String,Number>();
	
	@Override
	public Number visitFloat(@NotNull SimpleParser.FloatContext ctx){
		System.out.println("Found float : "+ctx.FLOAT().getText());
		return Float.parseFloat(ctx.FLOAT().getText());
	}
}
