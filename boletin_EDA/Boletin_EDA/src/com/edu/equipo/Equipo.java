package com.edu.equipo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Equipo {

	private String nombre;
	private Collection<Alumno>equipo;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
		this.equipo= new HashSet<>();
	}
	
	public boolean addJugador(Alumno alumno) throws AlumnoException {
		boolean mensaje = false;
		
		if(!this.equipo.contains(alumno)) {
			this.equipo.add(alumno);
			mensaje = true;
		}else {
			throw new AlumnoException("El alumno ya existe");
		}
		return mensaje;
	}
	
	
	public boolean removeJugador(Alumno alumno) throws AlumnoException {
	    boolean mensaje = false;

	    if (this.equipo.contains(alumno)) {
	        this.equipo.remove(alumno);
	        mensaje = true;
	    } else {
	        throw new AlumnoException("El alumno no ha sido eliminado");
	    }

	    return mensaje;
	}
	
	public boolean contains(Alumno alumno) {
	    return this.equipo.contains(alumno);
	}


	
	public Alumno searchJugador(Alumno alumno) {
	    return this.equipo.contains(alumno) ? alumno : null;
	}
	
	
	@Override
	public String toString() {
		return String.format(" Nombre: %s\n"
							+ "Equipo: %s\n",
							this.nombre,this.equipo);
	}

	
	public Collection<Alumno> unionJugadores(Equipo otroEquipo) {
	    this.equipo.addAll(otroEquipo.equipo);
	    return equipo;
	}
	
	
public Collection<Alumno> intersectJugadores(Equipo otroEquipo) {
	this.equipo.retainAll(otroEquipo.equipo);
	return equipo;
}
	
	

	

	
	

}
