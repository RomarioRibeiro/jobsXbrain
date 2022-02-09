package com.jobs.exception;

public class ObjException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public ObjException (String msg) {
		super(msg);
	}
	
	public ObjException (String msg, Throwable cause) {
		super(msg, cause);
	}
}
