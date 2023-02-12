package introduccion_java_boletinIII;

public class ejercicio6 {

	/*
	 * 6. Haciendo uso de la función anterior crea una función esCapicúa que acepte
números tanto enteros como decimales.
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(esCapicua(1821));
		System.out.println(esCapicua(12.21));
		
		
		String cadena="Sometamos o matemos";
		StringBuilder cadenaInvertida = new StringBuilder();
		System.out.println(esPalindromo(cadena,cadenaInvertida));
	}

	public static boolean esPalindromo(String cadena, StringBuilder cadenaInvertida) { 
		
		String cadenaSinEspacios=cadena.replace(" ","");
		
		for (int i=cadenaSinEspacios.length()-1; i>=0; i--) {
			cadenaInvertida.append(cadenaSinEspacios.charAt(i));
			}
		return cadenaInvertida.toString().equalsIgnoreCase(cadenaSinEspacios);
	}


	public static boolean esCapicua(int numero) {
		return esPalindromo(String.valueOf(numero), new StringBuilder());
	}
	
	public static boolean esCapicua(double numero) {
		return esPalindromo(String.valueOf(numero), new StringBuilder());
	}
}
