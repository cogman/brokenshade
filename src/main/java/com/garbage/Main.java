package com.garbage;

import groovy.lang.GroovyShell;

public class Main {
	public static void main(String[] args) {
		GroovyShell shell = new GroovyShell();
		final Object val = shell.evaluate("new Date().parse(\"MM/dd/yyyy\", \"01/01/2016\")");
		System.out.println(val);
	}
}
