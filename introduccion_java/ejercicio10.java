package com.edu;

import java.util.Scanner;
/*
10. Realiza un programa que sume los 100 números siguientes a un número entero y
positivo introducido por teclado. Se debe comprobar que el dato introducido es
correcto (que es un número positivo).
*/

public class ejercicio10 {

	public static void main(String[] args) {
		int numero=0;
		int suma=0;
		
		System.out.println("Indica un número ");
		Scanner sc=new Scanner (System.in);
		numero= Integer.valueOf(sc.nextLine());
		
		if (numero>0) {
			System.out.println(numero+100);
		}else {
			System.out.println("Error el numero es negativo");
		}
	}
}
