package de.lab4inf.wrb;

public class DTOFunctionSqrt implements Function{

	@Override
	public double eval(double... args) {
		double value = .0;
		
		if (args.length == 1){
			value = args[0];
			value = Math.sqrt(value);
		}
		return value;
	}

}
