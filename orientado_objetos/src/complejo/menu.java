package complejo;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Menu");
		System.out.println("1. Sumar complejos ");
		System.out.println("2. Restar complejos ");
		System.out.println("3. Salir ");
		int opcion=0;
		
		while(opcion !=3) {
			
			System.out.println("Indica una opcion [1-3] ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Introduce la parte real del primer número complejo");
				double parteReal1 = sc.nextDouble(); 
				
				System.out.println("Introduce la parte imaginaria del primer número complejo");
				double parteImaginaria1 = sc.nextDouble();
				Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);
				
				System.out.println("Introduce la parte real del segundo número complejo");
				double parteReal2 = sc.nextDouble(); 
				
				System.out.println("Introduce la parte imaginaria del segundo número complejo");
				double parteImaginaria2 = sc.nextDouble();
				Complejo complejo2 = new Complejo(parteReal2,parteImaginaria2);
				
				System.out.println(complejo1.sumar(complejo2));
				break;
			
			case 2:
				System.out.println("Introduce la parte real del primer número complejo");
				parteReal1 = sc.nextDouble(); 
				
				System.out.println("Introduce la parte imaginaria del primer número complejo");
				parteImaginaria1 = sc.nextDouble();
				complejo1 = new Complejo(parteReal1, parteImaginaria1);
				
				System.out.println("Introduce la parte real del segundo número complejo");
				parteReal2 = sc.nextDouble(); 
				
				System.out.println("Introduce la parte imaginaria del segundo número complejo");
				parteImaginaria2 = sc.nextDouble();
				complejo2 = new Complejo(parteReal2,parteImaginaria2);
				
				System.out.println(complejo1.restar(complejo2));
				break;
			}
		}
		System.out.println("Elejiste salir, adiós");
	}
}
