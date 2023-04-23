package com.edu.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApp {
	
	public static final String MENU = (	"1. Añadir palabra \n"
										+ "2. Buscar palabra en diccionario \n"
										+ "3. Borrar una palabra del diccionario \n"
										+ "4. Listado de palabras que empiecen por \n"
										+ "5. Salir");

	public static void main(String[] args) {
		
		try {
			Map<String, String> diccionario = new HashMap<String, String>();
			Diccionario diccionarioDeBolsillo = new Diccionario();
			
			Scanner sc = new Scanner (System.in);
			
			int opcion = 0;
			
			while(opcion != 5) {
				
				System.out.println(MENU);
				System.out.println("Indica una opcion [1-5]");
				opcion = sc.nextInt();
				
				switch(opcion) {
					
				case 1:
					
					System.out.println("Introduce una palabra en el diccionario");
					String palabra = sc.next();
					
					System.out.println("Introduce su significado");
					String significado = sc.next();
					
					if(palabra==null || palabra.isEmpty() && significado==null || significado.isEmpty()) {
						System.out.println("Introduce una palabra junto con su significado valido en el diccionario");
					}
					
					diccionarioDeBolsillo.addPalabra(palabra, significado);
					break;
					
				case 2:
					
					System.out.println("Introduce la palabra a buscar");
					String palabraBuscar = sc.next();
					
					
					if(diccionarioDeBolsillo.searchPalabra(palabraBuscar)) {
						System.out.println("La palabra fue encontrada");
					}else {
						System.out.println("La palabra no fue encontrada");
					}
					break;
					
				case 3:
					System.out.println("Introduce una palabra a borrar en el diccionario");
					
					String palabraBorrar = sc.next();
					
					if(diccionarioDeBolsillo.removePalabra(palabraBorrar)) {
						System.out.println("La palabra ha sido borrada correctamente");
					}else {
						System.out.println("La palabra no ha sido borrada");
					}
					break;
					
				case 4: 
					
					System.out.println("Introduce una palabra que comience por");
					String palabraComienza = sc.next();
					
					for(String palabraEncontrada : diccionarioDeBolsillo.buscarPalabraComienza(palabraComienza)) {
						System.out.println(palabraEncontrada);
					}
					break;
					
				default:
					System.out.println("Opcion invalida, vuelva de nuevo a introducir una opcion");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
