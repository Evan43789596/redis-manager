package com.evan.exception;

public class MethodNotSupportException extends RuntimeException {
	
	public MethodNotSupportException(String errormsg) {
		super(errormsg);
	}
}
