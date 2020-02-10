package com.tyss.springboot.exception;

public class EmailAlreadyExistExeception extends RuntimeException{
	public EmailAlreadyExistExeception(String msg) {
		super(msg);
	}

}
