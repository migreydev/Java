package com.edu.historial;

public class HistorialException extends Exception {
	
	private String mensaje;
	
	public HistorialException(String mensaje) {
		super();
		this.mensaje=mensaje;
	}

}
