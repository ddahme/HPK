package de.lab4inf.wrb;

public class ScriptTest extends AbstractScriptTest {
	
	/**
	 * Get the actual implementation for the script test.
	 * 
	 * @return script implementation
	 */
	protected Script getScript() {
		return new WRBScript();
	}
}