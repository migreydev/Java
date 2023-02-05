package com.edu.introduccion.introduccion_java_boletinII;


public class ejercicio11 {

	/*
	 * 11. Realizar un método llamado minimoComunMultiplo que reciba dos números y
calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
números dividido entre su máximo común divisor. Por ejemplo, el máximo común
divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
(24×36)/12=72.
	 */
	
	public static void main(String[] args) {
		int numero1=0;
		int numero2=0;
		
	System.out.println(minimoComunMultiplo(24,36));
		}
	
	public static int minimoComunMultiplo (int numero1, int numero2) {
		
		ejercicio10 miClase = new ejercicio10();
		
		int mcm = numero1*numero2/miClase.gcd(numero1,numero2);
		
		return mcm;
		}
	}

