package chat_instituto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mensaje {
	
	public Persona remitente;
	private String texto;
	private LocalDate fechaHora;
	private int numMensaje=0;

	
	public Mensaje(Persona remitente, String texto, LocalDate fechaHora) {
		super();
		this.remitente=remitente;
		this.texto=texto;
		this.fechaHora=LocalDate.now();
	}

	
	public Persona getRemitente() {
		return remitente;
	}


	public boolean tieneTexto(String texto) {
		return texto != null && !texto.isEmpty() && this.texto.contains(texto);
	}

	public String toString() {
		return String.format(" Mensaje: %s\n"
                + " De: %s\n"
                + " Texto: %s\n"
                + " Fecha y hota: %s\n",
                this.numMensaje, this.remitente, this.texto, this.fechaHora);
	}
}

	
