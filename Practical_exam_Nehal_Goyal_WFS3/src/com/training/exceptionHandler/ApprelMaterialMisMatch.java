package com.training.exceptionHandler;

public class ApprelMaterialMisMatch extends Exception {

	public ApprelMaterialMisMatch() {
		super();
		System.err.println("The Apparel material should be woolen or cotton only");
	}

	
}
