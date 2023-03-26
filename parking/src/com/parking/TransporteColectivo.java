package com.parking;

import java.time.LocalDate;

public class TransporteColectivo extends Vehiculo {

	public TransporteColectivo(String marca, String modelo, String matricula, Combustible combustible, LocalDate fechaEntrada, TipoVehiculo tipoVehiculo) {
		 super(marca, modelo, matricula, combustible, fechaEntrada, tipoVehiculo);
		
	}
	
	public boolean permiteTransporteMercancias() {
		return false;
	}

	public boolean permiteTransporteColectivoPersona() {
		return true;
	}
}
