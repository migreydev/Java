package chat_instituto;

import java.util.List;

public class Alumno extends Persona{
	
	
	private int edad;

	public Alumno (String nombre, int edad) {
		super();
		this.nombre=nombre;
		this.edad=edad;
	}

	@Override
	protected void enviarMensaje(Mensaje mensaje) throws ExceptionAlumno {
		if(this.edad < 18) {
			throw new ExceptionAlumno ("No puedes enviar un mensaje ya que eres un alumno");
		}else {
			this.buzon.add(mensaje);
		}
	}

	
	
	
	
	
}
