package de.lab4inf.wrb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleMathTest {

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

	//simple addition
	@Test
	public final void testAdd() throws Exception {
		String task = "1 + 2";
		double actual = script.parse(task);
		double expected = 3.0;
		assertEquals(expected, actual, eps);
	}
	
	//simple multiplication
	@Test
	public final void testMult() throws Exception {
		String task = "2 * 3";
		double actual = script.parse(task);
		double expected = 6.0;
		assertEquals(expected, actual, eps);
	}

	//simple division
	@Test
	public final void testDiv() throws Exception {
		String task = "8 / 2";
		double actual = script.parse(task);
		double expected = 4.0;
		assertEquals(expected, actual, eps);
	}

	@Test
	//simple exponential
	public final void testExp() throws Exception {
		String task = "1 ^ 1";
		double actual = script.parse(task);
		double expected = 1.0;
		assertEquals(expected, actual, eps);
	}
	
	//float multiplication
	@Test
	public final void testFloatMult() throws Exception {
		String task = "2.5 * 2.5";
		double actual = script.parse(task);
		double expected = 6.25;
		assertEquals(expected, actual, eps);
	}

	//float division
	@Test
	public final void testFloatDiv() throws Exception {
		String task = "60.2 / 8.6";
		double actual = script.parse(task);
		double expected = 7.0;
		assertEquals(expected, actual, eps);	}

	//large float multiplication
	@Test
	public final void testLongFloatMult() throws Exception {
		String task = "2.9 * 5.6 * 7.8 * 10.2";
		double actual = script.parse(task);
		double expected = 1292.0544;
		assertEquals(expected, actual, eps);
	}

	//large float division
	@Test
	public final void testLongFloatDiv() throws Exception {
		String task = "768.6 / 1.2 / 8.4 / 12.5";
		double expected = 6.1;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//large number addition
	@Test
	public final void testBigPlus() throws Exception {
		String task = "29421 + 435612";
		double actual = script.parse(task);
		double expected = 465033;
		assertEquals(expected, actual, eps);
	}

	//large float addition
	@Test
	public final void testBigFloatPlus() throws Exception {
		String task = "2123.2345165 + 3004.21315135";
		double expected = 5127.44766785;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//large number subtraction
	@Test
	public final void testBigSub() throws Exception {
		String task = "321536 - 213150";
		double expected = 108386;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//large float subtraction
	@Test
	public final void testBigFloatSub() throws Exception {
		String task = "35189.486143654 - 31550.84646541498";
		double expected = 3638.63967823902;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//big number multiplication and addition
	@Test
	public final void testBigMixedPlusMul() throws Exception {
		String task = "56974 * 546 + 15487961";
		double expected = 46595765;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//big number division and subtraction
	@Test
	public final void testBigMixedSubDiv() throws Exception {
		String task = "500004 / 4 - 10000";
		double expected = 115001;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//big number multiplication addition division subtraction
	@Test
	public final void testBigMixedALL() throws Exception {
		String task = "5964 * 464 + 554981 - 58461 / 25";
		double expected = 3319938.56;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//big float multiplication addition division subtraction
	@Test
	public final void testBigFloatMixedALL() throws Exception {
		String task = "548.1487 * 56.22 + 5411.2333 - 9877.123 / 56.36";
		double expected = 36052.90262847835;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//big numbers with braces
	@Test
	public final void testBigParenMixed() throws Exception {
		String task = "200 * ((400 + 65 - 233) / 2)";
		double expected = 23200;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if ** failed
//	@Test(expected = IllegalArgumentException.class)
//	public final void testDoubleMul() throws Exception {
//		String task = "5 ** 5";
//		double expected = 25;
//		double actual = script.parse(task);
//		assertEquals(expected, actual, eps);
//	}

	//NEGATIV check if ++ failed
	@Test(expected = IllegalArgumentException.class)
	public final void testDoublePlus() throws Exception {
		String task = "5 ++ 5";
		double expected = 10;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if -- failed
	@Test
	public final void testDoubleSub() throws Exception {
		String task = "5 -- 5";
		double expected = 10;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if // failed
	@Test(expected = IllegalArgumentException.class)
	public final void testDoubleDiv() throws Exception {
		String task = "5 // 5";
		double expected = 1;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if ** under all operations failed
//	@Test(expected = IllegalArgumentException.class)
//	public final void testDoubleMulInMixed() throws Exception {
//		String task = "600 + 5 ** 5 / 5";
//		double expected = 605;
//		double actual = script.parse(task);
//		assertEquals(expected, actual, eps);
//	}

	//NEGATIV check if ++ under all operations failed
	@Test(expected = IllegalArgumentException.class)
	public final void testDoublePlusInMixed() throws Exception {
		String task = "600 ++ 5 * 5 / 5";
		double expected = 605;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//check if -- under all operations failed
	@Test
	public final void testDoubleSubInMixed() throws Exception {
		String task = "600 + 5 * 5 / 5 -- 5";
		double expected = 610;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if // under all operations failed
	@Test(expected = IllegalArgumentException.class)
	public final void testDoubleDivInMixed() throws Exception {
		String task = "600 + 5 * 5 // 5";
		double expected = 605;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	// check if more than one -- failed
	@Test
	public final void testMultipleSub() throws Exception {
		String task = "5 -- 5 -- 5 -- 5 -- 5 -- 5 -- 5 -- 5";
		double expected = 40;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if more than one ++ failed
	@Test(expected = IllegalArgumentException.class)
	public final void testMultipleplus() throws Exception {
		String task = "5 ++ 5 ++ 5 ++ 5 ++ 5 ++ 5 ++ 5 ++ 5";
		double expected = 40;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//NEGATIV check if more than one ** failed
//	@Test(expected = IllegalArgumentException.class)
//	public final void testMultipleMul() throws Exception {
//		String task = "5 ** 5 ** 5 ** 5 ** 5 ** 5 ** 5 ** 5";
//		double expected = 390625;
//		double actual = script.parse(task);
//		assertEquals(expected, actual, eps);
//	}

	//NEGATIV check if more than one // failed
	@Test(expected = IllegalArgumentException.class)
	public final void testMultipleDiv() throws Exception {
		String task = "10000000 // 10 // 10 // 10 // 10 //10 //10 // 10";
		double expected = 1;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative numbers
	@Test
	public final void testNegativValue() throws Exception {
		String task = " -2 ";
		double expected = -2;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative numbers addition
	@Test
	public final void testNegativPlus() throws Exception {
		String task = "-2 + -3";
		double expected = -5;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative numbers subtraction
	@Test
	public final void testNegativSub() throws Exception {
		String task = "-2 - -3";
		double expected = 1;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative numbers multiplication
	@Test
	public final void testNegativMul() throws Exception {
		String task = "-2 * -3";
		double expected = 6;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative numbers division
	@Test
	public final void testNegativDiv() throws Exception {
		String task = "-6 / -3";
		double expected = 2;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative and positive numbers multiplication
	@Test
	public final void testNegativMulOneNeg() throws Exception {
		String task = "2 * -3";
		double expected = -6;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative and positive numbers division
	@Test
	public final void testNegativDivOneNeg() throws Exception {
		String task = "6 / -3";
		double expected = -2;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative and positive float multiplication
	@Test
	public final void testNegativFloatMultOneNeg() throws Exception {
		String task = "2.5 * -2.5";
		double expected = -6.25;
		double actual = script.parse(task);
		assertEquals(expected, actual, eps);
	}

	//negative and positive numbers division
	@Test
	public final void testNegativFloatDivOneNeg() throws Exception {
		String task = "-60.2 / 8.6";
		double actual = script.parse(task);
		double expected = -7.0;
		assertEquals(expected, actual, eps);
	}

	//negative number multiplication in long calculation
	@Test
	public final void testNegativLongFloatMultOneNeg() throws Exception {
		String task = "2.9 * 5.6 * 7.8 * -10.2";
		double actual = script.parse(task);
		double expected = -1292.0544;
		assertEquals(expected, actual, eps);
	}

	//negative number division in long calculation
	@Test
	public final void testNegativLongFloatDivOneNeg() throws Exception {
		String task = "768.6 / -1.2 / 8.4 / 12.5";
		double actual = script.parse(task);
		double expected = -6.1;
		assertEquals(expected, actual, eps);
	}

	//big negative number addition
	@Test
	public final void testNegativBigPlus() throws Exception {
		String task = "-29421 + -435612";
		
		double actual = script.parse(task);
		double expected = -465033;
		assertEquals(expected, actual, eps);
	}

	//big negative number and float addition
	@Test
	public final void testNegativBigFloatPlus() throws Exception {
		String task = "-2123.2345165 + -3004.21315135";
		
		double actual = script.parse(task);
		double expected = -5127.44766785;
		assertEquals(expected, actual, eps);
	}

	//big negative number subtraction
	@Test
	public final void testNegativBigSub() throws Exception {
		String task = "-321536 - -213150";
		double actual = script.parse(task);
		double expected = -108386;
		assertEquals(expected, actual, eps);
	}

	//big negative float subtraction
	@Test
	public final void testNegativBigFloatSub() throws Exception {
		String task = "-35189.486143654 - -31550.84646541498";
		double actual = script.parse(task);
		double expected = -3638.63967823902;
		assertEquals(expected, actual, eps);
	}

	//big negative float multiplication
	@Test
	public final void testNegativFloatMult() throws Exception {
		String task = "-2.5 * -2.5";
		double actual = script.parse(task);
		double expected = 6.25;
		assertEquals(expected, actual, eps);
	}

	//big negative float division
	@Test
	public final void testNegativFloatDiv() throws Exception {
		String task = "-60.2 / -8.6";
		double actual = script.parse(task);
		double expected = 7.0;
		assertEquals(expected, actual, eps);
	}

	//two negative float multiplication in long calculation
	@Test
	public final void testNegativLongFloatMultTwoNeg() throws Exception {
		String task = "2.9 * 5.6 * -7.8 * -10.2";
		double actual = script.parse(task);
		double expected = 1292.0544;
		assertEquals(expected, actual, eps);
	}

	//two negative float division in long calculation
	@Test
	public final void testNegativLongFloatDivTwoNeg() throws Exception {
		String task = "768.6 / -1.2 / -8.4 / 12.5";
		double actual = script.parse(task);
		double expected = 6.1;
		assertEquals(expected, actual, eps);
	}

	//three negative float multiplication in long calculation
	@Test
	public final void testNegativLongFloatMultThreeNeg() throws Exception {
		String task = "2.9 * -5.6 * -7.8 * -10.2";
		double actual = script.parse(task);
		double expected = -1292.0544;
		assertEquals(expected, actual, eps);
	}

	//three negative float division in long calculation
	@Test
	public final void testNegativLongFloatDivThreeNeg() throws Exception {
		String task = "768.6 / -1.2 / -8.4 / -12.5";
		double actual = script.parse(task);
		double expected = -6.1;
		assertEquals(expected, actual, eps);
	}

	//negative number multiplication in long calculation
	@Test
	public final void testNegativLongFloatMult() throws Exception {
		String task = "-2.9 * -5.6 * -7.8 * -10.2";
		double actual = script.parse(task);
		double expected = 1292.0544;
		assertEquals(expected, actual, eps);
	}

	//negative number division in long calculation
	@Test
	public final void testNegativLongFloatDiv() throws Exception {
		String task = "-768.6 / -1.2 / -8.4 / -12.5";
		double actual = script.parse(task);
		double expected = 6.1;
		assertEquals(expected, actual, eps);
	}

	//negative big number addition
	@Test
	public final void testNegativBigPlusOneNeg() throws Exception {
		String task = "435612 + -29421";
		double actual = script.parse(task);
		double expected = 406191;
		assertEquals(expected, actual, eps);
	}

	//negative big float addition
	@Test
	public final void testNegativBigFloatPlusOneNeg() throws Exception {
		String task = "-2123.2345165 + 3004.21315135";
		double actual = script.parse(task);
		double expected = 880.97863485;
		assertEquals(expected, actual, eps);
	}

	//negative big number subtraction
	@Test
	public final void testNegativBigSubOneNeg() throws Exception {
		String task = "-321536 - 213150";
		double actual = script.parse(task);
		double expected = -534686;
		assertEquals(expected, actual, eps);
	}

	//negative big float subtraction
	@Test
	public final void testNegativBigFloatSubOneNeg() throws Exception {
		String task = "-35189.486143654 - 31550.84646541498";
		double actual = script.parse(task);
		double expected = -66740.33260906898;
		assertEquals(expected, actual, eps);
	}

	//negative big number multiplication and addition
	@Test
	public final void testNegativBigMixedPlusMul() throws Exception {
		String task = "-56974 * -546 + -15487961";
		double actual = script.parse(task);
		double expected = 15619843;
		assertEquals(expected, actual, eps);
	}

	//negative big number subtraction and division
	@Test
	public final void testNegativBigMixedSubDiv() throws Exception {
		String task = "-500004 / -4 - -10000";
		double actual = script.parse(task);
		double expected = 135001;
		assertEquals(expected, actual, eps);
	}

	//negative big number subtraction, addition, multiplication and division
	@Test
	public final void testNegativBigMixedALL() throws Exception {
		String task = "-5964 * -464 + -554981 - -58461 / -25";
		double actual = script.parse(task);
		double expected = 2209976.56;
		assertEquals(expected, actual, eps);
	}

	//negative big float subtraction, addition, multiplication and division
	@Test
	public final void testNegativBigFloatMixedALL() throws Exception {
		String task = "-548.1487 * -56.22 + -5411.2333 - -9877.123 / -56.36";
		double actual = script.parse(task);
		double expected = 25230.4360284784;
		assertEquals(expected, actual, eps);
	}

	//negative numbers with braces
	@Test
	public final void testNegativBigParenMixed() throws Exception {
		String task = "-200 * ((-400 + -65 - -233) / -2)";
		double actual = script.parse(task);
		double expected = -23200;
		assertEquals(expected, actual, eps);
	}

	//big float with braces addition, subtraction, multiplication and division
	@Test
	public final void testBigFloatParenMixed() throws Exception {
		String task = "200.568 * ((400.482 + 65.6348 - 233.1547) / 2.3)";
		double actual = script.parse(task);
		double expected = 20315.1054229565;
		assertEquals(expected, actual, eps);
	}

	//big float with braces addition, subtraction, multiplication and division
	@Test
	public final void testNegativBigFloatParenMixed() throws Exception {
		String task = "-200.568 * ((-400.482 + -65.6348 - -233.157) / -2.3)";
		double actual = script.parse(task);
		double expected = -20314.9048549565;
		assertEquals(expected, actual, eps);
	}
	
	
	@Test
	(expected = java.lang.AssertionError.class)
	public final void testDivideByZero() throws Exception {
		String task = "0 / 0";
		double actual = script.parse(task);
		double expected = 0.0;	/**Argument 'divisor' is 0**/
		assertEquals(expected, actual, eps);
	}
}
