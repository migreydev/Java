package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio2 {
	
	/*
	 2. Realiza un programa que pida un número por teclado y que después muestre ese
número al revés.
	 */

	public static void main(String[] args) {
		

		int numero;
		String cadena="";

		
		System.out.println("Introduce un número ");
		Scanner sc = new Scanner (System.in);
		numero = Integer.valueOf(sc.nextLine());
		
		String numeroCadena= String.valueOf(numero);
		
		for(int i = numeroCadena.length()-1; i>=0; i--) {
			cadena+=numeroCadena.charAt(i);
		}
		System.out.println(cadena);
	}

}
