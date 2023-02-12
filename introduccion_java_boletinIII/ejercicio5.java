package introduccion_java_boletinIII;

public class ejercicio5 {

	/*
	 * 5. Diseña una función llamada esPalindromo que reciba una cadena de caracteres y
determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
los espacios en blanco y caracteres separadores, así como tildes, etc.
Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.
	 */
	
	public static void main(String[] args) {

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
}
