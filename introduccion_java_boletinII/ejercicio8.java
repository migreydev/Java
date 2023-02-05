package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio8 {

/*
 8. Realiza un método llamado toBinary que reciba un número decimal como
argumento y devuelva un String con el número binario correspondiente.
 */
	public static void main(String[] args) {

		System.out.println(toBinary(50));
	}
	
	public static String toBinary(double numero) {
		String binario="";
		
			while ((int)numero>0) {
				if (numero%2==0) {
					binario= binario + '0';
				}else {
					binario=binario + '1';
				}
			numero= (int)numero/2;
			}
	return binario;
	}
}