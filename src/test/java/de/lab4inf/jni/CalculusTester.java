package de.lab4inf.jni;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import de.lab4inf.wrb.Function;
import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class CalculusTester {
	final double eps = 1.E-5;
	Script script;
	Differentiator differentiator;
	Integrator integrator;
	
	@Before
	public final void setUp() throws Exception {
		script = getScript();
		differentiator = new Differentiator();
		integrator = new Integrator();
		assertNotNull("no script implementation", script);
	}

	protected Script getScript() {
		return new WRBScript();
	}

	@Test
	public void testDifferentiateSquare() throws Exception {
		int index = 0;
		String task = "f(x)=x^2";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 0, 0.5, 1, 1.5, 2 };
		
		for(double x = 0; x <= 1; x += 0.25) 
		{
			assertEquals(expected[index++], differentiator.differentiate(fct, x), eps);
		}
	}
	
	@Test
	public void testIntegrateSquare() throws Exception {
		int index = 0;
		String task = "f(x)=x^2";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 0, 0.00520833, 0.0416667, 0.140625, 0.3333333333 };
		
		for(double x = 0; x <= 1; x += 0.25) 
		{
			assertEquals(expected[index++], integrator.integrate(fct, 0, x), eps);
		}		
	}
	
	@Test
	public void testDifferentiateExp() throws Exception {
		int index = 0;
		String task = "f(x)=exp(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 1, 1.28403, 1.64872, 2.117, 2.71828 };
		
		for(double x = 0; x <= 1; x += 0.25) 
		{
			assertEquals(expected[index++], differentiator.differentiate(fct, x), eps);
		}
	}
	
	@Test
	public void testIntegrateExp() throws Exception {
		int index = 0;
		String task = "f(x)=exp(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 0, 0.284025, 0.648721, 1.117, (Math.E - 1) };
		
		for(double x = 0; x <= 1; x += 0.25) 
		{
			assertEquals(expected[index++], integrator.integrate(fct, 0, x), eps);
		}
	}	
	
	@Test
	public void testDifferentiateSin() throws Exception {
		int index = 0;
		String task = "f(x)=sin(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 1, 0.866025, 0.5, 0, -0.5, -0.866025, -1 };
		
		for(double x = 0; x <= Math.PI; x += (Math.PI / 6)) 
		{
			assertEquals(expected[index++], differentiator.differentiate(fct, x), eps);
		}
	}
	
	@Test
	public void testIntegrateWithBoundsReversed() throws Exception {
		String task = "f(x) = sin(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		double a = Math.PI/2;
		double b = 0;
		
		assertEquals(integrator.integrate(fct, a, b), -1 * integrator.integrate(fct, b, a), eps);
	}
	
	@Test
	public void testIntegrateSin() throws Exception {
		int index = 0;
		String task = "f(x)=sin(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		
		// calculated by wolfram alpha
		double[] expected = { 0, (1 - Math.sqrt(3)/2), 0.5, 1, 1.5, ((2 + Math.sqrt(3))/2), 2 };
		
		for(double x = 0; x <= Math.PI; x += (Math.PI / 6)) 
		{
			double actual = integrator.integrate(fct, 0, x);
			assertEquals(expected[index++], actual, eps);
		}
	}
	
	@Test
	public void testDifferentiateComplex1() throws Exception {
		String task = "f(x) = 37*x^2 + 5*x^7 + sin(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		double x = 2;
		
		// calculated by wolfram alpha
		double expected = 2388 + Math.cos(2);
		
		double actual = differentiator.differentiate(fct, x);
		
		assertEquals(expected, actual, eps);
	}
	
	@Test
	public void testIntegrateComplex1() throws Exception {
		String task = "f(x) = 37*x^2 + 5*x^7 + sin(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		double a = 1;
		double b = 2.5;
		
		// calculated by wolfram alpha
		double expected = 1134.77;
		
		double actual = Math.round(integrator.integrate(fct, a, b) * 100.0) / 100.0;
		
		assertEquals(expected, actual, eps);
	}	
	
	@Test(expected=Exception.class)
	public void testIntegrateDiscontinousFunc() throws Exception {
		String task = "f(x) = tan(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		double x = Math.PI;
		
		// exception expected, because tanx integrated from 0 to PI doesn't converge
		double expected = 666;
		
		assertEquals(expected, integrator.integrate(fct, 0, x), eps);
	}
	
	@Test(expected=Exception.class)
	public void testDifferentiateDiscontinousFunc() throws Exception {
		String task = "f(x) = tan(x)";
		script.parse(task);
		Function fct = script.getFunction("f");
		double x = Math.PI / 2;
		
		// exception expected, tanx is divergent at PI/2
		double expected = 666;
		
		assertEquals(expected, differentiator.differentiate(fct, x), eps);
	}
}
