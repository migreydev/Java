package com.mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		
				List<Persona>personas = new ArrayList<>();
				personas.add(new Persona("Miguel Angel","Reyes", Genero.MASCULINO));
				personas.add(new Persona("Ana Belen","Pavon", Genero.FEMENINO));
				personas.add(new Persona("Juan","Reyes", Genero.MASCULINO));
				personas.add(new Persona("Cristina","Reyes", Genero.FEMENINO));
				
				
				Mapeando mapeo = new Mapeando();
		
				Map<Genero, List<Persona>> mapearPersonasPorGenero = mapeo.mapearPersonasPorGenero(personas);
				System.out.println(mapearPersonasPorGenero);
				
				
				Collection<Integer> numerosAleatorios = mapeo.generarNumerosAleatorios(10);
				Map<Integer, Integer> tablaFrecuencias = mapeo.contarNumeros(numerosAleatorios);
				System.out.println(numerosAleatorios);
				System.out.println(tablaFrecuencias);
				
		
	}

}
