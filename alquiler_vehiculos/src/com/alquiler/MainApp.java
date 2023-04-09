package com.alquiler;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("1. Alta de vehículo ");
            System.out.println("2. Calcular el precio del vehiculo ");
            System.out.println("3. Salir ");

            int opcion = 0;

            while (opcion != 3) {

                System.out.println("Indica una opcion [1-3] ");
                opcion = sc.nextInt();
                
                String tipo = null;
                Gama gama = null;
                Combustible combustible = null;

                switch (opcion) {

                    case 1:

                        System.out.println("Indique el tipo de vehiculo [Coche, Microbus, Furgoneta] ");
                        tipo = sc.next().toUpperCase();
                        while (!tipo.equals("COCHE") && !tipo.equals("MICROBUS") && !tipo.equals("FURGONETA")) {
                            System.out.println("Indique un tipo de vehículo válido [Coche, Microbus, Furgoneta]");
                            tipo = sc.next().toUpperCase();
                        }

                        System.out.println("Indique la gama del vehiculo [Baja,Media,Alta] ");
                        String gamaString = sc.next().toUpperCase();
                        while (!gamaString.equals("BAJA") && !gamaString.equals("MEDIA") && !gamaString.equals("ALTA")) {
                            System.out.println("Indique una gama del vehículo válida [Baja, Media, Alta]");
                            gamaString = sc.next().toUpperCase();
                        }
                        gama = Gama.valueOf(gamaString);

                        System.out.println("Indique el tipo de combustible [Gasolina o Diesel] ");
                        String combustibleString = sc.next().toUpperCase();
                        while (!combustibleString.equals("GASOLINA") && !combustibleString.equals("DIESEL")) {
                            System.out.println("Indique un tipo de combustible válido [Gasolina o Diesel]");
                            combustibleString = sc.next().toUpperCase();
                        }
                        combustible = Combustible.valueOf(combustibleString);

                        switch (tipo) {
                        case "COCHE":
                            Coche coche = new Coche(tipo, combustible, gama);
                            coche.setGama(gama);
                            coche.setCombustible(combustible);
                            double precioCoche = coche.getPrecioCoche() * gama.getPrecioGama() * combustible.getPrecio();
                            break;
				            
						case "MICROBUS":
							Microbus microbus = new Microbus(tipo, combustible, gama);
							microbus.setGama(gama);
							microbus.setCombustible(combustible);
							double precioMicrobus = microbus.getPrecioBus() * gama.getPrecioGama() * combustible.getPrecio();
				            break;
				            
						case "FURGONETA":
							Furgoneta furgoneta = new Furgoneta(tipo, combustible, gama);
							furgoneta.setGama(gama);
							furgoneta.setCombustible(combustible);
							double precioFurgoneta = furgoneta.getPrecioFurgoneta() * gama.getPrecioGama() * combustible.getPrecio();
				            break;
					}
					break;
					
				case 2:
					
					System.out.println("Introduce la matricula del vehiculo ");
					String matricula = sc.nextLine();
					
					System.out.println("Indique el número de dias que ha sido alquilado el vehiculo ");
					int dias = sc.nextInt();
					
					
					if(tipo.equals("COCHE")) {
						  Coche coche = new Coche(matricula, combustible, gama);
                          coche.setGama(gama);
                          coche.setCombustible(combustible);
                          double precioCoche = coche.getPrecioCoche() * gama.getPrecioGama() * combustible.getPrecio();
                          System.out.println("Total de dias alquilados " + dias + ". El total del precio es de " + precioCoche);
                          break;
					}else if(tipo.equals("MICROBUS")) {
						Microbus microbus = new Microbus(matricula, combustible, gama);
						microbus.setGama(gama);
						microbus.setCombustible(combustible);
						double precioMicrobus = microbus.getPrecioBus() * gama.getPrecioGama() * combustible.getPrecio();
						System.out.println("Total de dias alquilados " + dias + ". El total del precio es de " + precioMicrobus);
			            break;
						
					}else if(tipo.equals("FURGONETA")) {
						Furgoneta furgoneta = new Furgoneta(matricula, combustible, gama);
						furgoneta.setGama(gama);
						furgoneta.setCombustible(combustible);
						double precioFurgoneta = furgoneta.getPrecioFurgoneta() * gama.getPrecioGama() * combustible.getPrecio();
						System.out.println("Total de dias alquilados " + dias + ". El total del precio es de " + precioFurgoneta);
			            break;
					}
				}	
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
