package com.edu.diccionario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Diccionario {

	private String palabra;
	private  Map<String, Collection<String>> diccionario;
	
	
	public Diccionario() {
		this.diccionario=new HashMap<>();
	}
	
	public void addPalabra (String palabra, String definicion) {
		
		if(!diccionario.containsKey(palabra)) {
			diccionario.put(palabra, new HashSet<>());
		}
		
		diccionario.get(palabra).add(definicion);
	}
	
	public boolean searchPalabra(String palabra) throws DiccionarioException {
		boolean mensaje = false;
		
		for(String buscarPalabra : diccionario.get(palabra)) {
			if(diccionario.containsKey(buscarPalabra)) {
				mensaje = true;
			} else {
				throw new DiccionarioException("La palabra no ha sido encontrada");
			}
		}
		
		return mensaje;
	}
	
	public boolean removePalabra(String palabra) {
		boolean mensaje = false;
		
		for(String eliminarPalabra : diccionario.remove(palabra)) {
			mensaje=true;
		}
		return mensaje;
	}
	
	public List<String> buscarPalabraComienza(String comienza){
	    List<String> palabras = new ArrayList<>();
	    for(String palabraComienza : diccionario.keySet()) {
	        if(palabraComienza.startsWith(comienza)) {
	            palabras.add(palabraComienza);
	        }
	    }
	    return palabras;
	}

	
	public String toString() {
		return String.format("Diccionario: %s\n",
							this.diccionario);
	}

}
