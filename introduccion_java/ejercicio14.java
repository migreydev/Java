package com.edu;

import java.util.Scanner;

public class ejercicio14 {

	/*
	14. Realiza un programa que vaya pidiendo números hasta que se introduzca un
número negativo y nos diga cuántos números se han introducido, la media de los
impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
final de la introducción de datos pero no se incluye en el cómputo.
	*/	
	
	public static void main(String[] args) {
		
		int numero = 0;
		int contador=0;
		int impar=0;
		int contadorImpar=0;
		int mayor=0;
		
		System.out.println("Indica un número ");
		Scanner sc= new Scanner(System.in);
		numero= Integer.valueOf(sc.nextLine());
		
			while (numero>0) {
				contador+=1;
				if (numero%2==1) {
					impar+=numero;
					contadorImpar+=1;
					
				}else if (numero>mayor) {
					mayor=numero;
				}
				System.out.println("Indica un número ");
				numero= Integer.valueOf(sc.nextLine());
		}
			System.out.println(contador);
			System.out.println("La media de los numeros impares es " + impar/contadorImpar);
			System.out.println("El mayor de los números pares es " + mayor);
	}
	
}
