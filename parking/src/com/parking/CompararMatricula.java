package com.parking;

import java.util.Comparator;

public class CompararMatricula implements Comparator<Vehiculo> {


	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		int resultado = 0;
		
		if(vehiculo1!=null && vehiculo2!= null) {
			if(resultado == 0) {
				resultado= vehiculo1.getMatricula().compareTo(vehiculo2.getMatricula());
			}
		}else if(vehiculo1==null ) {
			resultado = 1;
		}else if (vehiculo2==null) {
			resultado = -1;
		}
		return resultado;
	}
}
