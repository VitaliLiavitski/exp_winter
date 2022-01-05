package com.exlab.exceptions;

public class CrazyException extends Exception {
	
	private final static String MESSAGE = "Oh, my GOD!!!!";
	
	public CrazyException() {
		super(MESSAGE);
	}

}
