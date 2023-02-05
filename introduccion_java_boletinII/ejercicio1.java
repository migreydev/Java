package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

/*
 1. Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
los coeficientes de una ecuación de segundo grado y devuelva el número de
soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
que ser distinto de cero) debe devolver un -1.
 */

public class ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(numeroSolucionesEcuacionesSegundoGrado(2, 7, 3));
	}
	
	public static int numeroSolucionesEcuacionesSegundoGrado (double a, double b, double c) {
		
		double raizCuadrada= Math.pow(b,2)-4*a*c;
		int solucion;

		if(a!=0) {
			if (raizCuadrada>0) {
				solucion=2;
			}else if (raizCuadrada==0) {
				solucion=1;
			}else {
				solucion=0;
			}
		}else {
			solucion=-1;
		}
		return solucion;
	}
}
