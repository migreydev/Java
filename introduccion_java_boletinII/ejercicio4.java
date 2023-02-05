package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio4 {
	
	/*
	 4. Elabora un programa que codifique una cadena, de tal modo que en el resultado se
inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
intercambiarse
	 */

	public static void main(String[] args) {
		
		String cadenaIn="Hola mundo";
		
		String cadenaOut="";
		
		
		for(int i=0; i<cadenaIn.length()-1; i+=2) {
			cadenaOut+=cadenaIn.charAt(i+1);
			cadenaOut+=cadenaIn.charAt(i);
	}
		System.out.println(cadenaOut);
	}

}
