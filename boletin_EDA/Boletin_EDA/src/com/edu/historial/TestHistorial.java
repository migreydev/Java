package com.edu.historial;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestHistorial {

	PaginaWeb paginaWeb = new PaginaWeb("www.google.com", LocalDateTime.now());
	Historial historial = new Historial(paginaWeb, LocalDateTime.now());
	
	@Test
	void testAgregarPaginaWeb() throws HistorialException {

		historial.addPaginaWeb(paginaWeb);
		assertEquals(1, historial.getHistorial().size());
	}
	
	@Test
	void testPaginaWeb() throws HistorialException {
		
		historial.addPaginaWeb(paginaWeb);
		assertTrue(historial.getHistorial().contains(paginaWeb));
	}
	
}
