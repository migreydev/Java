package com.edu;

import java.util.Scanner;

public class ejercicio12 {
/*
		12. Realiza un programa que pida números hasta que se teclee uno negativo y muestre
		cuántos números se han introducido.
		*/	
	public static void main(String[] args) {
		

		int numero =0;
		int contador=0;
		
		System.out.println("Indica un número ");
		Scanner sc= new Scanner(System.in);
		numero= Integer.valueOf(sc.nextLine());
	
		while(numero>0) {
			
			if(numero>0) {
				contador+=1;
			}else {
				System.out.println("Error valor no valido ");
			}
		System.out.println("Indica un número ");
		Scanner sc1= new Scanner(System.in);
		numero= Integer.valueOf(sc.nextLine());	
		}
		System.out.println(contador);
	}
}
