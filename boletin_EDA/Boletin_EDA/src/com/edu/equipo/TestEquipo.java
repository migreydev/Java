package com.edu.equipo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mapas.Genero;

class TestEquipo {
	Alumno miguel = new Alumno("Miguel", "1234567");
	Alumno ivan = new Alumno("Ivan", "12345566");
	Alumno antonio = new Alumno("Antonio", "12344456");
	Alumno ana = new Alumno("Ana Belen", "1234567");
	
	Equipo aston = new Equipo ("Aston Villa");
	Equipo arsenal = new Equipo("Arsenal");
	
	Alumno cristina = new Alumno("Miguel", "1234567");
	Alumno rafa = new Alumno("Ivan", "12345566");
	Alumno juan = new Alumno("Antonio", "12344456");
	Alumno luis = new Alumno("Ana Belen", "1234567");
	
	@Test
	void testUnionJugadores() throws AlumnoException {
		
		aston.addJugador(miguel);
		aston.addJugador(ivan);
		aston.addJugador(antonio);
		aston.addJugador(ana);
		
		
		arsenal.addJugador(luis);
		arsenal.addJugador(cristina);
		arsenal.addJugador(juan);
		arsenal.addJugador(rafa);
		
		assertNotEquals(aston,arsenal);
		
	}
	
	@Test
	void testEquipo() throws AlumnoException{
		Equipo equipo1 = new Equipo("Equipo 1");
		Equipo equipo2 = new Equipo("Equipo 2");
		
		equipo1.addJugador(miguel);
		equipo2.addJugador(ivan);
		
		assertEquals(miguel,equipo1.searchJugador(miguel));
		assertNotEquals(ivan,equipo1.searchJugador(ivan));
		
	
		equipo2.removeJugador(ivan);
		assertFalse(equipo2.contains(ivan));
		
	}
	
	

}
