package genericoEquipo;

import java.util.Collection;

public class MainApp {

	public static void main(String[] args) {
	    Equipo<Integer> aston = new Equipo<>("Aston Villa");
	    Equipo<Integer> arsenal = new Equipo<>("Arsenal");

	    try {
	        Alumno<Integer> rafa = new Alumno("Rafa", "2345678");
	        Alumno<Integer> luis = new Alumno("Luis", "2345678");

	        aston.addJugador(4);
	        aston.addJugador(5);

	        arsenal.addJugador(2);
	        arsenal.addJugador(3);

	        System.out.println("Alineación de Aston Villa: ");
	        System.out.println(aston.toString());

	        System.out.println("Alineación de Arsenal: ");
	        System.out.println(arsenal.toString());


	    } catch (AlumnoException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
	
