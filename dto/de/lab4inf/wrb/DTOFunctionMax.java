package de.lab4inf.wrb;

public class DTOFunctionMax implements Function {

	@Override
	public double eval(double... args) {
		double result = .0;

		if (args.length > 0) {
			result = args[0];
			for (double arg : args) {
				result = Math.max(result, arg);
			}
		}
		return result;
	}
}
