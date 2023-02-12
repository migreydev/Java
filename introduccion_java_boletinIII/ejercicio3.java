package introduccion_java_boletinIII;

public class ejercicio3 {

	/*
	 * 3. Diseña un programa que cuente el número de veces que aparece una palabra en
una cadena de texto.
	 */
	
	public static void main(String[] args) {

		
		System.out.println(contarPalabra("hola buenos dias, hola, que haces", "hola"));
	}
	
	public static int contarPalabra(String cadena, String palabra) {
		int contador =0;
		int posicion =0;
		
		while (posicion!=-1) {
			posicion= cadena.indexOf(palabra,posicion);
			if (posicion !=-1) {
				contador ++;
				posicion+=palabra.length();
			}
		}
		return contador;
	}
}

