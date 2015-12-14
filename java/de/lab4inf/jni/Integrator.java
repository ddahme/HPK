package de.lab4inf.jni;

import de.lab4inf.wrb.Function;

public class Integrator {

	static {
		String path = System.getProperty("user.dir") + "/ExternalLibs/libPrak4_jni_c.so";
		System.load(path);
	}
	
	public native double integrate(final Function function, final double a, final double b);
}
