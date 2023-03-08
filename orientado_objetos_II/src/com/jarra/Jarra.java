package com.jarra;

public class Jarra {

	//ATRIBUTOS
	
	private double capacidad;
	private double cantidad;
	
	//CONSTRUCTOR
	
	public Jarra(double capacidad, double cantidad) {
		this.cantidad=cantidad;
		this.capacidad=capacidad;
	}
	
	
	//METODOS
	
	public void llenarJarra() {
		this.cantidad=this.capacidad;
	}
	
	public void vaciarJarra() {
		cantidad=0;
	}
	
	public void volcarJarra(Jarra otraJarra) {
		
		//Se calcula cuánto espacio libre hay en la jarra
		double espacioDisponible = otraJarra.capacidad - otraJarra.cantidad;
		
		if(espacioDisponible >= this.cantidad) { //Si el espascio que hay es mayor o igual a la cantidad actual
			otraJarra.cantidad += this.cantidad; //Entonces se añade todo el agua a la jarra actual y la cantidad se pone a 0
		    cantidad = 0;
	    } else {
	        cantidad -= espacioDisponible; //Si no cabe todo el agua, se le resta la cantidad al espacio que queda disponible
	        otraJarra.cantidad = otraJarra.capacidad; //actualizar la cantidad de agua en la jarra destino
	    }	
	}


	@Override
	public String toString() {
		return "Jarra capacidad " + capacidad + ", cantidad " + cantidad ;
	}
	
	
	
}








