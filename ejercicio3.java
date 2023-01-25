package com.edu;


/* Ejercicio 3. Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
Debe devolver una de los siguientes mensajes según corresponda:
*/

public class ejercicio3 {

	public static void main(String[] args) {
		
		char caracter =' ';
		
		if (Character.isUpperCase(caracter)) {
			System.out.println(caracter+ "mayuscula");
		}else if (Character.isLowerCase(caracter)) {
			System.out.println(caracter+ "minuscula");
		}else if (Character.isDigit(caracter)) {
			System.out.println(caracter+ "digito entre 0 y 9");
		}else if (Character.isWhitespace(caracter)) {
			System.out.println(caracter + "espacio en blanco");
		}else if (caracter=='{' || caracter=='}' || caracter=='[' || caracter==']') {
			System.out.println(caracter + "Parentesis o llaves");
		}else {
			System.out.println(caracter + "otro caracter");
		}
	}
}
