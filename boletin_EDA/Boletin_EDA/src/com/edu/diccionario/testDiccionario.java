package com.edu.diccionario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testDiccionario {

	Diccionario diccionarioDeBolsillo = new Diccionario();
	
	
	@Test
	void testBuscarPalabraComienza() {
	    diccionarioDeBolsillo.addPalabra("Saludo", "Hola");
	    diccionarioDeBolsillo.addPalabra("Gato", "Animal doméstico");

	    assertTrue(diccionarioDeBolsillo.buscarPalabraComienza("G").contains("Gato"));
	    assertFalse(diccionarioDeBolsillo.buscarPalabraComienza("F").contains("Saludo"));
	}



}
