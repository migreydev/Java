package com.edu.equipo;

public class Alumno{
	
	private String nombre;
	private String dni;
	
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre=nombre;
		this.dni=dni;
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;
			sonIguales = this.nombre.equals(casteado.dni);
		}
		return sonIguales;	
	}
	
	@Override
	public String toString() {
	    return String.format(" Nombre: %s\n"
	                         + " DNI: %s\n",
	                         this.nombre, this.dni);
	}


}
