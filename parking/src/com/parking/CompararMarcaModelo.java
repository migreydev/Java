package com.parking;

import java.util.Comparator;

public class CompararMarcaModelo implements Comparator<Vehiculo> {

	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		int resultado = 0;
		
		if(vehiculo1!=null && vehiculo2!=null ) {
			resultado = vehiculo1.getMarca().compareTo(vehiculo2.getMarca());
			if(resultado == 0) {
				resultado = vehiculo1.getModelo().compareTo(vehiculo2.getModelo());
			}
		}else if (vehiculo1==null) {
			resultado = 1;
		}else if (vehiculo2==null) {
			resultado = -1;
		}
		return resultado;
	}
}

