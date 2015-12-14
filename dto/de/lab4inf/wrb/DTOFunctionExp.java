package de.lab4inf.wrb;

public class DTOFunctionExp   implements Function{

	@Override
	public double eval(double... args) {
		double result = .0;

		if (args.length != 1) {
			throw new IllegalArgumentException("wrong number of variables");
		}
		result = Math.exp(args[0]);

		return result;
	}

}
