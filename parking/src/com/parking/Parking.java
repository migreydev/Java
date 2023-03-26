package com.parking;

import java.time.LocalDate;
import java.util.Arrays;


public class Parking {
	

	private Vehiculo [] vehiculos;
	
	private final static int SIZE_MAX= 3;

	public Parking() {
		super();
		this.vehiculos= new Vehiculo[SIZE_MAX];
	}
	
	public boolean aparcarVehiculo (Vehiculo otroVehiculo) {
		boolean mensaje = false;
		
		for(int i=0; i<vehiculos.length; i++) {
			if(vehiculos[i]==null && !mensaje) {
				vehiculos[i] = otroVehiculo;
				mensaje = true;
			}
		}
		return mensaje;	
	}
	
	public boolean abandonarPlaza(Vehiculo otroVehiculo) {
		boolean mensaje = false;
		
		for(int i=0; i<vehiculos.length; i++) {
			if(vehiculos[i]!=null) {
				vehiculos[i]=null;
				mensaje=true;
			}
		}
		return mensaje;
	}
	
	public String mostrarVehiculoPorFechaEntrada() {
		Arrays.sort(this.vehiculos);
		
		return toString();
	}
	
	public String compararModeloMarca() {
		
		CompararMarcaModelo marcaModelo = new CompararMarcaModelo();
		
		Arrays.sort(vehiculos, marcaModelo);
		
		 StringBuilder sb = new StringBuilder();
		    for (Vehiculo v : vehiculos) {
		        sb.append(v.toString()).append("");
		    }
		    return sb.toString();
		}
	
	public String compararTipoCombustible()  {
		
		CompararTipoCombustible tipoCombustible = new CompararTipoCombustible();
		
		Arrays.sort(vehiculos, tipoCombustible);
		
		StringBuilder sb = new StringBuilder();
		 for (Vehiculo v : vehiculos) {
		        sb.append(v.toString()).append("");
		    }
		    return sb.toString();
	}
	
	
	public String compararMatricula() {
		
		CompararMatricula matricula = new CompararMatricula();
		
		Arrays.sort(vehiculos, matricula);
		
		 StringBuilder sb = new StringBuilder();
		 for (Vehiculo v : vehiculos) {
		        sb.append(v.toString()).append("");
		    }
		    return sb.toString();
	}
	
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 for (Vehiculo v : vehiculos) {
		        sb.append(v.toString()).append("");
		    }
		    return sb.toString();
	}
	
	
	
		



}
