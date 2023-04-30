package chat_instituto;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		Persona miguel = new Alumno("Miguel Angel", 29);
		Persona raul = new Alumno("Raul Reyes", 15);
		
		Persona jose = new Profesor ("Jose");
		
		Mensaje mensaje = new Mensaje(miguel, "Hola, que tal?",LocalDate.now());
		Mensaje mensaje1 = new Mensaje(raul, "Hola, que tal?",LocalDate.now());
		
		try {
			 miguel.enviarMensaje(mensaje);
			 System.out.println("Mensaje enviado correctamente");
		} catch (ExceptionAlumno e) {
			 System.out.println("Error al enviar mensaje: ");
		}
		
		  try {
	            String mensajes = miguel.buscarPalabraBuzon("Hola");
	            System.out.println("Mensaje encontrado");
	        } catch (ExceptionAlumno e) {
	            System.out.println("Error al buscar mensaje");
	       }
		  
		  try {
				 raul.enviarMensaje(mensaje1);
				 System.out.println("Mensaje enviado correctamente");
			} catch (ExceptionAlumno e) {
				 System.out.println("Error al enviar mensaje: ");
			}
		  
		
		
	}

}
