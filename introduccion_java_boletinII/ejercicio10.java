package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio10 {

	/*
	 10. Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
devuelva el máximo común divisor según el algoritmo de Euclides.
	 */
	public static void main(String[] args) {
		int numeroA;
		int numeroB;
		
		System.out.println(gcd(67,56));
	}
	
	public static int gcd (int numeroA, int numeroB) {
		int aux;
		
		while (numeroB>0) {
			int r=numeroA%numeroB;
			numeroA=numeroB%numeroA;
			numeroB=r%numeroA;
			
		}return numeroA;	
		
	}
	}





