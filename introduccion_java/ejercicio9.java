package com.edu;

import java.util.Scanner;

public class ejercicio9 {
	/*
	 9. Método que pida 5 números e imprima si alguno es múltiplo de 3.
	 */
	
	public static void main(String[] args) {
		
		int numero =0;
		int contador=1;
		
		while(contador<6) {
			System.out.println("Indica un número ");
			Scanner sc= new Scanner(System.in);
			numero= Integer.valueOf(sc.nextLine());
			contador+=1;
			if (numero%3==0) {
				System.out.println("El número "+numero+" es multiplo de 3");
			}else {
				System.out.println("El número "+numero+" no es multiplo de 3" );
			}
		}
	}

}
