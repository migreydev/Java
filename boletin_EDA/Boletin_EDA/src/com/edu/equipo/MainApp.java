package com.edu.equipo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) throws AlumnoException {
		
		try {
				Alumno miguel = new Alumno("Miguel", "1234567");
				Alumno ivan = new Alumno("Ivan", "12345566");
				Alumno antonio = new Alumno("Antonio", "12344456");
				Alumno ana = new Alumno("Ana Belen", "1234567");
				
				Alumno cristina = new Alumno("Miguel", "1234567");
				Alumno rafa = new Alumno("Ivan", "12345566");
				Alumno juan = new Alumno("Antonio", "12344456");
				Alumno luis = new Alumno("Ana Belen", "1234567");
				
				Equipo aston = new Equipo ("Aston Villa");
				Equipo arsenal = new Equipo("Arsenal");
				
				//Añadir jugadores
				aston.addJugador(miguel);
				aston.addJugador(ivan);
				aston.addJugador(antonio);
				aston.addJugador(ana);
				
				//Añadir jugadores
				arsenal.addJugador(luis);
				arsenal.addJugador(cristina);
				arsenal.addJugador(juan);
				arsenal.addJugador(rafa);
				
				//Eliminar un jugador del equipo
				arsenal.removeJugador(rafa);
				
				
				aston.searchJugador(miguel);
				
				Collection<Alumno> union = aston.unionJugadores(arsenal);
				System.out.println("Unión de jugadores: " + union);
				
				Collection<Alumno> repetidos = aston.intersectJugadores(arsenal);
				System.out.println("Unión de jugadores repetidos: " + repetidos);
				

				System.out.println(aston);
				System.out.println(arsenal);
				System.out.println(miguel.toString()); 
				

		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}	
}
	
