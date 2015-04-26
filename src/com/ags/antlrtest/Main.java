package com.ags.antlrtest;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.ags.antlrtest.parser.CalcVisitor;
import com.ags.antlrtest.parser.MySimpleListener;
import com.ags.antlrtest.parser.SimpleLexer;
import com.ags.antlrtest.parser.SimpleListener;
import com.ags.antlrtest.parser.SimpleParser;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String inputFile = null;
			if(args.length>0) inputFile = args[0];
			InputStream is = System.in;
			if(inputFile != null) is = new FileInputStream(inputFile);
			for(String s : Files.readAllLines(Paths.get(inputFile),Charset.defaultCharset())){
				System.out.println(s);
			}
			
			System.out.println("====================================");
			
			ANTLRInputStream input = new ANTLRInputStream(is);
			SimpleLexer lexer = new SimpleLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SimpleParser parser = new SimpleParser(tokens);
			ParseTree tree = parser.prog();
			
			CalcVisitor visitor = new CalcVisitor();
			visitor.visit(tree);
			/*
			ParseTreeWalker walker = new ParseTreeWalker();
			SimpleListener sl = new MySimpleListener();
			walker.walk(sl,tree);
			
			Hashtable<String,Number> vars = ((MySimpleListener)sl).getVariables();
			System.out.println("---------------------------");
			for(String key : vars.keySet()){
				System.out.println(key+"="+vars.get(key).toString());
			}
			*/
			
			
			
			System.out.println(tree.toStringTree(parser));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		
	}

}
