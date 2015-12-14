package de.lab4inf.wrb;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.lab4inf.wrb.WRBParser.AddTermContext;
import de.lab4inf.wrb.WRBParser.AtomContext;
import de.lab4inf.wrb.WRBParser.ConstantContext;
import de.lab4inf.wrb.WRBParser.EvalContext;
import de.lab4inf.wrb.WRBParser.ExpTermContext;
import de.lab4inf.wrb.WRBParser.ExprContext;
import de.lab4inf.wrb.WRBParser.FunctionAtomContext;
import de.lab4inf.wrb.WRBParser.FunctionCreateContext;
import de.lab4inf.wrb.WRBParser.IdContext;
import de.lab4inf.wrb.WRBParser.MulTermContext;
import de.lab4inf.wrb.WRBParser.NumberContext;
import de.lab4inf.wrb.WRBParser.ParensContext;
import de.lab4inf.wrb.WRBParser.ProgramContext;
import de.lab4inf.wrb.WRBParser.ProgramPartContext;
import de.lab4inf.wrb.WRBParser.SetConstantContext;
import de.lab4inf.wrb.WRBParser.ValueContext;
import de.lab4inf.wrb.WRBParser.VarToExprContext;
import de.lab4inf.wrb.WRBParser.VarToVarContext;

public class WRBObserver extends WRBParserBaseListener {

	protected Map<ParseTree, Double> values = new IdentityHashMap<ParseTree, Double>();
	protected Map<Integer, Map<String, Double>> memories = new HashMap<Integer, Map<String, Double>>();
	protected Script script;
	protected double lastValue;
	protected boolean isFunctionCreate=false;
	protected int iMemory= -1;

	public WRBObserver(final Script script) {
		if (script != null){
			this.script = script;
		}else{
			throw new IllegalArgumentException("script is null");
		}
	}
	
	public void addMemory(Map<String, Double> memory){
		this.iMemory++;
		this.memories.put(iMemory, memory);
	}
	
	public void removeMemory(){
		this.memories.remove(this.iMemory);
		this.iMemory--;
		
	}
	
	private double getVariable(String name){		
		if (iMemory > -1){
			for (int i = iMemory; i >=0 ; i--){
				Map<String, Double> memory=this.memories.get(i);
				if (memory.containsKey(name)){
					return memory.get(name);
				}
			}
		}
		return script.getVariable(name);
	}
	
	
	private void setVariable(String name, double value){
		if (this.iMemory > -1){
			this.memories.get(iMemory).put(name, value);
		}else{
			this.script.setVariable(name, value);
		}
	}
	
	/***
	 * Get ctx value
	 * 
	 * @param ctx
	 * @return value
	 * @throws IllegalArgumentException
	 */
	private double getValue(ParseTree ctx) throws IllegalArgumentException {
		if (!values.containsKey(ctx) || values.isEmpty()) {
			throw new IllegalArgumentException("can not get value: " + ctx.getText());
		} else {
			return values.get(ctx);
		}
	}

	/***
	 * Saves ctx value
	 * 
	 * @param ctx
	 * @param value
	 */
	private void setValue(ParseTree ctx, double value) {
		values.put(ctx, value);
		this.lastValue = value;
	}

	@Override
	public void exitEval(EvalContext ctx) {
		double value = .0;
		
		value = getValue(ctx.program());
		
		setValue(ctx, value);
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		double value = .0;
		
		for (ProgramPartContext program : ctx.programPart()){
			value = getValue(program);
		}
		
		setValue(ctx, value);
	}

	@Override
	public void exitProgramPart(ProgramPartContext ctx) {
		double value = .0;
		
		if (ctx.assigntion() != null) {
			value = getValue(ctx.assigntion());
		} else if (ctx.functionCreate() != null) {
			value = getValue(ctx.functionCreate());
		} else if (ctx.expr() != null) {
			value = getValue(ctx.expr());
		} else {
			throw new IllegalArgumentException();
		}
		
		setValue(ctx, value);
	}
	
	public void enterFunctionCreate(FunctionCreateContext ctx) {
		this.isFunctionCreate=true;
	};
	
	@Override
	public void exitFunctionCreate(FunctionCreateContext ctx) {
		Function function;
		String id;
		String[] variables;
		ParseTree node;
		ParseTree body;
		
		id = ctx.name.getText();					/**get name**/
		body = ctx.body;							/**get body**/
		variables = new String[ctx.ID().size() -1]; /**get variables**/
		for (int i = 1; i<ctx.ID().size(); i++){
			node = ctx.ID(i);
			variables[i-1] = node.getText();
		}
		function = new WRBFunction(variables,body,this);
		script.setFunction(id, function);
		
		setValue(ctx, 0);
		this.isFunctionCreate = false;
	}

	@Override
	public void exitFunctionAtom(FunctionAtomContext ctx) {
		Function function;
		String id;
		double value = .0;
		double[] variables;
		int nVaraibles;

		if(this.isFunctionCreate){
			return;
		}
		
		id = ctx.functionCall().name.getText();
		function = script.getFunction(id);
		nVaraibles=ctx.functionCall().expr().size();
		variables = new double[nVaraibles];						/**create array in size of numbers|expressions**/
		for ( int i = 0; i < nVaraibles; i++){					/**iterate over numbers**/
			variables[i]= getValue(ctx.functionCall().expr(i));	/**add number|expression i to array**/
		}

		value = function.eval(variables);
		
		setValue(ctx, value);
	}
	
	@Override
	public void exitVarToVar(VarToVarContext ctx) {
		String fromId;
		double value;

		fromId = ctx.right.getText();
		value = getVariable(fromId);
		if (ctx.sign != null) {
			value *= -1;
		}
		String toId = ctx.left.getText();
		setVariable(toId, value);
		
		setValue(ctx, value);
	}

	@Override
	public void exitVarToExpr(VarToExprContext ctx) {
		String id;
		double value;

		id = ctx.ID().getText();
		value = getValue(ctx.expr());
		setVariable(id, value);
		setValue(ctx, value);
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		double value;
		
		if (isFunctionCreate){
			return;
		}
		value = getValue(ctx.addTerm());
		
		setValue(ctx, value);
	}

	public void exitAddTerm(AddTermContext ctx) {
		double value = .0;
		int iAdd=0;
		int iSub =0;
		int iTerm =0;
		TerminalNode operator;
		MulTermContext term;
		
		if (this.isFunctionCreate){
			return;
		}
		value = getValue(ctx.mulTerm(iTerm)); 					/**get first term**/
		iTerm++;
		term = ctx.mulTerm(iTerm); 								/**get next term**/
		operator = getOperator(ctx, iAdd, iSub); 				/**get operator**/
		while(term!=null && operator!=null){ 					/**check if next term or operator is null**/
			if(operator.getSymbol().getType() == WRBLexer.ADD){ /**check if operator is addition**/
				value += getValue(term);
				iAdd++;
			}else{												/**or subtraction**/
				value -= getValue(term);
				iSub++;
			}
			iTerm++;
			term = ctx.mulTerm(iTerm);							/**get next operator**/
			operator = getOperator(ctx, iAdd, iSub);			/**get next term**/
		}

		setValue(ctx, value);
	}

	@Override
	public void exitMulTerm(MulTermContext ctx) {
		double value = 1.0;
		int iMul =0;
		int iDiv =0;
		int iTerm=0;
		TerminalNode operator;
		ExpTermContext term;
		
		if(isFunctionCreate){
			return;
		}
		value = getValue(ctx.expTerm(iTerm)); 					/**get first term**/
		iTerm++;
		term = ctx.expTerm(iTerm); 								/**get next term**/
		operator = getOperator(ctx, iMul, iDiv); 				/**get operator**/
		while(term!=null && operator!=null){ 					/**check if next term or operator is null**/
			if(operator.getSymbol().getType() == WRBLexer.MUL){ /**check if operator is multiplication**/
				value *= getValue(term);
				iMul++;
			}else{												/**or division**/
				value /= getValue(term);
				iDiv++;
			}
			iTerm++;
			term = ctx.expTerm(iTerm);							/**get next operator**/
			operator = getOperator(ctx, iMul, iDiv);			/**get next term**/
		}

	setValue(ctx, value);
	}

	@Override
	public void exitExpTerm(ExpTermContext ctx) {
		double value = .0;

		if (isFunctionCreate){
			return;
		}
		value = calculateExpList(ctx.atom());
		
		setValue(ctx, value);
	}

	@Override
	public void exitParens(ParensContext ctx) {
		double value = .0;
		
		value = getValue(ctx.expr());
		if (ctx.SUB() != null){		/**check for sign**/
			value *= -1;
		}
		
		setValue(ctx, value);
	}

	@Override
	public void exitId(IdContext ctx) {
		double value = .0;
		String name;

		if (this.isFunctionCreate) {
			return;					/**do not put function-variables in general variable list**/
		}

		name = ctx.ID().getSymbol().getText();
		value = getVariable(name);
		if (ctx.SUB() != null) {
			value *= -1;
		}

		setValue(ctx, value);
	}

	@Override
	public void exitSetConstant(SetConstantContext ctx) {
		double value = .0;

		value = getValue(ctx.constant());

		setValue(ctx, value);
	}

	@Override
	public void exitValue(ValueContext ctx) {
		double value = .0;

		value = getValue(ctx.number());

		setValue(ctx, value);
	}

	@Override
	public void exitConstant(ConstantContext ctx) {
		double value = .0;

		value = getValue(ctx.number());

		setValue(ctx, value);
	}

	@Override
	public void exitNumber(NumberContext ctx) {
		double value;
		
		value = Double.parseDouble(ctx.getText());
		
		setValue(ctx, value);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		throw new IllegalArgumentException(node.getText());
	}
	
	/***
	 * help-function to get operator of an addition-term
	 * @param ctx
	 * @param iAdd
	 * @param iSub
	 * @return
	 */
	private TerminalNode getOperator(AddTermContext ctx, int iAdd,int iSub){
		TerminalNode add;
		TerminalNode sub;
		TerminalNode operator = null;
		
		add = ctx.ADD(iAdd);
		sub = ctx.SUB(iSub);
		if (add != null && sub != null) {
			if (add.getSourceInterval().startsBeforeDisjoint(sub.getSourceInterval())){
				operator = add;
			}else{
				operator = sub;
			}
		} else if (add != null && sub == null) {
			operator = add;
		} else if (add == null && sub != null) {
			operator = sub;
		} else {
			// ToDo check if this is possible
		}
		
		return operator;
	}
	
	/***
	 * help-function to get operator of multiplication-term
	 * @param ctx
	 * @param iMul
	 * @param iDiv
	 * @return
	 */
	private TerminalNode getOperator(MulTermContext ctx, int iMul, int iDiv) {
		TerminalNode operator = null;
		TerminalNode mul;
		TerminalNode div;
		
		mul = ctx.MUL(iMul);
		div = ctx.DIV(iDiv);
		
		if (mul != null && div != null) {
			if (mul.getSourceInterval().startsBeforeDisjoint(div.getSourceInterval())){
				operator = mul;
			}else{
				operator = div;
			}
		} else if (mul != null && div == null) {
			operator = mul;
		} else if (mul == null && div != null) {
			operator = div;
		} else {
			// ToDo check if this is possible
		}
		
		return operator;
	}
	
	/***
	 * help-function to calculate exponent-calculations with more than one exponent
	 * @param list
	 * @return
	 */
	private double calculateExpList(List<AtomContext> list) {
		int nElements;
		double base;
		double expnent;
		double value = .0;
		
		nElements=list.size();
		if (nElements == 1){
			value = getValue(list.get(0));
		}else if (nElements == 2){
			base = getValue(list.get(0));
			expnent = getValue(list.get(1));
			value = Math.pow(base, expnent);
		}else if (nElements > 2){
			base = getValue(list.get(0));
			list.remove(0);
			expnent = calculateExpList(list);
			value = Math.pow(base, expnent);
		}
		
		return value;
	}
}