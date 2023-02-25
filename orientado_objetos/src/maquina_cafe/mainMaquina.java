package maquina_cafe;

import java.util.Scanner;

public class mainMaquina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de dinero para el monedero ");
		double cantidadInicial = sc.nextDouble();
		
		//Creacion del objeto de la clase Maquina. Le pasamos como argumento la variable cantidadInicial que va a tomar el valor que introduzca el usuario.
		Maquina maquinaCafe = new Maquina(cantidadInicial);
		
		System.out.println("Menu");
		System.out.println("1. Servir café ");
		System.out.println("2. Servir leche ");
		System.out.println("3. Servir café con leche ");
		System.out.println("4. Consultar estado máquina. Aparecen los datos de los depositos y del monedero ");
		System.out.println("5. Apagar maquina salir ");
		
		int opcion=0;
		
		while(opcion !=5) {
			
			System.out.println("Indica una opcion [1-5] ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("¿Cuanto dinero vas a introducir? ");
				double dineroIntroducir = sc.nextDouble();
				
				System.out.println(maquinaCafe.servirCafe(dineroIntroducir));
				break;
			case 2:
				System.out.println("¿Cuanto dinero vas a introducir? ");
				dineroIntroducir = sc.nextDouble();
				
				System.out.println(maquinaCafe.servirLeche(dineroIntroducir));
				break;
			case 3:
				System.out.println("¿Cuanto dinero vas a introducir? ");
				dineroIntroducir = sc.nextDouble();
				
				System.out.println(maquinaCafe.servirCafeConLeche(dineroIntroducir));
				break;
			case 4:
				System.out.println(maquinaCafe);
				break;
			}
		}
	}
}
