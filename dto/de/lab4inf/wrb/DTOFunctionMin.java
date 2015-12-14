package de.lab4inf.wrb;

public class DTOFunctionMin   implements Function{

	@Override
	public double eval(double... args) {
		double result = .0;

		if (args.length > 0) {
			result = args[0];
			for (double arg : args) {
				result = Math.min(result, arg);
			}
		}
		return result;
	}

}
