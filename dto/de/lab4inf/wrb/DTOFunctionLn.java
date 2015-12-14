package de.lab4inf.wrb;


public class DTOFunctionLn   implements Function{

	@Override
	public double eval(double... args) {
		double result = .0;

		if (args.length != 1) {
			throw new IllegalArgumentException("wrong number of variables");
		}
		result = Math.log(args[0])/Math.log(2);

		return result;
	}

}
