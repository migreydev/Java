package com.edu;

import java.util.Scanner;

public class ejercicio15 {

	/*
	 15. Crea un programa que permita sumar N números. El usuario decide cuándo termina
de introducir números al indicar la palabra ‘fin’.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int suma=0;

			while (!cadena.equals("fin")) {
				
			System.out.println("Introduce un numero: ");
			cadena = sc.nextLine();
			
				if (!cadena.equals("fin")) {
					suma += Integer.valueOf(cadena);
				}
		}
		System.out.println(suma);
	}
}
