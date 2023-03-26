package com.parking;

import java.time.LocalDate;
import java.util.Arrays;


public class mainParking {

	public static void main(String[] args) {
		
		Vehiculo[] parking = new Vehiculo [3];
		
		Vehiculo vehiculo1 = new Automovil("Renault", "R5", "5564DFGH", Combustible.Gasolina, LocalDate.of(2019, 02, 25), TipoVehiculo.Automovil); 
		parking[0]= vehiculo1;
		Vehiculo vehiculo2 = new Automovil("Peugeot", "307", "4464ABCD", Combustible.Gasoil, LocalDate.of(2022, 04, 17), TipoVehiculo.Automovil); 
		parking[1]= vehiculo2;
		Vehiculo vehiculo3 = new Automovil("Citroen", "C4", "5566QWER", Combustible.Gasoil, LocalDate.of(2021, 04, 17), TipoVehiculo.Automovil); 
		parking[2]= vehiculo3;
		
		
		Arrays.sort(parking);
		System.out.println(parking);
		
		System.out.println("Ordenados por fecha de entrada");
		Arrays.sort(parking, new FechaDeEntradaComparator());
		System.out.println(Arrays.toString(parking));
		
		
		System.out.println("Ordenados por marca y modelo");
		Arrays.sort(parking, new CompararMarcaModelo());
		System.out.println(Arrays.toString(parking));
		
		
		System.out.println("Ordenados por tipo y combustible");
		Arrays.sort(parking, new CompararTipoCombustible());
		System.out.println(Arrays.toString(parking));
		
		System.out.println("Ordenados por matricula");
		Arrays.sort(parking, new CompararMatricula());
		System.out.println(Arrays.toString(parking));

	}

}

