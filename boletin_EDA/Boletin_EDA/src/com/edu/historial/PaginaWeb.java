package com.edu.historial;

import java.time.LocalDateTime;


public class PaginaWeb {
	
	private String url;
	private LocalDateTime fecha;

	public PaginaWeb(String url, LocalDateTime fecha) {
		super();
		this.url=url;
		this.fecha=LocalDateTime.now();
	}
	
	
	public String getUrl() {
		return url;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof PaginaWeb) {
			PaginaWeb casteado = (PaginaWeb) obj;
			sonIguales = this.url.equals(casteado.fecha);
		}
		return sonIguales;	
	}
	
	
	@Override
	public String toString() {
		return String.format(" Nombre de la página web: %s\n"
							+ "Fecha de registro: %s\n",
				this.url,this.fecha);
	}

}
