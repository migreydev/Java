package ampliacion_Equipo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

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
	
	
	public Set<Alumno> masculinoMenorEdad() {
	    Set<Alumno> jugadoresMasculinoMenor = new HashSet<>();
	    for (Alumno a : equipo) {
	        if (a.getEdad() < 18 && a.getSexo() == 'H') {
	            jugadoresMasculinoMenor.add(a);
	        }
	    }
	    return jugadoresMasculinoMenor;
	}

	
	public List<Alumno> equipoFemenino(Equipo otroEquipo) {
	    List<Alumno> femenino = new ArrayList<>();
	    for (Alumno a : equipo) {
	        if (a.getSexo() == 'M') {
	            femenino.add(a);
	        }
	    }
	    return femenino;
	}

	
	public int mayorFemenino (Equipo otroEquipo) {
		int contador = 0;
		Set<Alumno> edadMayorFemenino = new HashSet<>();
		
		for (Alumno a : equipo) {
			if(a.getEdad() >=18 && a.getSexo() == 'M') {
				edadMayorFemenino.add(a);
				contador ++;
			}
		}
		return contador;
	}
	
	public Set<Alumno> dniJugadores(Equipo otroEquipo) {
		
		Set<Alumno> dniMasculino = new HashSet<>();
		
		for(Alumno a : equipo) {
			if(a.getSexo() == 'H' && a.getEdad() >= 18) {
				dniMasculino.add(a);
			}
		}
		return dniMasculino;
	}
	
	public List<Alumno> jugadorasOrdenadas (Equipo otroEquipo) {
		
		List<Alumno> jugadorasAscendente = new ArrayList<>();
		
		for (Alumno a: equipo) {
			if(a.getSexo() == 'M') {
				jugadorasAscendente.add(a);
			}
			
		}
		return jugadorasAscendente;
	}
	
	public boolean mayoEdad (Equipo otroEquipo) {
		boolean mensaje = false;
		
		for (Alumno a: equipo) {
			if(a.getEdad() >= 18) {
				mensaje = true;
			}
		}
		return mensaje;
	}
	
	public int contarCiudades (Equipo otroEquipo) {
		
		int contador = 0;
		
		Set<Alumno> ciudades = new HashSet <>();
		
		for(Alumno a: equipo) {
			a.getCiudad();
			ciudades.add(a);
			contador ++;
		}
		return contador;
	}

	public boolean contains(Alumno alumno) {
	    return equipo.contains(alumno);
	}

	
	
	
	
	

	

	
	

}
