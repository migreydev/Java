package com.edu;

/*
7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
while, iii) do-while en cada una de ellas:
a. Crea un método que muestre los números del 1 al 100
b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
*/

public class ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("a.");
		
		
		for(int contador = 0; contador <=100; ++contador) {
			System.out.println(contador);
		}

		System.out.println("b.");
		
		int numero = 100;
		
		while(numero>0) {
			System.out.println(numero);
			numero--;
		}
		
		System.out.println("c.");
		int c = 0;
		
		while (c<100) {
			c++;
		
			if(c%5==0) {
				System.out.println(c + " es multiplo");
			}else {
				System.out.println(c + " no es multiplo");
			}
		}
		System.out.println("d.");
		
		int x = 360;
		
		while(x>=160) {
			System.out.println(x);
			x-=20;
		}
	}
}
