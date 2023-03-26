package com.parking;

import java.time.LocalDate;

public class Automovil extends Vehiculo implements Comparable<Vehiculo> {

    public Automovil(String marca, String modelo, String matricula, Combustible combustible, LocalDate fechaEntrada, TipoVehiculo tipoVehiculo) {
    	super(marca, modelo, matricula, combustible, fechaEntrada, tipoVehiculo);
    }
	

	@Override
	public int compareTo(Automovil otroAutomovil) {
		
		return this.getMatricula().compareTo(otroAutomovil.getMatricula());
	}


	@Override
	public int compareTo(Vehiculo otroVehiculo) {
		return this.getMatricula().compareTo(otroVehiculo.getMatricula());
	}

	
}
