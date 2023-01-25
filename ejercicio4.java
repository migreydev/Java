package com.edu;

/* 4. Calcular las calificaciones de un alumno con un método que reciba la nota de la
parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
deberá devolver un mensaje de error.
Realiza el método que calcule la media de tres notas y te devuelva la nota del
boletín (insuficiente, suficiente, bien, notable o sobresaliente).
*/

public class ejercicio4 {

	public static void main(String[] args) {
		
		float partePractica = 1;
		float parteTeorica = 2;
		float problemas = 7;
		
		float media = ((partePractica*10)/100 +(parteTeorica*50)/100 +(problemas*40)/100);
		
		if (media>0 && media<5) {
			System.out.println("Tu nota es de " + media + ", tienes una calificacion de insuficiente");
		}else if (media>5 && media<6) {
			System.out.println("Tu nota es de " + media + ", tienes una calificacion de suficiente");
		}else if (media>=6 && media <7) {
			System.out.println("Tu nota es de " + media + ", tienes una calificacion de bien");
		}else if (media>=7 && media<9) {
			System.out.println("Tu nota es de " + media + ", tienes una calificacion de notable");
		}else if (media>=9 && media<=10) {
			System.out.println("Tu nota es de " + media + ", tienes una calificacion de sobresaliente");
		}else {
			System.out.println("Error");
		}
	}
}
