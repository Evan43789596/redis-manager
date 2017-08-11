package com.evan.exception;

public class RedisConnectionException extends RuntimeException {

	public RedisConnectionException(String errormsg) {
		super(errormsg);
	}

}
