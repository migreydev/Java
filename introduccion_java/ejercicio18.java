package com.edu;

import java.util.Scanner;

public class ejercicio18 {

	/*
	 18. Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo
y otro llamado calcularLongitudCirculo que devuelva su longitud.
	 */
	
	double radio;
	double diametro;
	public static void main(String[]args) {
		
	
	
	System.out.println("Indica un radio ");
	Scanner sc = new Scanner(System.in);
	double radio = Double.valueOf(sc.nextDouble());
	
	System.out.println(calcularAreaCirculo(radio));
	System.out.println(calcularLongitudCirculo(radio));
	
	}
	
	 public static double calcularAreaCirculo (double radio) {
		double area;
		
		area=3.14 * radio*radio;
		
		return area ;
	}
	
	 
	public static double calcularLongitudCirculo (double radio) {
		double longitud;
		
		longitud= 3.14 * 2*radio;
		return longitud;
	}
}
