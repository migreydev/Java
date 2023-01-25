package com.edu;
import java.util.Scanner;

public class ejercicio16 {

	/*
	 16. Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
Mostrar su suma y cuantos hay mayores de 1000€.
	 */
	
	public static void main(String[] args) {
		

		int contador=0;
		double salario ;
		double suma=0;
		int contMayor=0;
		
		
		while (contador < 10) {
			contador++;
			
			System.out.println("Indica un salario ");
			Scanner sc = new Scanner (System.in);
			salario = Double.valueOf(sc.nextDouble());
			
			suma+=salario;
			
			if (salario>1000) {
				contMayor++;
			}
		}
		
	System.out.println("La suma total del salario de los 10 empleados es de " + suma + " €");
	System.out.println(contMayor + " salarios son mayor de 1000€");	
	}
}
