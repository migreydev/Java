package ampliacion_Equipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class testAmpEquipo {
	
	Equipo equipo = new Equipo("Aston Villa");
	
 	Alumno miguel = new Alumno("Miguel", "1234567", 29, 'H', "Zafra");
	Alumno ivan = new Alumno("Ivan", "12345566", 21, 'H', "Brenes");
	Alumno antonio = new Alumno("Antonio", "12344456" ,30, 'H', "Sevilla");
	Alumno ana = new Alumno("Ana Belen", "1234567", 28, 'M', "Sevilla");
	Alumno cristina = new Alumno("Cristina", "1234567", 29, 'M', "Zafra");
	Alumno marina = new Alumno("Marina", "1234567", 27, 'M', "Sevilla");

	@Test
	void testEquipoMasculinoMenorEdad() throws AlumnoException {
		    equipo.addJugador(miguel);
		    equipo.addJugador(ivan);
		    equipo.addJugador(antonio);
		    equipo.addJugador(ana);
		    
		    assertEquals(0, equipo.masculinoMenorEdad().size());

	}
	
	@Test
	void testEstaJugador() throws AlumnoException {
	    equipo.addJugador(cristina);
	    equipo.addJugador(marina);
	    equipo.addJugador(miguel);
	    
	    assertTrue(equipo.contains(miguel));
	    assertFalse(equipo.contains(ana));
	}


}
