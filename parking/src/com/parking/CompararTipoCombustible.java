package com.parking;

import java.util.Comparator;

public class CompararTipoCombustible implements Comparator<Vehiculo> {

	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		int resultado = 0;
		
		if(vehiculo1!=null && vehiculo2!= null) {
			resultado= vehiculo1.getCombustible().compareTo(vehiculo2.getCombustible());
			if(resultado == 0) {
				resultado= vehiculo1.getTipoVehiculo().compareTo(vehiculo2.getTipoVehiculo());
			}
		}else if(vehiculo1==null ) {
			resultado = 1;
		}else if (vehiculo2==null) {
			resultado = -1;
		}
		return resultado;
	}
}
