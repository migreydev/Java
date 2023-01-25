/* 2. Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
*/

package com.edu;

public class ejercicio2 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un día de la semana ");
		
		String semana = sc.nextLine();
		*/
		
		String semana = "martes";
		
		if (semana == "lunes") {
			System.out.println("Entornos de desarrollo");
		}else if (semana == "martes") {
			System.out.println("Fol");
		}else if (semana == "miercoles") {
			System.out.println("sistemas informaticos");
		}else if (semana == "jueves") {
			System.out.println("base de datos");
		}else if (semana == "viernes") {
			System.out.println("sistemas informaticos");
		}else {
			System.out.println("El dia introducido no es valido ");
		}
		
	}

}
