package com.edu;

public class ejercicio17 {
	
	/*
	 17. Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
8, 13, 21, 34, 55, 89, 144.
	 */

	public static void main(String[] args) {
		
		int contador=0;
		int fibo=1;
		int fibonacci = 1;
		
		
		while (contador<7) {
			contador ++;
			
			fibonacci+=fibo;
			System.out.println(fibonacci);
			fibo+=fibonacci; 
			System.out.println(fibo);
		}
	}

}
