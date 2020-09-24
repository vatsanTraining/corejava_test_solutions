package com.training.exceptionHandler;

public class VegtarianWrongEntry extends Exception {

	public VegtarianWrongEntry() {
		super();
		System.err.println("The vegetarian entry should have only yes or no");
	}
	
}
