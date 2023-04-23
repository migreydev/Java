package com.mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Mapeando {

	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map<Genero, List<Persona>> mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, List<Persona>> mapa = new HashMap<>();
		for(Persona p : personas) {
			Genero genero = p.getGenero();
			List<Persona> lista = mapa.get(genero);
			if(lista==null) {
				mapa.put(genero, lista);
			}
			lista.add(p);
		}
		
		return mapa;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
		Map<Integer, Integer> contarNumeros(Collection<Integer>numeros){
		Map<Integer, Integer> mapaFrecuencias = new HashMap<>();
	    
	    for (int numero : numeros) {
	        int frecuenciaActual = mapaFrecuencias.getOrDefault(numero, 0);
	        mapaFrecuencias.put(numero, frecuenciaActual + 1);
	    }
	    
	    return mapaFrecuencias;
	}

	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}
