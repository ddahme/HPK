package de.lab4inf.wrb;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class WRBFunction implements Function{

	private String[] variables;
	private ParseTree body;
	private WRBObserver listener;
	private Map<String, Double> memory = new HashMap<String, Double>();
	
	public WRBFunction(String[] variables, ParseTree body, WRBObserver listener) {
		
		if (variables == null|variables.length == 0){
			throw new IllegalArgumentException("variables are null or empty");
		}
		
		this.variables = variables;
		this.body = body;
		this.listener = listener;
	}
	
	@Override
	public double eval(double... args) {
		double value = .0;
		
		parseVariables(args);
		value = parse();
		
		return value;
	}
	
	private void parseVariables(double... variableValues) {
		String name;
		Double value;
		if (variableValues.length != this.variables.length) {
			throw new IllegalArgumentException("wront number of argumentes.");
		}
		for (int i = 0; i < variables.length; i++) {
			name = variables[i];
			value = variableValues[i];
			this.memory.put(name, value);
		}
		this.listener.addMemory(this.memory);
	}
	
	private double parse(){
		double result;
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, body);
		listener.removeMemory();
		result = listener.lastValue;
		
		return result;
	}
}
