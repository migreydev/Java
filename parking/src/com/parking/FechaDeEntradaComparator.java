package com.parking;

import java.util.Comparator;

public class FechaDeEntradaComparator implements Comparator<Vehiculo> {
	
    @Override
    public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        return vehiculo1.getFechaEntrada().compareTo(vehiculo2.getFechaEntrada());
    }
}
