package granAlmacen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws ExceptionCaja {
		GranAlmacen almacenReyes = new GranAlmacen ();
		Caja caja = new Caja (0);
		
		List<Cliente> clientes = new ArrayList<>();

		
		 Scanner sc = new Scanner(System.in);
	        int opcion;
	        do {
	            System.out.println("1. Abrir caja");
	            System.out.println("2. Cerrar caja");
	            System.out.println("3. Nuevo cliente");
	            System.out.println("4. Atender cliente");
	            System.out.println("5. Salir");
	            System.out.print("Introduce una opción: ");
	            opcion = sc.nextInt();
	            
	            switch (opcion) {
	                case 1:
	                    System.out.print("Introduce el número de caja a abrir: ");
	                    int numCaja = sc.nextInt();
	                    if (numCaja >=0 && numCaja<=20) {
	                    	if(caja.abrir()) {
	                    		System.out.println("Caja abierta ");
	                    	}else {
	                    		System.out.println("La caja ya está abierta");
	                    	}
	                    }else {
	                    	System.out.println("El número de caja no es valido ");
	                    }
	                    break;
	                case 2:
	                	  System.out.print("Introduce el número de caja a abrir: ");
	                	  	numCaja = sc.nextInt();
		                    if (numCaja >=0 && numCaja<=20) {
		                    	if(caja.cerrar()) {
		                    		System.out.println("Caja cerrada ");
		                    	}else {
		                    		System.out.println("La caja ya está cerrada");
		                    	}
		                    }else {
		                    	System.out.println("El número de caja no es valido ");
		                    }
		                    break;
	                case 3:
	                	int numCliente = clientes.size() + 1;
	                    numCaja = almacenReyes.getNumCajas();
	                    clientes.add(new Cliente(numCliente, numCaja));
	                    System.out.println("Es usted el cliente número " + numCliente + " y debe ir a la caja número " + numCaja + ".");
	                    break;
	                case 4:
	                    System.out.print("Introduce el número de caja: ");
	                    numCaja = sc.nextInt();
	                    break;
	            }
	        } while (opcion != 5);
	    }
	}
