package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio3 {
	
	/*
	 3. Diseña una función que, dada una cadena de entrada, comprueba si es una
contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
de puntuación y al menos un dígito.
	 */

	public static void main(String[] args) {
		
		String caracteres="h_OlA12345?";
		
		System.out.println(contrasegnaSegura(caracteres));
	}	
	
	public static Boolean contrasegnaSegura(String caracteres) {
		
		String signos= "!¡?¿-_´";
		boolean esDigito=false;
		boolean esMayuscula=false;
		boolean esMinuscula=false;
		boolean esSigno=false;
	
		if (caracteres!=null && caracteres.length()>=8) {
			
			for(int i=0; i<caracteres.length(); i++) {
				if(Character.isUpperCase(caracteres.charAt(i))) {
					esMayuscula=true;
				}else if(Character.isLowerCase(caracteres.charAt(i))) {
					esMinuscula=true;
				}else if(Character.isDigit(caracteres.charAt(i))) {
					esDigito=true;
				}
				for (int c=0; c<signos.length(); c++) {
					if (caracteres.charAt(i)==signos.charAt(c)) {
						esSigno=true;
					}
				}
			}	
		}
		return esMayuscula&& esMinuscula&& esDigito&& esSigno;
	}
}
	