package com.alquiler;

public class Furgoneta extends Vehiculo{
	
	private Combustible combustible;
	private Gama gama;
	private double precioFurgoneta = 0.5;


	public Furgoneta(String matricula, Combustible comustible, Gama gama) throws Excepcion {
		super(matricula, comustible, gama);
		
	}

	public double getPrecioFurgoneta() {
		return precioFurgoneta;
	}
	
	
	public void setCombustible(Combustible combustible) {
	    this.combustible = combustible;
	}
	
	public void setGama(Gama gama) {
	    this.gama = gama;
	}


}
