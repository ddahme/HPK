package de.lab4inf.jni;

import de.lab4inf.wrb.Function;

public class Differentiator {

	static {
		String path = System.getProperty("user.dir") + "/ExternalLibs/libPrak4_jni_c.so";
		System.load(path);
	}
	
	public native double differentiate(final Function function, final double x);
}
