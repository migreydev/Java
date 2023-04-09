package com.alquiler;

public enum Combustible{
	
	GASOLINA(2), DIESEL(3.5);
	

	private double precio;
	
	Combustible(double precio) {
		this.precio=precio;
		
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
        this.precio = precio;
    }
	
	
	
	
	
	
	

}
