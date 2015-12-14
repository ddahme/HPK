package de.lab4inf.wrb;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import de.lab4inf.wrb.WRBParser.EvalContext;


public class WRBScript implements Script {

	private Map<String, Double> variableMap = new HashMap<String, Double>();
	private Map<String, Function> functionMap = new HashMap<String, Function>();
	
	public WRBScript() {
		loadDefaultfunctions();
	}
	
	@Override
	public double getVariable(String name) throws IllegalArgumentException {
		if(!variableMap.containsKey(name)) {
			throw new IllegalArgumentException();
		}
		return variableMap.get(name);
	}

	@Override
	public void setVariable(String name, double value) {
		if (this.variableMap.containsKey(name)){
			this.variableMap.remove(name);
		}
		this.variableMap.put(name, value);
	}

	@Override
	public Function getFunction(String id) throws IllegalArgumentException {
		if(!functionMap.containsKey(id)){
			throw new IllegalArgumentException("can not find function: " + id);
		}
		return functionMap.get(id);
	}

	@Override
	public void setFunction(String name, Function function) {
		if (this.functionMap.containsKey(name)){
			this.functionMap.remove(name);
		}
		this.functionMap.put(name, function);	//ToDo: handle double definition?
	}

	@Override
	public double parse(String definition) throws RecognitionException, IllegalArgumentException {
		ANTLRInputStream antlrStream = new ANTLRInputStream(definition);
		double result = .0;
		
		try {
			result = parse(antlrStream);
		} catch (IOException e) {
			// TODO add some error-handling
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public double parse(InputStream defStream) throws RecognitionException, IllegalArgumentException, IOException {
		ANTLRInputStream antlrStream = new ANTLRInputStream(defStream);
		double result = .0;
		
		result = parse(antlrStream);
		
		return result;
	}
	
	private double parse(ANTLRInputStream stream) throws RecognitionException, IllegalArgumentException, IOException{
		double result = .0;
		
		WRBLexer lexer = new WRBLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		WRBParser parser = new WRBParser(tokens);
		parser.getInterpreter().setPredictionMode(PredictionMode.LL);
		EvalContext evalContext = parser.eval();
		ParseTreeWalker walker = new ParseTreeWalker();
		WRBObserver listener = new WRBObserver(this);
		System.out.println(evalContext.toStringTree(parser));
		walker.walk(listener, evalContext);
		result = listener.lastValue;
		return result;
	}
	
	private void loadDefaultfunctions(){
		Function function;
		
		/**min**/
		function = new DTOFunctionMin();
		setFunction("min", function);
		/**max**/
		function = new DTOFunctionMax();
		setFunction("max", function);

		/**abs**/
		function = new DTOFunctionAbs();
		setFunction("abs", function);
		/**exp**/
		function = new DTOFunctionExp();
		setFunction("exp", function);
		
		/**pow**/
		function = new DTOFunctionPow();
		setFunction("pow", function);
		/**sqrt**/
		function = new DTOFunctionSqrt();
		setFunction("sqrt", function);
		
		/**sin**/
		function = new DTOFunctionSin();
		setFunction("sin", function);
		/**cos**/
		function = new DTOFunctionCos();
		setFunction("cos", function);
		/**tan**/
		function = new DTOFunctionTan();
		setFunction("tan", function);
		/**asin**/
		function = new DTOFunctionASin();
		setFunction("asin", function);
		/**acos**/
		function = new DTOFunctionACos();
		setFunction("acos", function);
		/**atan**/
		function = new DTOFunctionATan();
		setFunction("atan", function);
		/**sinh**/
		function = new DTOFunctionSinH();
		setFunction("sinh", function);
		/**cosh**/
		function = new DTOFunctionCosH();
		setFunction("cosh", function);
		/**tanh**/
		function = new DTOFunctionTanH();
		setFunction("tanh", function);

		/**ln**/
		function = new DTOFunctionLn();
		setFunction("lb", function);
		setFunction("ld", function);
		/**log**/
		function = new DTOFunctionLog();
		setFunction("log", function);
		setFunction("logE", function);
		setFunction("ln", function);
		/**log2**/
		function = new DTOFunctionLogII();
		setFunction("log2", function);
		/**log10**/
		function = new DTOFunctionLogX();
		setFunction("log10", function);
	}
}