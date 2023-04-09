package com.bloc_notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota {
	
	private int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	

	public Nota(String texto) {
		super();
		this.texto=texto;
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCodigo() {
		return codigo;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean mensaje = false;
	
		
		return mensaje;
	}
	
	public boolean isEmpy(){
		boolean mensaje = false;
		if(this.texto.isEmpty())
			mensaje=true;
		
		return mensaje;
	}
	
	public boolean isCreadoAnterior(Nota otraNota) {
		
		return this.fechaCreacion.isBefore(otraNota.fechaCreacion);
	}
	
	public boolean isModificadoAnterior(Nota otraNota) {

		return this.fechaUltimaModificacion.isBefore(otraNota.fechaUltimaModificacion);

	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, codigoSiguiente, fechaCreacion, fechaUltimaModificacion, texto);
	}


	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Nota) {
			Nota casteado = (Nota) obj;
			sonIguales = this.texto.equals(casteado.texto);
		}
		return sonIguales;
	}
	
	public int compareTo(Nota otraNota) {
		return this.getFechaCreacion().compareTo(otraNota.fechaCreacion);
	}
	
	
	@Override
	public String toString() {
		return String.format("Codigo: %s\n"
							+ "texto: %s\n"
							+ "Fecha creacion: %s\n"
							+ "Fecha de modificacion: %s\n",		
				getClass().getSimpleName(), this.codigo, this.texto, this.fechaCreacion, this.fechaUltimaModificacion);
	}
	
}
