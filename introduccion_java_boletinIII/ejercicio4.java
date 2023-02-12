package introduccion_java_boletinIII;

public class ejercicio4 {

	/*
	 * 4. Crea tres funciones cuyo comportamiento sea como el de los métodos de String
startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos.
	 */
	
	public static void main(String[] args) {
		
		System.out.println(startsWirth("miguel","mi"));
		System.out.println(contains("miguel","gu"));
		System.out.println(contains("miguel","el"));
	}

	public static boolean startsWirth(String cadena,String letras) {
		
		boolean mensaje = true;
		for (int i = 0; i<letras.length(); i++) {
			if(cadena.charAt(i) != letras.charAt(i)) {
				mensaje = false;
			}
		}
		return mensaje;
	}
	
	public static boolean contains(String cadena,String subcadena) {
		
		boolean mensaje = false;
		for (int i =0; i<cadena.length()-subcadena.length() +1; i++) {
			if(cadena.substring(i, i+subcadena.length()).equals(subcadena)) {
			mensaje = true;
			}
		}
		return mensaje;
	}
	
	public static boolean endsWith(String cadena, String subcadena) {
		boolean mensaje = false;
		for (int i =0; i<cadena.length()-subcadena.length() +1; i++) {
			if(cadena.substring(i, i+subcadena.length()).equals(subcadena)) {
			mensaje = true;
			}
		}
		return mensaje;
	}
}

