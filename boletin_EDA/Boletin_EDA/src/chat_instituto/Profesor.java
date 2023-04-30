package chat_instituto;

public class Profesor extends Persona{

	
	
	public Profesor(String nombre) {
		super();
		this.nombre=nombre;
	}


	@Override
	protected void enviarMensaje(Mensaje mensaje) throws ExceptionAlumno {
		if(this.buzon.isEmpty()) {
			throw new ExceptionAlumno("El buzon esta vacio");
		}else {
			int numMensaje=1;
			for(Mensaje mensajes: buzon) {
				 numMensaje ++;
			}
		}
	}
}
