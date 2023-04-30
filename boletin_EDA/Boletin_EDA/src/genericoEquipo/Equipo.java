package genericoEquipo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Equipo<T> {

	private String nombre;
	private Collection<T>equipo;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
		this.equipo= new HashSet<>();
	}
	
	public boolean addJugador(T alumno) throws AlumnoException {
        boolean mensaje = false;

        if (!this.equipo.contains(alumno)) {
            this.equipo.add((T) alumno);
            mensaje = true;
        } else {
            throw new AlumnoException("El alumno ya existe");
        }
        return mensaje;
    }
	
	
	public boolean removeJugador(T alumno) throws AlumnoException {
	    boolean mensaje = false;

	    if (this.equipo.contains(alumno)) {
	        this.equipo.remove(alumno);
	        mensaje = true;
	    } else {
	        throw new AlumnoException("El alumno no ha sido eliminado");
	    }

	    return mensaje;
	}

	
	public T searchJugador(T alumno) {
	    return this.equipo.contains(alumno) ? alumno : null;
	}
	
	
	@Override
	public String toString() {
		return String.format(" Nombre: %s\n"
							+ "Equipo: %s\n",
							this.nombre,this.equipo);
	}

	
	public Collection<T> unionJugadores(Equipo<T> otroEquipo) {
	    this.equipo.addAll(otroEquipo.equipo);
	    return equipo;
	}
	
	
	public Collection<T> intersectJugadores(Equipo<T> otroEquipo) {
		this.equipo.retainAll(otroEquipo.equipo);
		return equipo;
	}

}
