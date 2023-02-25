package complejo;

import java.util.Scanner;

public class mainComplejo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce la parte real del primer número complejo");
		double parteReal1 = sc.nextDouble(); 
		
		System.out.println("Introduce la parte imaginaria del primer número complejo");
		double parteImaginaria1 = sc.nextDouble();
		
		//Creando el primer objeto de la clase Complejo, asignandoselo a la variable complejo1
		Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);
		
	
		System.out.println("Introduce la parte real del segundo número complejo");
		double parteReal2 = sc.nextDouble(); 
		
		System.out.println("Introduce la parte imaginaria del segundo número complejo");
		double parteImaginaria2 = sc.nextDouble();
		
		//Creando el segundo objeto de la clase Complejo, asignandoselo a la variable complejo2
		Complejo complejo2 = new Complejo(parteReal2,parteImaginaria2);
		
		//Realizamos los diversos metodos en un Syso
		//Realizar suma
		System.out.println(complejo1.sumar(complejo2));
		
		//Realizar resta
		System.out.println(complejo1.restar(complejo2));
		
		//Realizar comparacion
		System.out.println(complejo1.equals(complejo2));
	}

}
