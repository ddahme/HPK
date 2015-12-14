package de.lab4inf.wrb;

import java.util.ArrayList;
import java.util.List;

public class DTOFunctionPow   implements Function{

	@Override
	public double eval(double... args) {
		double result = .0;
		ArrayList<Double> list;
		
		list = new ArrayList<Double>();
		for (double arg : args){
			list.add(arg);
		}
		result = calculateExpList(list);
		
		return result;
	}
	
	private double calculateExpList(List<Double> list) {
		int nElements;
		double base;
		double expnent;
		double value = .0;
		
		nElements=list.size();
		if (nElements == 1){
			value = list.get(0);
		}else if (nElements == 2){
			base = list.get(0);
			expnent = list.get(1);
			value = Math.pow(base, expnent);
		}else if (nElements > 2){
			base = list.get(0);
			list.remove(0);
			expnent = calculateExpList(list);
			value = Math.pow(base, expnent);
		}
		
		return value;
	}

}
