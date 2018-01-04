package com.indra.davinci.icecofsim.process;

public class InvalidPathException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPathException() {
	}

	public InvalidPathException(String message) {
		super(message);
	}

	public InvalidPathException(Throwable cause) {
		super(cause);
	}

	public InvalidPathException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPathException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
