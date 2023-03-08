package com.jarra;

import java.util.Scanner;

public class mainJarra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		//Objeto 
		Jarra jarraA = new Jarra (5,8);
		Jarra jarraB = new Jarra (4,5);
		
		System.out.println("1. Llenar jarra");
		System.out.println("2. Vaciar jarra");
		System.out.println("3. Volcar jarra A en B");
		System.out.println("4. Volcar jarra B en A");
		System.out.println("5. Ver estado de las jarras");
		System.out.println("6. Salir");
		
		int opcion = 0;
		
		while(opcion!=6) {
			
			System.out.println("Introduce una opcion [1-6]");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("¿Qué jarra desea llenar (A/B)?");
				sc.nextLine();
				String opcionJarra = sc.nextLine().toUpperCase();
				
				if(opcionJarra.equals("A")) {
					jarraA.llenarJarra();
					System.out.println("La jarra A ha sido llenada");
					
				}else if (opcionJarra.equals("B")) {
					jarraB.llenarJarra();
					System.out.println("La jarra B ha sido llenada");
					
				}else {
					System.out.println("El valor no existe");
				}
				break;
				
			case 2:
				System.out.println("¿Qué jarra desea vaciar (A/B)?");
				opcionJarra = sc.nextLine().toUpperCase();
				
				if(opcionJarra.equals("A")) {
					jarraA.vaciarJarra();
				}else if (opcionJarra.equals("B")) {
					jarraB.vaciarJarra();
				}else {
					System.out.println("El valor no existe");
				}
				break;
				
			case 3:
				
				jarraA.volcarJarra(jarraB);
				break;
				
			case 4:
				
				jarraB.volcarJarra(jarraA);
				break;
				
			case 5:
				
				System.out.println(jarraA);
				System.out.println(jarraB);
			}
		}
	}

}
