package genericos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGenericos {

	@Test
	void testReverse() {
		String[] nombres = {"Miguel", "Ana", "Juan"};
		String[] nombreInverso = MainApp.reverse(nombres);
		
		assertNotEquals(nombres, nombreInverso);

	}

}
