package com.alquiler;

public class Coche extends Vehiculo{
	
	private Combustible combustible;
	private Gama gama;
	private double precioCoche = 3.5;

	
	public Coche(String matricula, Combustible combustible, Gama gama) throws Excepcion {
		super(matricula, combustible, gama);
	
	}


	public double getPrecioCoche() {
		return precioCoche;
	}
	
	
	public void setCombustible(Combustible combustible) {
	    this.combustible = combustible;
	}
	
	public void setGama(Gama gama) {
	    this.gama = gama;
	}

	
	
	

}
