package com.alquiler;

public enum Gama {
	
	ALTA(50), MEDIA(40), BAJA(30);
	
	private int precioGama;
	
	Gama(int precioGama) {
		this.precioGama=precioGama;
		
	}

	public int getPrecioGama() {
		return precioGama;
	}
	
	
	
	

}
