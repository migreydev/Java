package introduccion_java_boletinIII;

public class ejercicio9 {

	/*
	 * 9. Escribir una función que devuelva el número de palabras, frases y párrafos que
existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
dos palabras puede haber más de un blanco, las frases se separan por puntos y los
párrafos por saltos de línea.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(contarElementos("hola, me llamo miguel angel."));
	}
	
	public static String contarElementos (String cadena) {
		int contarPalabras=0;
		int contarFrases=0;
		int contarParrafos=0;
		String resultado="";
		
		for(int i =0; i<cadena.length(); i++) {
			if(Character.isWhitespace(cadena.charAt(i))) {
				contarPalabras++;
			}if(cadena.charAt(i)=='.') {
				contarFrases++;
			}if (cadena.charAt(i)=='\n') {
				contarParrafos++;
			}
		} 
		resultado="El número de palabras es " + contarPalabras + ", el número de frases es de " + contarFrases + " y por último, el número de parrafos es de " + contarParrafos;
		
		return resultado; 
	}	
}
