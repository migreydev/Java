package com.edu;

import java.util.Scanner;

public class ejercicio13 {
	/*
	13. Programa que reciba 10 números y nos indique el valor máximo y mínimo.
	*/	
	
	public static void main(String[] args) {
		
		
		int numero=0;
		int contador=0;
		int maximo;
		int minimo;
		
		System.out.println("Indica un número ");
		Scanner sc= new Scanner(System.in);
		maximo = minimo = Integer.valueOf(sc.nextLine());
		
		while(contador<9) {
			contador+=1;

			System.out.println("Indica un número ");
			numero= Integer.valueOf(sc.nextLine());
			
			if(numero>maximo) {
				maximo=numero;
			}else if (numero<minimo) {
				minimo=numero;
			}
		}
		System.out.println(minimo);
		System.out.println(maximo);
	}
}
