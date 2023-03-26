package com.parking;

import java.time.LocalDate;

public class TransporteMercancias extends Vehiculo{
	
	public TransporteMercancias(String marca, String modelo, String matricula, Combustible combustible, LocalDate fechaEntrada, TipoVehiculo tipoVehiculo) {
		 super(marca, modelo, matricula, combustible, fechaEntrada, tipoVehiculo);
		
	}
	
	public boolean permiteTransporteMercancias() {
		return true;
	}

	public boolean permiteTransporteColectivoPersona() {
		return false;
	}
	
	
}
