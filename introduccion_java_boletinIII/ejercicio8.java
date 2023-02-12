package introduccion_java_boletinIII;

public class ejercicio8 {

	/*
	 * 8. Diseñar una función que reciba como parámetro tres cadenas, la primera será una
frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
reemplazarla por la tercera.
	 */
	
	public static void main(String[] args) {
		
		
		System.out.println(reemplazarPalabra("Hola me llamo Manuel","Manuel","Miguel"));
	}

	public static String reemplazarPalabra(String cadena, String palabraBuscar, String palabraReemplazar) {
		StringBuilder sb = new StringBuilder();
	
		int cadenaPalabra= cadena.indexOf(palabraBuscar);

		while(cadenaPalabra != -1) {
			sb.append(cadena.substring(0,cadenaPalabra));
			sb.append(palabraReemplazar);
			cadena=cadena.substring(cadenaPalabra + palabraBuscar.length());
			cadenaPalabra= cadena.indexOf(palabraBuscar);
			}
	return sb.toString();
	}
}