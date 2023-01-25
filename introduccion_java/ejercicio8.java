package com.edu;

import java.util.Scanner;

public class ejercicio8 {

	/*
	8. Método que pida 15 números y realice su suma.
	*/	
	
	public static void main(String[] args) {
		
		int numero=0;
		int contador=1;
		int total=0;
		
		 
		while(contador<16) {
			System.out.println("Indica un número ");
			Scanner sc= new Scanner(System.in);
			numero= Integer.valueOf(sc.nextLine());
			contador+=1;
			total+=numero;
		}System.out.println("La suma total de todos los numeros es de " + total);

	}

}
