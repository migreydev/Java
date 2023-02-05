package com.edu.introduccion.introduccion_java_boletinII;

import java.util.Scanner;

public class ejercicio7 {
	
	/*
	 7. Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
tres primeros representarán la hora, minuto y segundos de la primera hora y los
otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
datos no son correctos se deberá devolver -1000.
	 */
	
		public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);

			System.out.println("Introduce una hora ");
			int hora1 = Integer.valueOf(sc.nextLine());
			if (hora1 <0 && hora1 >24) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce una hora ");
				hora1 = Integer.valueOf(sc.nextLine());
			}
			
			System.out.println("Introduce los minutos ");
			int minuto1 = Integer.valueOf(sc.nextLine());
			if (minuto1 <0 && minuto1 >60) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce los minutos ");
				minuto1 = Integer.valueOf(sc.nextLine());
			}

			System.out.println("Introduce los segundos ");
			int segundo1 = Integer.valueOf(sc.nextLine());
			if (segundo1 <0 && segundo1 >60) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce los segundos ");
				segundo1 = Integer.valueOf(sc.nextLine());
			}
			
			System.out.println("Introduce una hora ");
			int hora2 = Integer.valueOf(sc.nextLine());
			if (hora2 <0 && hora2 >24) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce una hora ");
				hora2 = Integer.valueOf(sc.nextLine());
			}

			System.out.println("Introduce los minutos ");
			int minuto2 = Integer.valueOf(sc.nextLine());
			if (minuto2 <0 && minuto2 >60) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce los minutos ");
				minuto2 = Integer.valueOf(sc.nextLine());
			}
			
			System.out.println("Introduce los segundos ");
			int segundo2 = Integer.valueOf(sc.nextLine());
			if (segundo2 <0 && segundo2 >60) {
				System.out.println("Error introduce de nuevo el dato");
				System.out.println("Introduce los segundos ");
				segundo2 = Integer.valueOf(sc.nextLine());
			}
			
			int tiempo1=hora1*3600+minuto1*60+segundo1;
			int tiempo2=hora2*3600+minuto2*60+segundo2;

			System.out.println(segundosEntre(tiempo1,tiempo2));
		}
		
		public static int segundosEntre(int tiempo1, int tiempo2) {
			int contador =0;
			int mensaje=0;
			
			while (contador <1) {
				if (tiempo1 > tiempo2) {
					mensaje= tiempo1 - tiempo2;
					contador ++;
				}else if (tiempo1 < tiempo2) {
					mensaje= tiempo1 - tiempo2;
					contador++;
				}else {
					mensaje = -1000;
				}
			}
			return mensaje;
		}
		
	}

