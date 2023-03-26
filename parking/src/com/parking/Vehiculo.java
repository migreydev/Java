package com.parking;

import java.time.LocalDate;


public class Vehiculo {
	
	
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDate fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDate fechaEntrada, TipoVehiculo tipoVehiculo) {
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.combustible=combustible;
		this.fechaEntrada=fechaEntrada;
		this.tipoVehiculo=tipoVehiculo;
		
	}

	
	public Combustible getCombustible() {
		return combustible;
	}


	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	
	
	public String getMatricula() {
		return matricula;
	}


	public boolean esMatricula (String matricula) {
		boolean mensaje = false;
		int contador = 0;

		if(matricula.length()<= 8) {
			
			for(int i=0; i<matricula.length(); i++) {
				char c = matricula.charAt(i);
				if(Character.isLetter(c)) {
					contador ++;
				}
			}
			if(contador == 4) {
				mensaje = true;
			}
		}
		return mensaje;
	}
	
	public boolean equals(Object obj) {
			
			boolean sonIguales = this==obj;
			
			if(!sonIguales && obj!=null && obj instanceof Vehiculo) {
				Vehiculo casteado = (Vehiculo) obj;
				sonIguales = this.matricula.equals(casteado.matricula);
			}
			return sonIguales;
		}


	@Override
	public String toString() {
		return String.format("El vehiculo %s de la marca %s y modelo %s con matricula %s y combustible %s",
				this.getClass().getSimpleName(), this.marca, this.modelo, this.matricula, this.combustible
				);
	}


	public int compareTo(Automovil otroAutomovil) {

		return this.getMatricula().compareTo(otroAutomovil.getMatricula());
	}
}
