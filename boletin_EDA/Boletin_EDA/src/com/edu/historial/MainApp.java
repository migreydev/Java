package com.edu.historial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	
	public static final String MENU = ("1. Nueva página consultado \n"
			+ "2. Consultar historial completo \n"
			+ "3. Consultar historial de un dia \n"
			+ "4. Borrar todo el historial \n"
			+ "5. Borrar visitas a una página \n"
			+ "6. Salir.");

	public static void main(String[] args) {
	
	try {
		
		List<Historial> historial = new ArrayList<>();
		
		PaginaWeb mozilla = new PaginaWeb ("www.mozilla.com", LocalDateTime.now());
		PaginaWeb google = new PaginaWeb ("www.google.com", LocalDateTime.now());
		PaginaWeb twitter = new PaginaWeb ("www.twitter.com", LocalDateTime.now());
		
		Historial historial1 = new Historial(mozilla,LocalDateTime.now());
		Historial historial2 = new Historial(google, LocalDateTime.now());
		Historial historial3 = new Historial(twitter,LocalDateTime.now());
		Scanner sc = new Scanner (System.in);
		
		int opcion = 0;
		
		while(opcion != 6) {
				
				System.out.println(MENU);
				System.out.println("Indica una opcion [1-6] ");
				opcion = sc.nextInt();
		
				switch(opcion) {
					
					case 1:
						
						System.out.println("Introduce el nombre de la página web ");
						String pagina = sc.next();
						
						 LocalDateTime fechaHoraActual = LocalDateTime.now();
	                        if (!historial.isEmpty()) {
	                            LocalDateTime ultimaFechaHora = historial.get(historial.size() - 1).getFecha();
	                            if (fechaHoraActual.isBefore(ultimaFechaHora)) {
	                                System.out.println("Error: la fecha y hora de la página web introducida es anterior a la última almacenada.");
	                                break;
	                            }
	                        }

	                        PaginaWeb paginaWeb = new PaginaWeb(pagina, fechaHoraActual);
	                        historial.add(new Historial(paginaWeb, fechaHoraActual));
	                        System.out.println("Página web añadida al historial.");
	                        break;
					case 2:
						
						  if (historial.isEmpty()) {
	                            System.out.println("El historial está vacío.");
	                        } else {
	                            for (Historial h : historial) {
	                                System.out.println(h);
	                            }
	                        }
	                        break;
						
					case 3:
					    System.out.println("Introduce la fecha a consultar (en formato yyyy-mm-dd):");
					    String fechaStr = sc.next();
					    LocalDate fecha = LocalDate.parse(fechaStr);

					    for (Historial visita : historial) {
					        if (visita.getFecha().toLocalDate().equals(fecha)) {
					            System.out.println(visita);
					        }
					    }
					    break;
						
					case 4:
                        historial.clear();
                        System.out.println("Historial borrado.");
                        break;
					
					case 5:
					    System.out.println("Introduce el nombre de la página web a borrar:");
					    String urlBorrar = sc.next();
					    for (Historial h : historial) {
					        boolean result = h.removeVisitaPagina(urlBorrar);
					        if (result) {
					            System.out.println("Visita a " + urlBorrar + " eliminada del historial.");
					        } else {
					            System.out.println("No se encontraron visitas a " + urlBorrar + " en el historial.");
					        }
					    }
					    break;
						
					default:
						System.out.println("Opción inválida, intenta de nuevo.");
						break;
						
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}

