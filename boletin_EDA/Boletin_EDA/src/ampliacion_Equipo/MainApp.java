package ampliacion_Equipo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) throws AlumnoException {
		
		try {
				Equipo aston = new Equipo ("Aston Villa");
				Alumno miguel = new Alumno("Miguel", "1234567", 29, 'H', "Zafra");
				Alumno ivan = new Alumno("Ivan", "12345566", 21, 'H', "Brenes");
				Alumno antonio = new Alumno("Antonio", "12344456" ,30, 'H', "Sevilla");
				Alumno ana = new Alumno("Ana Belen", "1234567", 28, 'M', "Sevilla");
				
				Equipo arsenal = new Equipo("Arsenal");
				Alumno cristina = new Alumno("Cristina", "1234567", 29, 'M', "Zafra");
				Alumno rafa = new Alumno("Ivan", "12345566", 27, 'H', "Zafra");
				Alumno juan = new Alumno("Antonio", "12344456", 58, 'H', "Zafra");
				Alumno luis = new Alumno("Ana Belen", "1234567", 29, 'H', "Sevilla");

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
				
				
				aston.contarCiudades(arsenal);
				aston.equipoFemenino(aston);
				aston.mayoEdad(aston);

				

				System.out.println(aston.equipoFemenino(aston));
				System.out.println(aston.mayoEdad(aston));
				System.out.println(aston.masculinoMenorEdad());

				

				

		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}	
}
	
