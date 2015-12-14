package de.lab4inf.wrb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleFunctionTest {

	final double eps = 1.E-8;
	Script script;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public final void setUp() throws Exception {
		script = getScript();
		assertNotNull("no script implementation", script);
	}

	/**
	 * Get the actual implementation for the script test.
	 * 
	 * @return script implementation
	 */
	protected Script getScript() {
		return new WRBScript();
	}
	
	@Test
	public final void testFunctionCall() throws Exception {
		String task = "f(x) = 2*x";
		script.parse(task);
		task="h(y)=f(y)/2";
		script.parse(task);
		task = "h(5)";
		double actual = script.parse(task);
		double expected = 5.0;
		assertEquals(expected, actual, eps);
	}
	
	@Test
	public void testConvolutetFunctionsPARTI() throws Exception {
		String task;
		task = "z=7;";
		double expacted = 7;
		double actual = script.parse(task);
		
		assertEquals(expacted, actual, eps);
	}
	
	@Test
	public void testConvolutetFunctionsPartTwo() throws Exception {
		String task;
		task = "h(x)=x*5;";
		script.parse(task);
		task="h(4)";
		double actual = script.parse(task);
		double expacted = 20;
		assertEquals(expacted, actual, eps);
	}
	
	@Test
	public void testConvolutetFunctionsPartThree() throws Exception {
		String task;
		task = "f(x)=x*x;";
		double expacted = 0;
		double actual = script.parse(task);
		
		assertEquals(expacted, actual, eps);
	}
	
	@Test
	public void testConvolutetFunctionsPartFour() throws Exception {
		String task;
		task = "y(z)=h(f(z));";
		double expacted = 0;
		double actual = script.parse(task);
		
		assertEquals(expacted, actual, eps);
	}
	
	@Test
	public void testFunctionsPartFive() throws Exception {
			String task;
			task = "z=7; h(x)=x*5; f(x)=x*x; y(z)=h(f(z)); q=y(z);";
			script.parse(task);
			task = "z=7;";
			script.parse(task);
			task = "h(x)=x*5;";
			script.parse(task);
			task = "f(x)=x*x;";
			script.parse(task);
			task = "y(z)=h(f(z));";
			script.parse(task);
			task = "y(7);";
			double expacted = 5*7*7;
			double actual = script.parse(task);
			assertEquals(expacted, actual, eps);
		}
	
	@Test
	public void testConvolutetFunctionsPartFive() throws Exception {
			String task;
			task = "z=7;";
			script.parse(task);
			task = "h(x)=x*5;";
			script.parse(task);
			task = "f(x)=x*x;";
			script.parse(task);
			task = "y(z)=h(f(z));";
			script.parse(task);
			task = "q=f(5);";
			double expacted = 25;
			double bla = script.getVariable("z");
			assertEquals(expacted, script.parse(task), eps);
		}

	@Test
	public void functionSin() throws Exception {
		String task;
		task = "sin(90)";
		double actual = script.parse(task);
		double expacted = Math.sin(90);
		
		assertEquals(expacted, actual, eps);
	}
}
