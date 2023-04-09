package com.bloc_notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota {

	
	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;
	
	//Atributos Nota
	private Nota nota;
	
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) {
		super(texto);
		this.fechaAlarma=fechaAlarma;
		this.activado=activado;
	}
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		super(texto);
		this.fechaAlarma=fechaAlarma;
		this.minutosRepetir=minutosRepetir;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public void activar() throws NotaAlarmaExcepcion {
		this.activado=true;
			throw new NotaAlarmaExcepcion("La nota de la alarma esta activado");
	}
	
	public void desactivar() throws NotaAlarmaExcepcion, BlocExcepcion {
		this.activado=false;
			throw new NotaAlarmaExcepcion("La nota de la alarma esta desactiva");
	}
	
	public boolean isActivado() {
		this.activado = true;
		return this.activado;
	}
	
	@Override
	public String toString() {
		return String.format("Fecha alarma: %s\n"
							+ "Minutos repetidos: %s\n",		
				getClass().getSimpleName(), this.fechaAlarma, this.minutosRepetir);
	}
	
	
	
	
	
	
	
	
	
	

}
