package com.edu;

/*
  5. Realiza un método que reciba una hora por parámetro y que muestre luego buenos
días, buenas tardes o buenas noches según corresponda. Se utilizarán los tramos
de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor
de las horas.
 */


public class ejercicio5 {

	public static void main(String[] args) {
		
		float hora=6;
		
		if (hora>6 && hora<12) {
			System.out.println("Buenos dias, son las " + hora + " de la mañana");
		}else if (hora>13 && hora<20) {
			System.out.println("Buenas tardes, son las " + hora + " de la tarde");
		}else if (hora>21 && hora<5) {
			System.out.println("Buenas noches, son las " + hora + " de la noche");
		}else {
			System.out.println("Error, el valor es erroneo");
		}

	}

}
