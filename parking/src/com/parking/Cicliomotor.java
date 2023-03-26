package com.parking;

import java.time.LocalDate;

public class Cicliomotor extends Vehiculo  {
	
	public Cicliomotor(String marca, String modelo, String matricula, Combustible combustible, LocalDate fechaEntrada, TipoVehiculo tipoVehiculo) {
		 super(marca, modelo, matricula, combustible, fechaEntrada, tipoVehiculo);
		
	}

}
