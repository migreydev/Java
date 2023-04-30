package chat_instituto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Persona {
	
	public String nombre;
	public List<Mensaje>buzon = new ArrayList<>();
	
	
	
	protected abstract void enviarMensaje(Mensaje mensaje) throws ExceptionAlumno;

	
	public String getNombre() {
		return nombre;
	}
	

	public List<Mensaje> getBuzon() {
		return buzon;
	}


	public void leerMensajesOrdenados() throws Exception {
		if(this.buzon.isEmpty()) {
			throw new Exception("El buzon esta vacio");
		}else {
			Collections.sort(buzon, new Comparator<Mensaje>() {
				public int compare(Mensaje o1, Mensaje o2) {
					return o1.getRemitente().getNombre().compareTo(o2.getRemitente().getNombre());
				}
			});
		}
	}
	
	public void borrarMensaje(int numMensaje) throws Exception {
		if(this.buzon.isEmpty()) {
			throw new Exception("El buzon esta vacio");
		}else {
			this.buzon.remove(numMensaje);
		}
	}		
	
	public String buscarPalabraBuzon(String frase)  throws Exception {
		if(buzon.isEmpty()) {
			throw new Exception("El buzon esta vacio");
		}
		StringBuilder mensajesEncontrados = new StringBuilder();
	    for (Mensaje mensaje : this.buzon) {
	        if (mensaje.tieneTexto(frase)) {
	            mensajesEncontrados.append(mensaje.toString()).append("\n");
	        }
	    }
	    return mensajesEncontrados.toString();
	}
	
	

}
