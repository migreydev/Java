package com.edu.diccionario;

public class DiccionarioException extends Exception {

	private String message;
	
	public DiccionarioException() {
		
	}

	public DiccionarioException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DiccionarioException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DiccionarioException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DiccionarioException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
