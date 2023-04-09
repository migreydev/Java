package com.alquiler;

public class Microbus extends Vehiculo {
	
	private Combustible combustible;
	private Gama gama;
	private double precioBus = 5.0;


	public Microbus(String matricula, Combustible comustible, Gama gama) throws Excepcion {
		super(matricula, comustible, gama);
	}


	public double getPrecioBus() {
		return precioBus;
	}
	
	public void setCombustible(Combustible combustible) {
	    this.combustible = combustible;
	}

	public void setGama(Gama gama) {
	    this.gama = gama;
	}

	
	
	

}
