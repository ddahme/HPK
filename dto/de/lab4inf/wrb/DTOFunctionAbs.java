package de.lab4inf.wrb;

public class DTOFunctionAbs implements Function {

	@Override
	public double eval(double... args) {
		double result = .0;

		if (args.length != 1) {
			throw new IllegalArgumentException("wrong number of variables");
		}
		result = Math.abs(args[0]);

		return result;
	}

}
