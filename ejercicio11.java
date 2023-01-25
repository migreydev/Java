package com.edu;

import java.util.Scanner;

public class ejercicio11 {

	/*
	11. Realiza un programa que pida números y muestre su cuadrado, repitiendo el
proceso hasta que se introduzca un número negativo.
	*/	
	
	public static void main(String[] args) {
		
		int numero =0;
	
		System.out.println("Indica un número ");
		Scanner sc= new Scanner(System.in);
		numero= Integer.valueOf(sc.nextLine());
		
		
		while(numero>0) {
			
		
			if (numero>0) {
				System.out.println("El cuadrado del número "+numero+" es "+numero*numero);
			}else {
				System.out.println("Error");
			}
			System.out.println("Indica un número ");
			Scanner sc1= new Scanner(System.in);
			numero= Integer.valueOf(sc.nextLine());
		}
	}
}
