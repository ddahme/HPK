package de.lab4inf.jni;

import de.lab4inf.wrb.Script;
import de.lab4inf.wrb.WRBScript;

public class ConcretePrak4Tester extends Prak4Tester {
	
	/**
	 * Get the actual implementation for the script test.
	 * 
	 * @return script implementation
	 */
	protected Script getScript() {
		return new WRBScript();
	}
}