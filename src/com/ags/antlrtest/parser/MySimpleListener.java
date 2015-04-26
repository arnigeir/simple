package com.ags.antlrtest.parser;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;

import com.ags.antlrtest.parser.SimpleParser.ExprContext;

public class MySimpleListener extends SimpleBaseListener {
	
	private Stack<Number> stack = new Stack<Number>();
	private Hashtable<String,Number> variables = new Hashtable<String,Number>();
	private ArrayList<String> errors = new ArrayList<String>();

	public double getValue(){
		return stack.peek().doubleValue();
	}
	public Hashtable<String,Number> getVariables(){
		return variables;
	}
	private void parseNumeric(String s){
		Number n = Float.parseFloat(s);
		stack.push(n);
		System.out.println(String.format("%f",n));		
	}
	private void multiply()
	{
		Number n1 = stack.pop();
		Number n2 = stack.pop();
		Number v = n1.doubleValue()*n2.doubleValue();
		String log = String.format("%f = %f * %f",v.doubleValue(),n2.doubleValue(),n1.doubleValue());
		System.out.println(log);
		stack.push(v);		
	}
	private void divide()
	{
		Number n1 = stack.pop();
		Number n2 = stack.pop();
		Number v = n2.doubleValue()/n1.doubleValue();
		String log = String.format("%f = %f / %f",v.doubleValue(),n2.doubleValue(),n1.doubleValue());
		System.out.println(log);
		stack.push(v);		
	}
	
	private void add()
	{
		Number n1 = stack.pop();
		Number n2 = stack.pop();
		Number v = n1.doubleValue()+n2.doubleValue();
		String log = String.format("%f = %f + %f",v.doubleValue(),n2.doubleValue(),n1.doubleValue());
		System.out.println(log);
		stack.push(v);		
	}
	
	private void subtract()
	{
		Number n1 = stack.pop();
		Number n2 = stack.pop();
		Number v = n2.doubleValue() - n1.doubleValue();
		String log = String.format("%f = %f - %f",v.doubleValue(),n2.doubleValue(),n1.doubleValue());
		System.out.println(log);
		stack.push(v);		
	}
	
	/*
	@Override
	public void exitExpr(@NotNull ExprContext ctx)  {
		if(ctx.FLOAT() != null)
			parseNumeric(ctx.FLOAT().getText());
		else if(ctx.INT() != null)
			parseNumeric(ctx.INT().getText());
		else if(ctx.MUL() != null)
			multiply();
		else if(ctx.DIV() != null)			
			divide();
		else if(ctx.ADD() != null)
			add();
		else if(ctx.SUB() != null)
			subtract();
		else if(ctx.ID() != null)
		{
			//check if variable is defined
			String variableName = ctx.ID().getText();
			if(!variables.containsKey(variableName)){
				errors.add("Variable name '"+variableName+"' is unbound");
				stack.push(null);
			}
			
		}
	}
	

	@Override 
	public void exitStat(@NotNull SimpleParser.StatContext ctx) { 
		String lvar = null;
		if(ctx.EQU() != null){
			lvar = ctx.children.get(0).getText();
			System.out.println("Assigned value "+stack.peek()+" to variable "+lvar);
			variables.put(lvar, stack.peek());
		}
		System.out.println(ctx.getText());
	}
	*/


}
