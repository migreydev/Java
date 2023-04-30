package chat_instituto;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class testChat {
	
	Persona miguel = new Alumno("Miguel Angel", 29);
	Mensaje mensaje = new Mensaje(miguel, "Hola, que tal?",LocalDate.now());

	
	
	@Test
	void testBuscarPalabra() throws Exception {
		miguel.enviarMensaje(mensaje);
	
		

		assertTrue(miguel.buscarPalabraBuzon("Hola").contains("Hola, que tal?"));
		assertFalse(miguel.buscarPalabraBuzon("Adios").contains("Hola, que tal?"));
		
		miguel.borrarMensaje(0);
		assertEquals(0, miguel.getBuzon().size());
	}

}
