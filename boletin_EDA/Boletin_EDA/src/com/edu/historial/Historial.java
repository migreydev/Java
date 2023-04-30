package com.edu.historial;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Historial {

	private LocalDateTime fecha;
	private Collection<PaginaWeb>historial;
	private PaginaWeb url;
	
	public Historial(PaginaWeb url, LocalDateTime fecha) {
		super();
		this.url=url;
		this.fecha=LocalDateTime.now();
		this.historial= new HashSet<>();
	}
	
	
	public PaginaWeb getUrl() {
		return url;
	}
	
	

	public Collection<PaginaWeb> getHistorial() {
		return historial;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public boolean addPaginaWeb(PaginaWeb paginaWeb) throws HistorialException {
		boolean mensaje = false;
		
		if(this.historial.add(paginaWeb)) {
			mensaje=true;
		}else {
			throw new HistorialException("Error, la pagina web no pudo agregarse correctamente");
		}
		return mensaje;
	}
	
	public boolean removeHistorial(PaginaWeb paginaWeb)  throws HistorialException {
		boolean mensaje = false;
		
		if(this.historial.contains(paginaWeb)) {
			this.historial.remove(paginaWeb);
			mensaje = true;
		}else {
			throw new HistorialException("Error, el historial no pudo eliminarse correctamente");
		}
		return mensaje;
	}
	
	public boolean removeAllHistorial()  throws HistorialException {
		boolean mensaje = false;
		
		if (!historial.isEmpty()) {
	        historial.clear();
			mensaje=true;
		}else {
			throw new HistorialException("Error, el historial está vacio por completo");
		}
		return mensaje;
	}
	
	public boolean removeVisitaPagina(String url) {
		boolean mensaje = false;
		Iterator <PaginaWeb> iter = historial.iterator();
		
		while(iter.hasNext()) {
			PaginaWeb visita = iter.next();
			if(visita.getUrl().equals(url)) {
				iter.remove();
				mensaje = true;
			}
		}
		return mensaje;
	}
	
	public void mostrarHistorialCompleto() {
		for(PaginaWeb n : historial) {
		}
	}
	
	public void borrarHistorial() {
	    this.historial.clear();
	}

	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Historial) {
			Historial casteado = (Historial) obj;
			sonIguales = this.historial.equals(casteado.fecha);
		}
		return sonIguales;	
	}
	
	@Override
	public String toString() {
		return String.format(" Registro del historial: %s\n"
							+ "Fecha de registro: %s\n",
				this.historial,this.fecha);
	}

}
