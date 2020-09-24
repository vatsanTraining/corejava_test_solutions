package com.asessment.exceptions;

public class ItemIDException extends Exception {
	private String message;
	public ItemIDException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	

}
