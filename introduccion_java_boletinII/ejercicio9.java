package com.edu.introduccion.introduccion_java_boletinII;

public class ejercicio9 {

	/**
	 9. Realiza un método llamado toDecimal que reciba un String con un valor numérico
en binario como argumento y devuelva un número con el número decimal
correspondiente.
	 */
	
	public static void main(String[] args) {
		
	System.out.println(toDecimal("100110"));
	}

	public static String toDecimal (String binario ) {

		String auxiliar="";
		double decimal = 0;
		final int BASE = 2;
		
		for (int i=binario.length()-1; i>=0;i--) {
			auxiliar+=binario.charAt(i);
				
		}			
		for(int d=0; d<auxiliar.length(); d++) {
			if (auxiliar.charAt(d)=='1') {
				decimal+=Math.pow(BASE,d);
			}
		}
		return String.valueOf(decimal);
	}
}
