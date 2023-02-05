package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio5 {

	/*
	 5. Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
el primer número es múltiplo del segundo.
	 */
	
	public static void main(String[] args) {
		
		int numeroA;
		int numeroB;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero ");
		numeroA= sc.nextInt();
		
		System.out.println("Introduce otro número ");
		numeroB= sc.nextInt();
		
		System.out.println(esmultiplo(numeroA,numeroB));
		
	
	}
		public static boolean esmultiplo(int numeroA, int numeroB) {
		 
			boolean mensaje = false;
			
			if (numeroA > 0 && numeroB>0) {
				
				if (numeroA%numeroB==0) {
					mensaje=true;
				}

			}
			return mensaje;
			
		}
}	
		
		
		